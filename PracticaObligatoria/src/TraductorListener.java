/*
 * Gramática del lenguaje fuente — Sentencias de control de flujo:
 *
 *   expcond    ::= expcond oplog expcond
 *                | factorcond
 *
 *   oplog      ::= "or"
 *                | "and"
 *
 *   factorcond ::= exp opcomp exp
 *                | "(" expcond ")"
 *                | "not" factorcond
 *
 *   opcomp     ::= "<" | ">" | "<=" | ">=" | "="
 *
 *   sent       ::= …                           (tus sent anteriores)
 *                | "if"    expcond "then" blq "else" blq
 *                | "while" expcond "do"   blq
 *                | "repeat" blq "until" expcond ";"
 *                | "for" ID ":=" exp inc exp "do" blq
 *
 *   inc        ::= "to" | "downto"
 *
 * Nota: Para la parte obligatoria sólo se procesan parámetros sin compactar
 *       y el bloque principal se traduce a  void main(void) { … }.
 */

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

public class TraductorListener extends GramaticaBaseListener {

    private final StringBuilder salida               = new StringBuilder();
    private final StringBuilder defines              = new StringBuilder();
    private final StringBuilder mainVarDecls         = new StringBuilder();
    private final List<String>    funcionesYProcedimientos = new ArrayList<>();
    private final StringBuilder   mainBody            = new StringBuilder();

    private final Stack<StringBuilder> pilaCuerpos     = new Stack<>();
    private final Stack<Boolean>        esFuncion      = new Stack<>();
    private final Stack<String>         nombreFuncion  = new Stack<>();

    // Para detectar subrutinas y añadir paréntesis cuando no tengan args
    private final Set<String> nombresSubrutinas      = new HashSet<>();

    //----------------------------------------------------------------------
    // 1) Constantes (#define)
    //----------------------------------------------------------------------

    @Override
    public void exitDefcte(GramaticaParser.DefcteContext ctx) {
        procesarCtelist(ctx.ctelist());
    }

    private void procesarCtelist(GramaticaParser.CtelistContext ctx) {
        defines
                .append("#define ")
                .append(ctx.ID().getText())
                .append(" ")
                .append(ctx.simpvalue().getText())
                .append("\n");
        procesarCtelistp(ctx.ctelistp());
    }

    private void procesarCtelistp(GramaticaParser.CtelistpContext ctx) {
        if (ctx == null || ctx.ID() == null) return;
        defines
                .append("#define ")
                .append(ctx.ID().getText())
                .append(" ")
                .append(ctx.simpvalue().getText())
                .append("\n");
        procesarCtelistp(ctx.ctelistp());
    }

    //----------------------------------------------------------------------
    // 2) Procedimientos y funciones
    //----------------------------------------------------------------------

    @Override
    public void enterDefproc(GramaticaParser.DefprocContext ctx) {
        String id = ctx.ID().getText();
        nombresSubrutinas.add(id);
        nombreFuncion.push(id);
        esFuncion.push(false);

        String parametros = ctx.formal_paramlist() != null
                ? extraerParametros(ctx.formal_paramlist().getText())
                : "void";

        StringBuilder cuerpo = new StringBuilder();
        cuerpo.append("void ")
                .append(id)
                .append("(").append(parametros).append(") {\n");
        pilaCuerpos.push(cuerpo);
    }

    @Override
    public void exitDefproc(GramaticaParser.DefprocContext ctx) {
        StringBuilder cuerpo = pilaCuerpos.pop();
        cuerpo.append("}\n");
        funcionesYProcedimientos.add(cuerpo.toString());
        esFuncion.pop();
        nombreFuncion.pop();
    }

    @Override
    public void enterDeffun(GramaticaParser.DeffunContext ctx) {
        String id = ctx.ID().getText();
        nombresSubrutinas.add(id);
        nombreFuncion.push(id);
        esFuncion.push(true);

        String tipo = (ctx.tbas() != null && ctx.tbas().getText().equalsIgnoreCase("REAL"))
                ? "float"
                : "int";

        String parametros = ctx.formal_paramlist() != null
                ? extraerParametros(ctx.formal_paramlist().getText())
                : "void";

        StringBuilder cuerpo = new StringBuilder();
        cuerpo.append(tipo)
                .append(" ").append(id)
                .append("(").append(parametros).append(") {\n");
        pilaCuerpos.push(cuerpo);
    }

    @Override
    public void exitDeffun(GramaticaParser.DeffunContext ctx) {
        StringBuilder cuerpo = pilaCuerpos.pop();
        cuerpo.append("}\n");
        funcionesYProcedimientos.add(cuerpo.toString());
        esFuncion.pop();
        nombreFuncion.pop();
    }

    //----------------------------------------------------------------------
    // 3) Declaración de variables (program principal o locales)
    //----------------------------------------------------------------------

    @Override
    public void exitDefvarlist(GramaticaParser.DefvarlistContext ctx) {
        procesarDefvarlist(ctx);
    }

    private void procesarDefvarlist(GramaticaParser.DefvarlistContext ctx) {
        String tipo = ctx.tbas().getText().equalsIgnoreCase("REAL") ? "float" : "int";
        List<String> ids = extraerIDsDesdeVarlist(ctx.varlist());

        StringBuilder dest = destinoActual();
        dest.append("  ")
                .append(tipo)
                .append(" ")
                .append(String.join(", ", ids))
                .append(";\n");

        procesarDefvarlistp(ctx.defvarlistp());
    }

