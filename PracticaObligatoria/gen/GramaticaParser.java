// Generated from R:/Documents/PL/TrabajoObligatorioPL/PracticaObligatoria/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, CONSTINT=2, CONSTREAL=3, CONSTLI=4, COMENTARIO1L=5, COMENTARIOVL=6, 
		PRG=7, BLQ=8, DCLLIST=9, SENTLIST=10, SENTLISTP=11, DCL=12, DEFCTE=13, 
		CTELIST=14, CTELISTP=15, SIMPVALUE=16, DEFVAR=17, DEFVARLIST=18, DEFVARLISTP=19, 
		VARLIST=20, DEFPROC=21, DEFFUN=22, FORMAL_PARAMLIST=23, FORMAL_PARAM=24, 
		TBAS=25, SENT=26, ASIG=27, EXP=28, EXPP=29, OP=30, OPARIT=31, FACTOR=32, 
		SUBPARAMLIST=33, EXPLIST=34, PROC_CALL=35, SALTAR=36;
	public static final int
		RULE_axioma = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"axioma"
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
			null, "ID", "CONSTINT", "CONSTREAL", "CONSTLI", "COMENTARIO1L", "COMENTARIOVL", 
			"PRG", "BLQ", "DCLLIST", "SENTLIST", "SENTLISTP", "DCL", "DEFCTE", "CTELIST", 
			"CTELISTP", "SIMPVALUE", "DEFVAR", "DEFVARLIST", "DEFVARLISTP", "VARLIST", 
			"DEFPROC", "DEFFUN", "FORMAL_PARAMLIST", "FORMAL_PARAM", "TBAS", "SENT", 
			"ASIG", "EXP", "EXPP", "OP", "OPARIT", "FACTOR", "SUBPARAMLIST", "EXPLIST", 
			"PROC_CALL", "SALTAR"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxiomaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> CONSTINT() { return getTokens(GramaticaParser.CONSTINT); }
		public TerminalNode CONSTINT(int i) {
			return getToken(GramaticaParser.CONSTINT, i);
		}
		public List<TerminalNode> CONSTREAL() { return getTokens(GramaticaParser.CONSTREAL); }
		public TerminalNode CONSTREAL(int i) {
			return getToken(GramaticaParser.CONSTREAL, i);
		}
		public List<TerminalNode> CONSTLI() { return getTokens(GramaticaParser.CONSTLI); }
		public TerminalNode CONSTLI(int i) {
			return getToken(GramaticaParser.CONSTLI, i);
		}
		public List<TerminalNode> COMENTARIO1L() { return getTokens(GramaticaParser.COMENTARIO1L); }
		public TerminalNode COMENTARIO1L(int i) {
			return getToken(GramaticaParser.COMENTARIO1L, i);
		}
		public List<TerminalNode> COMENTARIOVL() { return getTokens(GramaticaParser.COMENTARIOVL); }
		public TerminalNode COMENTARIOVL(int i) {
			return getToken(GramaticaParser.COMENTARIOVL, i);
		}
		public List<TerminalNode> PRG() { return getTokens(GramaticaParser.PRG); }
		public TerminalNode PRG(int i) {
			return getToken(GramaticaParser.PRG, i);
		}
		public List<TerminalNode> BLQ() { return getTokens(GramaticaParser.BLQ); }
		public TerminalNode BLQ(int i) {
			return getToken(GramaticaParser.BLQ, i);
		}
		public List<TerminalNode> DCLLIST() { return getTokens(GramaticaParser.DCLLIST); }
		public TerminalNode DCLLIST(int i) {
			return getToken(GramaticaParser.DCLLIST, i);
		}
		public List<TerminalNode> SENTLIST() { return getTokens(GramaticaParser.SENTLIST); }
		public TerminalNode SENTLIST(int i) {
			return getToken(GramaticaParser.SENTLIST, i);
		}
		public List<TerminalNode> SENTLISTP() { return getTokens(GramaticaParser.SENTLISTP); }
		public TerminalNode SENTLISTP(int i) {
			return getToken(GramaticaParser.SENTLISTP, i);
		}
		public List<TerminalNode> DCL() { return getTokens(GramaticaParser.DCL); }
		public TerminalNode DCL(int i) {
			return getToken(GramaticaParser.DCL, i);
		}
		public List<TerminalNode> DEFCTE() { return getTokens(GramaticaParser.DEFCTE); }
		public TerminalNode DEFCTE(int i) {
			return getToken(GramaticaParser.DEFCTE, i);
		}
		public List<TerminalNode> CTELIST() { return getTokens(GramaticaParser.CTELIST); }
		public TerminalNode CTELIST(int i) {
			return getToken(GramaticaParser.CTELIST, i);
		}
		public List<TerminalNode> CTELISTP() { return getTokens(GramaticaParser.CTELISTP); }
		public TerminalNode CTELISTP(int i) {
			return getToken(GramaticaParser.CTELISTP, i);
		}
		public List<TerminalNode> SIMPVALUE() { return getTokens(GramaticaParser.SIMPVALUE); }
		public TerminalNode SIMPVALUE(int i) {
			return getToken(GramaticaParser.SIMPVALUE, i);
		}
		public List<TerminalNode> DEFVAR() { return getTokens(GramaticaParser.DEFVAR); }
		public TerminalNode DEFVAR(int i) {
			return getToken(GramaticaParser.DEFVAR, i);
		}
		public List<TerminalNode> DEFVARLIST() { return getTokens(GramaticaParser.DEFVARLIST); }
		public TerminalNode DEFVARLIST(int i) {
			return getToken(GramaticaParser.DEFVARLIST, i);
		}
		public List<TerminalNode> DEFVARLISTP() { return getTokens(GramaticaParser.DEFVARLISTP); }
		public TerminalNode DEFVARLISTP(int i) {
			return getToken(GramaticaParser.DEFVARLISTP, i);
		}
		public List<TerminalNode> VARLIST() { return getTokens(GramaticaParser.VARLIST); }
		public TerminalNode VARLIST(int i) {
			return getToken(GramaticaParser.VARLIST, i);
		}
		public List<TerminalNode> DEFPROC() { return getTokens(GramaticaParser.DEFPROC); }
		public TerminalNode DEFPROC(int i) {
			return getToken(GramaticaParser.DEFPROC, i);
		}
		public List<TerminalNode> DEFFUN() { return getTokens(GramaticaParser.DEFFUN); }
		public TerminalNode DEFFUN(int i) {
			return getToken(GramaticaParser.DEFFUN, i);
		}
		public List<TerminalNode> FORMAL_PARAMLIST() { return getTokens(GramaticaParser.FORMAL_PARAMLIST); }
		public TerminalNode FORMAL_PARAMLIST(int i) {
			return getToken(GramaticaParser.FORMAL_PARAMLIST, i);
		}
		public List<TerminalNode> FORMAL_PARAM() { return getTokens(GramaticaParser.FORMAL_PARAM); }
		public TerminalNode FORMAL_PARAM(int i) {
			return getToken(GramaticaParser.FORMAL_PARAM, i);
		}
		public List<TerminalNode> TBAS() { return getTokens(GramaticaParser.TBAS); }
		public TerminalNode TBAS(int i) {
			return getToken(GramaticaParser.TBAS, i);
		}
		public List<TerminalNode> SENT() { return getTokens(GramaticaParser.SENT); }
		public TerminalNode SENT(int i) {
			return getToken(GramaticaParser.SENT, i);
		}
		public List<TerminalNode> ASIG() { return getTokens(GramaticaParser.ASIG); }
		public TerminalNode ASIG(int i) {
			return getToken(GramaticaParser.ASIG, i);
		}
		public List<TerminalNode> EXP() { return getTokens(GramaticaParser.EXP); }
		public TerminalNode EXP(int i) {
			return getToken(GramaticaParser.EXP, i);
		}
		public List<TerminalNode> EXPP() { return getTokens(GramaticaParser.EXPP); }
		public TerminalNode EXPP(int i) {
			return getToken(GramaticaParser.EXPP, i);
		}
		public List<TerminalNode> OP() { return getTokens(GramaticaParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(GramaticaParser.OP, i);
		}
		public List<TerminalNode> OPARIT() { return getTokens(GramaticaParser.OPARIT); }
		public TerminalNode OPARIT(int i) {
			return getToken(GramaticaParser.OPARIT, i);
		}
		public List<TerminalNode> FACTOR() { return getTokens(GramaticaParser.FACTOR); }
		public TerminalNode FACTOR(int i) {
			return getToken(GramaticaParser.FACTOR, i);
		}
		public List<TerminalNode> SUBPARAMLIST() { return getTokens(GramaticaParser.SUBPARAMLIST); }
		public TerminalNode SUBPARAMLIST(int i) {
			return getToken(GramaticaParser.SUBPARAMLIST, i);
		}
		public List<TerminalNode> EXPLIST() { return getTokens(GramaticaParser.EXPLIST); }
		public TerminalNode EXPLIST(int i) {
			return getToken(GramaticaParser.EXPLIST, i);
		}
		public List<TerminalNode> PROC_CALL() { return getTokens(GramaticaParser.PROC_CALL); }
		public TerminalNode PROC_CALL(int i) {
			return getToken(GramaticaParser.PROC_CALL, i);
		}
		public List<TerminalNode> SALTAR() { return getTokens(GramaticaParser.SALTAR); }
		public TerminalNode SALTAR(int i) {
			return getToken(GramaticaParser.SALTAR, i);
		}
		public AxiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAxioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAxioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAxioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomaContext axioma() throws RecognitionException {
		AxiomaContext _localctx = new AxiomaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_axioma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953470L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953470L) != 0) );
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
		"\u0004\u0001$\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0001\u0000\u0001$\u0007\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000\u0000"+
		"\u0004\u0005\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000\u0000"+
		"\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000\u0000"+
		"\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}