package uk.minersonline.ezscript.generation;

import uk.minersonline.ezscript.parser.EZScriptBaseListener;
import uk.minersonline.ezscript.parser.EZScriptParser;

public class EZScriptListener extends EZScriptBaseListener {
	@Override
	public void enterAssignment(EZScriptParser.AssignmentContext ctx) {
		this.enterExpression(ctx.expression());
		super.enterAssignment(ctx);
	}

	@Override
	public void enterAdditionOrSubtraction(EZScriptParser.AdditionOrSubtractionContext ctx) {
		super.enterAdditionOrSubtraction(ctx);
	}

	@Override
	public void enterMultiplicationOrDivision(EZScriptParser.MultiplicationOrDivisionContext ctx) {
		super.enterMultiplicationOrDivision(ctx);
	}

	@Override
	public void enterIdentifer(EZScriptParser.IdentiferContext ctx) {
		super.enterIdentifer(ctx);
	}

	@Override
	public void enterFunctionCall(EZScriptParser.FunctionCallContext ctx) {
		super.enterFunctionCall(ctx);
	}
}
