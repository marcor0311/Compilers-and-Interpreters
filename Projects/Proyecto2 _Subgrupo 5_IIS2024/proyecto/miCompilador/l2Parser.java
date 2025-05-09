// Generated from l2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class l2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, WS=84;
	public static final int
		RULE_programa = 0, RULE_declaraciones = 1, RULE_declaracion = 2, RULE_control_flujo = 3, 
		RULE_if_stmt = 4, RULE_while_stmt = 5, RULE_for_stmt = 6, RULE_impresion = 7, 
		RULE_expresion = 8, RULE_operador_aditivo = 9, RULE_operador_multiplicativo = 10, 
		RULE_operador_relacional = 11, RULE_numero = 12, RULE_digito = 13, RULE_identificador = 14, 
		RULE_letra = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaraciones", "declaracion", "control_flujo", "if_stmt", 
			"while_stmt", "for_stmt", "impresion", "expresion", "operador_aditivo", 
			"operador_multiplicativo", "operador_relacional", "numero", "digito", 
			"identificador", "letra"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", 
			"'for'", "'print'", "'='", "'-'", "'+'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'<>'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", 
			"'6'", "'7'", "'8'", "'9'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", 
			"'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", 
			"'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", 
			"'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", 
			"'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", 
			"'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS"
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
	public String getGrammarFileName() { return "l2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public l2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			declaraciones();
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
	public static class DeclaracionesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitDeclaraciones(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__7:
			case T__8:
			case T__9:
			case T__11:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				declaracion();
				setState(35);
				match(T__0);
				setState(36);
				declaraciones();
				}
				break;
			case EOF:
			case T__5:
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
	public static class DeclaracionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Control_flujoContext control_flujo() {
			return getRuleContext(Control_flujoContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				expresion(0);
				}
				break;
			case T__1:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				control_flujo();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				impresion();
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
	public static class Control_flujoContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Control_flujoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_flujo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterControl_flujo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitControl_flujo(this);
		}
	}

	public final Control_flujoContext control_flujo() throws RecognitionException {
		Control_flujoContext _localctx = new Control_flujoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_control_flujo);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				if_stmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				while_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				for_stmt();
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
	public static class If_stmtContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stmt);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__1);
				setState(52);
				match(T__2);
				setState(53);
				expresion(0);
				setState(54);
				match(T__3);
				setState(55);
				match(T__4);
				setState(56);
				declaraciones();
				setState(57);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__1);
				setState(60);
				match(T__2);
				setState(61);
				expresion(0);
				setState(62);
				match(T__3);
				setState(63);
				match(T__4);
				setState(64);
				declaraciones();
				setState(65);
				match(T__5);
				setState(66);
				match(T__6);
				setState(67);
				match(T__4);
				setState(68);
				declaraciones();
				setState(69);
				match(T__5);
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
	public static class While_stmtContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__7);
			setState(74);
			match(T__2);
			setState(75);
			expresion(0);
			setState(76);
			match(T__3);
			setState(77);
			match(T__4);
			setState(78);
			declaraciones();
			setState(79);
			match(T__5);
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
	public static class For_stmtContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__8);
			setState(82);
			match(T__2);
			setState(83);
			expresion(0);
			setState(84);
			match(T__0);
			setState(85);
			expresion(0);
			setState(86);
			match(T__0);
			setState(87);
			expresion(0);
			setState(88);
			match(T__3);
			setState(89);
			match(T__4);
			setState(90);
			declaraciones();
			setState(91);
			match(T__5);
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
	public static class ImpresionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitImpresion(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__9);
			setState(94);
			match(T__2);
			setState(95);
			identificador();
			setState(96);
			match(T__3);
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
	public static class ExpresionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Operador_aditivoContext operador_aditivo() {
			return getRuleContext(Operador_aditivoContext.class,0);
		}
		public Operador_multiplicativoContext operador_multiplicativo() {
			return getRuleContext(Operador_multiplicativoContext.class,0);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(99);
				identificador();
				setState(100);
				match(T__10);
				setState(101);
				expresion(8);
				}
				break;
			case 2:
				{
				setState(103);
				identificador();
				}
				break;
			case 3:
				{
				setState(104);
				numero();
				}
				break;
			case 4:
				{
				setState(105);
				match(T__2);
				setState(106);
				expresion(0);
				setState(107);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(109);
				match(T__11);
				setState(110);
				expresion(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						operador_aditivo();
						setState(115);
						expresion(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(117);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(118);
						operador_multiplicativo();
						setState(119);
						expresion(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122);
						operador_relacional();
						setState(123);
						expresion(3);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Operador_aditivoContext extends ParserRuleContext {
		public Operador_aditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterOperador_aditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitOperador_aditivo(this);
		}
	}

	public final Operador_aditivoContext operador_aditivo() throws RecognitionException {
		Operador_aditivoContext _localctx = new Operador_aditivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador_aditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
	public static class Operador_multiplicativoContext extends ParserRuleContext {
		public Operador_multiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_multiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterOperador_multiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitOperador_multiplicativo(this);
		}
	}

	public final Operador_multiplicativoContext operador_multiplicativo() throws RecognitionException {
		Operador_multiplicativoContext _localctx = new Operador_multiplicativoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operador_multiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
	public static class Operador_relacionalContext extends ParserRuleContext {
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
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
	public static class NumeroContext extends ParserRuleContext {
		public DigitoContext digito() {
			return getRuleContext(DigitoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numero);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				digito();
				setState(137);
				numero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				digito();
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
	public static class DigitoContext extends ParserRuleContext {
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterDigito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitDigito(this);
		}
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_digito);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4290772992L) != 0)) ) {
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
	public static class IdentificadorContext extends ParserRuleContext {
		public LetraContext letra() {
			return getRuleContext(LetraContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identificador);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				letra();
				setState(145);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				letra();
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
	public static class LetraContext extends ParserRuleContext {
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).enterLetra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof l2Listener ) ((l2Listener)listener).exitLetra(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_letra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 4503599627370495L) != 0)) ) {
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
		case 8:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001T\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"2\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bp\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b~\b\b\n\b\f\b\u0081\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008d\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0095\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0001\u0010\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0005\u0001\u0000\f\r\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0010\u0015\u0001\u0000\u0016\u001f\u0001\u0000 S\u0097\u0000 "+
		"\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004,\u0001"+
		"\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000"+
		"\u0000\nI\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000e]\u0001"+
		"\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000"+
		"\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000"+
		"\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u008e\u0001\u0000"+
		"\u0000\u0000\u001c\u0094\u0001\u0000\u0000\u0000\u001e\u0096\u0001\u0000"+
		"\u0000\u0000 !\u0003\u0002\u0001\u0000!\u0001\u0001\u0000\u0000\u0000"+
		"\"#\u0003\u0004\u0002\u0000#$\u0005\u0001\u0000\u0000$%\u0003\u0002\u0001"+
		"\u0000%(\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'\"\u0001\u0000"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")-\u0003\u0010\b\u0000*-\u0003\u0006\u0003\u0000+-\u0003\u000e\u0007\u0000"+
		",)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000"+
		"\u0000-\u0005\u0001\u0000\u0000\u0000.2\u0003\b\u0004\u0000/2\u0003\n"+
		"\u0005\u000002\u0003\f\u0006\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000010\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u0000"+
		"34\u0005\u0002\u0000\u000045\u0005\u0003\u0000\u000056\u0003\u0010\b\u0000"+
		"67\u0005\u0004\u0000\u000078\u0005\u0005\u0000\u000089\u0003\u0002\u0001"+
		"\u00009:\u0005\u0006\u0000\u0000:H\u0001\u0000\u0000\u0000;<\u0005\u0002"+
		"\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0003\u0010\b\u0000>?\u0005\u0004"+
		"\u0000\u0000?@\u0005\u0005\u0000\u0000@A\u0003\u0002\u0001\u0000AB\u0005"+
		"\u0006\u0000\u0000BC\u0005\u0007\u0000\u0000CD\u0005\u0005\u0000\u0000"+
		"DE\u0003\u0002\u0001\u0000EF\u0005\u0006\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000G3\u0001\u0000\u0000\u0000G;\u0001\u0000\u0000\u0000H\t\u0001\u0000"+
		"\u0000\u0000IJ\u0005\b\u0000\u0000JK\u0005\u0003\u0000\u0000KL\u0003\u0010"+
		"\b\u0000LM\u0005\u0004\u0000\u0000MN\u0005\u0005\u0000\u0000NO\u0003\u0002"+
		"\u0001\u0000OP\u0005\u0006\u0000\u0000P\u000b\u0001\u0000\u0000\u0000"+
		"QR\u0005\t\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0003\u0010\b\u0000"+
		"TU\u0005\u0001\u0000\u0000UV\u0003\u0010\b\u0000VW\u0005\u0001\u0000\u0000"+
		"WX\u0003\u0010\b\u0000XY\u0005\u0004\u0000\u0000YZ\u0005\u0005\u0000\u0000"+
		"Z[\u0003\u0002\u0001\u0000[\\\u0005\u0006\u0000\u0000\\\r\u0001\u0000"+
		"\u0000\u0000]^\u0005\n\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0003\u001c"+
		"\u000e\u0000`a\u0005\u0004\u0000\u0000a\u000f\u0001\u0000\u0000\u0000"+
		"bc\u0006\b\uffff\uffff\u0000cd\u0003\u001c\u000e\u0000de\u0005\u000b\u0000"+
		"\u0000ef\u0003\u0010\b\bfp\u0001\u0000\u0000\u0000gp\u0003\u001c\u000e"+
		"\u0000hp\u0003\u0018\f\u0000ij\u0005\u0003\u0000\u0000jk\u0003\u0010\b"+
		"\u0000kl\u0005\u0004\u0000\u0000lp\u0001\u0000\u0000\u0000mn\u0005\f\u0000"+
		"\u0000np\u0003\u0010\b\u0001ob\u0001\u0000\u0000\u0000og\u0001\u0000\u0000"+
		"\u0000oh\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000p\u007f\u0001\u0000\u0000\u0000qr\n\u0004\u0000\u0000rs\u0003"+
		"\u0012\t\u0000st\u0003\u0010\b\u0005t~\u0001\u0000\u0000\u0000uv\n\u0003"+
		"\u0000\u0000vw\u0003\u0014\n\u0000wx\u0003\u0010\b\u0004x~\u0001\u0000"+
		"\u0000\u0000yz\n\u0002\u0000\u0000z{\u0003\u0016\u000b\u0000{|\u0003\u0010"+
		"\b\u0003|~\u0001\u0000\u0000\u0000}q\u0001\u0000\u0000\u0000}u\u0001\u0000"+
		"\u0000\u0000}y\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0011\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0007\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0007\u0001\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0007\u0002\u0000\u0000\u0087\u0017\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003\u001a\r\u0000\u0089\u008a\u0003\u0018\f\u0000\u008a\u008d"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u001a\r\u0000\u008c\u0088\u0001"+
		"\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0019\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0007\u0003\u0000\u0000\u008f\u001b\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0003\u001e\u000f\u0000\u0091\u0092\u0003"+
		"\u001c\u000e\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0095\u0003"+
		"\u001e\u000f\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u001d\u0001\u0000\u0000\u0000\u0096\u0097\u0007"+
		"\u0004\u0000\u0000\u0097\u001f\u0001\u0000\u0000\u0000\t\',1Go}\u007f"+
		"\u008c\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}