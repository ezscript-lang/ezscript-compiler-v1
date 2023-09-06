package uk.minersonline.ezscript.generation;

import uk.minersonline.ezscript.parser.EZScriptBaseVisitor;
import uk.minersonline.ezscript.parser.EZScriptParser;

public class EZScriptVisitor extends EZScriptBaseVisitor<Void> {

	@Override
	public Void visitAssignment(EZScriptParser.AssignmentContext ctx) {
		Assembler.generate(ctx, this);
		return super.visitAssignment(ctx);
	}

	public Void visitAtom(EZScriptParser.AtomContext ctx) {
		Assembler.generate(ctx);
		return super.visitAtom(ctx);
	}

	@Override
	public Void visitAdditionOrSubtraction(EZScriptParser.AdditionOrSubtractionContext ctx) {
		System.out.println(ctx.getChild(0).getText());
		System.out.println(ctx.getChild(1).getText());
		System.out.println(ctx.getChild(2).getText());
		System.out.println(ctx.getChild(3).getText());
		System.out.println(ctx.getChild(4).getText());
		visit(ctx.getChild(0));
		visit(ctx.getChild(2));
//		ctx.children.remove(0);
//		ctx.children.remove(1);
		Assembler.generate(ctx);
		return super.visitAdditionOrSubtraction(ctx);
	}

	@Override
	public Void visitMultiplicationOrDivision(EZScriptParser.MultiplicationOrDivisionContext ctx) {
//		System.out.println(ctx.getText());
//		visit(ctx.powExpression(0));
//		visit(ctx.powExpression(1));
//		ctx.children.remove(0);
//		ctx.children.remove(1);
//		Assembler.generate(ctx);
		return super.visitMultiplicationOrDivision(ctx);
	}

	@Override
	public Void visitIdentifer(EZScriptParser.IdentiferContext ctx) {
		Assembler.generate(ctx);
		return super.visitIdentifer(ctx);
	}

	@Override
	public Void visitFunctionCall(EZScriptParser.FunctionCallContext ctx) {
		return super.visitFunctionCall(ctx);
	}

	@Override
	public Void visitFunctionCallArguments(EZScriptParser.FunctionCallArgumentsContext ctx) {
		return super.visitFunctionCallArguments(ctx);
	}
}
