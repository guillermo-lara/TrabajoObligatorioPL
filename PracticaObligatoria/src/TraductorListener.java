import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TraductorListener extends GramaticaBaseListener {

    private final StringBuilder salida = new StringBuilder();
    private final StringBuilder defines = new StringBuilder();
    private final List<String> funcionesYProcedimientos = new ArrayList<>();
    private final StringBuilder mainBody = new StringBuilder();

    private String nombrePrograma;

    @Override
    public void enterPrg(GramaticaParser.PrgContext ctx) {
        if (ctx.ID() != null) {
            nombrePrograma = ctx.ID().getText();
        }
    }

    @Override
    public void exitDefcte(GramaticaParser.DefcteContext ctx) {
        // Recorremos manualmente los hijos de ctelist
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
    public void enterDefproc(GramaticaParser.DefprocContext ctx) {
        String id = ctx.ID().getText();
        String parametros = "void"; // por defecto
        if (ctx.formal_paramlist() != null) {
            parametros = extraerParametrosDesdeTexto(ctx.formal_paramlist().getText());
        }
        funcionesYProcedimientos.add("void " + id + "(" + parametros + ") {\n");
    }

    @Override
    public void enterDeffun(GramaticaParser.DeffunContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tbas().getText().equals("INTEGER") ? "int" : "float";
        String parametros = "void"; // por defecto
        if (ctx.formal_paramlist() != null) {
            parametros = extraerParametrosDesdeTexto(ctx.formal_paramlist().getText());
        }
        funcionesYProcedimientos.add(tipo + " " + id + "(" + parametros + ") {\n");
    }

    @Override
    public void exitBlq(GramaticaParser.BlqContext ctx) {
        if (ctx.getParent() instanceof GramaticaParser.PrgContext) {
            mainBody.append("void main(void) {\n");
        }
    }

    @Override
    public void exitAsig(GramaticaParser.AsigContext ctx) {
        String lhs = ctx.ID().getText();
        String rhs = ctx.exp().getText();
        String sentencia = lhs + " = " + rhs + ";\n";

        if (ctx.getParent().getParent() instanceof GramaticaParser.PrgContext) {
            mainBody.append("  ").append(sentencia);
        } else {
            int i = funcionesYProcedimientos.size() - 1;
            funcionesYProcedimientos.set(i, funcionesYProcedimientos.get(i) + "  " + sentencia);
        }
    }

    @Override
    public void exitPrg(GramaticaParser.PrgContext ctx) {
        for (int i = 0; i < funcionesYProcedimientos.size(); i++) {
            funcionesYProcedimientos.set(i, funcionesYProcedimientos.get(i) + "}\n\n");
        }
        mainBody.append("}\n");
        salida.append(defines);
        for (String fp : funcionesYProcedimientos) {
            salida.append(fp);
        }
        salida.append(mainBody);
    }

    public String getCodigoFinal() {
        return salida.toString();
    }

    // Usa un truco para sacar parámetros desde el texto (temporal)
    private String extraerParametrosDesdeTexto(String original) {
        String sinParentesis = original.replace("(", "").replace(")", "");
        String[] partes = sinParentesis.split(";");
        List<String> parametros = new ArrayList<>();

        for (String parte : partes) {
            String[] seccion = parte.trim().split(":");
            if (seccion.length == 2) {
                String[] nombres = seccion[0].trim().split(",");
                String tipo = seccion[1].trim().equals("INTEGER") ? "int" : "float";
                for (String nombre : nombres) {
                    parametros.add(tipo + " " + nombre.trim());
                }
            }
        }

        return String.join(", ", parametros);
    }
}
