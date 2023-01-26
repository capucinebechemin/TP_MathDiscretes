// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, VAR=9, 
		OPHP=10, OPLP=11, LIT=12, WS=13, LINE_COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "VAR", 
			"OPHP", "OPLP", "LIT", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'ifz'", "'then'", "'else'", "'let'", "'='", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "VAR", "OPHP", 
			"OPLP", "LIT", "WS", "LINE_COMMENT"
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

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
		"\u0004\u0000\u000e_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\b:\b\b\u000b\b\f\b;\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bE\b\u000b\n\u000b\f"+
		"\u000bH\t\u000b\u0003\u000bJ\b\u000b\u0001\f\u0004\fM\b\f\u000b\f\f\f"+
		"N\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rW\b\r\n\r\f\r"+
		"Z\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0007\u0002"+
		"\u0000AZaz\u0002\u0000**//\u0002\u0000++--\u0001\u000019\u0001\u00000"+
		"9\u0003\u0000\t\n\r\r  \u0001\u0000\n\nc\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		"\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007%\u0001"+
		"\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000"+
		"\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u0011"+
		"9\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015?\u0001"+
		"\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019L\u0001\u0000\u0000"+
		"\u0000\u001bR\u0001\u0000\u0000\u0000\u001d\u001e\u0005(\u0000\u0000\u001e"+
		"\u0002\u0001\u0000\u0000\u0000\u001f \u0005)\u0000\u0000 \u0004\u0001"+
		"\u0000\u0000\u0000!\"\u0005i\u0000\u0000\"#\u0005f\u0000\u0000#$\u0005"+
		"z\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005"+
		"h\u0000\u0000\'(\u0005e\u0000\u0000()\u0005n\u0000\u0000)\b\u0001\u0000"+
		"\u0000\u0000*+\u0005e\u0000\u0000+,\u0005l\u0000\u0000,-\u0005s\u0000"+
		"\u0000-.\u0005e\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005l\u0000"+
		"\u000001\u0005e\u0000\u000012\u0005t\u0000\u00002\f\u0001\u0000\u0000"+
		"\u000034\u0005=\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005i\u0000"+
		"\u000067\u0005n\u0000\u00007\u0010\u0001\u0000\u0000\u00008:\u0007\u0000"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0012\u0001\u0000\u0000"+
		"\u0000=>\u0007\u0001\u0000\u0000>\u0014\u0001\u0000\u0000\u0000?@\u0007"+
		"\u0002\u0000\u0000@\u0016\u0001\u0000\u0000\u0000AJ\u00050\u0000\u0000"+
		"BF\u0007\u0003\u0000\u0000CE\u0007\u0004\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IA\u0001"+
		"\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000J\u0018\u0001\u0000\u0000"+
		"\u0000KM\u0007\u0005\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0006\f\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000"+
		"RS\u0005/\u0000\u0000ST\u0005/\u0000\u0000TX\u0001\u0000\u0000\u0000U"+
		"W\b\u0006\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\n\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0006\r\u0000\u0000^\u001c\u0001\u0000\u0000\u0000\u0006"+
		"\u0000;FINX\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}