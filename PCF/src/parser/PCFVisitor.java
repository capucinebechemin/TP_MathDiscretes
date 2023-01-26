// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PCFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PCFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PCFParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(PCFParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(PCFParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(PCFParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarLet}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarLet(PCFParser.VarLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunEnter}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunEnter(PCFParser.FunEnterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarEnter}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEnter(PCFParser.VarEnterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(PCFParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fun}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(PCFParser.FunContext ctx);
}