// Generated from E:/UdG/4t/Compiladors/GitFolderP1/Compiladors-ANTLR/prova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class provaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_LPAREN=2, TK_RPAREN=3, TK_SEMI=4, TK_COMMA=5, TK_OP_PLUS=6, 
		TK_OP_MINUS=7, TK_OP_MULT=8, TK_OP_DIV=9, TK_OP_DIV_INT=10, TK_OP_MOD=11, 
		TK_OP_MINUS_UN=12, TK_OP_EQUAL=13, TK_OP_NEQUAL=14, TK_OP_SMALLER=15, 
		TK_OP_SMALLEREQ=16, TK_OP_GREATER=17, TK_OP_GREATEREQ=18, TK_OP_NO=19, 
		TK_OP_AND=20, TK_OP_OR=21, TK_OP_IF=22, TK_OP_ELSE=23, TK_OP_OVEC=24, 
		TK_OP_CVEC=25, TK_OP_GET=26, TK_OP_ASSIG=27, TK_PC_PROGRAMA=28, TK_PC_FPROGRAMA=29, 
		TK_PC_MENTRE=30, TK_PC_FMENTRE=31, TK_PC_FER=32, TK_PC_PER=33, TK_PC_DE=34, 
		TK_PC_FINS=35, TK_PC_FPER=36, TK_PC_SI=37, TK_PC_LLAVORS=38, TK_PC_ALTRAMENT=39, 
		TK_PC_FSI=40, TK_PC_TIPUS=41, TK_PC_FTIPUS=42, TK_PC_VECTOR=43, TK_PC_MIDA=44, 
		TK_PC_INICI=45, TK_PC_TUPLA=46, TK_PC_FTUPLA=47, TK_PC_ACCIO=48, TK_PC_FACCIO=49, 
		TK_PC_FUNCIO=50, TK_PC_FFUNCIO=51, TK_PC_RETORNA=52, TK_PC_VARIABLES=53, 
		TK_PC_FVARIABLES=54, TK_PC_ENTRADA=55, TK_PC_ENTRADA_SORTIDA=56, TK_TIPUS_BASIC=57, 
		TK_FUNC_LLEGIR=58, TK_FUNC_ESCRIURE=59, TK_FUNC_ESCRIURELN=60, TK_COMENTARI=61, 
		TK_ENTER=62, TK_BOOL=63, TK_REAL=64, TK_IDENT=65;
	public static final int
		RULE_p = 0, RULE_bloc_declaracio_tipus = 1, RULE_declaracio_tipus = 2, 
		RULE_declaracio_vector = 3, RULE_declaracio_tupla = 4, RULE_bloc_declaracio_accions_funcions = 5, 
		RULE_accio = 6, RULE_funcio = 7, RULE_parametres_formals = 8, RULE_bloc_declaracio_var_def = 9, 
		RULE_sentencia = 10, RULE_inst_lectura = 11, RULE_inst_escriptura = 12, 
		RULE_e_if_then_else = 13, RULE_e = 14, RULE_e_bool = 15, RULE_op_comparator = 16, 
		RULE_op_binaryLogic = 17, RULE_e_num = 18, RULE_e_entera = 19, RULE_e_real = 20, 
		RULE_op1 = 21, RULE_op2 = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"p", "bloc_declaracio_tipus", "declaracio_tipus", "declaracio_vector", 
			"declaracio_tupla", "bloc_declaracio_accions_funcions", "accio", "funcio", 
			"parametres_formals", "bloc_declaracio_var_def", "sentencia", "inst_lectura", 
			"inst_escriptura", "e_if_then_else", "e", "e_bool", "op_comparator", 
			"op_binaryLogic", "e_num", "e_entera", "e_real", "op1", "op2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'\\'", 
			"'%'", "'~'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'no'", "'&'", 
			"'|'", "'?'", "':'", "'['", "']'", "'.'", "':='", "'programa'", "'fprograma'", 
			"'mentre'", "'fmentre'", "'fer'", "'per'", "'de'", "'fins'", "'fper'", 
			"'si'", "'llavors'", "'altrament'", "'fsi'", "'tipus'", "'ftipus'", "'vector'", 
			"'mida'", "'inici'", "'tupla'", "'ftupla'", "'accio'", "'faccio'", "'funcio'", 
			"'ffuncio'", "'retorna'", "'variables'", "'fvariables'", "'ent'", "'entsor'", 
			null, "'llegir'", "'escriure'", "'escriureln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_WS", "TK_LPAREN", "TK_RPAREN", "TK_SEMI", "TK_COMMA", "TK_OP_PLUS", 
			"TK_OP_MINUS", "TK_OP_MULT", "TK_OP_DIV", "TK_OP_DIV_INT", "TK_OP_MOD", 
			"TK_OP_MINUS_UN", "TK_OP_EQUAL", "TK_OP_NEQUAL", "TK_OP_SMALLER", "TK_OP_SMALLEREQ", 
			"TK_OP_GREATER", "TK_OP_GREATEREQ", "TK_OP_NO", "TK_OP_AND", "TK_OP_OR", 
			"TK_OP_IF", "TK_OP_ELSE", "TK_OP_OVEC", "TK_OP_CVEC", "TK_OP_GET", "TK_OP_ASSIG", 
			"TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_MENTRE", "TK_PC_FMENTRE", 
			"TK_PC_FER", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FPER", "TK_PC_SI", 
			"TK_PC_LLAVORS", "TK_PC_ALTRAMENT", "TK_PC_FSI", "TK_PC_TIPUS", "TK_PC_FTIPUS", 
			"TK_PC_VECTOR", "TK_PC_MIDA", "TK_PC_INICI", "TK_PC_TUPLA", "TK_PC_FTUPLA", 
			"TK_PC_ACCIO", "TK_PC_FACCIO", "TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETORNA", 
			"TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_PC_ENTRADA", "TK_PC_ENTRADA_SORTIDA", 
			"TK_TIPUS_BASIC", "TK_FUNC_LLEGIR", "TK_FUNC_ESCRIURE", "TK_FUNC_ESCRIURELN", 
			"TK_COMENTARI", "TK_ENTER", "TK_BOOL", "TK_REAL", "TK_IDENT"
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
	public String getGrammarFileName() { return "prova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public provaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends ParserRuleContext {
		public Bloc_declaracio_accions_funcionsContext bloc_declaracio_accions_funcions() {
			return getRuleContext(Bloc_declaracio_accions_funcionsContext.class,0);
		}
		public TerminalNode TK_PC_PROGRAMA() { return getToken(provaParser.TK_PC_PROGRAMA, 0); }
		public Bloc_declaracio_var_defContext bloc_declaracio_var_def() {
			return getRuleContext(Bloc_declaracio_var_defContext.class,0);
		}
		public TerminalNode TK_PC_FPROGRAMA() { return getToken(provaParser.TK_PC_FPROGRAMA, 0); }
		public Bloc_declaracio_tipusContext bloc_declaracio_tipus() {
			return getRuleContext(Bloc_declaracio_tipusContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(46);
				bloc_declaracio_tipus();
				}
			}

			setState(49);
			bloc_declaracio_accions_funcions();
			setState(50);
			match(TK_PC_PROGRAMA);
			setState(51);
			bloc_declaracio_var_def();
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				sentencia();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 36238786697L) != 0) );
			setState(57);
			match(TK_PC_FPROGRAMA);
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
	public static class Bloc_declaracio_tipusContext extends ParserRuleContext {
		public TerminalNode TK_PC_TIPUS() { return getToken(provaParser.TK_PC_TIPUS, 0); }
		public TerminalNode TK_PC_FTIPUS() { return getToken(provaParser.TK_PC_FTIPUS, 0); }
		public List<Declaracio_tipusContext> declaracio_tipus() {
			return getRuleContexts(Declaracio_tipusContext.class);
		}
		public Declaracio_tipusContext declaracio_tipus(int i) {
			return getRuleContext(Declaracio_tipusContext.class,i);
		}
		public Bloc_declaracio_tipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_declaracio_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_declaracio_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_declaracio_tipus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitBloc_declaracio_tipus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloc_declaracio_tipusContext bloc_declaracio_tipus() throws RecognitionException {
		Bloc_declaracio_tipusContext _localctx = new Bloc_declaracio_tipusContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloc_declaracio_tipus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TK_PC_TIPUS);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				declaracio_tipus();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(65);
			match(TK_PC_FTIPUS);
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
	public static class Declaracio_tipusContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_OP_ELSE() { return getToken(provaParser.TK_OP_ELSE, 0); }
		public Declaracio_vectorContext declaracio_vector() {
			return getRuleContext(Declaracio_vectorContext.class,0);
		}
		public Declaracio_tuplaContext declaracio_tupla() {
			return getRuleContext(Declaracio_tuplaContext.class,0);
		}
		public Declaracio_tipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDeclaracio_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDeclaracio_tipus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitDeclaracio_tipus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracio_tipusContext declaracio_tipus() throws RecognitionException {
		Declaracio_tipusContext _localctx = new Declaracio_tipusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracio_tipus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TK_IDENT);
			setState(68);
			match(TK_OP_ELSE);
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_VECTOR:
				{
				setState(69);
				declaracio_vector();
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(70);
				declaracio_tupla();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Declaracio_vectorContext extends ParserRuleContext {
		public TerminalNode TK_PC_VECTOR() { return getToken(provaParser.TK_PC_VECTOR, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public TerminalNode TK_PC_MIDA() { return getToken(provaParser.TK_PC_MIDA, 0); }
		public List<TerminalNode> TK_ENTER() { return getTokens(provaParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(provaParser.TK_ENTER, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(provaParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(provaParser.TK_COMMA, i);
		}
		public TerminalNode TK_PC_INICI() { return getToken(provaParser.TK_PC_INICI, 0); }
		public Declaracio_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDeclaracio_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDeclaracio_vector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitDeclaracio_vector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracio_vectorContext declaracio_vector() throws RecognitionException {
		Declaracio_vectorContext _localctx = new Declaracio_vectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracio_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(TK_PC_VECTOR);
			setState(74);
			match(TK_TIPUS_BASIC);
			setState(75);
			match(TK_PC_MIDA);
			setState(76);
			match(TK_ENTER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(77);
				match(TK_COMMA);
				setState(78);
				match(TK_ENTER);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(84);
				match(TK_PC_INICI);
				setState(85);
				match(TK_ENTER);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(86);
					match(TK_COMMA);
					setState(87);
					match(TK_ENTER);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class Declaracio_tuplaContext extends ParserRuleContext {
		public TerminalNode TK_PC_TUPLA() { return getToken(provaParser.TK_PC_TUPLA, 0); }
		public TerminalNode TK_PC_FTUPLA() { return getToken(provaParser.TK_PC_FTUPLA, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_OP_ELSE() { return getTokens(provaParser.TK_OP_ELSE); }
		public TerminalNode TK_OP_ELSE(int i) {
			return getToken(provaParser.TK_OP_ELSE, i);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(provaParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(provaParser.TK_TIPUS_BASIC, i);
		}
		public Declaracio_tuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterDeclaracio_tupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitDeclaracio_tupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitDeclaracio_tupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracio_tuplaContext declaracio_tupla() throws RecognitionException {
		Declaracio_tuplaContext _localctx = new Declaracio_tuplaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracio_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TK_PC_TUPLA);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				match(TK_IDENT);
				setState(97);
				match(TK_OP_ELSE);
				setState(98);
				match(TK_TIPUS_BASIC);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(103);
			match(TK_PC_FTUPLA);
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
	public static class Bloc_declaracio_accions_funcionsContext extends ParserRuleContext {
		public List<AccioContext> accio() {
			return getRuleContexts(AccioContext.class);
		}
		public AccioContext accio(int i) {
			return getRuleContext(AccioContext.class,i);
		}
		public List<FuncioContext> funcio() {
			return getRuleContexts(FuncioContext.class);
		}
		public FuncioContext funcio(int i) {
			return getRuleContext(FuncioContext.class,i);
		}
		public Bloc_declaracio_accions_funcionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_declaracio_accions_funcions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_declaracio_accions_funcions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_declaracio_accions_funcions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitBloc_declaracio_accions_funcions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloc_declaracio_accions_funcionsContext bloc_declaracio_accions_funcions() throws RecognitionException {
		Bloc_declaracio_accions_funcionsContext _localctx = new Bloc_declaracio_accions_funcionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloc_declaracio_accions_funcions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(105);
					accio();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(106);
					funcio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
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
	public static class AccioContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(provaParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_PC_FACCIO() { return getToken(provaParser.TK_PC_FACCIO, 0); }
		public Parametres_formalsContext parametres_formals() {
			return getRuleContext(Parametres_formalsContext.class,0);
		}
		public Bloc_declaracio_var_defContext bloc_declaracio_var_def() {
			return getRuleContext(Bloc_declaracio_var_defContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public AccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitAccio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitAccio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccioContext accio() throws RecognitionException {
		AccioContext _localctx = new AccioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(TK_PC_ACCIO);
			setState(113);
			match(TK_IDENT);
			setState(114);
			match(TK_LPAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 1027L) != 0)) {
				{
				setState(115);
				parametres_formals();
				}
			}

			setState(118);
			match(TK_RPAREN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(119);
				bloc_declaracio_var_def();
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 36238786697L) != 0)) {
				{
				{
				setState(122);
				sentencia();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(TK_PC_FACCIO);
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
	public static class FuncioContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(provaParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_PC_RETORNA() { return getTokens(provaParser.TK_PC_RETORNA); }
		public TerminalNode TK_PC_RETORNA(int i) {
			return getToken(provaParser.TK_PC_RETORNA, i);
		}
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode TK_PC_FFUNCIO() { return getToken(provaParser.TK_PC_FFUNCIO, 0); }
		public Parametres_formalsContext parametres_formals() {
			return getRuleContext(Parametres_formalsContext.class,0);
		}
		public Bloc_declaracio_var_defContext bloc_declaracio_var_def() {
			return getRuleContext(Bloc_declaracio_var_defContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public FuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitFuncio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitFuncio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncioContext funcio() throws RecognitionException {
		FuncioContext _localctx = new FuncioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TK_PC_FUNCIO);
			setState(131);
			match(TK_IDENT);
			setState(132);
			match(TK_LPAREN);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 1027L) != 0)) {
				{
				setState(133);
				parametres_formals();
				}
			}

			setState(136);
			match(TK_RPAREN);
			setState(137);
			match(TK_PC_RETORNA);
			setState(138);
			match(TK_TIPUS_BASIC);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(139);
				bloc_declaracio_var_def();
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 36238786697L) != 0)) {
				{
				{
				setState(142);
				sentencia();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(TK_PC_RETORNA);
			setState(149);
			e();
			setState(150);
			match(TK_PC_FFUNCIO);
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
	public static class Parametres_formalsContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_OP_ELSE() { return getTokens(provaParser.TK_OP_ELSE); }
		public TerminalNode TK_OP_ELSE(int i) {
			return getToken(provaParser.TK_OP_ELSE, i);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(provaParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(provaParser.TK_TIPUS_BASIC, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(provaParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(provaParser.TK_COMMA, i);
		}
		public List<TerminalNode> TK_PC_ENTRADA() { return getTokens(provaParser.TK_PC_ENTRADA); }
		public TerminalNode TK_PC_ENTRADA(int i) {
			return getToken(provaParser.TK_PC_ENTRADA, i);
		}
		public List<TerminalNode> TK_PC_ENTRADA_SORTIDA() { return getTokens(provaParser.TK_PC_ENTRADA_SORTIDA); }
		public TerminalNode TK_PC_ENTRADA_SORTIDA(int i) {
			return getToken(provaParser.TK_PC_ENTRADA_SORTIDA, i);
		}
		public Parametres_formalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterParametres_formals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitParametres_formals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitParametres_formals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametres_formalsContext parametres_formals() throws RecognitionException {
		Parametres_formalsContext _localctx = new Parametres_formalsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametres_formals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ENTRADA || _la==TK_PC_ENTRADA_SORTIDA) {
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==TK_PC_ENTRADA || _la==TK_PC_ENTRADA_SORTIDA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(155);
			match(TK_IDENT);
			setState(156);
			match(TK_OP_ELSE);
			setState(157);
			match(TK_TIPUS_BASIC);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(158);
				match(TK_COMMA);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_ENTRADA || _la==TK_PC_ENTRADA_SORTIDA) {
					{
					setState(159);
					_la = _input.LA(1);
					if ( !(_la==TK_PC_ENTRADA || _la==TK_PC_ENTRADA_SORTIDA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(162);
				match(TK_IDENT);
				setState(163);
				match(TK_OP_ELSE);
				setState(164);
				match(TK_TIPUS_BASIC);
				}
				}
				setState(169);
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
	public static class Bloc_declaracio_var_defContext extends ParserRuleContext {
		public TerminalNode TK_PC_VARIABLES() { return getToken(provaParser.TK_PC_VARIABLES, 0); }
		public TerminalNode TK_PC_FVARIABLES() { return getToken(provaParser.TK_PC_FVARIABLES, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_OP_ELSE() { return getTokens(provaParser.TK_OP_ELSE); }
		public TerminalNode TK_OP_ELSE(int i) {
			return getToken(provaParser.TK_OP_ELSE, i);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(provaParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(provaParser.TK_TIPUS_BASIC, i);
		}
		public List<TerminalNode> TK_SEMI() { return getTokens(provaParser.TK_SEMI); }
		public TerminalNode TK_SEMI(int i) {
			return getToken(provaParser.TK_SEMI, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(provaParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(provaParser.TK_COMMA, i);
		}
		public Bloc_declaracio_var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_declaracio_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterBloc_declaracio_var_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitBloc_declaracio_var_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitBloc_declaracio_var_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloc_declaracio_var_defContext bloc_declaracio_var_def() throws RecognitionException {
		Bloc_declaracio_var_defContext _localctx = new Bloc_declaracio_var_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloc_declaracio_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(TK_PC_VARIABLES);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(171);
				match(TK_IDENT);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(172);
					match(TK_COMMA);
					setState(173);
					match(TK_IDENT);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(TK_OP_ELSE);
				setState(180);
				match(TK_TIPUS_BASIC);
				setState(181);
				match(TK_SEMI);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(TK_PC_FVARIABLES);
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
	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode TK_PC_SI() { return getToken(provaParser.TK_PC_SI, 0); }
		public TerminalNode TK_PC_LLAVORS() { return getToken(provaParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(provaParser.TK_PC_FSI, 0); }
		public E_boolContext e_bool() {
			return getRuleContext(E_boolContext.class,0);
		}
		public List<TerminalNode> TK_IDENT() { return getTokens(provaParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(provaParser.TK_IDENT, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode TK_PC_PER() { return getToken(provaParser.TK_PC_PER, 0); }
		public TerminalNode TK_PC_DE() { return getToken(provaParser.TK_PC_DE, 0); }
		public TerminalNode TK_PC_FINS() { return getToken(provaParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(provaParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(provaParser.TK_PC_FPER, 0); }
		public List<E_enteraContext> e_entera() {
			return getRuleContexts(E_enteraContext.class);
		}
		public E_enteraContext e_entera(int i) {
			return getRuleContext(E_enteraContext.class,i);
		}
		public TerminalNode TK_PC_MENTRE() { return getToken(provaParser.TK_PC_MENTRE, 0); }
		public TerminalNode TK_PC_FMENTRE() { return getToken(provaParser.TK_PC_FMENTRE, 0); }
		public TerminalNode TK_OP_ASSIG() { return getToken(provaParser.TK_OP_ASSIG, 0); }
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(provaParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(provaParser.TK_COMMA, i);
		}
		public Inst_lecturaContext inst_lectura() {
			return getRuleContext(Inst_lecturaContext.class,0);
		}
		public Inst_escripturaContext inst_escriptura() {
			return getRuleContext(Inst_escripturaContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentencia);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(TK_PC_SI);
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_OP_NO:
				case TK_ENTER:
				case TK_BOOL:
				case TK_REAL:
					{
					setState(190);
					e_bool(0);
					}
					break;
				case TK_IDENT:
					{
					setState(191);
					match(TK_IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194);
				match(TK_PC_LLAVORS);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 36238786697L) != 0)) {
					{
					{
					setState(195);
					sentencia();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(TK_PC_FSI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(TK_PC_PER);
				setState(203);
				match(TK_IDENT);
				setState(204);
				match(TK_PC_DE);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_ENTER:
				case TK_REAL:
					{
					setState(205);
					e_entera(0);
					}
					break;
				case TK_IDENT:
					{
					setState(206);
					match(TK_IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209);
				match(TK_PC_FINS);
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_ENTER:
				case TK_REAL:
					{
					setState(210);
					e_entera(0);
					}
					break;
				case TK_IDENT:
					{
					setState(211);
					match(TK_IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214);
				match(TK_PC_FER);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 36238786697L) != 0)) {
					{
					{
					setState(215);
					sentencia();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(TK_PC_FPER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(TK_PC_MENTRE);
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_OP_NO:
				case TK_ENTER:
				case TK_BOOL:
				case TK_REAL:
					{
					setState(223);
					e_bool(0);
					}
					break;
				case TK_IDENT:
					{
					setState(224);
					match(TK_IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227);
				match(TK_PC_FER);
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					sentencia();
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 36238786697L) != 0) );
				setState(233);
				match(TK_PC_FMENTRE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(TK_IDENT);
				setState(236);
				match(TK_OP_ASSIG);
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_OP_NO:
				case TK_ENTER:
				case TK_BOOL:
				case TK_REAL:
					{
					setState(237);
					e();
					}
					break;
				case TK_IDENT:
					{
					setState(238);
					match(TK_IDENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241);
				match(TK_SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(TK_IDENT);
				setState(243);
				match(TK_LPAREN);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_IDENT) {
					{
					setState(244);
					match(TK_IDENT);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(245);
						match(TK_COMMA);
						setState(246);
						match(TK_IDENT);
						}
						}
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(254);
				match(TK_RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				inst_lectura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				inst_escriptura();
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
	public static class Inst_lecturaContext extends ParserRuleContext {
		public TerminalNode TK_FUNC_LLEGIR() { return getToken(provaParser.TK_FUNC_LLEGIR, 0); }
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public TerminalNode TK_IDENT() { return getToken(provaParser.TK_IDENT, 0); }
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public TerminalNode TK_OP_ELSE() { return getToken(provaParser.TK_OP_ELSE, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(provaParser.TK_TIPUS_BASIC, 0); }
		public Inst_lecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterInst_lectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitInst_lectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitInst_lectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_lecturaContext inst_lectura() throws RecognitionException {
		Inst_lecturaContext _localctx = new Inst_lecturaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inst_lectura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TK_FUNC_LLEGIR);
			setState(260);
			match(TK_LPAREN);
			setState(261);
			match(TK_IDENT);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_OP_ELSE) {
				{
				setState(262);
				match(TK_OP_ELSE);
				setState(263);
				match(TK_TIPUS_BASIC);
				}
			}

			setState(266);
			match(TK_RPAREN);
			setState(267);
			match(TK_SEMI);
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
	public static class Inst_escripturaContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(provaParser.TK_LPAREN, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(provaParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(provaParser.TK_SEMI, 0); }
		public TerminalNode TK_FUNC_ESCRIURE() { return getToken(provaParser.TK_FUNC_ESCRIURE, 0); }
		public TerminalNode TK_FUNC_ESCRIURELN() { return getToken(provaParser.TK_FUNC_ESCRIURELN, 0); }
		public List<TerminalNode> TK_OP_ELSE() { return getTokens(provaParser.TK_OP_ELSE); }
		public TerminalNode TK_OP_ELSE(int i) {
			return getToken(provaParser.TK_OP_ELSE, i);
		}
		public Inst_escripturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_escriptura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterInst_escriptura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitInst_escriptura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitInst_escriptura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_escripturaContext inst_escriptura() throws RecognitionException {
		Inst_escripturaContext _localctx = new Inst_escripturaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inst_escriptura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==TK_FUNC_ESCRIURE || _la==TK_FUNC_ESCRIURELN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270);
			match(TK_LPAREN);
			setState(271);
			e();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OP_ELSE) {
				{
				{
				setState(272);
				match(TK_OP_ELSE);
				setState(273);
				e();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(TK_RPAREN);
			setState(280);
			match(TK_SEMI);
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
	public static class E_if_then_elseContext extends ParserRuleContext {
		public E_boolContext e_bool() {
			return getRuleContext(E_boolContext.class,0);
		}
		public TerminalNode TK_OP_IF() { return getToken(provaParser.TK_OP_IF, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode TK_OP_ELSE() { return getToken(provaParser.TK_OP_ELSE, 0); }
		public E_if_then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_if_then_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterE_if_then_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitE_if_then_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitE_if_then_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_if_then_elseContext e_if_then_else() throws RecognitionException {
		E_if_then_elseContext _localctx = new E_if_then_elseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_e_if_then_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			e_bool(0);
			setState(283);
			match(TK_OP_IF);
			setState(284);
			e();
			setState(285);
			match(TK_OP_ELSE);
			setState(286);
			e();
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
	public static class EContext extends ParserRuleContext {
		public E_numContext e_num() {
			return getRuleContext(E_numContext.class,0);
		}
		public E_boolContext e_bool() {
			return getRuleContext(E_boolContext.class,0);
		}
		public E_if_then_elseContext e_if_then_else() {
			return getRuleContext(E_if_then_elseContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_e);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				e_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				e_bool(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				e_if_then_else();
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
	public static class E_boolContext extends ParserRuleContext {
		public TerminalNode TK_BOOL() { return getToken(provaParser.TK_BOOL, 0); }
		public List<E_numContext> e_num() {
			return getRuleContexts(E_numContext.class);
		}
		public E_numContext e_num(int i) {
			return getRuleContext(E_numContext.class,i);
		}
		public Op_comparatorContext op_comparator() {
			return getRuleContext(Op_comparatorContext.class,0);
		}
		public TerminalNode TK_OP_NO() { return getToken(provaParser.TK_OP_NO, 0); }
		public List<E_boolContext> e_bool() {
			return getRuleContexts(E_boolContext.class);
		}
		public E_boolContext e_bool(int i) {
			return getRuleContext(E_boolContext.class,i);
		}
		public Op_binaryLogicContext op_binaryLogic() {
			return getRuleContext(Op_binaryLogicContext.class,0);
		}
		public E_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterE_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitE_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitE_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_boolContext e_bool() throws RecognitionException {
		return e_bool(0);
	}

	private E_boolContext e_bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		E_boolContext _localctx = new E_boolContext(_ctx, _parentState);
		E_boolContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_e_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
				{
				setState(294);
				match(TK_BOOL);
				}
				break;
			case TK_ENTER:
			case TK_REAL:
				{
				setState(295);
				e_num();
				setState(296);
				op_comparator();
				setState(297);
				e_num();
				}
				break;
			case TK_OP_NO:
				{
				setState(299);
				match(TK_OP_NO);
				setState(300);
				e_bool(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new E_boolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_e_bool);
					setState(303);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(304);
					op_binaryLogic();
					setState(305);
					e_bool(3);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class Op_comparatorContext extends ParserRuleContext {
		public TerminalNode TK_OP_EQUAL() { return getToken(provaParser.TK_OP_EQUAL, 0); }
		public TerminalNode TK_OP_NEQUAL() { return getToken(provaParser.TK_OP_NEQUAL, 0); }
		public TerminalNode TK_OP_SMALLER() { return getToken(provaParser.TK_OP_SMALLER, 0); }
		public TerminalNode TK_OP_SMALLEREQ() { return getToken(provaParser.TK_OP_SMALLEREQ, 0); }
		public TerminalNode TK_OP_GREATER() { return getToken(provaParser.TK_OP_GREATER, 0); }
		public TerminalNode TK_OP_GREATEREQ() { return getToken(provaParser.TK_OP_GREATEREQ, 0); }
		public Op_comparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterOp_comparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitOp_comparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitOp_comparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_comparatorContext op_comparator() throws RecognitionException {
		Op_comparatorContext _localctx = new Op_comparatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
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
	public static class Op_binaryLogicContext extends ParserRuleContext {
		public TerminalNode TK_OP_AND() { return getToken(provaParser.TK_OP_AND, 0); }
		public TerminalNode TK_OP_OR() { return getToken(provaParser.TK_OP_OR, 0); }
		public TerminalNode TK_OP_EQUAL() { return getToken(provaParser.TK_OP_EQUAL, 0); }
		public Op_binaryLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_binaryLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterOp_binaryLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitOp_binaryLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitOp_binaryLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_binaryLogicContext op_binaryLogic() throws RecognitionException {
		Op_binaryLogicContext _localctx = new Op_binaryLogicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_binaryLogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3153920L) != 0)) ) {
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
	public static class E_numContext extends ParserRuleContext {
		public E_enteraContext e_entera() {
			return getRuleContext(E_enteraContext.class,0);
		}
		public E_realContext e_real() {
			return getRuleContext(E_realContext.class,0);
		}
		public E_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterE_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitE_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitE_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_numContext e_num() throws RecognitionException {
		E_numContext _localctx = new E_numContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_e_num);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				e_entera(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				e_real(0);
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
	public static class E_enteraContext extends ParserRuleContext {
		public TerminalNode TK_ENTER() { return getToken(provaParser.TK_ENTER, 0); }
		public List<E_realContext> e_real() {
			return getRuleContexts(E_realContext.class);
		}
		public E_realContext e_real(int i) {
			return getRuleContext(E_realContext.class,i);
		}
		public TerminalNode TK_OP_DIV_INT() { return getToken(provaParser.TK_OP_DIV_INT, 0); }
		public List<E_enteraContext> e_entera() {
			return getRuleContexts(E_enteraContext.class);
		}
		public E_enteraContext e_entera(int i) {
			return getRuleContext(E_enteraContext.class,i);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public E_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterE_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitE_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitE_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_enteraContext e_entera() throws RecognitionException {
		return e_entera(0);
	}

	private E_enteraContext e_entera(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		E_enteraContext _localctx = new E_enteraContext(_ctx, _parentState);
		E_enteraContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_e_entera, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ENTER:
				{
				setState(321);
				match(TK_ENTER);
				}
				break;
			case TK_REAL:
				{
				setState(322);
				e_real(0);
				setState(323);
				match(TK_OP_DIV_INT);
				setState(324);
				e_real(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new E_enteraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e_entera);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329);
						op1();
						setState(330);
						e_entera(5);
						}
						break;
					case 2:
						{
						_localctx = new E_enteraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e_entera);
						setState(332);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(333);
						match(TK_OP_DIV_INT);
						setState(334);
						e_entera(4);
						}
						break;
					case 3:
						{
						_localctx = new E_enteraContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e_entera);
						setState(335);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(336);
						op2();
						setState(337);
						e_entera(2);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class E_realContext extends ParserRuleContext {
		public TerminalNode TK_REAL() { return getToken(provaParser.TK_REAL, 0); }
		public List<E_realContext> e_real() {
			return getRuleContexts(E_realContext.class);
		}
		public E_realContext e_real(int i) {
			return getRuleContext(E_realContext.class,i);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public TerminalNode TK_OP_DIV() { return getToken(provaParser.TK_OP_DIV, 0); }
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public E_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterE_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitE_real(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitE_real(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_realContext e_real() throws RecognitionException {
		return e_real(0);
	}

	private E_realContext e_real(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		E_realContext _localctx = new E_realContext(_ctx, _parentState);
		E_realContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_e_real, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345);
			match(TK_REAL);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new E_realContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e_real);
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(350);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TK_OP_MULT:
						case TK_OP_MOD:
							{
							setState(348);
							op1();
							}
							break;
						case TK_OP_DIV:
							{
							setState(349);
							match(TK_OP_DIV);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(352);
						e_real(3);
						}
						break;
					case 2:
						{
						_localctx = new E_realContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_e_real);
						setState(353);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(354);
						op2();
						setState(355);
						e_real(2);
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode TK_OP_MULT() { return getToken(provaParser.TK_OP_MULT, 0); }
		public TerminalNode TK_OP_MOD() { return getToken(provaParser.TK_OP_MOD, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==TK_OP_MULT || _la==TK_OP_MOD) ) {
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
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode TK_OP_PLUS() { return getToken(provaParser.TK_OP_PLUS, 0); }
		public TerminalNode TK_OP_MINUS() { return getToken(provaParser.TK_OP_MINUS, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof provaVisitor ) return ((provaVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==TK_OP_PLUS || _la==TK_OP_MINUS) ) {
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
		case 15:
			return e_bool_sempred((E_boolContext)_localctx, predIndex);
		case 19:
			return e_entera_sempred((E_enteraContext)_localctx, predIndex);
		case 20:
			return e_real_sempred((E_realContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_bool_sempred(E_boolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean e_entera_sempred(E_enteraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean e_real_sempred(E_realContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u016f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		">\b\u0001\u000b\u0001\f\u0001?\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003P\b"+
		"\u0003\n\u0003\f\u0003S\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0003\u0003^\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004d\b\u0004"+
		"\u000b\u0004\f\u0004e\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006y\b\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006"+
		"\u007f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u008d\b\u0007\u0001\u0007\u0005\u0007\u0090\b"+
		"\u0007\n\u0007\f\u0007\u0093\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0003\b\u009a\b\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00a1\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a6\b\b\n"+
		"\b\f\b\u00a9\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00af\b\t\n\t"+
		"\f\t\u00b2\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b7\b\t\n\t\f\t\u00ba"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0001\n"+
		"\u0001\n\u0005\n\u00c5\b\n\n\n\f\n\u00c8\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d0\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d5"+
		"\b\n\u0001\n\u0001\n\u0005\n\u00d9\b\n\n\n\f\n\u00dc\t\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001\n\u0001\n\u0004\n\u00e6\b\n"+
		"\u000b\n\f\n\u00e7\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00f0\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f8"+
		"\b\n\n\n\f\n\u00fb\t\n\u0003\n\u00fd\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0102\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0109\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0113\b\f\n\f\f\f\u0116\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0124\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u012e\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0134\b\u000f\n\u000f\f\u000f\u0137\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u013f\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0147\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0154\b\u0013\n\u0013\f\u0013\u0157"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u015f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0166\b\u0014\n\u0014\f\u0014\u0169\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0003"+
		"\u001e&(\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0006\u0001\u000078\u0001\u0000"+
		";<\u0001\u0000\r\u0012\u0002\u0000\r\r\u0014\u0015\u0002\u0000\b\b\u000b"+
		"\u000b\u0001\u0000\u0006\u0007\u018b\u0000/\u0001\u0000\u0000\u0000\u0002"+
		";\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006I\u0001"+
		"\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000"+
		"\fp\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010"+
		"\u0099\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000\u0014"+
		"\u0101\u0001\u0000\u0000\u0000\u0016\u0103\u0001\u0000\u0000\u0000\u0018"+
		"\u010d\u0001\u0000\u0000\u0000\u001a\u011a\u0001\u0000\u0000\u0000\u001c"+
		"\u0123\u0001\u0000\u0000\u0000\u001e\u012d\u0001\u0000\u0000\u0000 \u0138"+
		"\u0001\u0000\u0000\u0000\"\u013a\u0001\u0000\u0000\u0000$\u013e\u0001"+
		"\u0000\u0000\u0000&\u0146\u0001\u0000\u0000\u0000(\u0158\u0001\u0000\u0000"+
		"\u0000*\u016a\u0001\u0000\u0000\u0000,\u016c\u0001\u0000\u0000\u0000."+
		"0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0003\n\u0005\u000023\u0005\u001c\u0000"+
		"\u000035\u0003\u0012\t\u000046\u0003\u0014\n\u000054\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u001d\u0000\u0000:\u0001"+
		"\u0001\u0000\u0000\u0000;=\u0005)\u0000\u0000<>\u0003\u0004\u0002\u0000"+
		"=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005*\u0000"+
		"\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005A\u0000\u0000DG\u0005\u0017"+
		"\u0000\u0000EH\u0003\u0006\u0003\u0000FH\u0003\b\u0004\u0000GE\u0001\u0000"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000"+
		"IJ\u0005+\u0000\u0000JK\u00059\u0000\u0000KL\u0005,\u0000\u0000LQ\u0005"+
		">\u0000\u0000MN\u0005\u0005\u0000\u0000NP\u0005>\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R]\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0005-\u0000\u0000UZ\u0005>\u0000\u0000VW\u0005\u0005\u0000\u0000W"+
		"Y\u0005>\u0000\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_c\u0005.\u0000\u0000`a\u0005"+
		"A\u0000\u0000ab\u0005\u0017\u0000\u0000bd\u00059\u0000\u0000c`\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005/\u0000\u0000h\t\u0001"+
		"\u0000\u0000\u0000il\u0003\f\u0006\u0000jl\u0003\u000e\u0007\u0000ki\u0001"+
		"\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000b\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u00050\u0000\u0000qr\u0005A\u0000"+
		"\u0000rt\u0005\u0002\u0000\u0000su\u0003\u0010\b\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u0003"+
		"\u0000\u0000wy\u0003\u0012\t\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y}\u0001\u0000\u0000\u0000z|\u0003\u0014\n\u0000{z\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u00051\u0000\u0000\u0081\r\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u00052\u0000\u0000\u0083\u0084\u0005A\u0000\u0000"+
		"\u0084\u0086\u0005\u0002\u0000\u0000\u0085\u0087\u0003\u0010\b\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089"+
		"\u008a\u00054\u0000\u0000\u008a\u008c\u00059\u0000\u0000\u008b\u008d\u0003"+
		"\u0012\t\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0091\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u0014"+
		"\n\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u00054\u0000\u0000\u0095\u0096\u0003\u001c\u000e\u0000"+
		"\u0096\u0097\u00053\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0007\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005A\u0000\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u00a7"+
		"\u00059\u0000\u0000\u009e\u00a0\u0005\u0005\u0000\u0000\u009f\u00a1\u0007"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"A\u0000\u0000\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a6\u00059\u0000"+
		"\u0000\u00a5\u009e\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u0011\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b8\u00055\u0000\u0000\u00ab\u00b0\u0005A\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0005\u0000\u0000\u00ad\u00af\u0005A\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0017\u0000\u0000\u00b4\u00b5\u00059\u0000\u0000\u00b5\u00b7\u0005"+
		"\u0004\u0000\u0000\u00b6\u00ab\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u00056\u0000\u0000\u00bc\u0013\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0005%\u0000\u0000\u00be\u00c1\u0003\u001e\u000f"+
		"\u0000\u00bf\u00c1\u0005A\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c6\u0005&\u0000\u0000\u00c3\u00c5\u0003\u0014\n\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u0102\u0005(\u0000\u0000\u00ca\u00cb\u0005!\u0000\u0000\u00cb\u00cc\u0005"+
		"A\u0000\u0000\u00cc\u00cf\u0005\"\u0000\u0000\u00cd\u00d0\u0003&\u0013"+
		"\u0000\u00ce\u00d0\u0005A\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0005#\u0000\u0000\u00d2\u00d5\u0003&\u0013\u0000\u00d3\u00d5"+
		"\u0005A\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00da\u0005"+
		" \u0000\u0000\u00d7\u00d9\u0003\u0014\n\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u0102\u0005$\u0000"+
		"\u0000\u00de\u00e1\u0005\u001e\u0000\u0000\u00df\u00e2\u0003\u001e\u000f"+
		"\u0000\u00e0\u00e2\u0005A\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0005 \u0000\u0000\u00e4\u00e6\u0003\u0014\n\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001f\u0000\u0000\u00ea"+
		"\u0102\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005A\u0000\u0000\u00ec\u00ef"+
		"\u0005\u001b\u0000\u0000\u00ed\u00f0\u0003\u001c\u000e\u0000\u00ee\u00f0"+
		"\u0005A\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0102\u0005"+
		"\u0004\u0000\u0000\u00f2\u00f3\u0005A\u0000\u0000\u00f3\u00fc\u0005\u0002"+
		"\u0000\u0000\u00f4\u00f9\u0005A\u0000\u0000\u00f5\u00f6\u0005\u0005\u0000"+
		"\u0000\u00f6\u00f8\u0005A\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0102\u0005\u0003\u0000\u0000\u00ff\u0102\u0003\u0016\u000b\u0000"+
		"\u0100\u0102\u0003\u0018\f\u0000\u0101\u00bd\u0001\u0000\u0000\u0000\u0101"+
		"\u00ca\u0001\u0000\u0000\u0000\u0101\u00de\u0001\u0000\u0000\u0000\u0101"+
		"\u00eb\u0001\u0000\u0000\u0000\u0101\u00f2\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0015\u0001\u0000\u0000\u0000\u0103\u0104\u0005:\u0000\u0000\u0104\u0105"+
		"\u0005\u0002\u0000\u0000\u0105\u0108\u0005A\u0000\u0000\u0106\u0107\u0005"+
		"\u0017\u0000\u0000\u0107\u0109\u00059\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0005\u0003\u0000\u0000\u010b\u010c\u0005\u0004"+
		"\u0000\u0000\u010c\u0017\u0001\u0000\u0000\u0000\u010d\u010e\u0007\u0001"+
		"\u0000\u0000\u010e\u010f\u0005\u0002\u0000\u0000\u010f\u0114\u0003\u001c"+
		"\u000e\u0000\u0110\u0111\u0005\u0017\u0000\u0000\u0111\u0113\u0003\u001c"+
		"\u000e\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118\u0119\u0005\u0004"+
		"\u0000\u0000\u0119\u0019\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u001e"+
		"\u000f\u0000\u011b\u011c\u0005\u0016\u0000\u0000\u011c\u011d\u0003\u001c"+
		"\u000e\u0000\u011d\u011e\u0005\u0017\u0000\u0000\u011e\u011f\u0003\u001c"+
		"\u000e\u0000\u011f\u001b\u0001\u0000\u0000\u0000\u0120\u0124\u0003$\u0012"+
		"\u0000\u0121\u0124\u0003\u001e\u000f\u0000\u0122\u0124\u0003\u001a\r\u0000"+
		"\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u001d\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0006\u000f\uffff\uffff\u0000\u0126\u012e\u0005?\u0000\u0000"+
		"\u0127\u0128\u0003$\u0012\u0000\u0128\u0129\u0003 \u0010\u0000\u0129\u012a"+
		"\u0003$\u0012\u0000\u012a\u012e\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"\u0013\u0000\u0000\u012c\u012e\u0003\u001e\u000f\u0001\u012d\u0125\u0001"+
		"\u0000\u0000\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012e\u0135\u0001\u0000\u0000\u0000\u012f\u0130\n\u0002"+
		"\u0000\u0000\u0130\u0131\u0003\"\u0011\u0000\u0131\u0132\u0003\u001e\u000f"+
		"\u0003\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u001f\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0007\u0002\u0000"+
		"\u0000\u0139!\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0003\u0000\u0000"+
		"\u013b#\u0001\u0000\u0000\u0000\u013c\u013f\u0003&\u0013\u0000\u013d\u013f"+
		"\u0003(\u0014\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d\u0001"+
		"\u0000\u0000\u0000\u013f%\u0001\u0000\u0000\u0000\u0140\u0141\u0006\u0013"+
		"\uffff\uffff\u0000\u0141\u0147\u0005>\u0000\u0000\u0142\u0143\u0003(\u0014"+
		"\u0000\u0143\u0144\u0005\n\u0000\u0000\u0144\u0145\u0003(\u0014\u0000"+
		"\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0140\u0001\u0000\u0000\u0000"+
		"\u0146\u0142\u0001\u0000\u0000\u0000\u0147\u0155\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\n\u0004\u0000\u0000\u0149\u014a\u0003*\u0015\u0000\u014a"+
		"\u014b\u0003&\u0013\u0005\u014b\u0154\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\n\u0003\u0000\u0000\u014d\u014e\u0005\n\u0000\u0000\u014e\u0154\u0003"+
		"&\u0013\u0004\u014f\u0150\n\u0001\u0000\u0000\u0150\u0151\u0003,\u0016"+
		"\u0000\u0151\u0152\u0003&\u0013\u0002\u0152\u0154\u0001\u0000\u0000\u0000"+
		"\u0153\u0148\u0001\u0000\u0000\u0000\u0153\u014c\u0001\u0000\u0000\u0000"+
		"\u0153\u014f\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\'\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0006\u0014\uffff\uffff\u0000\u0159\u015a\u0005@\u0000\u0000\u015a"+
		"\u0167\u0001\u0000\u0000\u0000\u015b\u015e\n\u0002\u0000\u0000\u015c\u015f"+
		"\u0003*\u0015\u0000\u015d\u015f\u0005\t\u0000\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0166\u0003(\u0014\u0003\u0161\u0162\n\u0001"+
		"\u0000\u0000\u0162\u0163\u0003,\u0016\u0000\u0163\u0164\u0003(\u0014\u0002"+
		"\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u015b\u0001\u0000\u0000\u0000"+
		"\u0165\u0161\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168)\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0007\u0004\u0000\u0000\u016b+\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0007\u0005\u0000\u0000\u016d-\u0001\u0000\u0000\u0000,/7?GQZ]ekmtx}"+
		"\u0086\u008c\u0091\u0099\u00a0\u00a7\u00b0\u00b8\u00c0\u00c6\u00cf\u00d4"+
		"\u00da\u00e1\u00e7\u00ef\u00f9\u00fc\u0101\u0108\u0114\u0123\u012d\u0135"+
		"\u013e\u0146\u0153\u0155\u015e\u0165\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}