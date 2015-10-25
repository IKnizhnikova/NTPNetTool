// Generated from CTL.g4 by ANTLR 4.2.1

  package algorithms.ctlparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CTLParser}.
 */
public interface CTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CTLParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(@NotNull CTLParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(@NotNull CTLParser.ApContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull CTLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull CTLParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#NOT}.
	 * @param ctx the parse tree
	 */
	void enterNOT(@NotNull CTLParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#NOT}.
	 * @param ctx the parse tree
	 */
	void exitNOT(@NotNull CTLParser.NOTContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#AND}.
	 * @param ctx the parse tree
	 */
	void enterAND(@NotNull CTLParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#AND}.
	 * @param ctx the parse tree
	 */
	void exitAND(@NotNull CTLParser.ANDContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#false}.
	 * @param ctx the parse tree
	 */
	void enterFalse(@NotNull CTLParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#false}.
	 * @param ctx the parse tree
	 */
	void exitFalse(@NotNull CTLParser.FalseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#true}.
	 * @param ctx the parse tree
	 */
	void enterTrue(@NotNull CTLParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#true}.
	 * @param ctx the parse tree
	 */
	void exitTrue(@NotNull CTLParser.TrueContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#pare}.
	 * @param ctx the parse tree
	 */
	void enterPare(@NotNull CTLParser.PareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#pare}.
	 * @param ctx the parse tree
	 */
	void exitPare(@NotNull CTLParser.PareContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#ORorIMPL}.
	 * @param ctx the parse tree
	 */
	void enterORorIMPL(@NotNull CTLParser.ORorIMPLContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#ORorIMPL}.
	 * @param ctx the parse tree
	 */
	void exitORorIMPL(@NotNull CTLParser.ORorIMPLContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#AEXGF}.
	 * @param ctx the parse tree
	 */
	void enterAEXGF(@NotNull CTLParser.AEXGFContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#AEXGF}.
	 * @param ctx the parse tree
	 */
	void exitAEXGF(@NotNull CTLParser.AEXGFContext ctx);

	/**
	 * Enter a parse tree produced by {@link CTLParser#EAU}.
	 * @param ctx the parse tree
	 */
	void enterEAU(@NotNull CTLParser.EAUContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLParser#EAU}.
	 * @param ctx the parse tree
	 */
	void exitEAU(@NotNull CTLParser.EAUContext ctx);
}