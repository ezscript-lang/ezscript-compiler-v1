package uk.minersonline.ezscript;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import uk.minersonline.ezscript.generation.Assembler;
import uk.minersonline.ezscript.generation.EZScriptListener;
import uk.minersonline.ezscript.generation.EZScriptVisitor;
import uk.minersonline.ezscript.parser.*;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		CharStream code = CharStreams.fromFileName("test.ezs");
		EZScriptLexer lexer = new EZScriptLexer(code);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		EZScriptParser parser = new EZScriptParser(tokens);
		ParseTree tree = parser.input().getChild(0);
		EZScriptVisitor listener = new EZScriptVisitor();
		listener.visit(tree);
//		ParseTree tree = parser.input().getChild(0);
//		EZScriptListener listener = new EZScriptListener();
//		ParseTreeWalker.DEFAULT.walk(listener, tree);

		System.out.println(Assembler.getOutput());
	}
}