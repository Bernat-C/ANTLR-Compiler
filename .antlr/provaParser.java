// Generated from c://Users//girob//OneDrive//Documents//udg//7e Semestre//Compiladors//Compiladors-ANTLR//prova.g4 by ANTLR 4.13.1
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
		TK_PC_FVARIABLES=54, TK_FUNC_LLEGIR=55, TK_FUNC_ESCRIURE=56, TK_FUNC_ESCRIURELN=57, 
		TK_COMENTARI_1L=58, TK_COMENTARI=59, TK_FCOMENTARI=60, TK_ENTER=61, TK_IDENT=62;
	public static final int
		RULE_inici = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici"
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
			"'ffuncio'", "'retorna'", "'variables'", "'fvariables'", "'llegir'", 
			"'escriure'", "'escriureln'", "'//'", "'/*'", "'*/'"
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
			"TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_FUNC_LLEGIR", "TK_FUNC_ESCRIURE", 
			"TK_FUNC_ESCRIURELN", "TK_COMENTARI_1L", "TK_COMENTARI", "TK_FCOMENTARI", 
			"TK_ENTER", "TK_IDENT"
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
	public static class IniciContext extends ParserRuleContext {
		public List<TerminalNode> EOF() { return getTokens(provaParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(provaParser.EOF, i);
		}
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).enterInici(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof provaListener ) ((provaListener)listener).exitInici(this);
		}
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);
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
				if ( _la <= 0 || (_la==EOF) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9223372036854775806L) != 0) );
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
		"\u0004\u0001>\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0000\u0001\u0007\u0000\u0003\u0001\u0000\u0000\u0000\u0002"+
		"\u0004\b\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000\u0000\u0005\u0006"+
		"\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}