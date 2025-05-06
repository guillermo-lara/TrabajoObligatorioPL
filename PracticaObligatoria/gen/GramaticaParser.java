// Generated from R:/Documents/PL/TrabajoObligatorioPL/PracticaObligatoria/src/Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, ID=33, CONSTINT=34, CONSTREAL=35, CONSTLI=36, COMENTARIO1L=37, 
		COMENTARIOVL=38, SALTAR=39;
	public static final int
		RULE_axioma = 0, RULE_prg = 1, RULE_blq = 2, RULE_dcllist = 3, RULE_sentlist = 4, 
		RULE_sentlistp = 5, RULE_dcl = 6, RULE_defcte = 7, RULE_ctelist = 8, RULE_ctelistp = 9, 
		RULE_simpvalue = 10, RULE_defvar = 11, RULE_defvarlist = 12, RULE_defvarlistp = 13, 
		RULE_varlist = 14, RULE_varlistaux = 15, RULE_defproc = 16, RULE_deffun = 17, 
		RULE_formal_paramlist = 18, RULE_formalparam = 19, RULE_formalparamaux = 20, 
		RULE_tbas = 21, RULE_sent = 22, RULE_asig = 23, RULE_exp = 24, RULE_expp = 25, 
		RULE_op = 26, RULE_oparit = 27, RULE_factor = 28, RULE_subparamlist = 29, 
		RULE_explist = 30, RULE_explistaux = 31, RULE_proc_call = 32, RULE_program = 33, 
		RULE_defines = 34, RULE_ctes = 35, RULE_partes = 36, RULE_part = 37, RULE_restpart = 38, 
		RULE_bloque = 39, RULE_listparam = 40, RULE_type = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"axioma", "prg", "blq", "dcllist", "sentlist", "sentlistp", "dcl", "defcte", 
			"ctelist", "ctelistp", "simpvalue", "defvar", "defvarlist", "defvarlistp", 
			"varlist", "varlistaux", "defproc", "deffun", "formal_paramlist", "formalparam", 
			"formalparamaux", "tbas", "sent", "asig", "exp", "expp", "op", "oparit", 
			"factor", "subparamlist", "explist", "explistaux", "proc_call", "program", 
			"defines", "ctes", "partes", "part", "restpart", "bloque", "listparam", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'begin'", "'end'", "'CONST'", "'const'", 
			"'='", "'VAR'", "'var'", "':'", "','", "'PROCEDURE'", "'procedure'", 
			"'FUNCTION'", "'function'", "'('", "')'", "'INTEGER'", "'REAL'", "':='", 
			"'+'", "'-'", "'*'", "'div'", "'mod'", "'#define'", "'void'", "'{'", 
			"'}'", "'int'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ID", "CONSTINT", 
			"CONSTREAL", "CONSTLI", "COMENTARIO1L", "COMENTARIOVL", "SALTAR"
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
		public PrgContext prg() {
			return getRuleContext(PrgContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			prg();
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
	public static class PrgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(87);
			match(ID);
			setState(88);
			match(T__1);
			setState(89);
			blq();
			setState(90);
			match(T__2);
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
	public static class BlqContext extends ParserRuleContext {
		public String bloq;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((BlqContext)_localctx).dcllist = dcllist();
			setState(93);
			match(T__3);
			setState(94);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(95);
			match(T__4);
			((BlqContext)_localctx).bloq =  ((BlqContext)_localctx).dcllist.dcllis +" begin" + ((BlqContext)_localctx).sentlist.senlis +" end";
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
	public static class DcllistContext extends ParserRuleContext {
		public String dcllis;
		public DclContext dcl;
		public DcllistContext dcllist;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcllist);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__8:
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((DcllistContext)_localctx).dcl = dcl();
				setState(99);
				((DcllistContext)_localctx).dcllist = dcllist();
				((DcllistContext)_localctx).dcllis =  ((DcllistContext)_localctx).dcl.dcll +((DcllistContext)_localctx).dcllist.dcllis;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistContext)_localctx).dcllis =  "";
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
	public static class SentlistContext extends ParserRuleContext {
		public String senlis;
		public SentContext sent;
		public SentlistpContext sentlistp;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistpContext sentlistp() {
			return getRuleContext(SentlistpContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((SentlistContext)_localctx).sent = sent();
			setState(106);
			((SentlistContext)_localctx).sentlistp = sentlistp();
			((SentlistContext)_localctx).senlis =  ((SentlistContext)_localctx).sent.sen +((SentlistContext)_localctx).sentlistp.senlisp;
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
	public static class SentlistpContext extends ParserRuleContext {
		public String senlisp;
		public SentContext sent;
		public SentlistpContext sentlistp;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistpContext sentlistp() {
			return getRuleContext(SentlistpContext.class,0);
		}
		public SentlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentlistp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistpContext sentlistp() throws RecognitionException {
		SentlistpContext _localctx = new SentlistpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlistp);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((SentlistpContext)_localctx).sent = sent();
				setState(110);
				((SentlistpContext)_localctx).sentlistp = sentlistp();
				((SentlistpContext)_localctx).senlisp =  ((SentlistpContext)_localctx).sent.sen +((SentlistpContext)_localctx).sentlistp.senlisp;
				}
				break;
			case T__4:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				((SentlistpContext)_localctx).senlisp =  "";
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
	public static class DclContext extends ParserRuleContext {
		public String dcll;
		public DefcteContext defcte;
		public DefvarContext defvar;
		public DefprocContext defproc;
		public DeffunContext deffun;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dcl);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((DclContext)_localctx).defcte = defcte();
				_localctx.dcll = ((DclContext)_localctx).defcte.defconst
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((DclContext)_localctx).defvar = defvar();
				_localctx.dcll = ((DclContext)_localctx).defvar.defvari
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((DclContext)_localctx).defproc = defproc();
				_localctx.dcll = ((DclContext)_localctx).defproc.defproceso
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				((DclContext)_localctx).deffun = deffun();
				_localctx.dcll = ((DclContext)_localctx).deffun.deffuncion
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
	public static class DefcteContext extends ParserRuleContext {
		public String defconst;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defcte);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__6);
				setState(132);
				((DefcteContext)_localctx).ctelist = ctelist();
				((DefcteContext)_localctx).defconst =  "#define" ((DefcteContext)_localctx).ctelist.ctelis;
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
	public static class CtelistContext extends ParserRuleContext {
		public String ctelis;
		public Token ID;
		public SimpvalueContext simpvalue;
		public CtelistpContext ctelistp;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistpContext ctelistp() {
			return getRuleContext(CtelistpContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((CtelistContext)_localctx).ID = match(ID);
			setState(138);
			match(T__7);
			setState(139);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			setState(140);
			match(T__1);
			setState(141);
			((CtelistContext)_localctx).ctelistp = ctelistp();
			((CtelistContext)_localctx).ctelis =  (((CtelistContext)_localctx).ID!=null?((CtelistContext)_localctx).ID.getText():null) +" " +((CtelistContext)_localctx).simpvalue.simp +\n +"#define " +((CtelistContext)_localctx).ctelistp.ctelisp;
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
	public static class CtelistpContext extends ParserRuleContext {
		public String ctelisp;
		public Token ID;
		public SimpvalueContext simpvalue;
		public CtelistpContext ctelistp;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistpContext ctelistp() {
			return getRuleContext(CtelistpContext.class,0);
		}
		public CtelistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCtelistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCtelistp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCtelistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistpContext ctelistp() throws RecognitionException {
		CtelistpContext _localctx = new CtelistpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ctelistp);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((CtelistpContext)_localctx).ID = match(ID);
				setState(145);
				match(T__7);
				setState(146);
				((CtelistpContext)_localctx).simpvalue = simpvalue();
				setState(147);
				match(T__1);
				setState(148);
				((CtelistpContext)_localctx).ctelistp = ctelistp();
				((CtelistpContext)_localctx).ctelisp =  (((CtelistpContext)_localctx).ID!=null?((CtelistpContext)_localctx).ID.getText():null) +" "+ ((CtelistpContext)_localctx).simpvalue.simp +\n +"#define " +((CtelistpContext)_localctx).ctelistp.ctelisp;
				}
				break;
			case T__3:
			case T__5:
			case T__6:
			case T__8:
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				((CtelistpContext)_localctx).ctelisp =  "";
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
	public static class SimpvalueContext extends ParserRuleContext {
		public String simp;
		public Token CONSTINT;
		public Token CONSTREAL;
		public Token CONSTLI;
		public TerminalNode CONSTINT() { return getToken(GramaticaParser.CONSTINT, 0); }
		public TerminalNode CONSTREAL() { return getToken(GramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLI() { return getToken(GramaticaParser.CONSTLI, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpvalue);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((SimpvalueContext)_localctx).CONSTINT = match(CONSTINT);
				((SimpvalueContext)_localctx).simp =  (((SimpvalueContext)_localctx).CONSTINT!=null?((SimpvalueContext)_localctx).CONSTINT.getText():null);
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((SimpvalueContext)_localctx).CONSTREAL = match(CONSTREAL);
				((SimpvalueContext)_localctx).simp =  (((SimpvalueContext)_localctx).CONSTREAL!=null?((SimpvalueContext)_localctx).CONSTREAL.getText():null);
				}
				break;
			case CONSTLI:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				((SimpvalueContext)_localctx).CONSTLI = match(CONSTLI);
				((SimpvalueContext)_localctx).simp =  (((SimpvalueContext)_localctx).CONSTLI!=null?((SimpvalueContext)_localctx).CONSTLI.getText():null);
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
	public static class DefvarContext extends ParserRuleContext {
		public String defvari;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defvar);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__9);
				setState(164);
				((DefvarContext)_localctx).defvarlist = defvarlist();
				setState(165);
				match(T__1);
				((DefvarContext)_localctx).defvari =  ((DefvarContext)_localctx).defvarlist.defvarlis;
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
	public static class DefvarlistContext extends ParserRuleContext {
		public String defvarlis;
		public VarlistContext varlist;
		public TbasContext tbas;
		public DefvarlistpContext defvarlistp;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistpContext defvarlistp() {
			return getRuleContext(DefvarlistpContext.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((DefvarlistContext)_localctx).varlist = varlist();
			setState(171);
			match(T__10);
			setState(172);
			((DefvarlistContext)_localctx).tbas = tbas();
			setState(173);
			((DefvarlistContext)_localctx).defvarlistp = defvarlistp();
			((DefvarlistContext)_localctx).defvarlis =  ((DefvarlistContext)_localctx).tbas.vlex + ((DefvarlistContext)_localctx).varlist.varlis +((DefvarlistContext)_localctx).defvarlistp.defvarlisp;
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
	public static class DefvarlistpContext extends ParserRuleContext {
		public String defvarlisp;
		public VarlistContext varlist;
		public TbasContext tbas;
		public DefvarlistpContext defvarlistp;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistpContext defvarlistp() {
			return getRuleContext(DefvarlistpContext.class,0);
		}
		public DefvarlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDefvarlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDefvarlistp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDefvarlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistpContext defvarlistp() throws RecognitionException {
		DefvarlistpContext _localctx = new DefvarlistpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvarlistp);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__1);
				setState(177);
				((DefvarlistpContext)_localctx).varlist = varlist();
				setState(178);
				match(T__10);
				setState(179);
				((DefvarlistpContext)_localctx).tbas = tbas();
				setState(180);
				((DefvarlistpContext)_localctx).defvarlistp = defvarlistp();
				((DefvarlistpContext)_localctx).defvarlisp =  ";" +\n +((DefvarlistpContext)_localctx).tbas.vlex +((DefvarlistpContext)_localctx).varlist.varlis +((DefvarlistpContext)_localctx).defvarlistp.defvarlisp;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((DefvarlistpContext)_localctx).defvarlisp =  "";
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
	public static class VarlistContext extends ParserRuleContext {
		public String varlis;
		public Token ID;
		public VarlistauxContext varlistaux;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public VarlistauxContext varlistaux() {
			return getRuleContext(VarlistauxContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((VarlistContext)_localctx).ID = match(ID);
			setState(187);
			((VarlistContext)_localctx).varlistaux = varlistaux();
			((VarlistContext)_localctx).varlis =  (((VarlistContext)_localctx).ID!=null?((VarlistContext)_localctx).ID.getText():null) + ((VarlistContext)_localctx).varlistaux.varlisaux;
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
	public static class VarlistauxContext extends ParserRuleContext {
		public String varlisaux;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVarlistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVarlistaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarlistaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistauxContext varlistaux() throws RecognitionException {
		VarlistauxContext _localctx = new VarlistauxContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varlistaux);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__11);
				setState(191);
				((VarlistauxContext)_localctx).varlist = varlist();
				((VarlistauxContext)_localctx).varlisaux =  ", " +((VarlistauxContext)_localctx).varlist.varlis;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				((VarlistauxContext)_localctx).varlisaux =  "";
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
	public static class DefprocContext extends ParserRuleContext {
		public String defproceso;
		public Token ID;
		public Formal_paramlistContext formal_paramlist;
		public BlqContext blq;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defproc);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__13);
				setState(199);
				((DefprocContext)_localctx).ID = match(ID);
				setState(200);
				((DefprocContext)_localctx).formal_paramlist = formal_paramlist();
				setState(201);
				match(T__1);
				setState(202);
				((DefprocContext)_localctx).blq = blq();
				setState(203);
				match(T__1);
				((DefprocContext)_localctx).defproceso = "void " +(((DefprocContext)_localctx).ID!=null?((DefprocContext)_localctx).ID.getText():null) +" " +((DefprocContext)_localctx).formal_paramlist.for_paramli +\n +"{" +\n +((DefprocContext)_localctx).blq.bloq +\n +"}";
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
	public static class DeffunContext extends ParserRuleContext {
		public String deffuncion;
		public Token ID;
		public Formal_paramlistContext formal_paramlist;
		public TbasContext tbas;
		public BlqContext blq;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deffun);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__15);
				setState(210);
				((DeffunContext)_localctx).ID = match(ID);
				setState(211);
				((DeffunContext)_localctx).formal_paramlist = formal_paramlist();
				setState(212);
				match(T__10);
				setState(213);
				((DeffunContext)_localctx).tbas = tbas();
				setState(214);
				match(T__1);
				setState(215);
				((DeffunContext)_localctx).blq = blq();
				setState(216);
				match(T__1);
				((DeffunContext)_localctx).deffuncion = ((DeffunContext)_localctx).tbas.vlex +(((DeffunContext)_localctx).ID!=null?((DeffunContext)_localctx).ID.getText():null) +" " +((DeffunContext)_localctx).formal_paramlist.for_paramli +\n +"{" +\n +((DeffunContext)_localctx).blq.bloq +\n +"}";
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
	public static class Formal_paramlistContext extends ParserRuleContext {
		public String for_paramli;
		public FormalparamContext formalparam;
		public FormalparamContext formalparam() {
			return getRuleContext(FormalparamContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_paramlist);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__16);
				setState(222);
				((Formal_paramlistContext)_localctx).formalparam = formalparam();
				setState(223);
				match(T__17);
				((Formal_paramlistContext)_localctx).for_paramli =  "( " +((Formal_paramlistContext)_localctx).formalparam.for_para +" )";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_paramlistContext)_localctx).for_paramli =  "";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((Formal_paramlistContext)_localctx).for_paramli = "( " +"void" +" )";
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
	public static class FormalparamContext extends ParserRuleContext {
		public String for_para;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public FormalparamauxContext formalparamaux() {
			return getRuleContext(FormalparamauxContext.class,0);
		}
		public FormalparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFormalparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFormalparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFormalparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalparamContext formalparam() throws RecognitionException {
		FormalparamContext _localctx = new FormalparamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((FormalparamContext)_localctx).varlist = varlist();
			setState(231);
			match(T__10);
			setState(232);
			tbas();
			setState(233);
			formalparamaux();
			((FormalparamContext)_localctx).for_para =  ((FormalparamContext)_localctx).varlist.varlis +" :";
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
	public static class FormalparamauxContext extends ParserRuleContext {
		public String for_paraaux;
		public FormalparamContext formalparam;
		public FormalparamContext formalparam() {
			return getRuleContext(FormalparamContext.class,0);
		}
		public FormalparamauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalparamaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFormalparamaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFormalparamaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFormalparamaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalparamauxContext formalparamaux() throws RecognitionException {
		FormalparamauxContext _localctx = new FormalparamauxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalparamaux);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__1);
				setState(237);
				((FormalparamauxContext)_localctx).formalparam = formalparam();
				((FormalparamauxContext)_localctx).for_paraaux =  "; "+((FormalparamauxContext)_localctx).formalparam.for_para;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				((FormalparamauxContext)_localctx).for_paraaux =  "";
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
	public static class TbasContext extends ParserRuleContext {
		public String vlex;
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tbas);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__18);
				((TbasContext)_localctx).vlex =  "int ";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__19);
				((TbasContext)_localctx).vlex =  "float ";
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
	public static class SentContext extends ParserRuleContext {
		public String sen;
		public AsigContext asig;
		public Proc_callContext proc_call;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((SentContext)_localctx).asig = asig();
				setState(250);
				match(T__1);
				((SentContext)_localctx).sen =  ((SentContext)_localctx).asig.asi +" ;";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((SentContext)_localctx).proc_call = proc_call();
				setState(254);
				match(T__1);
				((SentContext)_localctx).sen =  ((SentContext)_localctx).proc_call.procall +" ;";
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
	public static class AsigContext extends ParserRuleContext {
		public String asi;
		public Token ID;
		public ExpContext exp;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((AsigContext)_localctx).ID = match(ID);
			setState(260);
			match(T__20);
			setState(261);
			((AsigContext)_localctx).exp = exp();
			((AsigContext)_localctx).asi =  (((AsigContext)_localctx).ID!=null?((AsigContext)_localctx).ID.getText():null) +" = " +((AsigContext)_localctx).exp.ex ;
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
	public static class ExpContext extends ParserRuleContext {
		public String ex;
		public FactorContext factor;
		public ExppContext expp;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((ExpContext)_localctx).factor = factor();
			setState(265);
			((ExpContext)_localctx).expp = expp();
			((ExpContext)_localctx).ex =  ((ExpContext)_localctx).factor.fact + ((ExpContext)_localctx).expp.exppp;
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
	public static class ExppContext extends ParserRuleContext {
		public String exppp;
		public OpContext op;
		public ExppContext expp;
		public ExpContext exp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expp);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((ExppContext)_localctx).op = op();
				setState(269);
				((ExppContext)_localctx).expp = expp();
				setState(270);
				((ExppContext)_localctx).exp = exp();
				((ExppContext)_localctx).exppp =  ((ExppContext)_localctx).op.opp +" " +((ExppContext)_localctx).exp.ex +" " +((ExppContext)_localctx).expp.exppp;
				}
				break;
			case T__1:
			case T__11:
			case T__16:
			case T__17:
			case ID:
			case CONSTINT:
			case CONSTREAL:
			case CONSTLI:
				enterOuterAlt(_localctx, 2);
				{
				((ExppContext)_localctx).exppp =  "";
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
	public static class OpContext extends ParserRuleContext {
		public String opp;
		public OparitContext oparit;
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((OpContext)_localctx).oparit = oparit();
			((OpContext)_localctx).opp =  ((OpContext)_localctx).oparit.valex;
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
	public static class OparitContext extends ParserRuleContext {
		public String valex;
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOparit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oparit);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__21);
				((OparitContext)_localctx).valex =  "+";
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__22);
				((OparitContext)_localctx).valex =  "-";
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__23);
				((OparitContext)_localctx).valex =  "*";
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(T__24);
				((OparitContext)_localctx).valex =  "/";
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__25);
				((OparitContext)_localctx).valex =  "%";
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
	public static class FactorContext extends ParserRuleContext {
		public String fact;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token ID;
		public SubparamlistContext subparamlist;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
			case CONSTREAL:
			case CONSTLI:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).fact =  ((FactorContext)_localctx).simpvalue.simp;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__16);
				setState(295);
				((FactorContext)_localctx).exp = exp();
				setState(296);
				match(T__17);
				((FactorContext)_localctx).fact =  "( "+ ((FactorContext)_localctx).exp.ex +" )";
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((FactorContext)_localctx).ID = match(ID);
				setState(300);
				((FactorContext)_localctx).subparamlist = subparamlist();
				((FactorContext)_localctx).fact =  (((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null) +((FactorContext)_localctx).subparamlist.subparalis;
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
	public static class SubparamlistContext extends ParserRuleContext {
		public String subparalis;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subparamlist);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__16);
				setState(306);
				((SubparamlistContext)_localctx).explist = explist();
				setState(307);
				match(T__17);
				((SubparamlistContext)_localctx).subparalis =  "( "+((SubparamlistContext)_localctx).explist.explis+" )";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((SubparamlistContext)_localctx).subparalis =  "";
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
	public static class ExplistContext extends ParserRuleContext {
		public String explis;
		public ExpContext exp;
		public ExplistauxContext explistaux;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistauxContext explistaux() {
			return getRuleContext(ExplistauxContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((ExplistContext)_localctx).exp = exp();
			setState(314);
			((ExplistContext)_localctx).explistaux = explistaux();
			((ExplistContext)_localctx).explis =  ((ExplistContext)_localctx).exp.ex +((ExplistContext)_localctx).explistaux.explisaux;
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
	public static class ExplistauxContext extends ParserRuleContext {
		public String explisaux;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExplistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExplistaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExplistaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistauxContext explistaux() throws RecognitionException {
		ExplistauxContext _localctx = new ExplistauxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_explistaux);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__11);
				setState(318);
				((ExplistauxContext)_localctx).explist = explist();
				((ExplistauxContext)_localctx).explisaux =  ", " +((ExplistauxContext)_localctx).explist.explis;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				((ExplistauxContext)_localctx).explisaux =  "";
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
	public static class Proc_callContext extends ParserRuleContext {
		public String procall;
		public Token ID;
		public SubparamlistContext subparamlist;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((Proc_callContext)_localctx).ID = match(ID);
			setState(325);
			((Proc_callContext)_localctx).subparamlist = subparamlist();
			((Proc_callContext)_localctx).procall =  (((Proc_callContext)_localctx).ID!=null?((Proc_callContext)_localctx).ID.getText():null) +" " +((Proc_callContext)_localctx).subparamlist.subparalis;
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
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			defines();
			setState(329);
			partes();
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
	public static class DefinesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public DefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDefines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinesContext defines() throws RecognitionException {
		DefinesContext _localctx = new DefinesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_defines);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(T__26);
				setState(332);
				match(ID);
				setState(333);
				ctes();
				setState(334);
				defines();
				}
				break;
			case T__27:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode CONSTINT() { return getToken(GramaticaParser.CONSTINT, 0); }
		public TerminalNode CONSTREAL() { return getToken(GramaticaParser.CONSTREAL, 0); }
		public TerminalNode CONSTLI() { return getToken(GramaticaParser.CONSTLI, 0); }
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class PartesContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public PartesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPartes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPartes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPartes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartesContext partes() throws RecognitionException {
		PartesContext _localctx = new PartesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_partes);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				part();
				setState(342);
				partes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				part();
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
	public static class PartContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			type();
			setState(348);
			restpart();
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
	public static class RestpartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRestpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRestpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_restpart);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(ID);
				setState(351);
				match(T__16);
				setState(352);
				listparam(0);
				setState(353);
				match(T__17);
				setState(354);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(ID);
				setState(357);
				match(T__16);
				setState(358);
				match(T__27);
				setState(359);
				match(T__17);
				setState(360);
				bloque();
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
	public static class BloqueContext extends ParserRuleContext {
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__28);
			setState(364);
			sentlist();
			setState(365);
			match(T__29);
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
	public static class ListparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public ListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		return listparam(0);
	}

	private ListparamContext listparam(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListparamContext _localctx = new ListparamContext(_ctx, _parentState);
		ListparamContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_listparam, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368);
			type();
			setState(369);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListparamContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listparam);
					setState(371);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(372);
					match(T__11);
					setState(373);
					type();
					setState(374);
					match(ID);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6710886400L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return listparam_sempred((ListparamContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listparam_sempred(ListparamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u0180\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005s\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0081\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0088\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0099\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00b9\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c4"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cf\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00dc"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00e5\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f2\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f8\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0102\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0113\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0122\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0130"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0138\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0143\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0152\b\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u015a\b$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u016a\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0179\b(\n("+
		"\f(\u017c\t(\u0001)\u0001)\u0001)\u0000\u0001P*\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPR\u0000\u0002\u0001\u0000\"$\u0002\u0000\u001c\u001c"+
		"\u001f \u0175\u0000T\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000"+
		"\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000"+
		"\bi\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000"+
		"\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000"+
		"\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000"+
		"\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000"+
		"\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000"+
		"\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00ce\u0001\u0000\u0000"+
		"\u0000\"\u00db\u0001\u0000\u0000\u0000$\u00e4\u0001\u0000\u0000\u0000"+
		"&\u00e6\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*\u00f7"+
		"\u0001\u0000\u0000\u0000,\u0101\u0001\u0000\u0000\u0000.\u0103\u0001\u0000"+
		"\u0000\u00000\u0108\u0001\u0000\u0000\u00002\u0112\u0001\u0000\u0000\u0000"+
		"4\u0114\u0001\u0000\u0000\u00006\u0121\u0001\u0000\u0000\u00008\u012f"+
		"\u0001\u0000\u0000\u0000:\u0137\u0001\u0000\u0000\u0000<\u0139\u0001\u0000"+
		"\u0000\u0000>\u0142\u0001\u0000\u0000\u0000@\u0144\u0001\u0000\u0000\u0000"+
		"B\u0148\u0001\u0000\u0000\u0000D\u0151\u0001\u0000\u0000\u0000F\u0153"+
		"\u0001\u0000\u0000\u0000H\u0159\u0001\u0000\u0000\u0000J\u015b\u0001\u0000"+
		"\u0000\u0000L\u0169\u0001\u0000\u0000\u0000N\u016b\u0001\u0000\u0000\u0000"+
		"P\u016f\u0001\u0000\u0000\u0000R\u017d\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0002\u0001\u0000U\u0001\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000"+
		"\u0000WX\u0005!\u0000\u0000XY\u0005\u0002\u0000\u0000YZ\u0003\u0004\u0002"+
		"\u0000Z[\u0005\u0003\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\]\u0003"+
		"\u0006\u0003\u0000]^\u0005\u0004\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005"+
		"\u0005\u0000\u0000`a\u0006\u0002\uffff\uffff\u0000a\u0005\u0001\u0000"+
		"\u0000\u0000bc\u0003\f\u0006\u0000cd\u0003\u0006\u0003\u0000de\u0006\u0003"+
		"\uffff\uffff\u0000eh\u0001\u0000\u0000\u0000fh\u0006\u0003\uffff\uffff"+
		"\u0000gb\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0007\u0001"+
		"\u0000\u0000\u0000ij\u0003,\u0016\u0000jk\u0003\n\u0005\u0000kl\u0006"+
		"\u0004\uffff\uffff\u0000l\t\u0001\u0000\u0000\u0000mn\u0003,\u0016\u0000"+
		"no\u0003\n\u0005\u0000op\u0006\u0005\uffff\uffff\u0000ps\u0001\u0000\u0000"+
		"\u0000qs\u0006\u0005\uffff\uffff\u0000rm\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0003\u000e\u0007"+
		"\u0000uv\u0006\u0006\uffff\uffff\u0000v\u0081\u0001\u0000\u0000\u0000"+
		"wx\u0003\u0016\u000b\u0000xy\u0006\u0006\uffff\uffff\u0000y\u0081\u0001"+
		"\u0000\u0000\u0000z{\u0003 \u0010\u0000{|\u0006\u0006\uffff\uffff\u0000"+
		"|\u0081\u0001\u0000\u0000\u0000}~\u0003\"\u0011\u0000~\u007f\u0006\u0006"+
		"\uffff\uffff\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080t\u0001\u0000"+
		"\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082"+
		"\u0088\u0005\u0006\u0000\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084"+
		"\u0085\u0003\u0010\b\u0000\u0085\u0086\u0006\u0007\uffff\uffff\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087"+
		"\u0083\u0001\u0000\u0000\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005!\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c"+
		"\u0003\u0014\n\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e\u0003"+
		"\u0012\t\u0000\u008e\u008f\u0006\b\uffff\uffff\u0000\u008f\u0011\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005!\u0000\u0000\u0091\u0092\u0005\b"+
		"\u0000\u0000\u0092\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\u0002\u0000"+
		"\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0096\u0006\t\uffff\uffff"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0099\u0006\t\uffff\uffff"+
		"\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u009b\u0005\"\u0000\u0000"+
		"\u009b\u00a1\u0006\n\uffff\uffff\u0000\u009c\u009d\u0005#\u0000\u0000"+
		"\u009d\u00a1\u0006\n\uffff\uffff\u0000\u009e\u009f\u0005$\u0000\u0000"+
		"\u009f\u00a1\u0006\n\uffff\uffff\u0000\u00a0\u009a\u0001\u0000\u0000\u0000"+
		"\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a9\u0005\t\u0000\u0000\u00a3"+
		"\u00a4\u0005\n\u0000\u0000\u00a4\u00a5\u0003\u0018\f\u0000\u00a5\u00a6"+
		"\u0005\u0002\u0000\u0000\u00a6\u00a7\u0006\u000b\uffff\uffff\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac"+
		"\u00ad\u0003*\u0015\u0000\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u00af"+
		"\u0006\f\uffff\uffff\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0002\u0000\u0000\u00b1\u00b2\u0003\u001c\u000e\u0000\u00b2\u00b3"+
		"\u0005\u000b\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000\u00b4\u00b5\u0003"+
		"\u001a\r\u0000\u00b5\u00b6\u0006\r\uffff\uffff\u0000\u00b6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u0006\r\uffff\uffff\u0000\u00b8\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u001b\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005!\u0000\u0000\u00bb\u00bc\u0003\u001e"+
		"\u000f\u0000\u00bc\u00bd\u0006\u000e\uffff\uffff\u0000\u00bd\u001d\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\f\u0000\u0000\u00bf\u00c0\u0003\u001c"+
		"\u000e\u0000\u00c0\u00c1\u0006\u000f\uffff\uffff\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0006\u000f\uffff\uffff\u0000\u00c3\u00be"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u001f"+
		"\u0001\u0000\u0000\u0000\u00c5\u00cf\u0005\r\u0000\u0000\u00c6\u00c7\u0005"+
		"\u000e\u0000\u0000\u00c7\u00c8\u0005!\u0000\u0000\u00c8\u00c9\u0003$\u0012"+
		"\u0000\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca\u00cb\u0003\u0004\u0002"+
		"\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd\u0006\u0010\uffff"+
		"\uffff\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00cf!\u0001\u0000\u0000"+
		"\u0000\u00d0\u00dc\u0005\u000f\u0000\u0000\u00d1\u00d2\u0005\u0010\u0000"+
		"\u0000\u00d2\u00d3\u0005!\u0000\u0000\u00d3\u00d4\u0003$\u0012\u0000\u00d4"+
		"\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d6\u0003*\u0015\u0000\u00d6\u00d7"+
		"\u0005\u0002\u0000\u0000\u00d7\u00d8\u0003\u0004\u0002\u0000\u00d8\u00d9"+
		"\u0005\u0002\u0000\u0000\u00d9\u00da\u0006\u0011\uffff\uffff\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d0\u0001\u0000\u0000\u0000\u00db"+
		"\u00d1\u0001\u0000\u0000\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\u0011\u0000\u0000\u00de\u00df\u0003&\u0013\u0000\u00df\u00e0\u0005"+
		"\u0012\u0000\u0000\u00e0\u00e1\u0006\u0012\uffff\uffff\u0000\u00e1\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e5\u0006\u0012\uffff\uffff\u0000\u00e3"+
		"\u00e5\u0006\u0012\uffff\uffff\u0000\u00e4\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5%\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u001c\u000e\u0000\u00e7"+
		"\u00e8\u0005\u000b\u0000\u0000\u00e8\u00e9\u0003*\u0015\u0000\u00e9\u00ea"+
		"\u0003(\u0014\u0000\u00ea\u00eb\u0006\u0013\uffff\uffff\u0000\u00eb\'"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0002\u0000\u0000\u00ed\u00ee"+
		"\u0003&\u0013\u0000\u00ee\u00ef\u0006\u0014\uffff\uffff\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0006\u0014\uffff\uffff\u0000\u00f1"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		")\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0013\u0000\u0000\u00f4\u00f8"+
		"\u0006\u0015\uffff\uffff\u0000\u00f5\u00f6\u0005\u0014\u0000\u0000\u00f6"+
		"\u00f8\u0006\u0015\uffff\uffff\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8+\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0003.\u0017\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb\u00fc"+
		"\u0006\u0016\uffff\uffff\u0000\u00fc\u0102\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0003@ \u0000\u00fe\u00ff\u0005\u0002\u0000\u0000\u00ff\u0100\u0006"+
		"\u0016\uffff\uffff\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00f9"+
		"\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102-\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005!\u0000\u0000\u0104\u0105\u0005\u0015"+
		"\u0000\u0000\u0105\u0106\u00030\u0018\u0000\u0106\u0107\u0006\u0017\uffff"+
		"\uffff\u0000\u0107/\u0001\u0000\u0000\u0000\u0108\u0109\u00038\u001c\u0000"+
		"\u0109\u010a\u00032\u0019\u0000\u010a\u010b\u0006\u0018\uffff\uffff\u0000"+
		"\u010b1\u0001\u0000\u0000\u0000\u010c\u010d\u00034\u001a\u0000\u010d\u010e"+
		"\u00032\u0019\u0000\u010e\u010f\u00030\u0018\u0000\u010f\u0110\u0006\u0019"+
		"\uffff\uffff\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u0113\u0006"+
		"\u0019\uffff\uffff\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u01133\u0001\u0000\u0000\u0000\u0114\u0115\u0003"+
		"6\u001b\u0000\u0115\u0116\u0006\u001a\uffff\uffff\u0000\u01165\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\u0016\u0000\u0000\u0118\u0122\u0006\u001b"+
		"\uffff\uffff\u0000\u0119\u011a\u0005\u0017\u0000\u0000\u011a\u0122\u0006"+
		"\u001b\uffff\uffff\u0000\u011b\u011c\u0005\u0018\u0000\u0000\u011c\u0122"+
		"\u0006\u001b\uffff\uffff\u0000\u011d\u011e\u0005\u0019\u0000\u0000\u011e"+
		"\u0122\u0006\u001b\uffff\uffff\u0000\u011f\u0120\u0005\u001a\u0000\u0000"+
		"\u0120\u0122\u0006\u001b\uffff\uffff\u0000\u0121\u0117\u0001\u0000\u0000"+
		"\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000\u0000"+
		"\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u01227\u0001\u0000\u0000\u0000\u0123\u0124\u0003\u0014\n\u0000"+
		"\u0124\u0125\u0006\u001c\uffff\uffff\u0000\u0125\u0130\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005\u0011\u0000\u0000\u0127\u0128\u00030\u0018\u0000"+
		"\u0128\u0129\u0005\u0012\u0000\u0000\u0129\u012a\u0006\u001c\uffff\uffff"+
		"\u0000\u012a\u0130\u0001\u0000\u0000\u0000\u012b\u012c\u0005!\u0000\u0000"+
		"\u012c\u012d\u0003:\u001d\u0000\u012d\u012e\u0006\u001c\uffff\uffff\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0123\u0001\u0000\u0000\u0000"+
		"\u012f\u0126\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000"+
		"\u01309\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0011\u0000\u0000\u0132"+
		"\u0133\u0003<\u001e\u0000\u0133\u0134\u0005\u0012\u0000\u0000\u0134\u0135"+
		"\u0006\u001d\uffff\uffff\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136"+
		"\u0138\u0006\u001d\uffff\uffff\u0000\u0137\u0131\u0001\u0000\u0000\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0138;\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u00030\u0018\u0000\u013a\u013b\u0003>\u001f\u0000\u013b\u013c\u0006"+
		"\u001e\uffff\uffff\u0000\u013c=\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"\f\u0000\u0000\u013e\u013f\u0003<\u001e\u0000\u013f\u0140\u0006\u001f"+
		"\uffff\uffff\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u0143\u0006"+
		"\u001f\uffff\uffff\u0000\u0142\u013d\u0001\u0000\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143?\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"!\u0000\u0000\u0145\u0146\u0003:\u001d\u0000\u0146\u0147\u0006 \uffff"+
		"\uffff\u0000\u0147A\u0001\u0000\u0000\u0000\u0148\u0149\u0003D\"\u0000"+
		"\u0149\u014a\u0003H$\u0000\u014aC\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0005\u001b\u0000\u0000\u014c\u014d\u0005!\u0000\u0000\u014d\u014e\u0003"+
		"F#\u0000\u014e\u014f\u0003D\"\u0000\u014f\u0152\u0001\u0000\u0000\u0000"+
		"\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014b\u0001\u0000\u0000\u0000"+
		"\u0151\u0150\u0001\u0000\u0000\u0000\u0152E\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0007\u0000\u0000\u0000\u0154G\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0003J%\u0000\u0156\u0157\u0003H$\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u015a\u0003J%\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u015aI\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0003R)\u0000\u015c\u015d\u0003L&\u0000\u015dK\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0005!\u0000\u0000\u015f\u0160\u0005\u0011\u0000\u0000\u0160"+
		"\u0161\u0003P(\u0000\u0161\u0162\u0005\u0012\u0000\u0000\u0162\u0163\u0003"+
		"N\'\u0000\u0163\u016a\u0001\u0000\u0000\u0000\u0164\u0165\u0005!\u0000"+
		"\u0000\u0165\u0166\u0005\u0011\u0000\u0000\u0166\u0167\u0005\u001c\u0000"+
		"\u0000\u0167\u0168\u0005\u0012\u0000\u0000\u0168\u016a\u0003N\'\u0000"+
		"\u0169\u015e\u0001\u0000\u0000\u0000\u0169\u0164\u0001\u0000\u0000\u0000"+
		"\u016aM\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u001d\u0000\u0000\u016c"+
		"\u016d\u0003\b\u0004\u0000\u016d\u016e\u0005\u001e\u0000\u0000\u016eO"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0006(\uffff\uffff\u0000\u0170\u0171"+
		"\u0003R)\u0000\u0171\u0172\u0005!\u0000\u0000\u0172\u017a\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\n\u0002\u0000\u0000\u0174\u0175\u0005\f\u0000"+
		"\u0000\u0175\u0176\u0003R)\u0000\u0176\u0177\u0005!\u0000\u0000\u0177"+
		"\u0179\u0001\u0000\u0000\u0000\u0178\u0173\u0001\u0000\u0000\u0000\u0179"+
		"\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0001\u0000\u0000\u0000\u017bQ\u0001\u0000\u0000\u0000\u017c\u017a"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0007\u0001\u0000\u0000\u017eS\u0001"+
		"\u0000\u0000\u0000\u0018gr\u0080\u0087\u0098\u00a0\u00a8\u00b8\u00c3\u00ce"+
		"\u00db\u00e4\u00f1\u00f7\u0101\u0112\u0121\u012f\u0137\u0142\u0151\u0159"+
		"\u0169\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}