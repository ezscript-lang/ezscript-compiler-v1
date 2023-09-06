// Generated from D:/projects/ezscript-java/src/main/java/uk/minersonline/ezscript/parser\EZScript.g4 by ANTLR 4.12.0
package uk.minersonline.ezscript.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EZScriptParser}.
 */
public interface EZScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(EZScriptParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(EZScriptParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EZScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EZScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EZScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EZScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EZScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EZScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#func_}.
	 * @param ctx the parse tree
	 */
	void enterFunc_(EZScriptParser.Func_Context ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#func_}.
	 * @param ctx the parse tree
	 */
	void exitFunc_(EZScriptParser.Func_Context ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(EZScriptParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(EZScriptParser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionOrSubtraction}
	 * labeled alternative in {@link EZScriptParser#addingExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionOrSubtraction(EZScriptParser.AdditionOrSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionOrSubtraction}
	 * labeled alternative in {@link EZScriptParser#addingExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionOrSubtraction(EZScriptParser.AdditionOrSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link EZScriptParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationOrDivision(EZScriptParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link EZScriptParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationOrDivision(EZScriptParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link EZScriptParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPower(EZScriptParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link EZScriptParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPower(EZScriptParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(EZScriptParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(EZScriptParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(EZScriptParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(EZScriptParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#identifer}.
	 * @param ctx the parse tree
	 */
	void enterIdentifer(EZScriptParser.IdentiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#identifer}.
	 * @param ctx the parse tree
	 */
	void exitIdentifer(EZScriptParser.IdentiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(EZScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(EZScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZScriptParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(EZScriptParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZScriptParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(EZScriptParser.FunctionCallArgumentsContext ctx);
}