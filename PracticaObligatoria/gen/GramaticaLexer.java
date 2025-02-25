// Generated from R:/Documents/PL/recursiva/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, CONSTINT=2, CONSTREAL=3, CONSTLI=4, COMENTARIO1L=5, COMENTARIOVL=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "CONSTINT", "CONSTREAL", "CONSTLI", "COMENTARIO1L", "COMENTARIOVL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "CONSTINT", "CONSTREAL", "CONSTLI", "COMENTARIO1L", "COMENTARIOVL"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			CONSTINT_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			CONSTREAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			CONSTLI_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			COMENTARIO1L_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			COMENTARIOVL_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			break;
		}
	}
	private void CONSTINT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			break;
		}
	}
	private void CONSTREAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			break;
		}
	}
	private void CONSTLI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			break;
		}
	}
	private void COMENTARIO1L_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			break;
		}
	}
	private void COMENTARIOVL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0006_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\u0010\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0003\u0001\u0017\b\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001"+
		"\u000b\u0001\f\u0001\u001b\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002"+
		"!\b\u0002\u0001\u0002\u0004\u0002$\b\u0002\u000b\u0002\f\u0002%\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002/\b\u0002\u000b\u0002\f\u00020\u0001\u0002\u0001\u0002"+
		"\u0003\u00025\b\u0002\u0003\u00027\b\u0002\u0001\u0002\u0004\u0002:\b"+
		"\u0002\u000b\u0002\f\u0002;\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0004\u0003B\b\u0003\u000b\u0003\f\u0003C\u0001\u0003\u0004\u0003"+
		"G\b\u0003\u000b\u0003\f\u0003H\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0004\u0004P\b\u0004\u000b\u0004\f\u0004Q\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005Y\b\u0005"+
		"\u000b\u0005\f\u0005Z\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000"+
		"\u0006\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\u0001\u0000\b\u0002\u0000AZaz\u0004\u000009AZ__az\u0002\u0000++--\u0001"+
		"\u000009\u0002\u0000EEee\u0006\u0000,,..09AZ__az\u0002\u0000\n\n~~\u0002"+
		"\u0000**~~m\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0001\r\u0001\u0000\u0000\u0000\u0003\u0016\u0001\u0000\u0000\u0000"+
		"\u0005 \u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tM\u0001"+
		"\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\r\u000f\u0007\u0000"+
		"\u0000\u0000\u000e\u0010\u0007\u0001\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0006\u0000\u0000\u0000\u0014\u0002\u0001\u0000"+
		"\u0000\u0000\u0015\u0017\u0007\u0002\u0000\u0000\u0016\u0015\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000"+
		"\u0000\u0000\u0018\u001a\u0007\u0003\u0000\u0000\u0019\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0006\u0001\u0001\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f!\u0007\u0002\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\"$\u0007\u0003\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&6\u0001\u0000\u0000\u0000\'7\u0005"+
		".\u0000\u0000(*\u0007\u0004\u0000\u0000)+\u0007\u0002\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+7\u0001\u0000\u0000\u0000"+
		",.\u0005.\u0000\u0000-/\u0007\u0003\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0007\u0004\u0000\u000035\u0007\u0002"+
		"\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u00006\'\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u0000"+
		"6,\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u00008:\u0007\u0003\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0006"+
		"\u0002\u0002\u0000>\u0006\u0001\u0000\u0000\u0000?F\u0005\'\u0000\u0000"+
		"@B\u0007\u0005\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0005\'\u0000\u0000FA\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0005\'\u0000\u0000KL\u0006\u0003\u0003\u0000L\b"+
		"\u0001\u0000\u0000\u0000MO\u0005{\u0000\u0000NP\u0007\u0006\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005}\u0000"+
		"\u0000TU\u0006\u0004\u0004\u0000U\n\u0001\u0000\u0000\u0000VX\u0005*\u0000"+
		"\u0000WY\u0007\u0007\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0005*\u0000\u0000]^\u0006\u0005\u0005\u0000^\f"+
		"\u0001\u0000\u0000\u0000\u000f\u0000\u0011\u0016\u001b %*046;CHQZ\u0006"+
		"\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003"+
		"\u0001\u0004\u0004\u0001\u0005\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}