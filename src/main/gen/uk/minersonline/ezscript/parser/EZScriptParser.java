// Generated from D:/projects/ezscript-java/src/main/java/uk/minersonline/ezscript/parser\EZScript.g4 by ANTLR 4.12.0
package uk.minersonline.ezscript.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EZScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, LPAREN=2, RPAREN=3, SEMI=4, PLUS=5, MINUS=6, STAR=7, SLASH=8, CARET=9, 
		EQ=10, COMMA=11, POINT=12, IDENIFIER=13, NUMBER=14, Whitespace=15, Newline=16, 
		BlockComment=17, LineComment=18;
	public static final int
		RULE_input = 0, RULE_program = 1, RULE_expression = 2, RULE_assignment = 3, 
		RULE_func_ = 4, RULE_signExpression = 5, RULE_addingExpression = 6, RULE_multiplyingExpression = 7, 
		RULE_powExpression = 8, RULE_equation = 9, RULE_atom = 10, RULE_identifer = 11, 
		RULE_functionCall = 12, RULE_functionCallArguments = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "program", "expression", "assignment", "func_", "signExpression", 
			"addingExpression", "multiplyingExpression", "powExpression", "equation", 
			"atom", "identifer", "functionCall", "functionCallArguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'('", "')'", "';'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'='", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "LPAREN", "RPAREN", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", 
			"CARET", "EQ", "COMMA", "POINT", "IDENIFIER", "NUMBER", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EZScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EZScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EZScriptParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EZScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EZScriptParser.SEMI, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24678L) != 0)) {
				{
				{
				setState(30);
				expression();
				setState(31);
				match(SEMI);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assignment();
				}
				break;
			case IDENIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				functionCall();
				}
				break;
			case LPAREN:
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				equation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(EZScriptParser.LET, 0); }
		public IdentiferContext identifer() {
			return getRuleContext(IdentiferContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EZScriptParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LET);
			setState(46);
			identifer();
			setState(47);
			match(EQ);
			setState(48);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_Context extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EZScriptParser.LPAREN, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EZScriptParser.RPAREN, 0); }
		public Func_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterFunc_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitFunc_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitFunc_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_Context func_() throws RecognitionException {
		Func_Context _localctx = new Func_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(LPAREN);
				setState(52);
				equation();
				setState(53);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignExpressionContext extends ParserRuleContext {
		public Func_Context func_() {
			return getRuleContext(Func_Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(EZScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EZScriptParser.MINUS, 0); }
		public SignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterSignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitSignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitSignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignExpressionContext signExpression() throws RecognitionException {
		SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(60);
			func_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddingExpressionContext extends ParserRuleContext {
		public AddingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingExpression; }
	 
		public AddingExpressionContext() { }
		public void copyFrom(AddingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionOrSubtractionContext extends AddingExpressionContext {
		public Token operator;
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(EZScriptParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(EZScriptParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(EZScriptParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(EZScriptParser.MINUS, i);
		}
		public AdditionOrSubtractionContext(AddingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterAdditionOrSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitAdditionOrSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitAdditionOrSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddingExpressionContext addingExpression() throws RecognitionException {
		AddingExpressionContext _localctx = new AddingExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addingExpression);
		int _la;
		try {
			_localctx = new AdditionOrSubtractionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			multiplyingExpression();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(63);
				((AdditionOrSubtractionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((AdditionOrSubtractionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				multiplyingExpression();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
	 
		public MultiplyingExpressionContext() { }
		public void copyFrom(MultiplyingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationOrDivisionContext extends MultiplyingExpressionContext {
		public Token operator;
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(EZScriptParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(EZScriptParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(EZScriptParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(EZScriptParser.SLASH, i);
		}
		public MultiplicationOrDivisionContext(MultiplyingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterMultiplicationOrDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitMultiplicationOrDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitMultiplicationOrDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiplyingExpression);
		int _la;
		try {
			_localctx = new MultiplicationOrDivisionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			powExpression();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(71);
				((MultiplicationOrDivisionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
					((MultiplicationOrDivisionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(72);
				powExpression();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowExpressionContext extends ParserRuleContext {
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
	 
		public PowExpressionContext() { }
		public void copyFrom(PowExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends PowExpressionContext {
		public Token operator;
		public List<SignExpressionContext> signExpression() {
			return getRuleContexts(SignExpressionContext.class);
		}
		public SignExpressionContext signExpression(int i) {
			return getRuleContext(SignExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(EZScriptParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(EZScriptParser.CARET, i);
		}
		public PowerContext(PowExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_powExpression);
		int _la;
		try {
			_localctx = new PowerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			signExpression();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(79);
				((PowerContext)_localctx).operator = match(CARET);
				setState(80);
				signExpression();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public Func_Context func_() {
			return getRuleContext(Func_Context.class,0);
		}
		public AddingExpressionContext addingExpression() {
			return getRuleContext(AddingExpressionContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equation);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				func_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				addingExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(EZScriptParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(EZScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EZScriptParser.MINUS, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(93);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentiferContext extends ParserRuleContext {
		public TerminalNode IDENIFIER() { return getToken(EZScriptParser.IDENIFIER, 0); }
		public IdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitIdentifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentiferContext identifer() throws RecognitionException {
		IdentiferContext _localctx = new IdentiferContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentiferContext identifer() {
			return getRuleContext(IdentiferContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EZScriptParser.LPAREN, 0); }
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EZScriptParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			identifer();
			setState(98);
			match(LPAREN);
			setState(99);
			functionCallArguments();
			setState(100);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<Func_Context> func_() {
			return getRuleContexts(Func_Context.class);
		}
		public Func_Context func_(int i) {
			return getRuleContext(Func_Context.class,i);
		}
		public List<TerminalNode> IDENIFIER() { return getTokens(EZScriptParser.IDENIFIER); }
		public TerminalNode IDENIFIER(int i) {
			return getToken(EZScriptParser.IDENIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EZScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EZScriptParser.COMMA, i);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EZScriptListener ) ((EZScriptListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EZScriptVisitor ) return ((EZScriptVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallArguments);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LPAREN:
			case PLUS:
			case MINUS:
			case IDENIFIER:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(103);
					functionCall();
					}
					break;
				case 2:
					{
					setState(104);
					func_();
					}
					break;
				case 3:
					{
					setState(105);
					match(IDENIFIER);
					}
					break;
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(108);
					match(COMMA);
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(109);
						functionCall();
						}
						break;
					case 2:
						{
						setState(110);
						func_();
						}
						break;
					case 3:
						{
						setState(111);
						match(IDENIFIER);
						}
						break;
					}
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001%\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00048\b\u0004"+
		"\u0001\u0005\u0003\u0005;\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006B\b\u0006\n\u0006\f\u0006E\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007J\b\u0007\n\u0007\f\u0007"+
		"M\t\u0007\u0001\b\u0001\b\u0001\b\u0005\bR\b\b\n\b\f\bU\t\b\u0001\t\u0001"+
		"\t\u0003\tY\b\t\u0001\n\u0003\n\\\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\rk\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rq\b\r\u0005"+
		"\rs\b\r\n\r\f\rv\t\r\u0003\rx\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002"+
		"\u0001\u0000\u0005\u0006\u0001\u0000\u0007\b{\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000"+
		"\u0006-\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n:\u0001\u0000"+
		"\u0000\u0000\f>\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000"+
		"\u0010N\u0001\u0000\u0000\u0000\u0012X\u0001\u0000\u0000\u0000\u0014["+
		"\u0001\u0000\u0000\u0000\u0016_\u0001\u0000\u0000\u0000\u0018a\u0001\u0000"+
		"\u0000\u0000\u001aw\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001"+
		"\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0004\u0002"+
		"\u0000\u001f \u0005\u0004\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0000\u0000\u0001\'\u0003\u0001\u0000\u0000\u0000"+
		"(,\u0003\u0006\u0003\u0000),\u0003\u0018\f\u0000*,\u0003\u0012\t\u0000"+
		"+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0003"+
		"\u0016\u000b\u0000/0\u0005\n\u0000\u000001\u0003\u0004\u0002\u00001\u0007"+
		"\u0001\u0000\u0000\u000028\u0003\u0014\n\u000034\u0005\u0002\u0000\u0000"+
		"45\u0003\u0012\t\u000056\u0005\u0003\u0000\u000068\u0001\u0000\u0000\u0000"+
		"72\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u00008\t\u0001\u0000\u0000"+
		"\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0003\b\u0004\u0000=\u000b\u0001"+
		"\u0000\u0000\u0000>C\u0003\u000e\u0007\u0000?@\u0007\u0000\u0000\u0000"+
		"@B\u0003\u000e\u0007\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\r\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FK\u0003\u0010\b\u0000GH\u0007\u0001"+
		"\u0000\u0000HJ\u0003\u0010\b\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u000f"+
		"\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NS\u0003\n\u0005\u0000"+
		"OP\u0005\t\u0000\u0000PR\u0003\n\u0005\u0000QO\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\u0011\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0003"+
		"\b\u0004\u0000WY\u0003\f\u0006\u0000XV\u0001\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000Z\\\u0007\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0005\u000e\u0000\u0000^\u0015\u0001\u0000\u0000\u0000"+
		"_`\u0005\r\u0000\u0000`\u0017\u0001\u0000\u0000\u0000ab\u0003\u0016\u000b"+
		"\u0000bc\u0005\u0002\u0000\u0000cd\u0003\u001a\r\u0000de\u0005\u0003\u0000"+
		"\u0000e\u0019\u0001\u0000\u0000\u0000fx\u0001\u0000\u0000\u0000gk\u0003"+
		"\u0018\f\u0000hk\u0003\b\u0004\u0000ik\u0005\r\u0000\u0000jg\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kt\u0001"+
		"\u0000\u0000\u0000lp\u0005\u000b\u0000\u0000mq\u0003\u0018\f\u0000nq\u0003"+
		"\b\u0004\u0000oq\u0005\r\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rl\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wf\u0001\u0000\u0000\u0000wj\u0001\u0000\u0000\u0000x\u001b"+
		"\u0001\u0000\u0000\u0000\r#+7:CKSX[jptw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}