// Generated from D:/projects/ezscript-java/src/main/java/uk/minersonline/ezscript/parser\EZScript.g4 by ANTLR 4.12.0
package uk.minersonline.ezscript.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EZScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, LPAREN=2, RPAREN=3, SEMI=4, PLUS=5, MINUS=6, STAR=7, SLASH=8, CARET=9, 
		EQ=10, COMMA=11, POINT=12, IDENIFIER=13, NUMBER=14, Whitespace=15, Newline=16, 
		BlockComment=17, LineComment=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "LPAREN", "RPAREN", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", 
			"CARET", "EQ", "COMMA", "POINT", "IDENIFIER", "VALID_ID_START", "VALID_ID_CHAR", 
			"NUMBER", "E1", "E2", "SIGN", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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


	public EZScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EZScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\fL\b\f\n\f\f\fO\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"U\b\u000e\u0001\u000f\u0004\u000fX\b\u000f\u000b\u000f\f\u000fY\u0001"+
		"\u000f\u0001\u000f\u0004\u000f^\b\u000f\u000b\u000f\f\u000f_\u0003\u000f"+
		"b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0004\u0013k\b\u0013\u000b\u0013\f\u0013l\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014s\b\u0014\u0001"+
		"\u0014\u0003\u0014v\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015~\b\u0015\n\u0015\f\u0015\u0081"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u008c\b\u0016\n"+
		"\u0016\f\u0016\u008f\t\u0016\u0001\u0016\u0001\u0016\u0001\u007f\u0000"+
		"\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000"+
		"\u001d\u0000\u001f\u000e!\u0000#\u0000%\u0000\'\u000f)\u0010+\u0011-\u0012"+
		"\u0001\u0000\u0004\u0003\u0000AZ__az\u0002\u0000++--\u0002\u0000\t\t "+
		" \u0002\u0000\n\n\r\r\u0096\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0001/\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055"+
		"\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000"+
		"\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013C"+
		"\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017G\u0001\u0000"+
		"\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000"+
		"\u001dT\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000!c\u0001"+
		"\u0000\u0000\u0000#e\u0001\u0000\u0000\u0000%g\u0001\u0000\u0000\u0000"+
		"\'j\u0001\u0000\u0000\u0000)u\u0001\u0000\u0000\u0000+y\u0001\u0000\u0000"+
		"\u0000-\u0087\u0001\u0000\u0000\u0000/0\u0005l\u0000\u000001\u0005e\u0000"+
		"\u000012\u0005t\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005(\u0000"+
		"\u00004\u0004\u0001\u0000\u0000\u000056\u0005)\u0000\u00006\u0006\u0001"+
		"\u0000\u0000\u000078\u0005;\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005"+
		"+\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005-\u0000\u0000<\f\u0001"+
		"\u0000\u0000\u0000=>\u0005*\u0000\u0000>\u000e\u0001\u0000\u0000\u0000"+
		"?@\u0005/\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005^\u0000\u0000"+
		"B\u0012\u0001\u0000\u0000\u0000CD\u0005=\u0000\u0000D\u0014\u0001\u0000"+
		"\u0000\u0000EF\u0005,\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GH\u0005"+
		".\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IM\u0003\u001b\r\u0000JL\u0003"+
		"\u001d\u000e\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u001a\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u001c"+
		"\u0001\u0000\u0000\u0000RU\u0003\u001b\r\u0000SU\u000209\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u001e\u0001\u0000\u0000"+
		"\u0000VX\u000209\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Za\u0001\u0000\u0000"+
		"\u0000[]\u0005.\u0000\u0000\\^\u000209\u0000]\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b \u0001\u0000\u0000\u0000cd\u0005E\u0000\u0000d\"\u0001\u0000"+
		"\u0000\u0000ef\u0005e\u0000\u0000f$\u0001\u0000\u0000\u0000gh\u0007\u0001"+
		"\u0000\u0000h&\u0001\u0000\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006\u0013\u0000"+
		"\u0000o(\u0001\u0000\u0000\u0000pr\u0005\r\u0000\u0000qs\u0005\n\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tv\u0005\n\u0000\u0000up\u0001\u0000\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006\u0014\u0000\u0000x*\u0001"+
		"\u0000\u0000\u0000yz\u0005/\u0000\u0000z{\u0005*\u0000\u0000{\u007f\u0001"+
		"\u0000\u0000\u0000|~\t\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005*\u0000\u0000\u0083\u0084\u0005/\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0006\u0015\u0001"+
		"\u0000\u0086,\u0001\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088"+
		"\u0089\u0005/\u0000\u0000\u0089\u008d\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\b\u0003\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0006\u0016\u0001\u0000\u0091.\u0001\u0000"+
		"\u0000\u0000\u000b\u0000MTY_alru\u007f\u008d\u0002\u0000\u0001\u0000\u0000"+
		"\u0002\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}