import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;


public class TraductorListener extends GramaticaListener {

    private final StringBuilder salida = new StringBuilder();
    private final StringBuilder defines = new StringBuilder();
    private final List<String> funcionesYProcedimientos = new ArrayList<>();
    private final StringBuilder mainBody = new StringBuilder();

    private String nombrePrograma;

    @Override
    public void enterPrg(grupo8Parser.PrgContext ctx) {
        if (ctx.getStart().getText().equals("program")) {
            nombrePrograma = ctx.ID().getText();
        }
    }

    @Override
    public void exitDefcte(grupo8Parser.DefcteContext ctx) {
        String id = ctx.ID().getText();
        String valor = ctx.simpvalue().getText();
        defines.append("#define ").append(id).append(" ").append(valor).append("\n");
    }

    @Override
    public void enterDefproc(grupo8Parser.DefprocContext ctx) {
        String id = ctx.ID().getText();
        String parametros = extraerParametros(ctx.formal_paramlist());
        funcionesYProcedimientos.add("void " + id + "(" + parametros + ") {\n");
    }

    @Override
    public void enterDeffun(grupo8Parser.DeffunContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tbas().getText().equals("INTEGER") ? "int" : "float";
        String parametros = extraerParametros(ctx.formal_paramlist());
        funcionesYProcedimientos.add(tipo + " " + id + "(" + parametros + ") {\n");
    }

    @Override
    public void exitBlq(grupo8Parser.BlqContext ctx) {
        if (ctx.getParent() instanceof grupo8Parser.PrgContext) {
            mainBody.append("void main(void) {\n");
        }
    }

    @Override
    public void exitAsig(grupo8Parser.AsigContext ctx) {
        String lhs = ctx.ID().getText();
        String rhs = ctx.exp().getText();
        String sentencia = lhs + " = " + rhs + ";\n";

        if (ctx.getParent().getParent() instanceof grupo8Parser.PrgContext) {
            mainBody.append("  ").append(sentencia);
        } else {
            funcionesYProcedimientos.set(funcionesYProcedimientos.size() - 1,
                    funcionesYProcedimientos.get(funcionesYProcedimientos.size() - 1) + "  " + sentencia);
        }
    }

    @Override
    public void exitPrg(grupo8Parser.PrgContext ctx) {
        // Cerrar bloques
        for (int i = 0; i < funcionesYProcedimientos.size(); i++) {
            funcionesYProcedimientos.set(i, funcionesYProcedimientos.get(i) + "}\n\n");
        }
        mainBody.append("}\n");

        // Componer salida
        salida.append(defines);
        for (String fp : funcionesYProcedimientos) {
            salida.append(fp);
        }
        salida.append(mainBody);
    }

    public String getCodigoFinal() {
        return salida.toString();
    }

    private String extraerParametros(grupo8Parser.Formal_paramlistContext ctx) {
        if (ctx == null || ctx.formal_param() == null) return "void";

        StringBuilder resultado = new StringBuilder();
        for (grupo8Parser.Formal_paramContext p : ctx.formal_param()) {
            String tipo = p.tbas().getText().equals("INTEGER") ? "int" : "float";
            for (TerminalNode id : p.varlist().ID()) {
                if (resultado.length() > 0) resultado.append(", ");
                resultado.append(tipo).append(" ").append(id.getText());
            }
        }
        return resultado.toString();
    }
}
