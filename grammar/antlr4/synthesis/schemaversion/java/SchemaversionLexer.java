// Generated from Schemaversion.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemaversionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Schemaversion=4, Unreserved=5, Alpha=6, Digit=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Schemaversion", "Unreserved", "Alpha", "Digit", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'='", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Schemaversion", "Unreserved", "Alpha", "Digit"
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


	public SchemaversionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Schemaversion.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00b0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7y\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2"+
		"%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2\3\2\36\5\2/"+
		"\60aa\u0080\u0080\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2"+
		"HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3E\3\2\2\2\5G\3\2"+
		"\2\2\7I\3\2\2\2\tK\3\2\2\2\13\\\3\2\2\2\rx\3\2\2\2\17z\3\2\2\2\21|\3\2"+
		"\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33"+
		"\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e"+
		"\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0094\3\2\2\2+\u0096\3\2\2\2"+
		"-\u0098\3\2\2\2/\u009a\3\2\2\2\61\u009c\3\2\2\2\63\u009e\3\2\2\2\65\u00a0"+
		"\3\2\2\2\67\u00a2\3\2\2\29\u00a4\3\2\2\2;\u00a6\3\2\2\2=\u00a8\3\2\2\2"+
		"?\u00aa\3\2\2\2A\u00ac\3\2\2\2C\u00ae\3\2\2\2EF\7&\2\2F\4\3\2\2\2GH\7"+
		"?\2\2H\6\3\2\2\2IJ\7,\2\2J\b\3\2\2\2KL\5\65\33\2LM\5\25\13\2MN\5\37\20"+
		"\2NO\5\31\r\2OP\5)\25\2PQ\5\21\t\2QR\5;\36\2RS\5\31\r\2ST\5\63\32\2TU"+
		"\5\65\33\2UV\5!\21\2VW\5-\27\2WX\5+\26\2X\n\3\2\2\2Y]\5\r\7\2Z]\5\17\b"+
		"\2[]\t\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\f\3\2\2\2^y\5\21\t\2_y"+
		"\5\23\n\2`y\5\25\13\2ay\5\27\f\2by\5\31\r\2cy\5\33\16\2dy\5\35\17\2ey"+
		"\5\37\20\2fy\5!\21\2gy\5#\22\2hy\5%\23\2iy\5\'\24\2jy\5)\25\2ky\5+\26"+
		"\2ly\5-\27\2my\5/\30\2ny\5\61\31\2oy\5\63\32\2py\5\65\33\2qy\5\67\34\2"+
		"ry\59\35\2sy\5;\36\2ty\5=\37\2uy\5? \2vy\5A!\2wy\5C\"\2x^\3\2\2\2x_\3"+
		"\2\2\2x`\3\2\2\2xa\3\2\2\2xb\3\2\2\2xc\3\2\2\2xd\3\2\2\2xe\3\2\2\2xf\3"+
		"\2\2\2xg\3\2\2\2xh\3\2\2\2xi\3\2\2\2xj\3\2\2\2xk\3\2\2\2xl\3\2\2\2xm\3"+
		"\2\2\2xn\3\2\2\2xo\3\2\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3"+
		"\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\16\3\2\2\2z{\t\3\2\2{\20\3\2\2\2"+
		"|}\t\4\2\2}\22\3\2\2\2~\177\t\5\2\2\177\24\3\2\2\2\u0080\u0081\t\6\2\2"+
		"\u0081\26\3\2\2\2\u0082\u0083\t\7\2\2\u0083\30\3\2\2\2\u0084\u0085\t\b"+
		"\2\2\u0085\32\3\2\2\2\u0086\u0087\t\t\2\2\u0087\34\3\2\2\2\u0088\u0089"+
		"\t\n\2\2\u0089\36\3\2\2\2\u008a\u008b\t\13\2\2\u008b \3\2\2\2\u008c\u008d"+
		"\t\f\2\2\u008d\"\3\2\2\2\u008e\u008f\t\r\2\2\u008f$\3\2\2\2\u0090\u0091"+
		"\t\16\2\2\u0091&\3\2\2\2\u0092\u0093\t\17\2\2\u0093(\3\2\2\2\u0094\u0095"+
		"\t\20\2\2\u0095*\3\2\2\2\u0096\u0097\t\21\2\2\u0097,\3\2\2\2\u0098\u0099"+
		"\t\22\2\2\u0099.\3\2\2\2\u009a\u009b\t\23\2\2\u009b\60\3\2\2\2\u009c\u009d"+
		"\t\24\2\2\u009d\62\3\2\2\2\u009e\u009f\t\25\2\2\u009f\64\3\2\2\2\u00a0"+
		"\u00a1\t\26\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\t\27\2\2\u00a38\3\2\2\2\u00a4"+
		"\u00a5\t\30\2\2\u00a5:\3\2\2\2\u00a6\u00a7\t\31\2\2\u00a7<\3\2\2\2\u00a8"+
		"\u00a9\t\32\2\2\u00a9>\3\2\2\2\u00aa\u00ab\t\33\2\2\u00ab@\3\2\2\2\u00ac"+
		"\u00ad\t\34\2\2\u00adB\3\2\2\2\u00ae\u00af\t\35\2\2\u00afD\3\2\2\2\5\2"+
		"\\x\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}