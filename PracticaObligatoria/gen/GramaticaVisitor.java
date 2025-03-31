// Generated from R:/Documents/PL/TrabajoObligatorioPL/PracticaObligatoria/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(GramaticaParser.AxiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(GramaticaParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(GramaticaParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(GramaticaParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(GramaticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistp(GramaticaParser.SentlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(GramaticaParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(GramaticaParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(GramaticaParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ctelistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelistp(GramaticaParser.CtelistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(GramaticaParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(GramaticaParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(GramaticaParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defvarlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlistp(GramaticaParser.DefvarlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(GramaticaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#varlistaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlistaux(GramaticaParser.VarlistauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(GramaticaParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(GramaticaParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(GramaticaParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#formalparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalparam(GramaticaParser.FormalparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#formalparamaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalparamaux(GramaticaParser.FormalparamauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(GramaticaParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(GramaticaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(GramaticaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(GramaticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpp(GramaticaParser.ExppContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(GramaticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(GramaticaParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(GramaticaParser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(GramaticaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#explistaux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplistaux(GramaticaParser.ExplistauxContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(GramaticaParser.Proc_callContext ctx);
}