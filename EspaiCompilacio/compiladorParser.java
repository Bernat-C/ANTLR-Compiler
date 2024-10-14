// Generated from C:/Users/girob/OneDrive/Documents/Udg/7e Semestre/Compiladors/Compiladors-ANTLR/compilador.g4 by ANTLR 4.13.1

    import java.io.*;
    import java.util.*;
    import java.util.regex.Pattern;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_LPAREN=2, TK_RPAREN=3, TK_SEMI=4, TK_COMMA=5, TK_OP_PLUS=6, 
		TK_OP_MINUS=7, TK_OP_MULT=8, TK_OP_DIV=9, TK_OP_DIV_INT=10, TK_OP_MOD=11, 
		TK_OP_MINUS_UN=12, TK_OP_EQUAL=13, TK_OP_NEQUAL=14, TK_OP_SMALLER=15, 
		TK_OP_SMALLEREQ=16, TK_OP_GREATER=17, TK_OP_GREATEREQ=18, TK_OP_NO=19, 
		TK_OP_AND=20, TK_OP_OR=21, TK_OP_QMARK=22, TK_COLON=23, TK_OP_OVEC=24, 
		TK_OP_CVEC=25, TK_OP_GET=26, TK_OP_ASSIG=27, TK_PC_PROGRAMA=28, TK_PC_FPROGRAMA=29, 
		TK_PC_MENTRE=30, TK_PC_FMENTRE=31, TK_PC_FER=32, TK_PC_PER=33, TK_PC_DE=34, 
		TK_PC_FINS=35, TK_PC_FPER=36, TK_PC_SI=37, TK_PC_LLAVORS=38, TK_PC_ALTRAMENT=39, 
		TK_PC_FSI=40, TK_PC_TIPUS=41, TK_PC_FTIPUS=42, TK_PC_VECTOR=43, TK_PC_MIDA=44, 
		TK_PC_INICI=45, TK_PC_TUPLA=46, TK_PC_FTUPLA=47, TK_PC_ACCIO=48, TK_PC_FACCIO=49, 
		TK_PC_FUNCIO=50, TK_PC_FFUNCIO=51, TK_PC_RETORNA=52, TK_PC_VARIABLES=53, 
		TK_PC_FVARIABLES=54, TK_PC_ENTRADA=55, TK_PC_ENTRADA_SORTIDA=56, TK_TIPUS_BASIC=57, 
		TK_FUNC_LLEGIR=58, TK_FUNC_ESCRIURE=59, TK_FUNC_ESCRIURELN=60, TK_COMENTARI=61, 
		TK_ENTER=62, TK_BOOL=63, TK_REAL=64, TK_STRING=65, TK_IDENT=66;
	public static final int
		RULE_arrel = 0, RULE_bloc_declaracio_tipus = 1, RULE_declaracio_tipus = 2, 
		RULE_declaracio_vector = 3, RULE_declaracio_tupla = 4, RULE_bloc_declaracio_accions_funcions = 5, 
		RULE_accio = 6, RULE_funcio = 7, RULE_parametres_formals = 8, RULE_bloc_declaracio_var_def = 9, 
		RULE_declaracio_var = 10, RULE_sentencia = 11, RULE_inst_lectura = 12, 
		RULE_inst_escriptura = 13, RULE_e = 14, RULE_e_bool = 15, RULE_e_num = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"arrel", "bloc_declaracio_tipus", "declaracio_tipus", "declaracio_vector", 
			"declaracio_tupla", "bloc_declaracio_accions_funcions", "accio", "funcio", 
			"parametres_formals", "bloc_declaracio_var_def", "declaracio_var", "sentencia", 
			"inst_lectura", "inst_escriptura", "e", "e_bool", "e_num"
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
			"TK_OP_QMARK", "TK_COLON", "TK_OP_OVEC", "TK_OP_CVEC", "TK_OP_GET", "TK_OP_ASSIG", 
			"TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_MENTRE", "TK_PC_FMENTRE", 
			"TK_PC_FER", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FPER", "TK_PC_SI", 
			"TK_PC_LLAVORS", "TK_PC_ALTRAMENT", "TK_PC_FSI", "TK_PC_TIPUS", "TK_PC_FTIPUS", 
			"TK_PC_VECTOR", "TK_PC_MIDA", "TK_PC_INICI", "TK_PC_TUPLA", "TK_PC_FTUPLA", 
			"TK_PC_ACCIO", "TK_PC_FACCIO", "TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETORNA", 
			"TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_PC_ENTRADA", "TK_PC_ENTRADA_SORTIDA", 
			"TK_TIPUS_BASIC", "TK_FUNC_LLEGIR", "TK_FUNC_ESCRIURE", "TK_FUNC_ESCRIURELN", 
			"TK_COMENTARI", "TK_ENTER", "TK_BOOL", "TK_REAL", "TK_STRING", "TK_IDENT"
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
	public String getGrammarFileName() { return "compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	         SymTable<Registre> TS = new SymTable<Registre>(1000);
	         SymTable<Registre> TSDef = new SymTable<Registre>(1000);
	         boolean error = false;
	         Bytecode x;
	         Long varCount  = 0L;
	         Long saltLinia;
	         //int parametresLlegits = 0;

	         //override method
	         public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
	              super.notifyErrorListeners(offendingToken,msg,e);
	              error=true;
	         }

	         public void errorTipus(int line, char expected, char found){
	            error = true;
	            System.out.println("Error de tipus detectat a la linia " + line + ". S'esperava " + tipusAString(expected) +
	            ". S'ha trobat " + tipusAString(found));
	         }

	         public void errorTipus(Token t, char expected, char found){
	            error = true;
	            System.out.println("Error de tipus detectat a la linia " + t.getLine() + ". S'esperava " + tipusAString(expected) +
	            ". S'ha trobat " + tipusAString(found));
	         }

	         public void errorTipus(Token t, String expected, String found){
	             error = true;
	             System.out.println("Error de tipus detectat a la linia " + t.getLine() + ". S'esperava " + expected +
	             ". S'ha trobat " + found);
	         }

	         public void errorVariableInexistent(Token t){
	            error = true;
	            System.out.println("Error de variable no existent a la linia " + t.getLine());
	         }

	         public void errorCridaInexistent(Token t) {
	            error = true;
	            System.out.println("Error de funció o acció no existent a la linia " + t.getLine());
	         }

	         public void errorAssignacio(Token t){
	            error = true;
	            Registre reg = TS.obtenir(t.getText());
	            System.out.println("Error d'assignació total de " + tipusAString(reg.tipus.get(0)) + " a la linia " + t.getLine());
	         }

	        // Retorna true si supertipus és supertipus o igual que tipus
	        public Boolean esSuperTipus(char supertipus, char tipus){
	            return supertipus == 'Q' || supertipus == tipus ||
	            (supertipus == 'N' && (tipus == 'E' || tipus == 'R') ||
	            supertipus == 'R' && tipus == 'E');
	        }

	        public char getNumericReturnType(char t1, char t2){
	           return (t1 == 'R' || t2 == 'R') ? 'R' : 'E';
	        }

	        public Boolean esNumeric(char c){
	            return esSuperTipus('N', c);
	        }

	        public char tipusAChar(String s) {
	            if(s.equals("enter")) return 'E';
	            else if(s.equals("numero")) return 'N';
	            else if(s.equals("real")) return 'R';
	            else if(s.equals("bool")) return 'B';
	            else if(s.equals("accio")) return 'A'; //Void
	            else if(s.equals("funcio")) return 'F';
	            else if(s.equals("vector")) return 'V';
	            else if(s.equals("tupla")) return 'T';
	            else if(s.equals("qualsevol")) return 'Q';
	            else if(s.equals("programa")) return 'P';
	            else return 'U';
	        }

	        public String tipusAString(char c) {
	            if(c == 'E') return "enter";
	            else if(c == 'N') return "numero";
	            else if(c == 'R') return "real";
	            else if(c == 'B') return "bool";
	            else if(c == 'A') return "accio"; //Void
	            else if(c == 'F') return "funcio";
	            else if(c == 'V') return "vector";
	            else if(c == 'T') return "tupla";
	            else if(c == 'Q') return "qualsevol";
	            else if(c == 'P') return "programa";
	            else return "unknown";
	        }

	        public char tipusACharBytecode(char c) {
	            if(c == 'E') return 'I';
	            else if(c == 'R') return 'F';
	            else if(c == 'B') return 'Z';
	            else if(c == 'A') return 'V'; //Void
	            else return c;
	        }

	        public Long getVectorType(char c){
	            Long l = x.T_INT;
	            if(c == 'R') l = x.T_FLOAT;
	            else if(c == 'B') l = x.T_BOOLEAN;
	            return l;
	        }

	        public void errorNombreParametresIncorrecte(Token t){
	            error = true;
	            Registre reg = TS.obtenir(t.getText());
	            int parametresEsperats = reg.tipus.size();
	            if(reg.tipus.get(0) == 'F') parametresEsperats -= 2;
	            else parametresEsperats -= 1;
	            System.out.println("Error a la linia " + t.getLine()
	                + ". La crida " + t.getText() + " espera "+ parametresEsperats + " parametres.");
	        }

	        public void errorTipusParametreIncorrecte(Token t, int pos, char expected, char found){
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + " a " + t.getText() +
	                    ": Error de tipus al parametre " + pos +
	                    ". S'esperava el tipus: " + tipusAString(expected) +
	                    ". S'ha trobat el tipus: " + tipusAString(found));
	        }

	        public void comprovarParametres(Token t, char tipus, int parametresLlegits){
	            Registre reg = TS.obtenir(t.getText());
	            char tReg = reg.tipus.get(0);
	            // En cas que sigui una funció
	            if (tReg == 'F') {
	                // Si hem llegit més paràmetres que la llargada del tipus - 2
	                if (reg.tipus.size() - 2 < parametresLlegits) {
	                    errorNombreParametresIncorrecte(t);
	                }
	                // Altrament, comprovem que el paràmetre sigui correcte
	                else if(!esSuperTipus(reg.tipus.get(parametresLlegits), tipus)){
	                    errorTipusParametreIncorrecte(t, parametresLlegits, reg.tipus.get(parametresLlegits), tipus);
	                }
	                //TODO: Fer alguna cosa aquí ?
	            }
	            // En cas que sigui una acció
	            else if (tReg == 'A') {
	                // Si hem llegit més paràmetres que la llargada del tipus - 1
	                if (reg.tipus.size() - 1 < parametresLlegits) {
	                    errorNombreParametresIncorrecte(t);
	                }
	                // Altrament, comprovem que el paràmetre sigui correcte
	                else if(!esSuperTipus(reg.tipus.get(parametresLlegits), tipus)){
	                    errorTipusParametreIncorrecte(t, parametresLlegits, reg.tipus.get(parametresLlegits), tipus);
	                }
	                //TODO: Fer alguna cosa aquí ?
	            }
	            else {
	                //TODO: ? No hi hauria d'haver aquesta possibilitat crec
	            }
	        }

	        public void comprovarProuParametres(Token t, int parametresLlegits){
	            Registre reg = TS.obtenir(t.getText());
	            int parametresEsperats = reg.tipus.size();

	            if(reg.tipus.get(0) == 'F') parametresEsperats -= 2;
	            else parametresEsperats -= 1;

	            if(parametresLlegits < parametresEsperats){
	                errorNombreParametresIncorrecte(t);
	            }
	        }

	        public void errorFuncioIncorrecta(Token t){
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + ": ús de la funció " + t.getText() +" sense assignar valor de retorn.");
	        }

	        public void errorAccioIncorrecta(Token t){
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + ": ús de l'acció " + t.getText() +" quan s'esperava una expressió.");
	        }

	        public void errorTuplaCampIncorrecte(Token t, String camp){
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + ": La tupla " + t.getText() + " no conté el camp " + camp + ".");
	        }

	        public void errorTipusPreviamentDefinit(Token t) {
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + " el tipus " + t.getText() + " ja ha estat definit amb anterioritat.");
	        }

	        public void errorTuplaJaConteCamp(Token t, Token t2) {
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + " el camp " + t.getText() + " ja existeix a la tupla " + t2.getText() + ".");
	        }

	        public void errorVariableJaDefinida(Token t) {
	            error = true;
	            System.out.println("Error a la linia " + t.getLine() + " la variable " + t.getText() + " ja existeix.");
	        }

	        public void errorParametreDuplicat(String text) {
	            error = true;
	            System.out.println("Error: Una funció no pot tenir dos parametres amb el mateix nom: " + text + ".");
	        }

	        public void afegirInstruccionsEscriure(Vector<Long> trad, Character c){
	            if(c != 'S') trad.add(x.INVOKESTATIC);
	            switch (c) {
	                case 'E':
	                    trad.add(x.nByte(x.mPutInt,2));
	                    trad.add(x.nByte(x.mPutInt,1));
	                    break;
	                case 'R':
	                    trad.add(x.nByte(x.mPutFloat,2));
	                    trad.add(x.nByte(x.mPutFloat,1));
	                    break;
	                case 'B':
	                    trad.add(x.nByte(x.mPutBoolean,2));
	                    trad.add(x.nByte(x.mPutBoolean,1));
	                    break;
	                case 'S':
	                    // Ja es fa tot a la traducció dels strings
	                    //trad.add(x.nByte(x.mPutString,2));
	                    //trad.add(x.nByte(x.mPutString,1));
	                    break;
	                default:

	                    break;
	            }

	        }

	        public void errorAccesDimensionsIncorrectes(Token t, int expectedDim){
	            System.out.println("Error a la linia " + t.getLine() + " al vector " + t.getText() + ". Acces incorrecte, s'esperen " + expectedDim + " dimensions.");
	            error = true;
	        }

	public compiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrelContext extends ParserRuleContext {
		public Bloc_declaracio_tipusContext b;
		public Bloc_declaracio_accions_funcionsContext c;
		public Token a;
		public Bloc_declaracio_var_defContext d;
		public SentenciaContext f;
		public TerminalNode TK_PC_PROGRAMA() { return getToken(compiladorParser.TK_PC_PROGRAMA, 0); }
		public TerminalNode TK_PC_FPROGRAMA() { return getToken(compiladorParser.TK_PC_FPROGRAMA, 0); }
		public Bloc_declaracio_accions_funcionsContext bloc_declaracio_accions_funcions() {
			return getRuleContext(Bloc_declaracio_accions_funcionsContext.class,0);
		}
		public TerminalNode TK_IDENT() { return getToken(compiladorParser.TK_IDENT, 0); }
		public Bloc_declaracio_tipusContext bloc_declaracio_tipus() {
			return getRuleContext(Bloc_declaracio_tipusContext.class,0);
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
		public ArrelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterArrel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitArrel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitArrel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrelContext arrel() throws RecognitionException {
		ArrelContext _localctx = new ArrelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arrel);

		    x=new Bytecode("fitxerquecalexecutar");
		    saltLinia=x.addConstant("S","\n");
		    Vector<Long> trad = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(34);
				((ArrelContext)_localctx).b = bloc_declaracio_tipus();
				trad.addAll(((ArrelContext)_localctx).b.trad);
				}
			}

			setState(39);
			((ArrelContext)_localctx).c = bloc_declaracio_accions_funcions();

			        TS = TSDef;
			    
			setState(41);
			match(TK_PC_PROGRAMA);
			setState(42);
			((ArrelContext)_localctx).a = match(TK_IDENT);

			        ArrayList<Character> tipusProg = new ArrayList<>();
			        tipusProg.add('P');
			        //TODO: Fer-ho bé
			        TS.inserir((((ArrelContext)_localctx).a!=null?((ArrelContext)_localctx).a.getText():null), new Registre(((ArrelContext)_localctx).a.getText(), tipusProg, varCount++));
			    
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(44);
				((ArrelContext)_localctx).d = bloc_declaracio_var_def();
				}
			}

			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				((ArrelContext)_localctx).f = sentencia();

				        trad.addAll(((ArrelContext)_localctx).f.trad);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0) );
			setState(54);
			match(TK_PC_FPROGRAMA);

			        if (!error){
			            trad.add(x.RETURN);
			            System.out.println("Traduccio final:" + trad);
			            x.addMainCode(20L,20L,trad);
			            x.write();
			        }
			        else System.out.println("Error! No s'ha fet write");
			    
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
		public Vector<Long> trad;
		public Declaracio_tipusContext dec;
		public TerminalNode TK_PC_TIPUS() { return getToken(compiladorParser.TK_PC_TIPUS, 0); }
		public TerminalNode TK_PC_FTIPUS() { return getToken(compiladorParser.TK_PC_FTIPUS, 0); }
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
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterBloc_declaracio_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitBloc_declaracio_tipus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitBloc_declaracio_tipus(this);
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
			setState(57);
			match(TK_PC_TIPUS);
			((Bloc_declaracio_tipusContext)_localctx).trad =  new Vector<Long>();
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				((Bloc_declaracio_tipusContext)_localctx).dec = declaracio_tipus();
				_localctx.trad.addAll(((Bloc_declaracio_tipusContext)_localctx).dec.trad);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(66);
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
		public Vector<Long> trad;
		public Declaracio_vectorContext dec;
		public Declaracio_tuplaContext declaracio_tupla() {
			return getRuleContext(Declaracio_tuplaContext.class,0);
		}
		public Declaracio_vectorContext declaracio_vector() {
			return getRuleContext(Declaracio_vectorContext.class,0);
		}
		public Declaracio_tipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracio_tipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracio_tipus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracio_tipus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracio_tipusContext declaracio_tipus() throws RecognitionException {
		Declaracio_tipusContext _localctx = new Declaracio_tipusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracio_tipus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Declaracio_tipusContext)_localctx).trad =  new Vector<Long>();
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69);
				((Declaracio_tipusContext)_localctx).dec = declaracio_vector();
				((Declaracio_tipusContext)_localctx).trad =  ((Declaracio_tipusContext)_localctx).dec.trad;
				}
				break;
			case 2:
				{
				setState(72);
				declaracio_tupla();
				_localctx.trad.addAll(new Vector<Long>());
				}
				break;
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
		public Vector<Long> trad;
		public Token nom;
		public Token tipus;
		public Token m1;
		public Token mn;
		public Token ini;
		public Token ini2;
		public TerminalNode TK_COLON() { return getToken(compiladorParser.TK_COLON, 0); }
		public TerminalNode TK_PC_VECTOR() { return getToken(compiladorParser.TK_PC_VECTOR, 0); }
		public TerminalNode TK_PC_MIDA() { return getToken(compiladorParser.TK_PC_MIDA, 0); }
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public TerminalNode TK_IDENT() { return getToken(compiladorParser.TK_IDENT, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(compiladorParser.TK_TIPUS_BASIC, 0); }
		public List<TerminalNode> TK_ENTER() { return getTokens(compiladorParser.TK_ENTER); }
		public TerminalNode TK_ENTER(int i) {
			return getToken(compiladorParser.TK_ENTER, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public TerminalNode TK_PC_INICI() { return getToken(compiladorParser.TK_PC_INICI, 0); }
		public Declaracio_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracio_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracio_vector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracio_vector(this);
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
			setState(77);
			((Declaracio_vectorContext)_localctx).nom = match(TK_IDENT);
			setState(78);
			match(TK_COLON);
			setState(79);
			match(TK_PC_VECTOR);
			setState(80);
			((Declaracio_vectorContext)_localctx).tipus = match(TK_TIPUS_BASIC);

			     Long varC = varCount++;
			     ArrayList<Long> inicis = new ArrayList<>();
			     ArrayList<Long> mides = new ArrayList<>();
			     ArrayList<Character> tipusVec = new ArrayList<>();
			     ((Declaracio_vectorContext)_localctx).trad =  new Vector<Long>(10);
			     if(TSDef.existeix(((Declaracio_vectorContext)_localctx).nom.getText())){
			         errorTipusPreviamentDefinit(((Declaracio_vectorContext)_localctx).nom);
			     }
			     else {
			         tipusVec.add('V');
			         tipusVec.add(tipusAChar(((Declaracio_vectorContext)_localctx).tipus.getText()));
			     }
			 
			setState(82);
			match(TK_PC_MIDA);
			setState(83);
			((Declaracio_vectorContext)_localctx).m1 = match(TK_ENTER);

			    Long mida = Long.valueOf(((Declaracio_vectorContext)_localctx).m1.getText());
			    mides.add(mida);

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(85);
				match(TK_COMMA);
				setState(86);
				((Declaracio_vectorContext)_localctx).mn = match(TK_ENTER);

				    mida = Long.valueOf(((Declaracio_vectorContext)_localctx).mn.getText());
				    mides.add(mida);

				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(93);
				match(TK_PC_INICI);
				setState(94);
				((Declaracio_vectorContext)_localctx).ini = match(TK_ENTER);

				    Long inici = Long.valueOf(((Declaracio_vectorContext)_localctx).ini.getText());
				    inicis.add(inici);

				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(96);
					match(TK_COMMA);
					setState(97);
					((Declaracio_vectorContext)_localctx).ini2 = match(TK_ENTER);

					    inici = Long.valueOf(((Declaracio_vectorContext)_localctx).ini.getText());
					    inicis.add(inici);

					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
			match(TK_SEMI);

			    Registre reg = new Registre((((Declaracio_vectorContext)_localctx).nom!=null?((Declaracio_vectorContext)_localctx).nom.getText():null), tipusVec, varC, inicis, mides);
			    TSDef.inserir((((Declaracio_vectorContext)_localctx).nom!=null?((Declaracio_vectorContext)_localctx).nom.getText():null), reg);

			    if(mides.size() != inicis.size() & inicis.size() > 0){
			        System.out.println("La quantitat d'inicis i mides no coincideixen pel vector " + ((Declaracio_vectorContext)_localctx).nom.getText() + ", a la linia " + ((Declaracio_vectorContext)_localctx).nom.getLine() + ".");
			        error = true;
			    }
			    for(Long c : mides){
			        _localctx.trad.add(x.BIPUSH);
			        _localctx.trad.add(c);
			    }
			    if(mides.size() == 1){
			        _localctx.trad.add(x.NEWARRAY);
			        _localctx.trad.add(getVectorType(tipusAChar(((Declaracio_vectorContext)_localctx).tipus.getText()))); //tipus del vector
			    }
			    else{
			        Long adreca = x.addArrayDef(mides.size(), String.valueOf(tipusACharBytecode(tipusAChar(((Declaracio_vectorContext)_localctx).tipus.getText()))));
			        _localctx.trad.add(x.MULTIANEWARRAY);
			        _localctx.trad.add(x.nByte(adreca,2));
			        _localctx.trad.add(x.nByte(adreca,1));
			        _localctx.trad.add(Long.valueOf(mides.size()));
			    }
			    _localctx.trad.add(x.ASTORE);
			    _localctx.trad.add(varC);

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
		public Token nom;
		public Token camp;
		public Token tipus;
		public List<TerminalNode> TK_COLON() { return getTokens(compiladorParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(compiladorParser.TK_COLON, i);
		}
		public TerminalNode TK_PC_TUPLA() { return getToken(compiladorParser.TK_PC_TUPLA, 0); }
		public TerminalNode TK_PC_FTUPLA() { return getToken(compiladorParser.TK_PC_FTUPLA, 0); }
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(compiladorParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(compiladorParser.TK_TIPUS_BASIC, i);
		}
		public Declaracio_tuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracio_tupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracio_tupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracio_tupla(this);
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
			setState(109);
			((Declaracio_tuplaContext)_localctx).nom = match(TK_IDENT);

			    if(TSDef.existeix(((Declaracio_tuplaContext)_localctx).nom.getText())){
			        errorTipusPreviamentDefinit(((Declaracio_tuplaContext)_localctx).nom);
			    }
			    else {
			        ArrayList<Character> tipusTup = new ArrayList<>();
			        tipusTup.add('T');
			        Registre reg = new Registre(((Declaracio_tuplaContext)_localctx).nom.getText(), tipusTup, varCount++);
			        TSDef.inserir(((Declaracio_tuplaContext)_localctx).nom.getText(), reg);
			    }

			setState(111);
			match(TK_COLON);
			setState(112);
			match(TK_PC_TUPLA);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				((Declaracio_tuplaContext)_localctx).camp = match(TK_IDENT);
				setState(114);
				match(TK_COLON);
				setState(115);
				((Declaracio_tuplaContext)_localctx).tipus = match(TK_TIPUS_BASIC);

				    String c = ((Declaracio_tuplaContext)_localctx).nom.getText() + "." + ((Declaracio_tuplaContext)_localctx).camp.getText();

				    if(TSDef.existeix(c)){
				        errorTuplaJaConteCamp(((Declaracio_tuplaContext)_localctx).camp, ((Declaracio_tuplaContext)_localctx).nom);
				    }
				    else{
				        ArrayList<Character> tipusTup = new ArrayList<>();
				        tipusTup.add(tipusAChar(((Declaracio_tuplaContext)_localctx).tipus.getText()));
				        Registre reg = new Registre(c, tipusTup, varCount++);
				        TSDef.inserir(c, reg);
				    }

				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(121);
			match(TK_PC_FTUPLA);
			setState(122);
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
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterBloc_declaracio_accions_funcions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitBloc_declaracio_accions_funcions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitBloc_declaracio_accions_funcions(this);
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
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(124);
					accio();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(125);
					funcio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130);
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
		public Token a1;
		public Token id1;
		public Token tip;
		public Token id2;
		public Token tip2;
		public SentenciaContext t2;
		public TerminalNode TK_PC_ACCIO() { return getToken(compiladorParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_LPAREN() { return getToken(compiladorParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(compiladorParser.TK_RPAREN, 0); }
		public TerminalNode TK_PC_FACCIO() { return getToken(compiladorParser.TK_PC_FACCIO, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_COLON() { return getTokens(compiladorParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(compiladorParser.TK_COLON, i);
		}
		public Bloc_declaracio_var_defContext bloc_declaracio_var_def() {
			return getRuleContext(Bloc_declaracio_var_defContext.class,0);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(compiladorParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(compiladorParser.TK_TIPUS_BASIC, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> TK_PC_ENTRADA() { return getTokens(compiladorParser.TK_PC_ENTRADA); }
		public TerminalNode TK_PC_ENTRADA(int i) {
			return getToken(compiladorParser.TK_PC_ENTRADA, i);
		}
		public List<TerminalNode> TK_PC_ENTRADA_SORTIDA() { return getTokens(compiladorParser.TK_PC_ENTRADA_SORTIDA); }
		public TerminalNode TK_PC_ENTRADA_SORTIDA(int i) {
			return getToken(compiladorParser.TK_PC_ENTRADA_SORTIDA, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public AccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitAccio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitAccio(this);
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
			setState(131);
			match(TK_PC_ACCIO);
			setState(132);
			((AccioContext)_localctx).a1 = match(TK_IDENT);

			setState(134);
			match(TK_LPAREN);

			                ArrayList<Character> tipusPar = new ArrayList<>();
			                ArrayList<String> nomPar = new ArrayList<>();
			                ArrayList<Boolean> isEntSor = new ArrayList<>();
			                ArrayList<Long> poseES = new ArrayList<>();
			                Vector<Long> trad = new Vector<>();
			            
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 2051L) != 0)) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ENTRADA:
					{
					setState(136);
					match(TK_PC_ENTRADA);
					isEntSor.add(false);
					}
					break;
				case TK_PC_ENTRADA_SORTIDA:
					{
					setState(138);
					match(TK_PC_ENTRADA_SORTIDA);
					isEntSor.add(true);
					}
					break;
				case TK_IDENT:
					break;
				default:
					break;
				}
				setState(142);
				((AccioContext)_localctx).id1 = match(TK_IDENT);
				setState(143);
				match(TK_COLON);
				setState(144);
				((AccioContext)_localctx).tip = match(TK_TIPUS_BASIC);

				                tipusPar.add(tipusAChar(((AccioContext)_localctx).tip.getText()));
				                nomPar.add(((AccioContext)_localctx).id1.getText());
				                if(tipusPar.size() > isEntSor.size()) {
				                    isEntSor.add(false);
				                }
				            
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(146);
					match(TK_COMMA);
					setState(151);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TK_PC_ENTRADA:
						{
						setState(147);
						match(TK_PC_ENTRADA);
						isEntSor.add(false);
						}
						break;
					case TK_PC_ENTRADA_SORTIDA:
						{
						setState(149);
						match(TK_PC_ENTRADA_SORTIDA);
						isEntSor.add(true);
						}
						break;
					case TK_IDENT:
						break;
					default:
						break;
					}
					setState(153);
					((AccioContext)_localctx).id2 = match(TK_IDENT);
					setState(154);
					match(TK_COLON);
					setState(155);
					((AccioContext)_localctx).tip2 = match(TK_TIPUS_BASIC);

					                tipusPar.add(tipusAChar(((AccioContext)_localctx).tip2.getText()));
					                nomPar.add(((AccioContext)_localctx).id2.getText());
					                if(tipusPar.size() > isEntSor.size()) {
					                    isEntSor.add(false);
					                }
					            
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(164);
			match(TK_RPAREN);

			                    String s = "(";
			                    varCount = Long.valueOf(tipusPar.size());

			                    for (int count = 0; count < tipusPar.size(); count++) {
			                        if(isEntSor.get(count)) s = s + '[';
			                        s = s + tipusACharBytecode(tipusPar.get(count)); // TODO: FUNCIO enter a i

			                        if(TS.existeix(nomPar.get(count))){
			                            errorParametreDuplicat(nomPar.get(count));
			                        }
			                        else {
			                            ArrayList<Character> t = new ArrayList<>();
			                            t.add(tipusPar.get(count));

			                            // Carreguem els paràmetres, que ocuparan les primeres posicions de la zona de variables
			                            if(isEntSor.get(count)) {
			                                trad.add(x.ALOAD);
			                                trad.add(Long.valueOf(count));
			                                trad.add(x.BIPUSH);
			                                trad.add(0L);
			                                trad.add(x.IALOAD);
			                                trad.add(x.ISTORE);
			                                trad.add(Long.valueOf(varCount));
			                                poseES.add(varCount);
			                                TS.inserir(nomPar.get(count), new Registre(nomPar.get(count),t,Long.valueOf(varCount++)));
			                            }
			                            else {
			                                TS.inserir(nomPar.get(count), new Registre(nomPar.get(count),t,Long.valueOf(count)));
			                            }
			                        }
			                    }

			                    // Afegim al principi per marcar que és una acció.
			                    tipusPar.add(0,'A');

			                    Long addrFunc = x.addFunctionDef(((AccioContext)_localctx).a1.getText(),s+')'+'V');
			                    TSDef.inserir(((AccioContext)_localctx).a1.getText(), new Registre(((AccioContext)_localctx).a1.getText(), tipusPar, addrFunc,isEntSor));
			            
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(166);
				bloc_declaracio_var_def();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0)) {
				{
				{
				setState(169);
				((AccioContext)_localctx).t2 = sentencia();

				            trad.addAll(((AccioContext)_localctx).t2.trad);
				        
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(TK_PC_FACCIO);

			            int i = 0;
			            for (int count = 0; count < isEntSor.size(); count++) {
			                if(isEntSor.get(count)) { //U
			                    trad.add(x.ALOAD);
			                    trad.add(Long.valueOf(count));
			                    trad.add(x.BIPUSH);
			                    trad.add(0L);
			                    trad.add(x.ILOAD);
			                    trad.add(Long.valueOf(poseES.get(i)));
			                    trad.add(x.IASTORE);
			                    i++;
			                }
			            }
			            trad.add(x.RETURN);

			            x.addFunctionCode(addrFunc,10L,10L,trad); // Aqui
			            TS = new SymTable<Registre>(1000);
			            varCount = 0L;
			        
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
		public Token a1;
		public Token id1;
		public Token tip;
		public Token id2;
		public Token tip2;
		public Token a2;
		public SentenciaContext t2;
		public EContext a3;
		public TerminalNode TK_PC_FUNCIO() { return getToken(compiladorParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_LPAREN() { return getToken(compiladorParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(compiladorParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_PC_RETORNA() { return getTokens(compiladorParser.TK_PC_RETORNA); }
		public TerminalNode TK_PC_RETORNA(int i) {
			return getToken(compiladorParser.TK_PC_RETORNA, i);
		}
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public TerminalNode TK_PC_FFUNCIO() { return getToken(compiladorParser.TK_PC_FFUNCIO, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(compiladorParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(compiladorParser.TK_TIPUS_BASIC, i);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public List<TerminalNode> TK_COLON() { return getTokens(compiladorParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(compiladorParser.TK_COLON, i);
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
		public List<TerminalNode> TK_PC_ENTRADA() { return getTokens(compiladorParser.TK_PC_ENTRADA); }
		public TerminalNode TK_PC_ENTRADA(int i) {
			return getToken(compiladorParser.TK_PC_ENTRADA, i);
		}
		public List<TerminalNode> TK_PC_ENTRADA_SORTIDA() { return getTokens(compiladorParser.TK_PC_ENTRADA_SORTIDA); }
		public TerminalNode TK_PC_ENTRADA_SORTIDA(int i) {
			return getToken(compiladorParser.TK_PC_ENTRADA_SORTIDA, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public FuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitFuncio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitFuncio(this);
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
			setState(180);
			match(TK_PC_FUNCIO);
			setState(181);
			((FuncioContext)_localctx).a1 = match(TK_IDENT);
			setState(182);
			match(TK_LPAREN);

			            ArrayList<Character> tipusPar = new ArrayList<>();
			            ArrayList<String> nomPar = new ArrayList<>();
			            ArrayList<Boolean> isEntSor = new ArrayList<>();
			            ArrayList<Long> poseES = new ArrayList<>();
			            Vector<Long> trad = new Vector<>();
			        
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 2051L) != 0)) {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ENTRADA:
					{
					setState(184);
					match(TK_PC_ENTRADA);
					isEntSor.add(false);
					}
					break;
				case TK_PC_ENTRADA_SORTIDA:
					{
					setState(186);
					match(TK_PC_ENTRADA_SORTIDA);
					isEntSor.add(true);
					}
					break;
				case TK_IDENT:
					break;
				default:
					break;
				}
				setState(190);
				((FuncioContext)_localctx).id1 = match(TK_IDENT);
				setState(191);
				match(TK_COLON);
				setState(192);
				((FuncioContext)_localctx).tip = match(TK_TIPUS_BASIC);

				            tipusPar.add(tipusAChar(((FuncioContext)_localctx).tip.getText()));
				            nomPar.add(((FuncioContext)_localctx).id1.getText());
				            if(tipusPar.size() > isEntSor.size()) {
				                isEntSor.add(false);
				            }
				        
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(194);
					match(TK_COMMA);
					setState(199);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TK_PC_ENTRADA:
						{
						setState(195);
						match(TK_PC_ENTRADA);
						isEntSor.add(false);
						}
						break;
					case TK_PC_ENTRADA_SORTIDA:
						{
						setState(197);
						match(TK_PC_ENTRADA_SORTIDA);
						isEntSor.add(true);
						}
						break;
					case TK_IDENT:
						break;
					default:
						break;
					}
					setState(201);
					((FuncioContext)_localctx).id2 = match(TK_IDENT);
					setState(202);
					match(TK_COLON);
					setState(203);
					((FuncioContext)_localctx).tip2 = match(TK_TIPUS_BASIC);

					            tipusPar.add(tipusAChar(((FuncioContext)_localctx).tip2.getText()));
					            nomPar.add(((FuncioContext)_localctx).id2.getText());
					            if(tipusPar.size() > isEntSor.size()) {
					                isEntSor.add(false);
					            }
					        
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(212);
			match(TK_RPAREN);
			setState(213);
			match(TK_PC_RETORNA);
			setState(214);
			((FuncioContext)_localctx).a2 = match(TK_TIPUS_BASIC);

			                char tipusRetorn = tipusAChar(((FuncioContext)_localctx).a2.getText());
			                String s = "(";
			                varCount = Long.valueOf(tipusPar.size());

			                for (int count = 0; count < tipusPar.size(); count++) {
			                    if(isEntSor.get(count)) s = s + '[';
			                    s = s + tipusACharBytecode(tipusPar.get(count)); // TODO: FUNCIO enter a i

			                    if(TS.existeix(nomPar.get(count))){
			                        errorParametreDuplicat(nomPar.get(count));
			                    }
			                    else {
			                        ArrayList<Character> t = new ArrayList<>();
			                        t.add(tipusPar.get(count));

			                        // Carreguem els paràmetres, que ocuparan les primeres posicions de la zona de variables
			                        if(isEntSor.get(count)) {
			                            trad.add(x.ALOAD);
			                            trad.add(Long.valueOf(count));
			                            trad.add(x.BIPUSH);
			                            trad.add(0L);
			                            trad.add(x.IALOAD);
			                            trad.add(x.ISTORE);
			                            trad.add(Long.valueOf(varCount));
			                            poseES.add(varCount);
			                            TS.inserir(nomPar.get(count), new Registre(nomPar.get(count),t,Long.valueOf(varCount++)));
			                        }
			                        else {
			                            TS.inserir(nomPar.get(count), new Registre(nomPar.get(count),t,Long.valueOf(count)));
			                        }
			                    }
			                }

			                // Afegim al principi per marcar que és una funció. També afegim el tipus de retorn al final
			                tipusPar.add(0,'F');
			                tipusPar.add(tipusRetorn);

			                //TODO: TRACTAMENT NO INT
			                Long addrFunc = x.addFunctionDef(((FuncioContext)_localctx).a1.getText(),s+')'+tipusACharBytecode(tipusRetorn));
			                TSDef.inserir(((FuncioContext)_localctx).a1.getText(), new Registre(((FuncioContext)_localctx).a1.getText(), tipusPar, addrFunc, isEntSor));
			        
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(216);
				bloc_declaracio_var_def();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0)) {
				{
				{
				setState(219);
				((FuncioContext)_localctx).t2 = sentencia();

				            trad.addAll(((FuncioContext)_localctx).t2.trad);
				        
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(TK_PC_RETORNA);
			setState(228);
			((FuncioContext)_localctx).a3 = e(0);
			setState(229);
			match(TK_SEMI);
			setState(230);
			match(TK_PC_FFUNCIO);

			            char expected = tipusAChar(((FuncioContext)_localctx).a2.getText());
			            if(expected != ((FuncioContext)_localctx).a3.tipus.get(((FuncioContext)_localctx).a3.tipus.size()-1)){
			                errorTipus(((FuncioContext)_localctx).a3.line, expected, ((FuncioContext)_localctx).a3.tipus.get(0));
			            }

			            int i = 0;
			            for (int count = 0; count < isEntSor.size(); count++) {
			                if(isEntSor.get(count)) { //U
			                    trad.add(x.ALOAD);
			                    trad.add(Long.valueOf(count));
			                    trad.add(x.BIPUSH);
			                    trad.add(0L);
			                    trad.add(x.ILOAD);
			                    trad.add(Long.valueOf(poseES.get(i)));
			                    trad.add(x.IASTORE);
			                    i++;
			                }
			            }

			            //TODO: Tractament no int
			            trad.addAll(((FuncioContext)_localctx).a3.trad);
			            if(expected == 'R') trad.add(x.FRETURN);
			            else trad.add(x.IRETURN);
			            x.addFunctionCode(addrFunc,10L,10L,trad); // Aqui
			            TS = new SymTable<Registre>(1000);
			            varCount = 0L;
			        
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
		public ArrayList<Character> tipus;
		public Token tip;
		public Token tip2;
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public List<TerminalNode> TK_COLON() { return getTokens(compiladorParser.TK_COLON); }
		public TerminalNode TK_COLON(int i) {
			return getToken(compiladorParser.TK_COLON, i);
		}
		public List<TerminalNode> TK_TIPUS_BASIC() { return getTokens(compiladorParser.TK_TIPUS_BASIC); }
		public TerminalNode TK_TIPUS_BASIC(int i) {
			return getToken(compiladorParser.TK_TIPUS_BASIC, i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public List<TerminalNode> TK_PC_ENTRADA() { return getTokens(compiladorParser.TK_PC_ENTRADA); }
		public TerminalNode TK_PC_ENTRADA(int i) {
			return getToken(compiladorParser.TK_PC_ENTRADA, i);
		}
		public List<TerminalNode> TK_PC_ENTRADA_SORTIDA() { return getTokens(compiladorParser.TK_PC_ENTRADA_SORTIDA); }
		public TerminalNode TK_PC_ENTRADA_SORTIDA(int i) {
			return getToken(compiladorParser.TK_PC_ENTRADA_SORTIDA, i);
		}
		public Parametres_formalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterParametres_formals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitParametres_formals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitParametres_formals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametres_formalsContext parametres_formals() throws RecognitionException {
		Parametres_formalsContext _localctx = new Parametres_formalsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametres_formals);

		    ((Parametres_formalsContext)_localctx).tipus =  new ArrayList<Character>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ENTRADA || _la==TK_PC_ENTRADA_SORTIDA) {
				{
				setState(233);
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

			setState(236);
			match(TK_IDENT);
			setState(237);
			match(TK_COLON);
			setState(238);
			((Parametres_formalsContext)_localctx).tip = match(TK_TIPUS_BASIC);

			                     _localctx.tipus.add(tipusAChar(((Parametres_formalsContext)_localctx).tip.getText()));
			                    
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(240);
				match(TK_COMMA);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_ENTRADA || _la==TK_PC_ENTRADA_SORTIDA) {
					{
					setState(241);
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

				setState(244);
				match(TK_IDENT);
				setState(245);
				match(TK_COLON);
				setState(246);
				((Parametres_formalsContext)_localctx).tip2 = match(TK_TIPUS_BASIC);
				_localctx.tipus.add(tipusAChar(((Parametres_formalsContext)_localctx).tip2.getText()));
				                    
				}
				}
				setState(252);
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
		public TerminalNode TK_PC_VARIABLES() { return getToken(compiladorParser.TK_PC_VARIABLES, 0); }
		public TerminalNode TK_PC_FVARIABLES() { return getToken(compiladorParser.TK_PC_FVARIABLES, 0); }
		public List<Declaracio_varContext> declaracio_var() {
			return getRuleContexts(Declaracio_varContext.class);
		}
		public Declaracio_varContext declaracio_var(int i) {
			return getRuleContext(Declaracio_varContext.class,i);
		}
		public Bloc_declaracio_var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc_declaracio_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterBloc_declaracio_var_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitBloc_declaracio_var_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitBloc_declaracio_var_def(this);
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
			setState(253);
			match(TK_PC_VARIABLES);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(254);
				declaracio_var();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
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
	public static class Declaracio_varContext extends ParserRuleContext {
		public Token nom;
		public Token nom2;
		public Token tipus;
		public TerminalNode TK_COLON() { return getToken(compiladorParser.TK_COLON, 0); }
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public TerminalNode TK_TIPUS_BASIC() { return getToken(compiladorParser.TK_TIPUS_BASIC, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public Declaracio_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracio_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracio_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracio_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracio_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracio_varContext declaracio_var() throws RecognitionException {
		Declaracio_varContext _localctx = new Declaracio_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracio_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<String> vars = new ArrayList<>();
			{
			setState(263);
			((Declaracio_varContext)_localctx).nom = match(TK_IDENT);

			                    if(TS.existeix(((Declaracio_varContext)_localctx).nom.getText())){
			                        errorVariableJaDefinida(((Declaracio_varContext)_localctx).nom);
			                    }
			                    else {
			                        vars.add(((Declaracio_varContext)_localctx).nom.getText());
			                    }
			                
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(265);
				match(TK_COMMA);
				setState(266);
				((Declaracio_varContext)_localctx).nom2 = match(TK_IDENT);

				                        if(TS.existeix(((Declaracio_varContext)_localctx).nom2.getText()) || vars.contains(((Declaracio_varContext)_localctx).nom2.getText())){
				                            errorVariableJaDefinida(((Declaracio_varContext)_localctx).nom2);
				                        }
				                        else {
				                            vars.add(((Declaracio_varContext)_localctx).nom2.getText());
				                        }
				                    
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(TK_COLON);
			setState(274);
			((Declaracio_varContext)_localctx).tipus = match(TK_TIPUS_BASIC);

			                    for(int i = 0; i < vars.size(); i++) {
			                        ArrayList<Character> t = new ArrayList<>();
			                        t.add(tipusAChar(((Declaracio_varContext)_localctx).tipus.getText()));
			                        TS.inserir(vars.get(i), new Registre(vars.get(i),t,varCount++));
			                    }
			                    vars.clear();
			                
			setState(276);
			match(TK_SEMI);
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
	public static class SentenciaContext extends ParserRuleContext {
		public Vector<Long> trad;
		public EContext a;
		public SentenciaContext s1;
		public SentenciaContext s2;
		public Token b1;
		public EContext b2;
		public EContext b3;
		public SentenciaContext s;
		public EContext c;
		public Token d1;
		public EContext d2;
		public Token e1;
		public EContext e2;
		public EContext e3;
		public Token f1;
		public Token f2;
		public EContext f3;
		public Token g1;
		public EContext g2;
		public EContext g3;
		public Inst_lecturaContext h;
		public Inst_escripturaContext i;
		public List<Declaracio_varContext> declaracio_var() {
			return getRuleContexts(Declaracio_varContext.class);
		}
		public Declaracio_varContext declaracio_var(int i) {
			return getRuleContext(Declaracio_varContext.class,i);
		}
		public TerminalNode TK_PC_SI() { return getToken(compiladorParser.TK_PC_SI, 0); }
		public TerminalNode TK_PC_LLAVORS() { return getToken(compiladorParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(compiladorParser.TK_PC_FSI, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode TK_PC_ALTRAMENT() { return getToken(compiladorParser.TK_PC_ALTRAMENT, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode TK_PC_PER() { return getToken(compiladorParser.TK_PC_PER, 0); }
		public TerminalNode TK_PC_DE() { return getToken(compiladorParser.TK_PC_DE, 0); }
		public TerminalNode TK_PC_FINS() { return getToken(compiladorParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(compiladorParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(compiladorParser.TK_PC_FPER, 0); }
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public TerminalNode TK_PC_MENTRE() { return getToken(compiladorParser.TK_PC_MENTRE, 0); }
		public TerminalNode TK_PC_FMENTRE() { return getToken(compiladorParser.TK_PC_FMENTRE, 0); }
		public TerminalNode TK_OP_ASSIG() { return getToken(compiladorParser.TK_OP_ASSIG, 0); }
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_OP_OVEC() { return getTokens(compiladorParser.TK_OP_OVEC); }
		public TerminalNode TK_OP_OVEC(int i) {
			return getToken(compiladorParser.TK_OP_OVEC, i);
		}
		public List<TerminalNode> TK_OP_CVEC() { return getTokens(compiladorParser.TK_OP_CVEC); }
		public TerminalNode TK_OP_CVEC(int i) {
			return getToken(compiladorParser.TK_OP_CVEC, i);
		}
		public TerminalNode TK_OP_GET() { return getToken(compiladorParser.TK_OP_GET, 0); }
		public TerminalNode TK_LPAREN() { return getToken(compiladorParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(compiladorParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
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
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentencia);

		    ((SentenciaContext)_localctx).trad = new Vector<Long>(10);
		    
		int _la;
		try {
			int _alt;
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(278);
						declaracio_var();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(TK_PC_SI);
				setState(284);
				((SentenciaContext)_localctx).a = e(0);
				Vector<Long> trad2 = new Vector<Long>(10);Vector<Long> trad3 = new Vector<Long>(10);
				setState(286);
				match(TK_PC_LLAVORS);
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					((SentenciaContext)_localctx).s1 = sentencia();
					trad2.addAll(((SentenciaContext)_localctx).s1.trad);
					}
					}
					setState(292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0) );
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_ALTRAMENT) {
					{
					setState(294);
					match(TK_PC_ALTRAMENT);
					setState(298); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(295);
						((SentenciaContext)_localctx).s2 = sentencia();
						trad3.addAll(((SentenciaContext)_localctx).s2.trad);
						}
						}
						setState(300); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0) );
					}
				}

				setState(304);
				match(TK_PC_FSI);

				        if(((SentenciaContext)_localctx).a.tipus.get(0) == 'B'){
				            ((SentenciaContext)_localctx).trad = ((SentenciaContext)_localctx).a.trad;
				            _localctx.trad.add(x.IFEQ);
				            Long salt=trad2.size()+6L;
				            _localctx.trad.add(x.nByte(salt,2));
				            _localctx.trad.add(x.nByte(salt,1));
				            _localctx.trad.addAll(trad2);
				            _localctx.trad.add(x.GOTO);
				            salt=trad3.size()+3L;
				            _localctx.trad.add(x.nByte(salt,2));
				            _localctx.trad.add(x.nByte(salt,1));
				            _localctx.trad.addAll(trad3);
				        }
				        else{
				            errorTipus(((SentenciaContext)_localctx).a.line, 'B', ((SentenciaContext)_localctx).a.tipus.get(0));
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(TK_PC_PER);
				setState(308);
				((SentenciaContext)_localctx).b1 = match(TK_IDENT);
				Vector<Long> trad2 = new Vector<Long>(10);
				setState(310);
				match(TK_PC_DE);
				setState(311);
				((SentenciaContext)_localctx).b2 = e(0);
				setState(312);
				match(TK_PC_FINS);
				setState(313);
				((SentenciaContext)_localctx).b3 = e(0);

				            if(!TS.existeix(((SentenciaContext)_localctx).b1.getText())){
				                ArrayList<Character> al = new ArrayList<>();
				                al.add('E');
				                Registre reg = new Registre(((SentenciaContext)_localctx).b1.getText(),al,varCount++);
				                TS.inserir(((SentenciaContext)_localctx).b1.getText(), reg);
				            }
				        
				setState(315);
				match(TK_PC_FER);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0)) {
					{
					{
					setState(316);
					((SentenciaContext)_localctx).s = sentencia();

					            trad2.addAll(((SentenciaContext)_localctx).s.trad);
					        
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(TK_PC_FPER);

				            Registre reg = TS.obtenir(((SentenciaContext)_localctx).b1.getText());
				            if(reg.tipus.get(0) == 'E'){
				                if(((SentenciaContext)_localctx).b2.tipus.get(0) == 'E'){
				                    if(((SentenciaContext)_localctx).b3.tipus.get(0) == 'E'){
				                        ((SentenciaContext)_localctx).trad = ((SentenciaContext)_localctx).b2.trad; // Posem el valor inicial a la pila
				                        _localctx.trad.add(x.ISTORE);
				                        _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				                        // Adreça de l'iterador conté inici
				                        _localctx.trad.add(x.ILOAD);
				                        _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				                        // Carreguem la traducció de b3 i comparem
				                        _localctx.trad.addAll(((SentenciaContext)_localctx).b3.trad);
				                        _localctx.trad.add(x.IF_ICMPGT);
				                        Long salt = 6L + trad2.size() + 6L;
				                        _localctx.trad.add(x.nByte(salt,2));
				                        _localctx.trad.add(x.nByte(salt,1));
				                        // Executem sentencia
				                        _localctx.trad.addAll(trad2);
				                        // Incrementem it
				                        _localctx.trad.add(x.ILOAD);
				                        _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				                        _localctx.trad.add(x.ICONST_1);
				                        _localctx.trad.add(x.IADD);
				                        // Save the iterator value
				                        _localctx.trad.add(x.ISTORE);
				                        _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				                        _localctx.trad.add(x.GOTO);
				                        salt = 0L - trad2.size() - ((SentenciaContext)_localctx).b3.trad.size() - 11L;
				                        _localctx.trad.add(x.nByte(salt,2));
				                        _localctx.trad.add(x.nByte(salt,1));
				                    }
				                    else{
				                        errorTipus(((SentenciaContext)_localctx).b3.line, 'E', ((SentenciaContext)_localctx).b3.tipus.get(0));
				                    }
				                }
				                else{
				                    errorTipus(((SentenciaContext)_localctx).b2.line, 'E', ((SentenciaContext)_localctx).b2.tipus.get(0));
				                }
				            }
				            else{
				                errorTipus(((SentenciaContext)_localctx).b1, 'E', reg.tipus.get(0));
				            }
				           
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(TK_PC_MENTRE);
				setState(328);
				((SentenciaContext)_localctx).c = e(0);
				Vector<Long> trad2 = new Vector<Long>(10);
				setState(330);
				match(TK_PC_FER);
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(331);
					((SentenciaContext)_localctx).s1 = sentencia();
					trad2.addAll(((SentenciaContext)_localctx).s1.trad);
					}
					}
					setState(336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70598525065L) != 0) );
				setState(338);
				match(TK_PC_FMENTRE);

				         if(((SentenciaContext)_localctx).c.tipus.get(0) == 'B'){
				            //TODO: Avaluar cert o fals
				            _localctx.trad.addAll(((SentenciaContext)_localctx).c.trad);
				            _localctx.trad.add(x.IFEQ);
				            Long salt = 6L + trad2.size();
				            _localctx.trad.add(x.nByte(salt,2));
				            _localctx.trad.add(x.nByte(salt,1));
				            _localctx.trad.addAll(trad2);
				            salt = 0L - _localctx.trad.size();
				            _localctx.trad.add(x.GOTO);
				            _localctx.trad.add(x.nByte(salt,2));
				            _localctx.trad.add(x.nByte(salt,1));
				         }
				         else{
				             errorTipus(((SentenciaContext)_localctx).c.line, 'B', ((SentenciaContext)_localctx).c.tipus.get(0));
				         }
				     
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				((SentenciaContext)_localctx).d1 = match(TK_IDENT);
				setState(342);
				match(TK_OP_ASSIG);
				setState(343);
				((SentenciaContext)_localctx).d2 = e(0);
				setState(344);
				match(TK_SEMI);

				        if(TS.existeix((((SentenciaContext)_localctx).d1!=null?((SentenciaContext)_localctx).d1.getText():null))){
				            Registre reg = TS.obtenir((((SentenciaContext)_localctx).d1!=null?((SentenciaContext)_localctx).d1.getText():null));
				            char tReg = reg.tipus.get(0);
				            if(tReg == 'V' || tReg == 'T'){
				                errorAssignacio(((SentenciaContext)_localctx).d1);
				            }
				            else if(esSuperTipus(tReg, ((SentenciaContext)_localctx).d2.tipus.get(((SentenciaContext)_localctx).d2.tipus.size()-1))){
				                _localctx.trad.addAll(((SentenciaContext)_localctx).d2.trad);
				                if(tReg == 'R') {
				                    //if(((SentenciaContext)_localctx).d2.tipus.get(0) != 'R') _localctx.trad.add(x.I2F);
				                    _localctx.trad.add(x.FSTORE);
				                }
				                else _localctx.trad.add(x.ISTORE);
				                _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				            }
				            else{
				                errorTipus(((SentenciaContext)_localctx).d1, tReg, ((SentenciaContext)_localctx).d2.tipus.get(0));
				            }
				        }
				        else {
				            //errorVariableInexistent(((SentenciaContext)_localctx).d1);
				            //Això ara permet assignar variables sense declarar
				            ArrayList<Character> tipus = new ArrayList<>();
				            tipus.add(((SentenciaContext)_localctx).d2.tipus.get(((SentenciaContext)_localctx).d2.tipus.size()-1));
				            if(tipus.get(0) == 'V' || tipus.get(0) == 'T'){
				                errorAssignacio(((SentenciaContext)_localctx).d1);
				            }
				            else{
				                Registre reg = new Registre(((SentenciaContext)_localctx).d1.getText(),tipus,varCount++);
				                TS.inserir(((SentenciaContext)_localctx).d1.getText(), reg);
				                _localctx.trad.addAll(((SentenciaContext)_localctx).d2.trad);
				                if(((SentenciaContext)_localctx).d2.tipus.get(0) == 'R') _localctx.trad.add(x.FSTORE);
				                else _localctx.trad.add(x.ISTORE);
				                _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				            }

				        }
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				((SentenciaContext)_localctx).e1 = match(TK_IDENT);

				        ((SentenciaContext)_localctx).trad =  new Vector<Long>();
				        Long adr = -1L;
				        Registre reg = null;
				        int i = 0;
				        if(TS.existeix(((SentenciaContext)_localctx).e1.getText())){
				            reg = TS.obtenir(((SentenciaContext)_localctx).e1.getText());
				            if(reg.tipus.get(0) != 'V') errorTipus(((SentenciaContext)_localctx).e1, 'V', reg.tipus.get(0));
				            char tipusVec = reg.tipus.get(reg.tipus.size()-1);
				            adr = reg.getAdreca();

				        }
				        else {
				            errorVariableInexistent(((SentenciaContext)_localctx).e1);
				        }
				        _localctx.trad.add(x.ALOAD);
				        _localctx.trad.add(adr);

				    
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(349);
					match(TK_OP_OVEC);
					setState(350);
					((SentenciaContext)_localctx).e2 = e(0);
					setState(351);
					match(TK_OP_CVEC);

					        _localctx.trad.addAll(((SentenciaContext)_localctx).e2.trad);
					        if(reg.inicis.size() > 0){
					            _localctx.trad.add(x.BIPUSH);
					            _localctx.trad.add(Long.valueOf(reg.inicis.get(i))); //Offset inicis
					            _localctx.trad.add(x.ISUB);
					        }
					        if(i >= reg.mides.size()){
					            errorAccesDimensionsIncorrectes(((SentenciaContext)_localctx).e1, reg.mides.size());
					        }
					        else if(i < reg.mides.size() - 1){
					            _localctx.trad.add(x.AALOAD);
					        }
					        //else -> No cal fer res, ja ve implicit quan fem ((SentenciaContext)_localctx).e3.trad
					        i++;
					    
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_OVEC );
				setState(358);
				match(TK_OP_ASSIG);
				setState(359);
				((SentenciaContext)_localctx).e3 = e(0);

				        if(i < reg.mides.size()){
				            errorAccesDimensionsIncorrectes(((SentenciaContext)_localctx).e1, reg.mides.size());
				        }
				        _localctx.trad.addAll(((SentenciaContext)_localctx).e3.trad);
				        _localctx.trad.add(x.IASTORE);
				    
				setState(361);
				match(TK_SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				((SentenciaContext)_localctx).f1 = match(TK_IDENT);
				setState(364);
				match(TK_OP_GET);
				setState(365);
				((SentenciaContext)_localctx).f2 = match(TK_IDENT);
				setState(366);
				match(TK_OP_ASSIG);
				setState(367);
				((SentenciaContext)_localctx).f3 = e(0);
				setState(368);
				match(TK_SEMI);

				        String c = ((SentenciaContext)_localctx).f1.getText() + "." + ((SentenciaContext)_localctx).f2.getText();

				        if(TS.existeix(((SentenciaContext)_localctx).f1.getText())){
				            if (TS.existeix(c)) {
				                Registre reg = TS.obtenir(c);
				                char tReg = reg.tipus.get(0);
				                if(tReg == 'V' || tReg == 'T'){
				                    errorAssignacio(((SentenciaContext)_localctx).f2);
				                }
				                else if(esSuperTipus(tReg, ((SentenciaContext)_localctx).f3.tipus.get(0))){
				                    _localctx.trad.addAll(((SentenciaContext)_localctx).f3.trad);
				                    if(tReg == 'R') {
				                        if(((SentenciaContext)_localctx).f3.tipus.get(0) != 'R') _localctx.trad.add(x.I2F);
				                        _localctx.trad.add(x.FSTORE);
				                    }
				                    else _localctx.trad.add(x.ISTORE);
				                    _localctx.trad.add(Long.valueOf(reg.getAdreca()));
				                }
				                else{
				                    errorTipus(((SentenciaContext)_localctx).f2, tReg, ((SentenciaContext)_localctx).f3.tipus.get(0));
				                }
				            }
				            else {
				                errorVariableInexistent(((SentenciaContext)_localctx).f2);
				            }
				        }
				        else {
				            errorVariableInexistent(((SentenciaContext)_localctx).f1);
				        }
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				((SentenciaContext)_localctx).g1 = match(TK_IDENT);

				        ArrayList<Character> paramsLlegits = new ArrayList<>();
				        ArrayList<Long> entsorVars = new ArrayList<>();
				        ArrayList<Long> originalAddr = new ArrayList<>();
				        int p = 0;
				        Registre reg = null;
				        if (TS.existeix((((SentenciaContext)_localctx).g1!=null?((SentenciaContext)_localctx).g1.getText():null))){
				            reg = TS.obtenir((((SentenciaContext)_localctx).g1!=null?((SentenciaContext)_localctx).g1.getText():null));
				            // TODO: Comprovar que sigui una acció / funció
				        }
				        else {
				            errorCridaInexistent(((SentenciaContext)_localctx).g1);
				            error = true;
				        }
				    
				setState(373);
				match(TK_LPAREN);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018426859516L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					setState(374);
					((SentenciaContext)_localctx).g2 = e(0);

					        paramsLlegits.add(((SentenciaContext)_localctx).g2.tipus.get(0));

					        if(reg.isEntSor.get(p)) { // Si la variable és E/S
					            Long l = varCount++;
					            entsorVars.add(l);

					            _localctx.trad.add(x.BIPUSH);
					            _localctx.trad.add(1L);
					            _localctx.trad.add(x.NEWARRAY);
					            _localctx.trad.add(getVectorType(reg.tipus.get(1))); //tipus del vector
					            _localctx.trad.add(x.ASTORE);
					            _localctx.trad.add(l);

					            _localctx.trad.add(x.ALOAD);
					            _localctx.trad.add(l);
					            _localctx.trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
					            _localctx.trad.add(0L);
					            _localctx.trad.addAll(((SentenciaContext)_localctx).g2.trad);
					            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') _localctx.trad.add(x.I2F);
					            _localctx.trad.add(x.IASTORE); // ArrayRef, Index, Val

					            // Carreguem array perque l'agafi per paràmetre
					            _localctx.trad.add(x.ALOAD);
					            _localctx.trad.add(l);
					            if(((SentenciaContext)_localctx).g2.addrVar != null) {
					                originalAddr.add(((SentenciaContext)_localctx).g2.addrVar);
					            }
					            else {
					                originalAddr.add(-1L);
					            }
					        }
					        else {
					            originalAddr.add(-1L);
					            _localctx.trad.addAll(((SentenciaContext)_localctx).g2.trad);
					            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') _localctx.trad.add(x.I2F);
					        }
					        p++;
					    
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(376);
						match(TK_COMMA);
						setState(377);
						((SentenciaContext)_localctx).g3 = e(0);

						        paramsLlegits.add(((SentenciaContext)_localctx).g3.tipus.get(0));

						        if(reg.isEntSor.get(p)) { // Si la variable és E/S
						            Long l = varCount++;
						            entsorVars.add(l);

						            _localctx.trad.add(x.BIPUSH);
						            _localctx.trad.add(1L);
						            _localctx.trad.add(x.NEWARRAY);
						            _localctx.trad.add(getVectorType(reg.tipus.get(1))); //tipus del vector
						            _localctx.trad.add(x.ASTORE);
						            _localctx.trad.add(l);

						            _localctx.trad.add(x.ALOAD);
						            _localctx.trad.add(l);
						            _localctx.trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
						            _localctx.trad.add(0l);
						            _localctx.trad.addAll(((SentenciaContext)_localctx).g3.trad);
						            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') _localctx.trad.add(x.I2F);
						            _localctx.trad.add(x.IASTORE);
						            _localctx.trad.add(x.ALOAD);
						            _localctx.trad.add(l);

						            if(((SentenciaContext)_localctx).g3.addrVar != null) {
						                originalAddr.add(((SentenciaContext)_localctx).g3.addrVar);
						            }
						            else {
						                originalAddr.add(-1L);
						            }
						        }
						        else {
						            originalAddr.add(-1L);
						            _localctx.trad.addAll(((SentenciaContext)_localctx).g3.trad);
						            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') _localctx.trad.add(x.I2F);
						        }
						        p++;
						    
						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(387);
				match(TK_RPAREN);
				setState(388);
				match(TK_SEMI);

				        int i = 0;
				        if (reg.tipus.get(0) == 'A') {
				            if (paramsLlegits.size()+1 != reg.tipus.size()) {
				                System.out.println("Error, la acció \"" + ((SentenciaContext)_localctx).g1.getText() + "\" esperava un nombre diferent de parametres.");
				                error = true;
				            }
				            while(i < paramsLlegits.size()) {
				                if (!esSuperTipus(reg.tipus.get(i+1), paramsLlegits.get(i))) {
				                    errorTipusParametreIncorrecte(((SentenciaContext)_localctx).g1, i+1, reg.tipus.get(i+1), paramsLlegits.get(i));
				                }
				                i++;
				            }
				        }
				        else if (reg.tipus.get(0) == 'F') {
				            if (paramsLlegits.size()+2 != reg.tipus.size()) {
				                System.out.println("Error, la funció " + ((SentenciaContext)_localctx).g1.getText() + " esperava un nombre diferent de parametres.");
				                error = true;
				            } //Ara aquí
				            while(i < paramsLlegits.size()) {
				                if (!esSuperTipus(reg.tipus.get(i+1), paramsLlegits.get(i))) {
				                    errorTipusParametreIncorrecte(((SentenciaContext)_localctx).g1, i+1, reg.tipus.get(i+1), paramsLlegits.get(i));
				                }
				                i++;
				            }
				        }

				        if (error == false) {
				            _localctx.trad.add(x.INVOKESTATIC);
				            _localctx.trad.add(x.nByte(Long.valueOf(reg.getAdreca()),2));
				            _localctx.trad.add(x.nByte(Long.valueOf(reg.getAdreca()),1));

				            int es = 0;
				            // Hem de posar als vectors les variables d'entrada-sortida que es troben als paràmetres.
				            for(int j = 0; j< paramsLlegits.size(); j++){
				                if(reg.isEntSor.get(j) && originalAddr.get(j) != -1L) {
				                    _localctx.trad.add(x.ALOAD);
				                    _localctx.trad.add(entsorVars.get(es)); // Variable que conté l'array
				                    _localctx.trad.add(x.BIPUSH); // Pos 0 de l'array
				                    _localctx.trad.add(0L);
				                    _localctx.trad.add(x.IALOAD);
				                    _localctx.trad.add(x.ISTORE);
				                    _localctx.trad.add(originalAddr.get(j)); // Num de paràmetre actual
				                    es++;
				                }
				                _localctx.trad.add(x.NOP);
				            }
				                _localctx.trad.add(x.NOP);
				                _localctx.trad.add(x.NOP);
				        }
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(390);
				((SentenciaContext)_localctx).h = inst_lectura();
				((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).h.trad;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(393);
				((SentenciaContext)_localctx).i = inst_escriptura();
				((SentenciaContext)_localctx).trad =  ((SentenciaContext)_localctx).i.trad;
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
		public ArrayList<Character> tipus;
		public Vector<Long> trad;
		public Token a1;
		public Token a2;
		public TerminalNode TK_FUNC_LLEGIR() { return getToken(compiladorParser.TK_FUNC_LLEGIR, 0); }
		public TerminalNode TK_LPAREN() { return getToken(compiladorParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(compiladorParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public TerminalNode TK_IDENT() { return getToken(compiladorParser.TK_IDENT, 0); }
		public TerminalNode TK_COLON() { return getToken(compiladorParser.TK_COLON, 0); }
		public TerminalNode TK_TIPUS_BASIC() { return getToken(compiladorParser.TK_TIPUS_BASIC, 0); }
		public Inst_lecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInst_lectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInst_lectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInst_lectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_lecturaContext inst_lectura() throws RecognitionException {
		Inst_lecturaContext _localctx = new Inst_lecturaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inst_lectura);

		    ((Inst_lecturaContext)_localctx).tipus =  new ArrayList<Character>();
		    ((Inst_lecturaContext)_localctx).trad = new Vector<Long>(10);
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(TK_FUNC_LLEGIR);
			setState(399);
			match(TK_LPAREN);
			setState(400);
			((Inst_lecturaContext)_localctx).a1 = match(TK_IDENT);

			        Vector<String> v = new Vector<>();
			    
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_COLON) {
				{
				setState(402);
				match(TK_COLON);
				setState(403);
				((Inst_lecturaContext)_localctx).a2 = match(TK_TIPUS_BASIC);

				        v.add(((Inst_lecturaContext)_localctx).a2.getText());
				    
				}
			}

			setState(407);
			match(TK_RPAREN);
			setState(408);
			match(TK_SEMI);

			        //TODO: QUE PASSA SI a1 JA EXISTEIX I LI DEFINIM EL TIPUS

			        Character tipusALlegir = null;
			        Registre reg = null;

			        if(TS.existeix(((Inst_lecturaContext)_localctx).a1.getText())){
			            reg = TS.obtenir(((Inst_lecturaContext)_localctx).a1.getText());
			            Character tip = reg.tipus.get(0);

			            if(v.size()>0 && tipusAChar(v.get(0)) != tip){
			                errorTipus(((Inst_lecturaContext)_localctx).a1, tip, tipusAChar(v.get(0)));
			                error = true;
			            }
			            else {
			                tipusALlegir = tip;
			            }
			        }
			        else{
			            ArrayList<Character> tipus2 = new ArrayList<>();
			            if(v.size()<=0){
			                System.out.println("S'esperava un tipus a la linia " + ((Inst_lecturaContext)_localctx).a1.getLine() + ", despres de " + ((Inst_lecturaContext)_localctx).a1.getText() + ".");
			                error = true;
			            }
			            else{
			                tipusALlegir = tipusAChar(v.get(0));
			                tipus2.add(tipusALlegir);

			                TS.inserir((((Inst_lecturaContext)_localctx).a1!=null?((Inst_lecturaContext)_localctx).a1.getText():null), new Registre(((Inst_lecturaContext)_localctx).a1.getText(), tipus2, varCount++));
			            }
			        }
			        _localctx.trad.add(x.INVOKESTATIC);

			        switch (tipusALlegir) {
			            case 'E':
			                _localctx.trad.add(x.nByte(x.mGetInt,2));
			                _localctx.trad.add(x.nByte(x.mGetInt,1));
			                _localctx.trad.add(x.ISTORE);
			                break;
			            case 'R':
			                _localctx.trad.add(x.nByte(x.mGetFloat,2));
			                _localctx.trad.add(x.nByte(x.mGetFloat,1));
			                _localctx.trad.add(x.FSTORE);
			                break;
			            case 'B':
			                _localctx.trad.add(x.nByte(x.mGetBoolean,2));
			                _localctx.trad.add(x.nByte(x.mGetBoolean,1));
			                _localctx.trad.add(x.ISTORE);
			                break;
			            default:
			                System.out.println("El tipus " + tipusAString(tipusALlegir) + " no està contemplat per la lectura.");
			                error = true;
			                break;
			        }
			        _localctx.trad.add(Long.valueOf(reg.getAdreca()));
			    
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
		public ArrayList<Character> tipus;
		public Vector<Long> trad;
		public Vector<Object> tradMix;
		public EContext s1;
		public EContext s2;
		public TerminalNode TK_LPAREN() { return getToken(compiladorParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(compiladorParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(compiladorParser.TK_SEMI, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode TK_FUNC_ESCRIURE() { return getToken(compiladorParser.TK_FUNC_ESCRIURE, 0); }
		public TerminalNode TK_FUNC_ESCRIURELN() { return getToken(compiladorParser.TK_FUNC_ESCRIURELN, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public Inst_escripturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_escriptura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInst_escriptura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInst_escriptura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInst_escriptura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_escripturaContext inst_escriptura() throws RecognitionException {
		Inst_escripturaContext _localctx = new Inst_escripturaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inst_escriptura);
		Boolean ln = false;
		      String str = "";
		      ((Inst_escripturaContext)_localctx).tipus =  new ArrayList<Character>();
		      ((Inst_escripturaContext)_localctx).trad = new Vector<Long>(10);
		      int nElements = 0;
		      
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_FUNC_ESCRIURE:
				{
				setState(411);
				match(TK_FUNC_ESCRIURE);
				ln = false;
				}
				break;
			case TK_FUNC_ESCRIURELN:
				{
				setState(413);
				match(TK_FUNC_ESCRIURELN);
				ln = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(417);
			match(TK_LPAREN);
			setState(418);
			((Inst_escripturaContext)_localctx).s1 = e(0);

			         _localctx.trad.addAll(((Inst_escripturaContext)_localctx).s1.trad);
			         if(((Inst_escripturaContext)_localctx).s1.tipus.size()<=0) {
			            System.out.println("Tipus no definit a la linia " + ((Inst_escripturaContext)_localctx).s1.line + ".");
			            error = true;
			         }
			         else {
			            afegirInstruccionsEscriure(_localctx.trad, ((Inst_escripturaContext)_localctx).s1.tipus.get(((Inst_escripturaContext)_localctx).s1.tipus.size()-1));
			            nElements++;
			         }
			     
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(420);
				match(TK_COMMA);
				setState(421);
				((Inst_escripturaContext)_localctx).s2 = e(0);

				         _localctx.trad.addAll(((Inst_escripturaContext)_localctx).s2.trad);
				         afegirInstruccionsEscriure(_localctx.trad, ((Inst_escripturaContext)_localctx).s2.tipus.get(0));
				         nElements++;
				     
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(TK_RPAREN);
			setState(430);
			match(TK_SEMI);

			         _localctx.tipus.add('A');
			         //En cas que hi hagi d'haver un salt de linia
			         if(ln){
			            _localctx.trad.add(x.LDC_W);
			            _localctx.trad.add(x.nByte(saltLinia,2));
			            _localctx.trad.add(x.nByte(saltLinia,1));
			            _localctx.trad.add(x.INVOKESTATIC);
			            _localctx.trad.add(x.nByte(x.mPutString,2));
			            _localctx.trad.add(x.nByte(x.mPutString,1));
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
	public static class EContext extends ParserRuleContext {
		public ArrayList<Character> tipus;
		public Vector<Long> trad;
		public int line;
		public Long addrVar;
		public EContext g1;
		public EContext h1;
		public Token str;
		public EContext a;
		public E_numContext b;
		public E_boolContext c;
		public Token d;
		public Token f;
		public EContext f1;
		public Token op;
		public EContext op2;
		public Token i1;
		public EContext i2;
		public EContext i3;
		public Token j1;
		public EContext j2;
		public Token k1;
		public Token k2;
		public EContext g2;
		public EContext h2;
		public EContext h3;
		public TerminalNode TK_STRING() { return getToken(compiladorParser.TK_STRING, 0); }
		public TerminalNode TK_LPAREN() { return getToken(compiladorParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(compiladorParser.TK_RPAREN, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public E_numContext e_num() {
			return getRuleContext(E_numContext.class,0);
		}
		public E_boolContext e_bool() {
			return getRuleContext(E_boolContext.class,0);
		}
		public List<TerminalNode> TK_IDENT() { return getTokens(compiladorParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(compiladorParser.TK_IDENT, i);
		}
		public TerminalNode TK_OP_NO() { return getToken(compiladorParser.TK_OP_NO, 0); }
		public TerminalNode TK_OP_MINUS_UN() { return getToken(compiladorParser.TK_OP_MINUS_UN, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(compiladorParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(compiladorParser.TK_COMMA, i);
		}
		public List<TerminalNode> TK_OP_OVEC() { return getTokens(compiladorParser.TK_OP_OVEC); }
		public TerminalNode TK_OP_OVEC(int i) {
			return getToken(compiladorParser.TK_OP_OVEC, i);
		}
		public List<TerminalNode> TK_OP_CVEC() { return getTokens(compiladorParser.TK_OP_CVEC); }
		public TerminalNode TK_OP_CVEC(int i) {
			return getToken(compiladorParser.TK_OP_CVEC, i);
		}
		public TerminalNode TK_OP_GET() { return getToken(compiladorParser.TK_OP_GET, 0); }
		public TerminalNode TK_OP_MULT() { return getToken(compiladorParser.TK_OP_MULT, 0); }
		public TerminalNode TK_OP_DIV() { return getToken(compiladorParser.TK_OP_DIV, 0); }
		public TerminalNode TK_OP_DIV_INT() { return getToken(compiladorParser.TK_OP_DIV_INT, 0); }
		public TerminalNode TK_OP_MOD() { return getToken(compiladorParser.TK_OP_MOD, 0); }
		public TerminalNode TK_OP_PLUS() { return getToken(compiladorParser.TK_OP_PLUS, 0); }
		public TerminalNode TK_OP_MINUS() { return getToken(compiladorParser.TK_OP_MINUS, 0); }
		public TerminalNode TK_OP_NEQUAL() { return getToken(compiladorParser.TK_OP_NEQUAL, 0); }
		public TerminalNode TK_OP_SMALLER() { return getToken(compiladorParser.TK_OP_SMALLER, 0); }
		public TerminalNode TK_OP_SMALLEREQ() { return getToken(compiladorParser.TK_OP_SMALLEREQ, 0); }
		public TerminalNode TK_OP_GREATER() { return getToken(compiladorParser.TK_OP_GREATER, 0); }
		public TerminalNode TK_OP_GREATEREQ() { return getToken(compiladorParser.TK_OP_GREATEREQ, 0); }
		public TerminalNode TK_OP_AND() { return getToken(compiladorParser.TK_OP_AND, 0); }
		public TerminalNode TK_OP_OR() { return getToken(compiladorParser.TK_OP_OR, 0); }
		public TerminalNode TK_OP_EQUAL() { return getToken(compiladorParser.TK_OP_EQUAL, 0); }
		public TerminalNode TK_OP_QMARK() { return getToken(compiladorParser.TK_OP_QMARK, 0); }
		public TerminalNode TK_COLON() { return getToken(compiladorParser.TK_COLON, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_e, _p);

		    ((EContext)_localctx).tipus =  new ArrayList<Character>();
		    ((EContext)_localctx).trad =  new Vector<Long>(10);
		    ((EContext)_localctx).addrVar =  null;
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(434);
				((EContext)_localctx).str = match(TK_STRING);

				        _localctx.tipus.add('S');
				        String str = ((EContext)_localctx).str.getText().substring(1, ((EContext)_localctx).str.getText().length() - 1);
				        String[] arr = str.split(Pattern.quote("\\n"), -1);
				        List<String> list = new ArrayList<>();

				        for (String s : arr) {
				            if (!s.isEmpty()) {
				                list.add(s);
				            }
				            list.add("\\n");
				        }

				        // Eliminem l'últim "\n" afegit
				        if (!list.isEmpty()) {
				            list.remove(list.size() - 1);
				        }

				        for (String element : list) {
				            if(element.equals("\\n")){
				                _localctx.trad.add(x.LDC_W);
				                _localctx.trad.add(x.nByte(saltLinia,2));
				                _localctx.trad.add(x.nByte(saltLinia,1));
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mPutString,2));
				                _localctx.trad.add(x.nByte(x.mPutString,1));
				            }
				            else{
				                Long l = x.addConstant("S", element);
				                _localctx.trad.add(x.LDC_W);
				                _localctx.trad.add(x.nByte(l,2));
				                _localctx.trad.add(x.nByte(l,1));
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(x.mPutString,2));
				                _localctx.trad.add(x.nByte(x.mPutString,1));
				            }
				        }
				    
				}
				break;
			case 2:
				{
				setState(436);
				match(TK_LPAREN);
				setState(437);
				((EContext)_localctx).a = e(0);

				        ((EContext)_localctx).tipus =  ((EContext)_localctx).a.tipus;
				        ((EContext)_localctx).trad =  ((EContext)_localctx).a.trad;
				        ((EContext)_localctx).line =  ((EContext)_localctx).a.line;
				        ((EContext)_localctx).addrVar =  ((EContext)_localctx).a.addrVar;
				    
				setState(439);
				match(TK_RPAREN);
				}
				break;
			case 3:
				{
				setState(441);
				((EContext)_localctx).b = e_num();

				        ((EContext)_localctx).tipus =  ((EContext)_localctx).b.tipus;
				        ((EContext)_localctx).trad =  ((EContext)_localctx).b.trad;
				        ((EContext)_localctx).line =  ((EContext)_localctx).b.line;
				    
				}
				break;
			case 4:
				{
				setState(444);
				((EContext)_localctx).c = e_bool();

				        ((EContext)_localctx).tipus =  ((EContext)_localctx).c.tipus;
				        ((EContext)_localctx).trad =  ((EContext)_localctx).c.trad;
				        ((EContext)_localctx).line =  ((EContext)_localctx).c.line;
				    
				}
				break;
			case 5:
				{
				setState(447);
				((EContext)_localctx).d = match(TK_IDENT);

				        if(TS.existeix(((EContext)_localctx).d.getText())){
				            Registre reg = TS.obtenir((((EContext)_localctx).d!=null?((EContext)_localctx).d.getText():null));
				            ((EContext)_localctx).tipus =  reg.tipus;
				            Long adreca = Long.valueOf(reg.adreca);
				            if(_localctx.tipus.get(0) == 'R') _localctx.trad.add(x.FLOAD);
				            else _localctx.trad.add(x.ILOAD);
				            _localctx.trad.add(Long.valueOf(adreca));
				            ((EContext)_localctx).line =  (((EContext)_localctx).d!=null?((EContext)_localctx).d.getLine():0);
				            ((EContext)_localctx).addrVar =  adreca;
				        }
				        else{
				            errorVariableInexistent(((EContext)_localctx).d);
				        }
				    
				}
				break;
			case 6:
				{
				setState(449);
				((EContext)_localctx).f = match(TK_OP_NO);
				setState(450);
				((EContext)_localctx).f1 = e(20);

				        ((EContext)_localctx).line =  ((EContext)_localctx).f.getLine();
				        if(((EContext)_localctx).f1.tipus.get(((EContext)_localctx).f1.tipus.size()-1)=='B'){
				            _localctx.tipus.add('B');
				            _localctx.trad.addAll(((EContext)_localctx).f1.trad);
				            _localctx.trad.add(x.ICONST_1);
				            _localctx.trad.add(x.IADD);
				            _localctx.trad.add(x.ICONST_2);
				            _localctx.trad.add(x.IREM);
				        }
				        else {
				            errorTipus(((EContext)_localctx).f1.line, 'B', ((EContext)_localctx).f1.tipus.get(((EContext)_localctx).f1.tipus.size()-1));
				        }
				    
				}
				break;
			case 7:
				{
				setState(453);
				((EContext)_localctx).op = match(TK_OP_MINUS_UN);
				setState(454);
				((EContext)_localctx).op2 = e(19);

				            char t = ((EContext)_localctx).op2.tipus.get(((EContext)_localctx).op2.tipus.size()-1);
				            if(t == 'E'){
				                ((EContext)_localctx).line =  (((EContext)_localctx).f!=null?((EContext)_localctx).f.getLine():0);
				                _localctx.tipus.add('E');
				                _localctx.trad.addAll(((EContext)_localctx).op2.trad);
				                _localctx.trad.add(x.INEG);
				            }
				            else if (t == 'R'){
				                ((EContext)_localctx).line =  (((EContext)_localctx).f!=null?((EContext)_localctx).f.getLine():0);
				                _localctx.tipus.add('R');
				                _localctx.trad.addAll(((EContext)_localctx).op2.trad);
				                _localctx.trad.add(x.FNEG);
				            }
				            else {
				                errorTipus(((EContext)_localctx).f1.line, 'N', ((EContext)_localctx).op2.tipus.get(((EContext)_localctx).op2.tipus.size()-1));
				            }
				        
				}
				break;
			case 8:
				{
				setState(457);
				((EContext)_localctx).i1 = match(TK_IDENT);

				            ArrayList<Character> paramsLlegits = new ArrayList<>();
				            ArrayList<Long> entsorVars = new ArrayList<>();
				            ArrayList<Long> tradParams = new ArrayList<>();
				            ArrayList<Long> originalAddr = new ArrayList<>(); // Contains the original address of the variables passed by parameter if it exists.
				            int p = 0;
				            Registre reg = null;
				            if (TS.existeix((((EContext)_localctx).i1!=null?((EContext)_localctx).i1.getText():null))){
				                reg = TS.obtenir((((EContext)_localctx).i1!=null?((EContext)_localctx).i1.getText():null));
				                ((EContext)_localctx).tipus =  reg.tipus;
				                // TODO: Comprovar que sigui funcio
				            }
				            else {
				                errorCridaInexistent(((EContext)_localctx).i1);
				                error = true;
				            }
				        
				setState(459);
				match(TK_LPAREN);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018426859516L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
					{
					setState(460);
					((EContext)_localctx).i2 = e(0);

					            paramsLlegits.add(((EContext)_localctx).i2.tipus.get(0));

					            if(reg.isEntSor.get(p)) { // Si la variable és E/S
					                Long l = varCount++;
					                entsorVars.add(l);

					                _localctx.trad.add(x.BIPUSH);
					                _localctx.trad.add(1L);
					                _localctx.trad.add(x.NEWARRAY);
					                _localctx.trad.add(getVectorType(reg.tipus.get(1))); //tipus del vector
					                _localctx.trad.add(x.ASTORE);
					                _localctx.trad.add(l);

					                _localctx.trad.add(x.ALOAD);
					                _localctx.trad.add(l);
					                _localctx.trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
					                _localctx.trad.add(0l);
					                _localctx.trad.addAll(((EContext)_localctx).i2.trad);
					                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') _localctx.trad.add(x.I2F);
					                //_localctx.trad.add(Long.valueOf(p));
					                _localctx.trad.add(x.IASTORE);

					                _localctx.trad.add(x.ALOAD);
					                _localctx.trad.add(l);

					                if(((EContext)_localctx).i2.addrVar != null) {
					                    originalAddr.add(((EContext)_localctx).i2.addrVar);
					                }
					                else {
					                    originalAddr.add(-1L);
					                }
					            }
					            else {
					                originalAddr.add(-1L);
					                _localctx.trad.addAll(((EContext)_localctx).i2.trad);
					                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') tradParams.add(x.I2F);
					            }
					            p++;
					        
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(462);
						match(TK_COMMA);
						setState(463);
						((EContext)_localctx).i3 = e(0);

						            paramsLlegits.add(((EContext)_localctx).i3.tipus.get(0));

						            if(reg.isEntSor.get(p)) { // Si la variable és E/S
						                Long l = varCount++;
						                entsorVars.add(l);

						                _localctx.trad.add(x.BIPUSH);
						                _localctx.trad.add(1L);
						                _localctx.trad.add(x.NEWARRAY);
						                _localctx.trad.add(getVectorType(reg.tipus.get(1))); //tipus del vector
						                _localctx.trad.add(x.ASTORE);
						                _localctx.trad.add(l);

						                _localctx.trad.add(x.ALOAD);
						                _localctx.trad.add(l);
						                _localctx.trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
						                _localctx.trad.add(0l);
						                _localctx.trad.addAll(((EContext)_localctx).i3.trad);
						                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') _localctx.trad.add(x.I2F);
						                //_localctx.trad.add(Long.valueOf(p));
						                _localctx.trad.add(x.IASTORE);

						                _localctx.trad.add(x.ALOAD);
						                _localctx.trad.add(l);

						                if(((EContext)_localctx).i2.addrVar != null) {
						                    originalAddr.add(((EContext)_localctx).i2.addrVar);
						                }
						                else {
						                    originalAddr.add(-1L);
						                }
						            }
						            else {
						                originalAddr.add(-1L);
						                _localctx.trad.addAll(((EContext)_localctx).i3.trad);
						                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') tradParams.add(x.I2F);
						            }
						            p++;
						        
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(473);
				match(TK_RPAREN);

				            //TODO: Com que és una expressió només hauria de poder ser 'F'
				            int i = 0;
				            if (reg.tipus.get(0) == 'F') {
				                if (paramsLlegits.size()+2 != reg.tipus.size()) {
				                    System.out.println("Error, la funció " + ((EContext)_localctx).i1.getText() + " esperava un nombre diferent de parametres.");
				                    error = true;
				                }
				                while(/*error == false && */ i < paramsLlegits.size()) {
				                    if (!esSuperTipus(reg.tipus.get(i+1), paramsLlegits.get(i))) {
				                        errorTipusParametreIncorrecte(((EContext)_localctx).i1, i+1, reg.tipus.get(i+1), paramsLlegits.get(i));
				                    }
				                    i++;
				                }
				            }

				            if (error == false) {
				                //_localctx.trad.addAll(tradParams);
				                _localctx.trad.add(x.INVOKESTATIC);
				                _localctx.trad.add(x.nByte(Long.valueOf(reg.getAdreca()),2));
				                _localctx.trad.add(x.nByte(Long.valueOf(reg.getAdreca()),1));

				                int es = 0;
				                // Hem de posar als vectors les variables d'entrada-sortida que es troben als paràmetres.
				                for(int j = 0; j< paramsLlegits.size(); j++){
				                    if(reg.isEntSor.get(j) && originalAddr.get(j) != -1L) {
				                        _localctx.trad.add(x.ALOAD);
				                        _localctx.trad.add(entsorVars.get(es)); // Variable que conté l'array
				                        _localctx.trad.add(x.BIPUSH); // Pos 0 de l'array
				                        _localctx.trad.add(0L);
				                        _localctx.trad.add(x.IALOAD);
				                        _localctx.trad.add(x.ISTORE);
				                        _localctx.trad.add(originalAddr.get(j)); // Num de paràmetre actual
				                        es++;
				                    }
				                }
				            }
				        
				}
				break;
			case 9:
				{
				setState(475);
				((EContext)_localctx).j1 = match(TK_IDENT);

				        ((EContext)_localctx).line =  ((EContext)_localctx).j1.getLine();
				        Long adr = -1L;
				        int parametresLlegits = 0;
				        ArrayList<Character> t;
				        Registre reg = null;
				        if(TS.existeix(((EContext)_localctx).j1.getText())){
				            reg = TS.obtenir(((EContext)_localctx).j1.getText());
				            t = reg.tipus;
				            if(t.get(0) != 'V') {
				                errorTipus(((EContext)_localctx).j1,'V',t.get(0));
				            }
				            ArrayList<Character> tip = new ArrayList<>();
				            tip.add(t.get(t.size() - 1));
				            ((EContext)_localctx).tipus =  tip;
				            adr = reg.getAdreca();
				        }
				        else{
				            errorVariableInexistent(((EContext)_localctx).j1);
				        }
				        _localctx.trad.add(x.ALOAD);
				        _localctx.trad.add(adr);
				        int i = 0;
				    
				setState(482); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(477);
						match(TK_OP_OVEC);
						setState(478);
						((EContext)_localctx).j2 = e(0);

						        if(((EContext)_localctx).j2.tipus.get(((EContext)_localctx).j2.tipus.size() - 1) != 'E'){
						            errorTipus(((EContext)_localctx).j2.line,'E', ((EContext)_localctx).j2.tipus.get(0));
						        }
						        _localctx.trad.addAll(((EContext)_localctx).j2.trad);
						        _localctx.trad.add(x.BIPUSH);
						        _localctx.trad.add(Long.valueOf(reg.inicis.get(i)));
						        _localctx.trad.add(x.ISUB);
						        if(i < reg.mides.size() - 1){
						            _localctx.trad.add(x.AALOAD);
						        }
						        else{
						            _localctx.trad.add(x.IALOAD);
						        }
						        i++;
						    
						setState(480);
						match(TK_OP_CVEC);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(484); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				{
				setState(486);
				((EContext)_localctx).k1 = match(TK_IDENT);
				setState(487);
				match(TK_OP_GET);
				setState(488);
				((EContext)_localctx).k2 = match(TK_IDENT);

				        String c = ((EContext)_localctx).k1.getText() + "." + ((EContext)_localctx).k2.getText();
				        ((EContext)_localctx).line =  ((EContext)_localctx).k1.getLine();
				        if(TS.existeix(((EContext)_localctx).k1.getText())){
				            if(TS.existeix(c)){
				                Registre reg = TS.obtenir(c);
				                ((EContext)_localctx).tipus =  reg.tipus;
				                Long adreca = Long.valueOf(reg.adreca);
				                if(_localctx.tipus.get(0) == 'R') _localctx.trad.add(x.FLOAD);
				                else _localctx.trad.add(x.ILOAD);
				                _localctx.trad.add(Long.valueOf(adreca));
				                ((EContext)_localctx).line =  (((EContext)_localctx).d!=null?((EContext)_localctx).d.getLine():0);
				            } else{
				                errorVariableInexistent(((EContext)_localctx).k2);
				            }
				        }
				        else{
				            errorVariableInexistent(((EContext)_localctx).k1);
				        }
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(569);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(492);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(493);
						((EContext)_localctx).op = match(TK_OP_MULT);
						setState(494);
						((EContext)_localctx).g2 = e(19);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      if(t1 == 'R') {
						                          if(t2 == 'R' || t2 == 'E') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              if(t2 != 'R') _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FMUL);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else if (t1 == 'E'){
						                          if(t2 == 'R') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.FMUL);
						                          }
						                          else if (t2 == 'E') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.IMUL);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g1.line, 'N', t1);
						                      }
						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(497);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(498);
						((EContext)_localctx).op = match(TK_OP_DIV);
						setState(499);
						((EContext)_localctx).g2 = e(18);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      if(t1 == 'R') {
						                          if(t2 == 'R' || t2 == 'E') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              if(t2 != 'R') _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FDIV);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else if (t1 == 'E'){
						                          if(t2 == 'R') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.FDIV);
						                          }
						                          else if (t2 == 'E') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FDIV);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g1.line, 'N', t1);
						                      }
						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 3:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(502);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(503);
						((EContext)_localctx).op = match(TK_OP_DIV_INT);
						setState(504);
						((EContext)_localctx).g2 = e(17);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      if(t1 == 'R') {
						                          if(t2 == 'R' || t2 == 'E') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              if(t2 != 'R') _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FDIV);
						                              _localctx.trad.add(x.F2I);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else if (t1 == 'E'){
						                          if(t2 == 'R') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.FDIV);
						                              _localctx.trad.add(x.F2I);
						                          }
						                          else if (t2 == 'E') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.IDIV);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g1.line, 'N', t1);
						                      }
						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 4:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(507);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(508);
						((EContext)_localctx).op = match(TK_OP_MOD);
						setState(509);
						((EContext)_localctx).g2 = e(16);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      if(t1 == 'R') {
						                          if(t2 == 'R' || t2 == 'E') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              if(t2 != 'R') _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FREM);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else if (t1 == 'E'){
						                          if(t2 == 'R') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.FREM);
						                          }
						                          else if (t2 == 'E') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.IREM);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g1.line, 'N', t1);
						                      }
						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 5:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(512);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(513);
						((EContext)_localctx).op = match(TK_OP_PLUS);
						setState(514);
						((EContext)_localctx).g2 = e(15);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      if(t1 == 'R') {
						                          if(t2 == 'R' || t2 == 'E') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              if(t2 != 'R') _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FADD);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else if (t1 == 'E'){
						                          if(t2 == 'R') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.FADD);
						                          }
						                          else if (t2 == 'E') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.IADD);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g1.line, 'N', t1);
						                      }
						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 6:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(517);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(518);
						((EContext)_localctx).op = match(TK_OP_MINUS);
						setState(519);
						((EContext)_localctx).g2 = e(14);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      if(t1 == 'R') {
						                          if(t2 == 'R' || t2 == 'E') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              if(t2 != 'R') _localctx.trad.add(x.I2F);
						                              _localctx.trad.add(x.FSUB);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else if (t1 == 'E'){
						                          if(t2 == 'R') {
						                              _localctx.tipus.add('R');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.add(x.I2F);
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.FSUB);
						                          }
						                          else if (t2 == 'E') {
						                              _localctx.tipus.add('E');
						                              ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                              _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                              _localctx.trad.add(x.ISUB);
						                          }
						                          else {
						                             errorTipus(((EContext)_localctx).g2.line, 'N', t2);
						                          }
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g1.line, 'N', t1);
						                      }
						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 7:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(522);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(523);
						((EContext)_localctx).op = match(TK_OP_NEQUAL);
						setState(524);
						((EContext)_localctx).g2 = e(13);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if((t1 == 'B' || t1 == 'E') && (t2 == 'E' || t2 == 'B')) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IF_ICMPEQ); //Si els operands són iguals, salta a posar 0
						                          Long salt = 7L; //6+1
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          salt = 4L; //3+1
						                          _localctx.trad.add(x.GOTO);
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if(t1 == 'R' || t2 == 'R') {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          if (t1 == 'E' || t1 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          if (t2 == 'E' || t2 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.add(x.FCMPL); //Si iguals 0 (Fals), altrament 1 o -1 (Cert)
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t1, t2);
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                      
						}
						break;
					case 8:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(527);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(528);
						((EContext)_localctx).op = match(TK_OP_SMALLER);
						setState(529);
						((EContext)_localctx).g2 = e(12);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IF_ICMPLT); //Si els operands són iguals, salta a posar 0
						                          Long salt = 7L; //6+1
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          salt = 4L; //3+1
						                          _localctx.trad.add(x.GOTO);
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          if (t1 == 'E' || t1 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          if (t2 == 'E' || t2 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.add(x.FCMPL); // si a > b deixa un 1, i si són iguals hi deixa un 0
						                          _localctx.trad.add(x.INEG); // si a > b deixa un -1, i si són iguals hi deixa un 0
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.FCMPL);  // Si la negació havia donat 1 això donarà 0 i si no, -1
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.IADD); //Ara afegim 1
						                          //Si l'últim fcmpl havia deixat un 0, ara tindrem un 1
						                          //Altrament, hi tindrem un 0
						                      }
						                      else if (t1 != 'E' && t1 != 'R' && t1 != 'B'){
						                         errorTipus(((EContext)_localctx).g1.line, t1, 'N');
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t2, 'N');
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 9:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(532);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(533);
						((EContext)_localctx).op = match(TK_OP_SMALLEREQ);
						setState(534);
						((EContext)_localctx).g2 = e(11);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IF_ICMPLE); //Si els operands són iguals, salta a posar 0
						                          Long salt = 7L; //6+1
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          salt = 4L; //3+1
						                          _localctx.trad.add(x.GOTO);
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          if (t1 == 'E' || t1 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          if (t2 == 'E' || t2 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.add(x.FCMPL); // si a > b deixa un 1
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.ISUB); //Restem 1
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.ICONST_0);
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.FCMPL); //Comparem amb 0
						                          //Si el primer fcmlp havia donat 1, quedarà un 0 a la pila
						                          //Altrament, quedarà un -1
						                          _localctx.trad.add(x.INEG); // Així quedarà un 0 o un 1
						                      }
						                      else if (t1 != 'E' && t1 != 'R'){
						                         errorTipus(((EContext)_localctx).g1.line, t1, 'N');
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t2, 'N');
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 10:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(537);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(538);
						((EContext)_localctx).op = match(TK_OP_GREATER);
						setState(539);
						((EContext)_localctx).g2 = e(10);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IF_ICMPGT); //Si els operands són iguals, salta a posar 0
						                          Long salt = 7L; //6+1
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          salt = 4L; //3+1
						                          _localctx.trad.add(x.GOTO);
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          if (t1 == 'E' || t1 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          if (t2 == 'E' || t2 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.add(x.FCMPL); // si a < b deixa un -1, i si són iguals hi deixa un 0
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.FCMPL);  // Si havia donat 1 això donarà 0 i si no, -1
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.IADD); //Ara afegim 1
						                          //Si l'últim fcmpl havia deixat un 0, ara tindrem un 1
						                          //Altrament, hi tindrem un 0
						                      }
						                      else if (t1 != 'E' && t1 != 'R'){
						                         errorTipus(((EContext)_localctx).g1.line, t1, 'N');
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t2, 'N');
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 11:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(542);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(543);
						((EContext)_localctx).op = match(TK_OP_GREATEREQ);
						setState(544);
						((EContext)_localctx).g2 = e(9);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IF_ICMPGE); //Si els operands són iguals, salta a posar 0
						                          Long salt = 7L; //6+1
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          salt = 4L; //3+1
						                          _localctx.trad.add(x.GOTO);
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          if (t1 == 'E' || t1 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          if (t2 == 'E' || t2 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.add(x.FCMPL); // si a < b deixa un -1
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.IADD); //Sumem 1
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.ICONST_0);
						                          _localctx.trad.add(x.I2F);
						                          _localctx.trad.add(x.FCMPL); //Comparem amb 0
						                          //Si el primer fcmlp havia donat -1 quedarà un 0 a la pila
						                          //Altrament quedarà un 1
						                      }
						                      else if (t1 != 'E' && t1 != 'R'){
						                         errorTipus(((EContext)_localctx).g1.line, t1, 'N');
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t2, 'N');
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 12:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(547);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(548);
						((EContext)_localctx).op = match(TK_OP_AND);
						setState(549);
						((EContext)_localctx).g2 = e(8);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if(t1 == 'B' && t2 == 'B') {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.add(x.IFEQ); //Si el primer es 0, salta a posar 0 (fals)
						                          Long salt = 10L + ((EContext)_localctx).g2.trad.size();
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IFEQ);
						                          salt = 7L;
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.GOTO);
						                          salt = 4L;
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                      }
						                      else if (t1 != 'B'){
						                         errorTipus(((EContext)_localctx).g1.line, t1, 'B');
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t2, 'B');
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 13:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(552);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(553);
						((EContext)_localctx).op = match(TK_OP_OR);
						setState(554);
						((EContext)_localctx).g2 = e(7);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if(t1 == 'B' && t2 == 'B') {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.add(x.IFNE); //Si el primer es 0, saltem
						                          Long salt = 10L + ((EContext)_localctx).g2.trad.size();
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IFNE);
						                          salt = 7L;
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          _localctx.trad.add(x.GOTO);
						                          salt = 4L;
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if (t1 != 'B'){
						                         errorTipus(((EContext)_localctx).g1.line, t1, 'B');
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t2, 'B');
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 14:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.g1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(557);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(558);
						((EContext)_localctx).op = match(TK_OP_EQUAL);
						setState(559);
						((EContext)_localctx).g2 = e(6);

						                      ((EContext)_localctx).tipus =  new ArrayList<Character>();
						                      char t1 = ((EContext)_localctx).g1.tipus.get(((EContext)_localctx).g1.tipus.size()-1);
						                      char t2 = ((EContext)_localctx).g2.tipus.get(((EContext)_localctx).g2.tipus.size()-1);

						                      _localctx.tipus.add('B');

						                      if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          _localctx.trad.add(x.IF_ICMPEQ); //Si els operands són iguals, salta a posar 1
						                          Long salt = 7L; //6+1
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_0);
						                          salt = 4L; //3+1
						                          _localctx.trad.add(x.GOTO);
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.add(x.ICONST_1);
						                      }
						                      else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
						                          ((EContext)_localctx).trad =  ((EContext)_localctx).g1.trad;
						                          if (t1 == 'E' || t1 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.addAll(((EContext)_localctx).g2.trad);
						                          if (t2 == 'E' || t2 == 'B') _localctx.trad.add(x.I2F);

						                          _localctx.trad.add(x.FCMPL); //Si iguals 0, altrament 1 o -1
						                          //Sumem 1 i fem el mòdul entre 2 per negar el resultat (si teníem 0 queda 1, altrament queda 0)
						                          _localctx.trad.add(x.ICONST_1);
						                          _localctx.trad.add(x.IADD);
						                          _localctx.trad.add(x.ICONST_2);
						                          _localctx.trad.add(x.IREM);
						                          //Si es compleix el nequal, a la pila hi quedarà un 0
						                      }
						                      else {
						                         errorTipus(((EContext)_localctx).g2.line, t1, t2);
						                      }

						                      ((EContext)_localctx).line =  ((EContext)_localctx).op.getLine();
						                  
						}
						break;
					case 15:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.h1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(562);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(563);
						match(TK_OP_QMARK);
						setState(564);
						((EContext)_localctx).h2 = e(0);
						setState(565);
						match(TK_COLON);
						setState(566);
						((EContext)_localctx).h3 = e(5);

						                  if(((EContext)_localctx).h1.tipus.get(0) == 'B'){
						                      if(((EContext)_localctx).h2.tipus.get(0) == ((EContext)_localctx).h3.tipus.get(0)){
						                          ((EContext)_localctx).tipus =  ((EContext)_localctx).h2.tipus;

						                          ((EContext)_localctx).trad = ((EContext)_localctx).h1.trad;
						                          _localctx.trad.add(x.IFEQ);
						                          Long salt=((EContext)_localctx).h2.trad.size()+6L;
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.addAll(((EContext)_localctx).h2.trad);
						                          _localctx.trad.add(x.GOTO);
						                          salt=((EContext)_localctx).h3.trad.size()+3L;
						                          _localctx.trad.add(x.nByte(salt,2));
						                          _localctx.trad.add(x.nByte(salt,1));
						                          _localctx.trad.addAll(((EContext)_localctx).h3.trad);
						                          ((EContext)_localctx).line =  ((EContext)_localctx).h1.line;
						                      }
						                      else {
						                          errorTipus(((EContext)_localctx).h3.line, ((EContext)_localctx).h2.tipus.get(0), ((EContext)_localctx).h3.tipus.get(0));
						                      }
						                  }
						                  else{
						                      errorTipus(((EContext)_localctx).h1.line, 'B', ((EContext)_localctx).h1.tipus.get(0));
						                  }
						              
						}
						break;
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
	public static class E_boolContext extends ParserRuleContext {
		public ArrayList<Character> tipus;
		public Vector<Long> trad;
		public int line;
		public Token a;
		public TerminalNode TK_BOOL() { return getToken(compiladorParser.TK_BOOL, 0); }
		public E_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterE_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitE_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitE_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_boolContext e_bool() throws RecognitionException {
		E_boolContext _localctx = new E_boolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_e_bool);

		    ((E_boolContext)_localctx).tipus =  new ArrayList<Character>();
		    ((E_boolContext)_localctx).trad = new Vector<Long>(10);
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			((E_boolContext)_localctx).a = match(TK_BOOL);

			        _localctx.tipus.add('B');
			        _localctx.trad.add(x.BIPUSH);
			        //true = 1, false = 0
			        Long lng = ((E_boolContext)_localctx).a.getText().equals("cert") ? 1L : 0L;
			        _localctx.trad.add(lng);
			        ((E_boolContext)_localctx).line =  ((E_boolContext)_localctx).a.getLine();
			    
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
		public ArrayList<Character> tipus;
		public Vector<Long> trad;
		public int line;
		public Token a;
		public Token b;
		public TerminalNode TK_REAL() { return getToken(compiladorParser.TK_REAL, 0); }
		public TerminalNode TK_ENTER() { return getToken(compiladorParser.TK_ENTER, 0); }
		public E_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterE_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitE_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitE_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_numContext e_num() throws RecognitionException {
		E_numContext _localctx = new E_numContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_e_num);

		    ((E_numContext)_localctx).tipus =  new ArrayList<Character>();
		    ((E_numContext)_localctx).trad = new Vector<Long>(10);
		    
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				((E_numContext)_localctx).a = match(TK_REAL);

				        _localctx.tipus.add('R');

				        //Afegim el valor a la constant pool
				        Long l = x.addConstant("F", ((E_numContext)_localctx).a.getText());
				        _localctx.trad.add(x.LDC_W);
				        _localctx.trad.add(x.nByte(l,2));
				        _localctx.trad.add(x.nByte(l,1));
				        ((E_numContext)_localctx).line =  ((E_numContext)_localctx).a.getLine();
				    
				}
				break;
			case TK_ENTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				((E_numContext)_localctx).b = match(TK_ENTER);

				         _localctx.tipus.add('E');
				         //Carreguem el valor a la pila
				         _localctx.trad.add(x.BIPUSH);
				         _localctx.trad.add(Long.valueOf((((E_numContext)_localctx).b!=null?((E_numContext)_localctx).b.getText():null)));
				         ((E_numContext)_localctx).line =  ((E_numContext)_localctx).b.getLine();
				   
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0248\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001?\b\u0001\u000b\u0001\f\u0001@\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"d\b\u0003\n\u0003\f\u0003g\t\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004v\b\u0004\u000b"+
		"\u0004\f\u0004w\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u007f\b\u0005\n\u0005\f\u0005\u0082\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u009e\b\u0006\n\u0006\f\u0006\u00a1\t\u0006\u0003"+
		"\u0006\u00a3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ad\b\u0006"+
		"\n\u0006\f\u0006\u00b0\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00c8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00ce\b\u0007\n\u0007\f\u0007\u00d1\t\u0007\u0003\u0007"+
		"\u00d3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00da\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00df\b\u0007\n\u0007\f\u0007\u00e2\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u00eb\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f3\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00f9\b\b\n\b\f\b\u00fc\t\b\u0001\t\u0001\t"+
		"\u0005\t\u0100\b\t\n\t\f\t\u0103\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u010d\b\n\n\n\f\n\u0110\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u0118\b\u000b"+
		"\u000b\u000b\f\u000b\u0119\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0123\b\u000b\u000b\u000b"+
		"\f\u000b\u0124\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u012b\b\u000b\u000b\u000b\f\u000b\u012c\u0003\u000b\u012f\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0140\b\u000b\n\u000b\f\u000b"+
		"\u0143\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u014f\b\u000b\u000b\u000b\f\u000b\u0150\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u0163\b\u000b\u000b\u000b\f\u000b\u0164"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u017d\b\u000b"+
		"\n\u000b\f\u000b\u0180\t\u000b\u0003\u000b\u0182\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u018d\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0196\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01a0\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u01a9\b\r\n\r\f\r\u01ac\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u01d3\b\u000e\n\u000e\f\u000e\u01d6\t\u000e\u0003\u000e\u01d8\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u01e3\b\u000e\u000b"+
		"\u000e\f\u000e\u01e4\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u01eb\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u023a\b\u000e\n\u000e\f\u000e\u023d\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0246\b\u0010\u0001\u0010\u0000\u0001\u001c\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0001\u0001\u000078\u0287\u0000%\u0001\u0000\u0000\u0000\u0002"+
		"9\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006M\u0001"+
		"\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000"+
		"\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u00b4\u0001\u0000\u0000\u0000"+
		"\u0010\u00ea\u0001\u0000\u0000\u0000\u0012\u00fd\u0001\u0000\u0000\u0000"+
		"\u0014\u0106\u0001\u0000\u0000\u0000\u0016\u018c\u0001\u0000\u0000\u0000"+
		"\u0018\u018e\u0001\u0000\u0000\u0000\u001a\u019f\u0001\u0000\u0000\u0000"+
		"\u001c\u01ea\u0001\u0000\u0000\u0000\u001e\u023e\u0001\u0000\u0000\u0000"+
		" \u0245\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0006\u0000"+
		"\uffff\uffff\u0000$&\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0003\n\u0005"+
		"\u0000()\u0006\u0000\uffff\uffff\u0000)*\u0005\u001c\u0000\u0000*+\u0005"+
		"B\u0000\u0000+-\u0006\u0000\uffff\uffff\u0000,.\u0003\u0012\t\u0000-,"+
		"\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.2\u0001\u0000\u0000"+
		"\u0000/0\u0003\u0016\u000b\u000001\u0006\u0000\uffff\uffff\u000013\u0001"+
		"\u0000\u0000\u00002/\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0005\u001d\u0000\u000078\u0006\u0000\uffff\uffff\u00008\u0001"+
		"\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:>\u0006\u0001\uffff\uffff"+
		"\u0000;<\u0003\u0004\u0002\u0000<=\u0006\u0001\uffff\uffff\u0000=?\u0001"+
		"\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0005*\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DK\u0006\u0002"+
		"\uffff\uffff\u0000EF\u0003\u0006\u0003\u0000FG\u0006\u0002\uffff\uffff"+
		"\u0000GL\u0001\u0000\u0000\u0000HI\u0003\b\u0004\u0000IJ\u0006\u0002\uffff"+
		"\uffff\u0000JL\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MN\u0005B\u0000\u0000"+
		"NO\u0005\u0017\u0000\u0000OP\u0005+\u0000\u0000PQ\u00059\u0000\u0000Q"+
		"R\u0006\u0003\uffff\uffff\u0000RS\u0005,\u0000\u0000ST\u0005>\u0000\u0000"+
		"TZ\u0006\u0003\uffff\uffff\u0000UV\u0005\u0005\u0000\u0000VW\u0005>\u0000"+
		"\u0000WY\u0006\u0003\uffff\uffff\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[h\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005-\u0000\u0000"+
		"^_\u0005>\u0000\u0000_e\u0006\u0003\uffff\uffff\u0000`a\u0005\u0005\u0000"+
		"\u0000ab\u0005>\u0000\u0000bd\u0006\u0003\uffff\uffff\u0000c`\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"h]\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0004\u0000\u0000kl\u0006\u0003\uffff\uffff\u0000l\u0007"+
		"\u0001\u0000\u0000\u0000mn\u0005B\u0000\u0000no\u0006\u0004\uffff\uffff"+
		"\u0000op\u0005\u0017\u0000\u0000pu\u0005.\u0000\u0000qr\u0005B\u0000\u0000"+
		"rs\u0005\u0017\u0000\u0000st\u00059\u0000\u0000tv\u0006\u0004\uffff\uffff"+
		"\u0000uq\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005"+
		"/\u0000\u0000z{\u0005\u0004\u0000\u0000{\t\u0001\u0000\u0000\u0000|\u007f"+
		"\u0003\f\u0006\u0000}\u007f\u0003\u000e\u0007\u0000~|\u0001\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u000b"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u00050\u0000\u0000\u0084\u0085\u0005B\u0000\u0000\u0085\u0086\u0006\u0006"+
		"\uffff\uffff\u0000\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u00a2\u0006"+
		"\u0006\uffff\uffff\u0000\u0088\u0089\u00057\u0000\u0000\u0089\u008d\u0006"+
		"\u0006\uffff\uffff\u0000\u008a\u008b\u00058\u0000\u0000\u008b\u008d\u0006"+
		"\u0006\uffff\uffff\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005B\u0000\u0000\u008f\u0090\u0005"+
		"\u0017\u0000\u0000\u0090\u0091\u00059\u0000\u0000\u0091\u009f\u0006\u0006"+
		"\uffff\uffff\u0000\u0092\u0097\u0005\u0005\u0000\u0000\u0093\u0094\u0005"+
		"7\u0000\u0000\u0094\u0098\u0006\u0006\uffff\uffff\u0000\u0095\u0096\u0005"+
		"8\u0000\u0000\u0096\u0098\u0006\u0006\uffff\uffff\u0000\u0097\u0093\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"B\u0000\u0000\u009a\u009b\u0005\u0017\u0000\u0000\u009b\u009c\u00059\u0000"+
		"\u0000\u009c\u009e\u0006\u0006\uffff\uffff\u0000\u009d\u0092\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u008c\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a7\u0006\u0006"+
		"\uffff\uffff\u0000\u00a6\u00a8\u0003\u0012\t\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ae\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0003\u0016\u000b\u0000\u00aa\u00ab\u0006\u0006"+
		"\uffff\uffff\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"1\u0000\u0000\u00b2\u00b3\u0006\u0006\uffff\uffff\u0000\u00b3\r\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u00052\u0000\u0000\u00b5\u00b6\u0005B\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00d2\u0006\u0007\uffff"+
		"\uffff\u0000\u00b8\u00b9\u00057\u0000\u0000\u00b9\u00bd\u0006\u0007\uffff"+
		"\uffff\u0000\u00ba\u00bb\u00058\u0000\u0000\u00bb\u00bd\u0006\u0007\uffff"+
		"\uffff\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005B\u0000\u0000\u00bf\u00c0\u0005\u0017\u0000"+
		"\u0000\u00c0\u00c1\u00059\u0000\u0000\u00c1\u00cf\u0006\u0007\uffff\uffff"+
		"\u0000\u00c2\u00c7\u0005\u0005\u0000\u0000\u00c3\u00c4\u00057\u0000\u0000"+
		"\u00c4\u00c8\u0006\u0007\uffff\uffff\u0000\u00c5\u00c6\u00058\u0000\u0000"+
		"\u00c6\u00c8\u0006\u0007\uffff\uffff\u0000\u00c7\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005B\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0017\u0000\u0000\u00cb\u00cc\u00059\u0000\u0000\u00cc"+
		"\u00ce\u0006\u0007\uffff\uffff\u0000\u00cd\u00c2\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5\u00d6\u00054\u0000\u0000\u00d6"+
		"\u00d7\u00059\u0000\u0000\u00d7\u00d9\u0006\u0007\uffff\uffff\u0000\u00d8"+
		"\u00da\u0003\u0012\t\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00e0\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0003\u0016\u000b\u0000\u00dc\u00dd\u0006\u0007\uffff\uffff\u0000\u00dd"+
		"\u00df\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u00054\u0000\u0000\u00e4\u00e5"+
		"\u0003\u001c\u000e\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7"+
		"\u00053\u0000\u0000\u00e7\u00e8\u0006\u0007\uffff\uffff\u0000\u00e8\u000f"+
		"\u0001\u0000\u0000\u0000\u00e9\u00eb\u0007\u0000\u0000\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005B\u0000\u0000\u00ed\u00ee\u0005"+
		"\u0017\u0000\u0000\u00ee\u00ef\u00059\u0000\u0000\u00ef\u00fa\u0006\b"+
		"\uffff\uffff\u0000\u00f0\u00f2\u0005\u0005\u0000\u0000\u00f1\u00f3\u0007"+
		"\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"B\u0000\u0000\u00f5\u00f6\u0005\u0017\u0000\u0000\u00f6\u00f7\u00059\u0000"+
		"\u0000\u00f7\u00f9\u0006\b\uffff\uffff\u0000\u00f8\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0011\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0101\u00055\u0000\u0000"+
		"\u00fe\u0100\u0003\u0014\n\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u00056\u0000\u0000\u0105\u0013"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0006\n\uffff\uffff\u0000\u0107\u0108"+
		"\u0005B\u0000\u0000\u0108\u010e\u0006\n\uffff\uffff\u0000\u0109\u010a"+
		"\u0005\u0005\u0000\u0000\u010a\u010b\u0005B\u0000\u0000\u010b\u010d\u0006"+
		"\n\uffff\uffff\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d\u0110\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\u0017\u0000\u0000\u0112\u0113\u0005"+
		"9\u0000\u0000\u0113\u0114\u0006\n\uffff\uffff\u0000\u0114\u0115\u0005"+
		"\u0004\u0000\u0000\u0115\u0015\u0001\u0000\u0000\u0000\u0116\u0118\u0003"+
		"\u0014\n\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u018d\u0001\u0000\u0000\u0000\u011b\u011c\u0005%\u0000"+
		"\u0000\u011c\u011d\u0003\u001c\u000e\u0000\u011d\u011e\u0006\u000b\uffff"+
		"\uffff\u0000\u011e\u0122\u0005&\u0000\u0000\u011f\u0120\u0003\u0016\u000b"+
		"\u0000\u0120\u0121\u0006\u000b\uffff\uffff\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u012e\u0001\u0000\u0000\u0000\u0126\u012a\u0005\'\u0000"+
		"\u0000\u0127\u0128\u0003\u0016\u000b\u0000\u0128\u0129\u0006\u000b\uffff"+
		"\uffff\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u0126\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005(\u0000"+
		"\u0000\u0131\u0132\u0006\u000b\uffff\uffff\u0000\u0132\u018d\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005!\u0000\u0000\u0134\u0135\u0005B\u0000\u0000"+
		"\u0135\u0136\u0006\u000b\uffff\uffff\u0000\u0136\u0137\u0005\"\u0000\u0000"+
		"\u0137\u0138\u0003\u001c\u000e\u0000\u0138\u0139\u0005#\u0000\u0000\u0139"+
		"\u013a\u0003\u001c\u000e\u0000\u013a\u013b\u0006\u000b\uffff\uffff\u0000"+
		"\u013b\u0141\u0005 \u0000\u0000\u013c\u013d\u0003\u0016\u000b\u0000\u013d"+
		"\u013e\u0006\u000b\uffff\uffff\u0000\u013e\u0140\u0001\u0000\u0000\u0000"+
		"\u013f\u013c\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005$\u0000\u0000\u0145\u0146\u0006\u000b\uffff\uffff\u0000"+
		"\u0146\u018d\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u001e\u0000\u0000"+
		"\u0148\u0149\u0003\u001c\u000e\u0000\u0149\u014a\u0006\u000b\uffff\uffff"+
		"\u0000\u014a\u014e\u0005 \u0000\u0000\u014b\u014c\u0003\u0016\u000b\u0000"+
		"\u014c\u014d\u0006\u000b\uffff\uffff\u0000\u014d\u014f\u0001\u0000\u0000"+
		"\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u001f\u0000"+
		"\u0000\u0153\u0154\u0006\u000b\uffff\uffff\u0000\u0154\u018d\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005B\u0000\u0000\u0156\u0157\u0005\u001b\u0000"+
		"\u0000\u0157\u0158\u0003\u001c\u000e\u0000\u0158\u0159\u0005\u0004\u0000"+
		"\u0000\u0159\u015a\u0006\u000b\uffff\uffff\u0000\u015a\u018d\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0005B\u0000\u0000\u015c\u0162\u0006\u000b\uffff"+
		"\uffff\u0000\u015d\u015e\u0005\u0018\u0000\u0000\u015e\u015f\u0003\u001c"+
		"\u000e\u0000\u015f\u0160\u0005\u0019\u0000\u0000\u0160\u0161\u0006\u000b"+
		"\uffff\uffff\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015d\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0005\u001b\u0000\u0000\u0167\u0168\u0003"+
		"\u001c\u000e\u0000\u0168\u0169\u0006\u000b\uffff\uffff\u0000\u0169\u016a"+
		"\u0005\u0004\u0000\u0000\u016a\u018d\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005B\u0000\u0000\u016c\u016d\u0005\u001a\u0000\u0000\u016d\u016e\u0005"+
		"B\u0000\u0000\u016e\u016f\u0005\u001b\u0000\u0000\u016f\u0170\u0003\u001c"+
		"\u000e\u0000\u0170\u0171\u0005\u0004\u0000\u0000\u0171\u0172\u0006\u000b"+
		"\uffff\uffff\u0000\u0172\u018d\u0001\u0000\u0000\u0000\u0173\u0174\u0005"+
		"B\u0000\u0000\u0174\u0175\u0006\u000b\uffff\uffff\u0000\u0175\u0181\u0005"+
		"\u0002\u0000\u0000\u0176\u0177\u0003\u001c\u000e\u0000\u0177\u017e\u0006"+
		"\u000b\uffff\uffff\u0000\u0178\u0179\u0005\u0005\u0000\u0000\u0179\u017a"+
		"\u0003\u001c\u000e\u0000\u017a\u017b\u0006\u000b\uffff\uffff\u0000\u017b"+
		"\u017d\u0001\u0000\u0000\u0000\u017c\u0178\u0001\u0000\u0000\u0000\u017d"+
		"\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0181\u0176\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0005\u0003\u0000\u0000\u0184\u0185\u0005\u0004\u0000\u0000\u0185"+
		"\u018d\u0006\u000b\uffff\uffff\u0000\u0186\u0187\u0003\u0018\f\u0000\u0187"+
		"\u0188\u0006\u000b\uffff\uffff\u0000\u0188\u018d\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0003\u001a\r\u0000\u018a\u018b\u0006\u000b\uffff\uffff\u0000"+
		"\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u0117\u0001\u0000\u0000\u0000"+
		"\u018c\u011b\u0001\u0000\u0000\u0000\u018c\u0133\u0001\u0000\u0000\u0000"+
		"\u018c\u0147\u0001\u0000\u0000\u0000\u018c\u0155\u0001\u0000\u0000\u0000"+
		"\u018c\u015b\u0001\u0000\u0000\u0000\u018c\u016b\u0001\u0000\u0000\u0000"+
		"\u018c\u0173\u0001\u0000\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000"+
		"\u018c\u0189\u0001\u0000\u0000\u0000\u018d\u0017\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005:\u0000\u0000\u018f\u0190\u0005\u0002\u0000\u0000\u0190"+
		"\u0191\u0005B\u0000\u0000\u0191\u0195\u0006\f\uffff\uffff\u0000\u0192"+
		"\u0193\u0005\u0017\u0000\u0000\u0193\u0194\u00059\u0000\u0000\u0194\u0196"+
		"\u0006\f\uffff\uffff\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0005\u0003\u0000\u0000\u0198\u0199\u0005\u0004\u0000\u0000\u0199\u019a"+
		"\u0006\f\uffff\uffff\u0000\u019a\u0019\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005;\u0000\u0000\u019c\u01a0\u0006\r\uffff\uffff\u0000\u019d\u019e"+
		"\u0005<\u0000\u0000\u019e\u01a0\u0006\r\uffff\uffff\u0000\u019f\u019b"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0002\u0000\u0000\u01a2\u01a3"+
		"\u0003\u001c\u000e\u0000\u01a3\u01aa\u0006\r\uffff\uffff\u0000\u01a4\u01a5"+
		"\u0005\u0005\u0000\u0000\u01a5\u01a6\u0003\u001c\u000e\u0000\u01a6\u01a7"+
		"\u0006\r\uffff\uffff\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0005\u0003\u0000\u0000\u01ae\u01af\u0005\u0004\u0000\u0000\u01af\u01b0"+
		"\u0006\r\uffff\uffff\u0000\u01b0\u001b\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0006\u000e\uffff\uffff\u0000\u01b2\u01b3\u0005A\u0000\u0000\u01b3\u01eb"+
		"\u0006\u000e\uffff\uffff\u0000\u01b4\u01b5\u0005\u0002\u0000\u0000\u01b5"+
		"\u01b6\u0003\u001c\u000e\u0000\u01b6\u01b7\u0006\u000e\uffff\uffff\u0000"+
		"\u01b7\u01b8\u0005\u0003\u0000\u0000\u01b8\u01eb\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0003 \u0010\u0000\u01ba\u01bb\u0006\u000e\uffff\uffff\u0000"+
		"\u01bb\u01eb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003\u001e\u000f\u0000"+
		"\u01bd\u01be\u0006\u000e\uffff\uffff\u0000\u01be\u01eb\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0005B\u0000\u0000\u01c0\u01eb\u0006\u000e\uffff\uffff"+
		"\u0000\u01c1\u01c2\u0005\u0013\u0000\u0000\u01c2\u01c3\u0003\u001c\u000e"+
		"\u0014\u01c3\u01c4\u0006\u000e\uffff\uffff\u0000\u01c4\u01eb\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005\f\u0000\u0000\u01c6\u01c7\u0003\u001c\u000e"+
		"\u0013\u01c7\u01c8\u0006\u000e\uffff\uffff\u0000\u01c8\u01eb\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0005B\u0000\u0000\u01ca\u01cb\u0006\u000e\uffff"+
		"\uffff\u0000\u01cb\u01d7\u0005\u0002\u0000\u0000\u01cc\u01cd\u0003\u001c"+
		"\u000e\u0000\u01cd\u01d4\u0006\u000e\uffff\uffff\u0000\u01ce\u01cf\u0005"+
		"\u0005\u0000\u0000\u01cf\u01d0\u0003\u001c\u000e\u0000\u01d0\u01d1\u0006"+
		"\u000e\uffff\uffff\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01cc"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u0003\u0000\u0000\u01da\u01eb"+
		"\u0006\u000e\uffff\uffff\u0000\u01db\u01dc\u0005B\u0000\u0000\u01dc\u01e2"+
		"\u0006\u000e\uffff\uffff\u0000\u01dd\u01de\u0005\u0018\u0000\u0000\u01de"+
		"\u01df\u0003\u001c\u000e\u0000\u01df\u01e0\u0006\u000e\uffff\uffff\u0000"+
		"\u01e0\u01e1\u0005\u0019\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e5\u01eb\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005B\u0000\u0000\u01e7"+
		"\u01e8\u0005\u001a\u0000\u0000\u01e8\u01e9\u0005B\u0000\u0000\u01e9\u01eb"+
		"\u0006\u000e\uffff\uffff\u0000\u01ea\u01b1\u0001\u0000\u0000\u0000\u01ea"+
		"\u01b4\u0001\u0000\u0000\u0000\u01ea\u01b9\u0001\u0000\u0000\u0000\u01ea"+
		"\u01bc\u0001\u0000\u0000\u0000\u01ea\u01bf\u0001\u0000\u0000\u0000\u01ea"+
		"\u01c1\u0001\u0000\u0000\u0000\u01ea\u01c5\u0001\u0000\u0000\u0000\u01ea"+
		"\u01c9\u0001\u0000\u0000\u0000\u01ea\u01db\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e6\u0001\u0000\u0000\u0000\u01eb\u023b\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\n\u0012\u0000\u0000\u01ed\u01ee\u0005\b\u0000\u0000\u01ee\u01ef"+
		"\u0003\u001c\u000e\u0013\u01ef\u01f0\u0006\u000e\uffff\uffff\u0000\u01f0"+
		"\u023a\u0001\u0000\u0000\u0000\u01f1\u01f2\n\u0011\u0000\u0000\u01f2\u01f3"+
		"\u0005\t\u0000\u0000\u01f3\u01f4\u0003\u001c\u000e\u0012\u01f4\u01f5\u0006"+
		"\u000e\uffff\uffff\u0000\u01f5\u023a\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\n\u0010\u0000\u0000\u01f7\u01f8\u0005\n\u0000\u0000\u01f8\u01f9\u0003"+
		"\u001c\u000e\u0011\u01f9\u01fa\u0006\u000e\uffff\uffff\u0000\u01fa\u023a"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\n\u000f\u0000\u0000\u01fc\u01fd\u0005"+
		"\u000b\u0000\u0000\u01fd\u01fe\u0003\u001c\u000e\u0010\u01fe\u01ff\u0006"+
		"\u000e\uffff\uffff\u0000\u01ff\u023a\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\n\u000e\u0000\u0000\u0201\u0202\u0005\u0006\u0000\u0000\u0202\u0203\u0003"+
		"\u001c\u000e\u000f\u0203\u0204\u0006\u000e\uffff\uffff\u0000\u0204\u023a"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\n\r\u0000\u0000\u0206\u0207\u0005"+
		"\u0007\u0000\u0000\u0207\u0208\u0003\u001c\u000e\u000e\u0208\u0209\u0006"+
		"\u000e\uffff\uffff\u0000\u0209\u023a\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\n\f\u0000\u0000\u020b\u020c\u0005\u000e\u0000\u0000\u020c\u020d\u0003"+
		"\u001c\u000e\r\u020d\u020e\u0006\u000e\uffff\uffff\u0000\u020e\u023a\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\n\u000b\u0000\u0000\u0210\u0211\u0005\u000f"+
		"\u0000\u0000\u0211\u0212\u0003\u001c\u000e\f\u0212\u0213\u0006\u000e\uffff"+
		"\uffff\u0000\u0213\u023a\u0001\u0000\u0000\u0000\u0214\u0215\n\n\u0000"+
		"\u0000\u0215\u0216\u0005\u0010\u0000\u0000\u0216\u0217\u0003\u001c\u000e"+
		"\u000b\u0217\u0218\u0006\u000e\uffff\uffff\u0000\u0218\u023a\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\n\t\u0000\u0000\u021a\u021b\u0005\u0011\u0000"+
		"\u0000\u021b\u021c\u0003\u001c\u000e\n\u021c\u021d\u0006\u000e\uffff\uffff"+
		"\u0000\u021d\u023a\u0001\u0000\u0000\u0000\u021e\u021f\n\b\u0000\u0000"+
		"\u021f\u0220\u0005\u0012\u0000\u0000\u0220\u0221\u0003\u001c\u000e\t\u0221"+
		"\u0222\u0006\u000e\uffff\uffff\u0000\u0222\u023a\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\n\u0007\u0000\u0000\u0224\u0225\u0005\u0014\u0000\u0000\u0225"+
		"\u0226\u0003\u001c\u000e\b\u0226\u0227\u0006\u000e\uffff\uffff\u0000\u0227"+
		"\u023a\u0001\u0000\u0000\u0000\u0228\u0229\n\u0006\u0000\u0000\u0229\u022a"+
		"\u0005\u0015\u0000\u0000\u022a\u022b\u0003\u001c\u000e\u0007\u022b\u022c"+
		"\u0006\u000e\uffff\uffff\u0000\u022c\u023a\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\n\u0005\u0000\u0000\u022e\u022f\u0005\r\u0000\u0000\u022f\u0230"+
		"\u0003\u001c\u000e\u0006\u0230\u0231\u0006\u000e\uffff\uffff\u0000\u0231"+
		"\u023a\u0001\u0000\u0000\u0000\u0232\u0233\n\u0004\u0000\u0000\u0233\u0234"+
		"\u0005\u0016\u0000\u0000\u0234\u0235\u0003\u001c\u000e\u0000\u0235\u0236"+
		"\u0005\u0017\u0000\u0000\u0236\u0237\u0003\u001c\u000e\u0005\u0237\u0238"+
		"\u0006\u000e\uffff\uffff\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239"+
		"\u01ec\u0001\u0000\u0000\u0000\u0239\u01f1\u0001\u0000\u0000\u0000\u0239"+
		"\u01f6\u0001\u0000\u0000\u0000\u0239\u01fb\u0001\u0000\u0000\u0000\u0239"+
		"\u0200\u0001\u0000\u0000\u0000\u0239\u0205\u0001\u0000\u0000\u0000\u0239"+
		"\u020a\u0001\u0000\u0000\u0000\u0239\u020f\u0001\u0000\u0000\u0000\u0239"+
		"\u0214\u0001\u0000\u0000\u0000\u0239\u0219\u0001\u0000\u0000\u0000\u0239"+
		"\u021e\u0001\u0000\u0000\u0000\u0239\u0223\u0001\u0000\u0000\u0000\u0239"+
		"\u0228\u0001\u0000\u0000\u0000\u0239\u022d\u0001\u0000\u0000\u0000\u0239"+
		"\u0232\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b"+
		"\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u001d\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0005?\u0000\u0000\u023f\u0240\u0006\u000f\uffff\uffff\u0000\u0240"+
		"\u001f\u0001\u0000\u0000\u0000\u0241\u0242\u0005@\u0000\u0000\u0242\u0246"+
		"\u0006\u0010\uffff\uffff\u0000\u0243\u0244\u0005>\u0000\u0000\u0244\u0246"+
		"\u0006\u0010\uffff\uffff\u0000\u0245\u0241\u0001\u0000\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0246!\u0001\u0000\u0000\u00000%-4@KZe"+
		"hw~\u0080\u008c\u0097\u009f\u00a2\u00a7\u00ae\u00bc\u00c7\u00cf\u00d2"+
		"\u00d9\u00e0\u00ea\u00f2\u00fa\u0101\u010e\u0119\u0124\u012c\u012e\u0141"+
		"\u0150\u0164\u017e\u0181\u018c\u0195\u019f\u01aa\u01d4\u01d7\u01e4\u01ea"+
		"\u0239\u023b\u0245";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}