    private void procesarDefvarlistp(GramaticaParser.DefvarlistpContext ctx) {
        if (ctx == null || ctx.varlist() == null) return;
        String tipo = ctx.tbas().getText().equalsIgnoreCase("REAL") ? "float" : "int";
        List<String> ids = extraerIDsDesdeVarlist(ctx.varlist());

        StringBuilder dest = destinoActual();
        dest.append("  ")
                .append(tipo)
                .append(" ")
                .append(String.join(", ", ids))
                .append(";\n");

        procesarDefvarlistp(ctx.defvarlistp());
    }

    /** Devuelve el StringBuilder de la función actual o, si no hay, mainVarDecls */
    private StringBuilder destinoActual() {
        return pilaCuerpos.isEmpty() ? mainVarDecls : pilaCuerpos.peek();
    }

    //----------------------------------------------------------------------
    // 4) Asignaciones y retorno de función
    //----------------------------------------------------------------------

    @Override
    public void exitAsig(GramaticaParser.AsigContext ctx) {
        String lhs = ctx.ID().getText();
        String rhs = ctx.exp().getText()
                .replaceAll("\\bdiv\\b", "/")
                .replaceAll("\\bmod\\b", "%")
                .trim();

        if (!esFuncion.isEmpty() && esFuncion.peek() && lhs.equals(nombreFuncion.peek())) {
            // return en función
            if (!rhs.contains("(") && nombresSubrutinas.contains(rhs)) {
                rhs += "()";
            }
            appendStatement(pilaCuerpos.peek(), "return " + rhs + ";");
        } else {
            // asignación normal
            if (!rhs.contains("(") && nombresSubrutinas.contains(rhs)) {
                rhs += "()";
            }
            appendStatement(pilaCuerpos.isEmpty() ? mainBody : pilaCuerpos.peek(),
                    lhs + " = " + rhs + ";");
        }
    }

    //----------------------------------------------------------------------
    // 5) Llamadas y writeln → printf
    //----------------------------------------------------------------------

    @Override
    public void exitProc_call(GramaticaParser.Proc_callContext ctx) {
        String id       = ctx.ID().getText();
        String argsText = ctx.subparamlist().getText().trim();
        if (argsText.isEmpty()) argsText = "()";

        String inner = argsText.substring(1, argsText.length()-1).trim();

        String sentencia;
        if (id.equalsIgnoreCase("writeln")) {
            String[] parts = inner.split(",");
            StringBuilder fmt = new StringBuilder();
            List<String> argsList = new ArrayList<>();
            for (String p : parts) {
                p = p.trim();
                if ((p.startsWith("'") && p.endsWith("'")) ||
                        (p.startsWith("\"") && p.endsWith("\""))) {
                    fmt.append(p, 1, p.length()-1);
                } else {
                    fmt.append("%f");
                    argsList.add(
                            p.replaceAll("\\bdiv\\b","/")
                                    .replaceAll("\\bmod\\b","%")
                    );
                }
                fmt.append(" ");
            }
            fmt.append("\\n");
            String args = argsList.isEmpty() ? "" : ", " + String.join(", ", argsList);
            sentencia = "printf(\"" + fmt + "\"" + args + ");";
        } else {
            sentencia = id + argsText
                    .replaceAll("\\bdiv\\b","/")
                    .replaceAll("\\bmod\\b","%")
                    + ";";
        }

        appendStatement(pilaCuerpos.isEmpty() ? mainBody : pilaCuerpos.peek(), sentencia);
    }

    //----------------------------------------------------------------------
    // 6) Ensamblado final del programa
    //----------------------------------------------------------------------

    @Override
    public void exitPrg(GramaticaParser.PrgContext ctx) {
        salida.append("#include <stdio.h>\n\n")
                .append(defines).append("\n");

        for (String fp : funcionesYProcedimientos) {
            salida.append(fp).append("\n");
        }

        salida.append("void main(void) {\n")
                .append(mainVarDecls)
                .append(mainBody)
                .append("  return 0;\n")
                .append("}\n");
    }

    public String getCodigoFinal() {
        return salida.toString();
    }

    //----------------------------------------------------------------------
    // Métodos auxiliares
    //----------------------------------------------------------------------

    private void appendStatement(StringBuilder buf, String stmt) {
        buf.append("  ").append(stmt).append("\n");
    }

    private List<String> extraerIDsDesdeVarlist(GramaticaParser.VarlistContext ctx) {
        List<String> ids = new ArrayList<>();
        if (ctx == null) return ids;
        ids.add(ctx.ID().getText());
        GramaticaParser.VarlistauxContext aux = ctx.varlistaux();
        while (aux != null && aux.varlist() != null) {
            ids.add(aux.varlist().ID().getText());
            aux = aux.varlist().varlistaux();
        }
        return ids;
    }

    private String extraerParametros(String texto) {
        String sinPar = texto.replace("(", "").replace(")", "");
        String[] grupos = sinPar.split(";");
        List<String> params = new ArrayList<>();
        for (String g : grupos) {
            String[] trozos = g.trim().split(":");
            if (trozos.length != 2) continue;
            String idPart = trozos[0].trim();
            if (idPart.contains(",")) {
                throw new RuntimeException(
                        "Compactación de parámetros no soportada. Use a: TYPE; b: TYPE; …");
            }
            String tipo = trozos[1].trim().equalsIgnoreCase("INTEGER") ? "int" : "float";
            params.add(tipo + " " + idPart);
        }
        return String.join(", ", params);
    }
}