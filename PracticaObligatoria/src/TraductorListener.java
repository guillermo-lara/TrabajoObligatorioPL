import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class TraductorListener extends GramaticaBaseListener {

    private final StringBuilder salida = new StringBuilder();
    private final StringBuilder defines = new StringBuilder();
    private final StringBuilder globalVariables = new StringBuilder();
    private final List<String> funcionesYProcedimientos = new ArrayList<>();
    private final StringBuilder mainBody = new StringBuilder();
    private final Stack<StringBuilder> pilaCuerpos = new Stack<>();
    private final Stack<Boolean> esFuncion = new Stack<>();
    private final Stack<StringBuilder> pilaBloques = new Stack<>();
    private String nombrePrograma;

    @Override
    public void enterPrg(GramaticaParser.PrgContext ctx) {
        System.out.println("Entrando a enterPrg: " + ctx.getText());
        if (ctx.ID() != null) {
            nombrePrograma = ctx.ID().getText();
        }
    }

    @Override
    public void exitDefcte(GramaticaParser.DefcteContext ctx) {
        List<TerminalNode> ids = ctx.getTokens(GramaticaParser.ID);
        List<GramaticaParser.SimpvalueContext> vals = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof GramaticaParser.CtelistContext) {
                GramaticaParser.CtelistContext cte = (GramaticaParser.CtelistContext) ctx.getChild(i);
                for (int j = 0; j < cte.getChildCount(); j++) {
                    if (cte.getChild(j) instanceof GramaticaParser.SimpvalueContext) {
                        vals.add((GramaticaParser.SimpvalueContext) cte.getChild(j));
                    }
                }
            }
        }

        for (int i = 0; i < ids.size() && i < vals.size(); i++) {
            defines.append("#define ")
                    .append(ids.get(i).getText())
                    .append(" ")
                    .append(vals.get(i).getText())
                    .append("\n");
        }
    }

    @Override
    public void exitDefproc(GramaticaParser.DefprocContext ctx) {
        String id = ctx.ID().getText();
        String parametros = "void";
        if (ctx.formal_paramlist() != null) {
            parametros = extraerParametrosDesdeTexto(ctx.formal_paramlist().getText());
        }
        StringBuilder cuerpo = new StringBuilder();
        cuerpo.append("void ").append(id).append("(").append(parametros).append(") {\n");
        pilaCuerpos.push(cuerpo);
        esFuncion.push(false);
        funcionesYProcedimientos.add(cuerpo.toString()); //Igual esta mal
        esFuncion.pop(); // Igual esta mal

    }

    @Override
    public void exitDeffun(GramaticaParser.DeffunContext ctx) {
        String id = ctx.ID().getText();
        String tipo = "int";  // valor por defecto
        if (ctx.tbas() != null && ctx.tbas().getText().equals("REAL")) {
            tipo = "float";
        }
        String parametros = "void";
        if (ctx.formal_paramlist() != null) {
            parametros = extraerParametrosDesdeTexto(ctx.formal_paramlist().getText());
        }
        StringBuilder cuerpo = new StringBuilder();
        cuerpo.append(tipo).append(" ").append(id).append("(").append(parametros).append(") {\n");
        pilaCuerpos.push(cuerpo);
        esFuncion.push(true);
        funcionesYProcedimientos.add(cuerpo.toString()); // Igual esta mal
        esFuncion.pop(); //Igual esta mal
    }

    @Override
    public void enterBlq(GramaticaParser.BlqContext ctx) {
        StringBuilder bloqueActual = new StringBuilder();

        if (ctx.getParent() instanceof GramaticaParser.PrgContext) {
            bloqueActual.append("void main(void) {\n");
        }

        pilaBloques.push(bloqueActual);
    }


    @Override
    public void exitBlq(GramaticaParser.BlqContext ctx) {
        if (pilaBloques.isEmpty()) return;

        StringBuilder bloque = pilaBloques.pop();
        bloque.append("}\n");

        if (ctx.getParent() instanceof GramaticaParser.PrgContext) {
            mainBody.append(bloque);
        } else {
            // Ya no toques funcionesYProcedimientos aquí
            if (!pilaCuerpos.isEmpty()) {
                pilaCuerpos.peek().append(bloque);
            }
        }
    }

    /*@Override
    public void exitBlq(GramaticaParser.BlqContext ctx) {
        if (pilaBloques.isEmpty()) return;

        StringBuilder bloque = pilaBloques.pop();
        bloque.append("}\n");

        if (ctx.getParent() instanceof GramaticaParser.PrgContext) {
            mainBody.append(bloque);
        } else {
            int i = funcionesYProcedimientos.size() - 1;
            String anterior = funcionesYProcedimientos.get(i);
            funcionesYProcedimientos.set(i, anterior + bloque);
        }
    }
*/

    @Override
    public void exitDefvarlist(GramaticaParser.DefvarlistContext ctx) {
        String tipo = "int";  // valor por defecto
        if (ctx.tbas() != null && ctx.tbas().getText().equals("REAL")) {
            tipo = "float";
        }
        List<String> nombres = extraerIDsDesdeVarlist(ctx.varlist());
        StringBuilder destino = pilaCuerpos.isEmpty() ? globalVariables : pilaCuerpos.peek();
        for (String nombre : nombres) {
            destino.append("  ").append(tipo).append(" ").append(nombre).append(";\n");
        }
    }

    private List<String> extraerIDsDesdeVarlist(GramaticaParser.VarlistContext ctx) {
        List<String> nombres = new ArrayList<>();
        if (ctx == null) return nombres;
        nombres.add(ctx.ID().getText());
        GramaticaParser.VarlistauxContext aux = ctx.varlistaux();
        while (aux != null && aux.getChildCount() > 1) {
            GramaticaParser.VarlistContext siguiente = aux.varlist();
            if (siguiente != null) {
                nombres.add(siguiente.ID().getText());
                aux = siguiente.varlistaux();
            } else {
                break;
            }
        }
        return nombres;
    }

    @Override
    public void exitAsig(GramaticaParser.AsigContext ctx) {
        String lhs = ctx.ID().getText();
        String rhs = ctx.exp().getText();
        String sentencia;

        // Aseguramos que la pila no esté vacía antes de acceder
        boolean dentroDeFuncion = !esFuncion.isEmpty() && esFuncion.peek();
        boolean esRetornoDeFuncion = dentroDeFuncion && !pilaCuerpos.isEmpty()
                && funcionesYProcedimientos.get(funcionesYProcedimientos.size() - 1).contains(lhs + "(");

        if (esRetornoDeFuncion) {
            sentencia = "  return " + rhs + ";\n";
        } else {
            sentencia = "  " + lhs + " = " + rhs + ";\n";
        }

        // Agregamos la sentencia al bloque actual si hay uno en la pila
        if (!pilaCuerpos.isEmpty()) {
            pilaCuerpos.peek().append(sentencia);
        } else {
            mainBody.append(sentencia);
        }
    }


    @Override
    public void exitProc_call(GramaticaParser.Proc_callContext ctx) {
        String id = ctx.ID().getText();
        String sentencia;

        if (id.equalsIgnoreCase("writeln")) {
            // Extraer el contenido dentro de los paréntesis y generar formato de printf
            String contenido = ctx.subparamlist().getText();
            contenido = contenido.replace("(", "").replace(")", "");
            sentencia = "  printf(" + generarFormatoPrintf(contenido) + ");\n";
        } else {
            // Para llamadas a otros procedimientos o funciones
            String argumentos = ctx.subparamlist().getText().replace(":=", "=");
            sentencia = "  " + id + argumentos + ";\n";
        }

        if (!pilaCuerpos.isEmpty()) {
            pilaCuerpos.peek().append(sentencia);
        } else {
            mainBody.append(sentencia);
        }
    }


    @Override
    public void exitPrg(GramaticaParser.PrgContext ctx) {
        mainBody.append("  return 0;\n}\n");

        salida.append("#include <stdio.h>\n\n");
        salida.append(defines).append("\n");
        salida.append(globalVariables).append("\n");
        for (String fp : funcionesYProcedimientos) {
            salida.append(fp);
        }
        salida.append(mainBody);
    }

    public String getCodigoFinal() {
        return salida.toString();
    }

    private String extraerParametrosDesdeTexto(String original) {
        String sinParentesis = original.replace("(", "").replace(")", "");
        String[] partes = sinParentesis.split(";");
        List<String> parametros = new ArrayList<>();

        for (String parte : partes) {
            String[] seccion = parte.trim().split(":");
            if (seccion.length == 2) {
                String[] nombres = seccion[0].trim().split(",");
                String tipo = seccion[1].trim().equalsIgnoreCase("INTEGER") ? "int" : "float";
                for (String nombre : nombres) {
                    parametros.add(tipo + " " + nombre.trim());
                }
            }
        }

        return String.join(", ", parametros);
    }

    private String generarFormatoPrintf(String args) {
        StringBuilder format = new StringBuilder("\"");
        StringBuilder values = new StringBuilder();
        String[] partes = args.split(",");

        for (String parte : partes) {
            parte = parte.trim();
            if (parte.startsWith("%")) {
                format.append(parte.replace("%", "")).append("\\n");
            } else {
                format.append("%f ");  // Suposición básica
                if (values.length() > 0) values.append(", ");
                values.append(parte);
            }
        }

        format.append("\"");
        if (values.length() > 0) {
            format.append(", ").append(values);
        }
        return format.toString();
    }

}
