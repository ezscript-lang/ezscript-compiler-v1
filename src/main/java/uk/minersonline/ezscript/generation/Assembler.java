package uk.minersonline.ezscript.generation;

import uk.minersonline.ezscript.parser.EZScriptParser;

import java.util.HashMap;

public class Assembler {
	private static HashMap<String, Variable> variables = new HashMap<>();
	private static String output = "";
	private static int stack_size;

	public static void generate(EZScriptParser.AtomContext term_int_lit) {
		output += "    mov rax, " + term_int_lit.getText() + "\n";
		push("rax");
	}

	public static void generate(EZScriptParser.AssignmentContext term_ident, EZScriptVisitor visitor) {
//		visitor.visit(term_ident.expression());
		if (variables.containsKey(term_ident.getText())) {
			//TODO: raise "Identifier already used:" error.
			return;
		}
		Variable var = new Variable(stack_size);
		variables.put(term_ident.getText(), var);
	}

	public static void generate(EZScriptParser.IdentiferContext term_ident) {
		if (!variables.containsKey(term_ident.getText())) {
			//TODO: raise "Undeclared identifier:" error.
			return;
		}
		Variable var = variables.get(term_ident.getText());
		push("QWORD [rsp + " + ((stack_size - var.stack_loc - 1) * 8) + "]\n");
	}

	public static void generate(EZScriptParser.AdditionOrSubtractionContext bin_expr) {
		if (bin_expr.operator.getText().equals("+")) {
			pop("rax");
			pop("rbx");
			output += "    add rax, rbx\n";
			push("rax");
		} else if (bin_expr.operator.getText().equals("-")) {
			pop("rax");
			pop("rbx");
			output += "    sub rax, rbx\n";
			push("rax");
		}
	}

	public static void generate(EZScriptParser.MultiplicationOrDivisionContext bin_expr) {
		if (bin_expr.operator.getText().equals("*")) {
			pop("rax");
			pop("rbx");
			output += "    mul rbx\n";
			push("rax");
		} else if (bin_expr.operator.getText().equals("/")) {
			pop("rax");
			pop("rbx");
			output += "    div rbx\n";
			push("rax");
		}
	}

	private static void push(String reg) {
		output += "    push " + reg + "\n";
		stack_size++;
	}

	private static void pop(String reg) {
		output += "    pop " + reg + "\n";
		stack_size--;
	}

	private static class Variable {
		int stack_loc;

		public Variable(int stack_loc) {
			this.stack_loc = stack_loc;
		}
	}

	public static String getOutput() {
		return output;
	}
}
