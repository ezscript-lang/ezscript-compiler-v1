// Generated from D:/projects/ezscript-java/src/main/java/uk/minersonline/ezscript/parser\EZScript.g4 by ANTLR 4.12.0
package uk.minersonline.ezscript.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EZScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EZScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(EZScriptParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EZScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EZScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EZScriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#func_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_(EZScriptParser.Func_Context ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(EZScriptParser.SignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOrSubtraction}
	 * labeled alternative in {@link EZScriptParser#addingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOrSubtraction(EZScriptParser.AdditionOrSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link EZScriptParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOrDivision(EZScriptParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link EZScriptParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(EZScriptParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(EZScriptParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(EZScriptParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#identifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifer(EZScriptParser.IdentiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(EZScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EZScriptParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(EZScriptParser.FunctionCallArgumentsContext ctx);
}