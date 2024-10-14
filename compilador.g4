/*
 * Pràctica Compiladors
 * Authors: Aniol Molero Grau i Bernat Comas Machuca
 */

grammar compilador;

@header{
    import java.io.*;
    import java.util.*;
    import java.util.regex.Pattern;
}

@parser::members{
         SymTable<Registre> TS = new SymTable<Registre>(1000);
         SymTable<Registre> TSDef = new SymTable<Registre>(1000);
         boolean error = false;
         Bytecode x;
         Long varCount  = 0L;
         Long saltLinia;

         //override method
         public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
              super.notifyErrorListeners(offendingToken,msg,e);
              error=true;
         }

         public void errorTipus(int line, char expected, char found){
            error = true;
            System.err.println("Error de tipus detectat a la linia " + line + ". S'esperava: " + tipusAString(expected) +
            ". S'ha trobat: " + tipusAString(found) + ".");
         }

         public void errorTipus(Token t, char expected, char found){
            error = true;
            System.err.println("Error de tipus detectat a la linia " + t.getLine() + ". S'esperava: " + tipusAString(expected) +
            ". S'ha trobat: " + tipusAString(found) + ".");
         }

         public void errorTipus(Token t, String expected, String found){
             error = true;
             System.err.println("Error de tipus detectat a la linia " + t.getLine() + ". S'esperava: " + expected +
             ". S'ha trobat: " + found + ".");
         }

         public void errorVariableInexistent(Token t){
            error = true;
            System.err.println("Error de variable no existent a la linia " + t.getLine());
         }

         public void errorCridaInexistent(Token t) {
            error = true;
            System.err.println("Error de funcio o accio no existent a la linia " + t.getLine());
         }

         public void errorAssignacio(Token t){
            error = true;
            Registre reg = TS.obtenir(t.getText());
            System.err.println("Error d'assignacio total de " + tipusAString(reg.tipus.get(0)) + " a la linia " + t.getLine());
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
            System.err.println("Error a la linia " + t.getLine()
                + ". La crida " + t.getText() + " espera "+ parametresEsperats + " parametres.");
        }

        public void errorTipusParametreIncorrecte(Token t, int pos, char expected, char found){
            error = true;
            System.err.println("Error a la linia " + t.getLine() + " a " + t.getText() +
                    ": Error de tipus al parametre " + pos +
                    ". S'esperava el tipus: " + tipusAString(expected) +
                    ". S'ha trobat el tipus: " + tipusAString(found) + ".");
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

        //Hem decidit permetre-ho, no l'utilitzem
        public void errorFuncioIncorrecta(Token t){
            error = true;
            System.err.println("Error a la linia " + t.getLine() + ": us de la funcio " + t.getText() +" sense assignar valor de retorn.");
        }

        public void errorAccioIncorrecta(Token t){
            error = true;
            System.err.println("Error a la linia " + t.getLine() + ": us de l'accio \"" + t.getText() +"\" quan s'esperava una expressio.");
        }

        public void errorTuplaCampIncorrecte(Token t, String camp){
            error = true;
            System.err.println("Error a la linia " + t.getLine() + ": La tupla " + t.getText() + " no conté el camp " + camp + ".");
        }

        public void errorTipusPreviamentDefinit(Token t) {
            error = true;
            System.err.println("Error a la linia " + t.getLine() + " el tipus " + t.getText() + " ja ha estat definit amb anterioritat.");
        }

        public void errorTuplaJaConteCamp(Token t, Token t2) {
            error = true;
            System.err.println("Error a la linia " + t.getLine() + " el camp " + t.getText() + " ja existeix a la tupla " + t2.getText() + ".");
        }

        public void errorVariableJaDefinida(Token t) {
            error = true;
            System.err.println("Error a la linia " + t.getLine() + " la variable " + t.getText() + " ja existeix.");
        }

        public void errorParametreDuplicat(String text) {
            error = true;
            System.err.println("Error: Una funcio no pot tenir dos parametres amb el mateix nom: " + text + ".");
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
            System.err.println("Error a la linia " + t.getLine() + " al vector " + t.getText() + ". Acces incorrecte, s'esperen " + expectedDim + " dimensions.");
            error = true;
        }
}

// Bloc de programa
arrel
@init{
    x=new Bytecode("fitxerquecalexecutar");
    saltLinia=x.addConstant("S","\n");
    Vector<Long> trad = new Vector<Long>(10);
}: (b = bloc_declaracio_tipus{trad.addAll($b.trad);})?
    c = bloc_declaracio_accions_funcions
    {
        TS = TSDef;
        varCount = TS.mida();
    }
    TK_PC_PROGRAMA a = TK_IDENT {
        ArrayList<Character> tipusProg = new ArrayList<>();
        tipusProg.add('P');
        if(TS.existeix($a.getText())) errorVariableJaDefinida($a);
        TS.inserir($a.text, new Registre($a.getText(), tipusProg, varCount++));
    }
        d = bloc_declaracio_var_def?
        (f = sentencia{
        trad.addAll($f.trad);})+
    TK_PC_FPROGRAMA {
        if (!error){
            trad.add(x.RETURN);
            x.addMainCode(1000L,1000L,trad);
            x.write();
            System.out.println("Compilacio finalitzada.");
        }
        else System.err.println("No s'ha pogut acabar de compilar.");
    }
    ;

//Bloc declaració de tipus
bloc_declaracio_tipus returns [Vector<Long> trad]: TK_PC_TIPUS {$trad = new Vector<Long>();} (dec = declaracio_tipus {$trad.addAll($dec.trad);})+ TK_PC_FTIPUS;
declaracio_tipus returns [Vector<Long> trad]: {$trad = new Vector<Long>();}(dec = declaracio_vector {$trad = $dec.trad;} | declaracio_tupla {$trad.addAll(new Vector<Long>());});
declaracio_vector returns [Vector<Long> trad]: nom = TK_IDENT ':' TK_PC_VECTOR tipus = TK_TIPUS_BASIC {
     Long varC = varCount++;
     ArrayList<Long> inicis = new ArrayList<>();
     ArrayList<Long> mides = new ArrayList<>();
     ArrayList<Character> tipusVec = new ArrayList<>();
     $trad = new Vector<Long>(10);
     if(TSDef.existeix($nom.getText())){
         errorTipusPreviamentDefinit($nom);
     }
     else {
         tipusVec.add('V');
         tipusVec.add(tipusAChar($tipus.getText()));
     }
 }
 TK_PC_MIDA m1 = TK_ENTER {
    Long mida = Long.valueOf($m1.getText());
    mides.add(mida);
} (',' mn = TK_ENTER {
    mida = Long.valueOf($mn.getText());
    mides.add(mida);
})*
(TK_PC_INICI ini = TK_ENTER {
    Long inici = Long.valueOf($ini.getText());
    inicis.add(inici);
}(',' ini2 = TK_ENTER {
    inici = Long.valueOf($ini.getText());
    inicis.add(inici);
})*)? TK_SEMI {
    Registre reg = new Registre($nom.text, tipusVec, varC, inicis, mides);
    TSDef.inserir($nom.text, reg);

    if(mides.size() != inicis.size() & inicis.size() > 0){
        System.err.println("La quantitat d'inicis i mides no coincideixen pel vector " + $nom.getText() + ", a la linia " + $nom.getLine() + ".");
        error = true;
    }
    for(Long c : mides){
        $trad.add(x.BIPUSH);
        $trad.add(c);
    }
    if(mides.size() == 1){
        $trad.add(x.NEWARRAY);
        $trad.add(getVectorType(tipusAChar($tipus.getText()))); //tipus del vector
    }
    else{
        Long adreca = x.addArrayDef(mides.size(), String.valueOf(tipusACharBytecode(tipusAChar($tipus.getText()))));
        $trad.add(x.MULTIANEWARRAY);
        $trad.add(x.nByte(adreca,2));
        $trad.add(x.nByte(adreca,1));
        $trad.add(Long.valueOf(mides.size()));
    }
    $trad.add(x.ASTORE);
    $trad.add(varC);
};

declaracio_tupla: nom = TK_IDENT {
    if(TSDef.existeix($nom.getText())){
        errorTipusPreviamentDefinit($nom);
    }
    else {
        ArrayList<Character> tipusTup = new ArrayList<>();
        tipusTup.add('T');
        Registre reg = new Registre($nom.getText(), tipusTup, varCount++);
        TSDef.inserir($nom.getText(), reg);
    }
}':' TK_PC_TUPLA ( camp = TK_IDENT ':' tipus = TK_TIPUS_BASIC {
    String c = $nom.getText() + "." + $camp.getText();

    if(TSDef.existeix(c)){
        errorTuplaJaConteCamp($camp, $nom);
    }
    else{
        ArrayList<Character> tipusTup = new ArrayList<>();
        tipusTup.add(tipusAChar($tipus.getText()));
        Registre reg = new Registre(c, tipusTup, varCount++);
        TSDef.inserir(c, reg);
    }
})+ TK_PC_FTUPLA TK_SEMI;

//Bloc declaració d'accions i funcions
bloc_declaracio_accions_funcions: (accio | funcio)*;
accio: TK_PC_ACCIO a1 = TK_IDENT {} TK_LPAREN
            {
                ArrayList<Character> tipusPar = new ArrayList<>();
                ArrayList<String> nomPar = new ArrayList<>();
                ArrayList<Boolean> isEntSor = new ArrayList<>();
                ArrayList<Long> poseES = new ArrayList<>();
                Vector<Long> trad = new Vector<>();
            }
            ((TK_PC_ENTRADA {isEntSor.add(false);} | TK_PC_ENTRADA_SORTIDA {isEntSor.add(true);})? id1 = TK_IDENT ':' tip = TK_TIPUS_BASIC
            {
                tipusPar.add(tipusAChar($tip.getText()));
                nomPar.add($id1.getText());
                if(tipusPar.size() > isEntSor.size()) {
                    isEntSor.add(false);
                }
            }
            (','(TK_PC_ENTRADA {isEntSor.add(false);} | TK_PC_ENTRADA_SORTIDA{isEntSor.add(true);})? id2 = TK_IDENT ':' tip2 = TK_TIPUS_BASIC
            {
                tipusPar.add(tipusAChar($tip2.getText()));
                nomPar.add($id2.getText());
                if(tipusPar.size() > isEntSor.size()) {
                    isEntSor.add(false);
                }
            })*)? TK_RPAREN
            {
                    String s = "(";
                    varCount = Long.valueOf(tipusPar.size());

                    for (int count = 0; count < tipusPar.size(); count++) {
                        if(isEntSor.get(count)) s = s + '[';
                        s = s + tipusACharBytecode(tipusPar.get(count));

                        if(TS.existeix(nomPar.get(count))){
                            errorParametreDuplicat(nomPar.get(count));
                        }
                        else {
                            ArrayList<Character> t = new ArrayList<>();
                            char tip = tipusPar.get(count);
                            t.add(tip);

                            // Carreguem els paràmetres, que ocuparan les primeres posicions de la zona de variables
                            if(isEntSor.get(count)) {
                                trad.add(x.ALOAD);
                                trad.add(Long.valueOf(count));
                                trad.add(x.BIPUSH);
                                trad.add(0L);
                                if(tip == 'R'){
                                    trad.add(x.FALOAD);
                                    trad.add(x.FSTORE);
                                }
                                else {
                                    //Només hi ha diferència per arrays
                                    if(tip == 'E') trad.add(x.IALOAD);
                                    else  trad.add(x.BALOAD);
                                    trad.add(x.ISTORE);
                                }
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

                    Long addrFunc = x.addFunctionDef($a1.getText(),s+')'+'V');
                    TSDef.inserir($a1.getText(), new Registre($a1.getText(), tipusPar, addrFunc,isEntSor));
					TS.inserir($a1.getText(), new Registre($a1.getText(), tipusPar, addrFunc,isEntSor));
            }
        (bloc_declaracio_var_def)?
        ( t2 = sentencia {
            trad.addAll($t2.trad);
        })*
        TK_PC_FACCIO {
            int i = 0;
            for (int count = 0; count < isEntSor.size(); count++) {
                if(isEntSor.get(count)) {
                    trad.add(x.ALOAD);
                    trad.add(Long.valueOf(count));
                    trad.add(x.BIPUSH);
                    trad.add(0L);
                    char tip = tipusPar.get(count+1);
                    if(tip == 'R') trad.add(x.FLOAD);
                    else trad.add(x.ILOAD);
                    trad.add(Long.valueOf(poseES.get(i)));
                    if(tip == 'R') trad.add(x.FASTORE);
                    else if (tip == 'E') trad.add(x.IASTORE);
                    else trad.add(x.BASTORE);
                    i++;
                }
            }
            trad.add(x.RETURN);

            x.addFunctionCode(addrFunc,500L,500L,trad);
            TS = new SymTable<Registre>(1000);
            TS.TS.putAll(TSDef.TS);
            varCount = 0L;
        };

funcio: TK_PC_FUNCIO a1 = TK_IDENT TK_LPAREN
        {
            ArrayList<Character> tipusPar = new ArrayList<>();
            ArrayList<String> nomPar = new ArrayList<>();
            ArrayList<Boolean> isEntSor = new ArrayList<>();
            ArrayList<Long> poseES = new ArrayList<>();
            Vector<Long> trad = new Vector<>();
        }
        ((TK_PC_ENTRADA {isEntSor.add(false);} | TK_PC_ENTRADA_SORTIDA {isEntSor.add(true);})? id1 = TK_IDENT ':' tip = TK_TIPUS_BASIC
        {
            tipusPar.add(tipusAChar($tip.getText()));
            nomPar.add($id1.getText());
            if(tipusPar.size() > isEntSor.size()) {
                isEntSor.add(false);
            }
        }
        (','(TK_PC_ENTRADA {isEntSor.add(false);} | TK_PC_ENTRADA_SORTIDA {isEntSor.add(true);})? id2 = TK_IDENT ':' tip2 = TK_TIPUS_BASIC
        {
            tipusPar.add(tipusAChar($tip2.getText()));
            nomPar.add($id2.getText());
            if(tipusPar.size() > isEntSor.size()) {
                isEntSor.add(false);
            }
        })*)? TK_RPAREN TK_PC_RETORNA a2 = TK_TIPUS_BASIC
        {
                char tipusRetorn = tipusAChar($a2.getText());
                String s = "(";
                varCount = Long.valueOf(tipusPar.size());

                for (int count = 0; count < tipusPar.size(); count++) {
                    if(isEntSor.get(count)) s = s + '[';
                    s = s + tipusACharBytecode(tipusPar.get(count));

                    if(TS.existeix(nomPar.get(count))){
                        errorParametreDuplicat(nomPar.get(count));
                    }
                    else {
                        ArrayList<Character> t = new ArrayList<>();
                        char tip = tipusPar.get(count);
                        t.add(tip);

                        // Carreguem els paràmetres, que ocuparan les primeres posicions de la zona de variables
                        if(isEntSor.get(count)) {
                            trad.add(x.ALOAD);
                            trad.add(Long.valueOf(count));
                            trad.add(x.BIPUSH);
                            trad.add(0L);
                            if(tip == 'R'){
                                trad.add(x.FALOAD);
                                trad.add(x.FSTORE);
                            }
                            else {
                                //Només hi ha diferència per arrays
                                if(tip == 'E') trad.add(x.IALOAD);
                                else  trad.add(x.BALOAD);
                                trad.add(x.ISTORE);
                            }
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

                Long addrFunc = x.addFunctionDef($a1.getText(),s+')'+tipusACharBytecode(tipusRetorn));
                TSDef.inserir($a1.getText(), new Registre($a1.getText(), tipusPar, addrFunc, isEntSor));
				TS.inserir($a1.getText(), new Registre($a1.getText(), tipusPar, addrFunc, isEntSor));
        }
        bloc_declaracio_var_def?
        ( t2 = sentencia {
            trad.addAll($t2.trad);
        })*
        TK_PC_RETORNA a3 = e TK_SEMI
        TK_PC_FFUNCIO {
            char expected = tipusAChar($a2.getText());
            if(expected != $a3.tipus.get($a3.tipus.size()-1)){
                errorTipus($a3.line, expected, $a3.tipus.get(0));
            }

            int i = 0;
            for (int count = 0; count < isEntSor.size(); count++) {
                if(isEntSor.get(count)) {
                    trad.add(x.ALOAD);
                    trad.add(Long.valueOf(count));
                    trad.add(x.BIPUSH);
                    trad.add(0L);
                    char tip = tipusPar.get(count+1);
                    if(tip == 'R') trad.add(x.FLOAD);
                    else trad.add(x.ILOAD);
                    trad.add(Long.valueOf(poseES.get(i)));
                    if(tip == 'R') trad.add(x.FASTORE);
                    else if (tip == 'E') trad.add(x.IASTORE);
                    else trad.add(x.BASTORE);
                    i++;
                }
            }

            trad.addAll($a3.trad);
            if(expected == 'R') trad.add(x.FRETURN);
            else trad.add(x.IRETURN);
            x.addFunctionCode(addrFunc,500L,500L,trad);

            TS = new SymTable<Registre>(1000);
            TS.TS.putAll(TSDef.TS);
            varCount = 0L;
        };
bloc_declaracio_var_def: TK_PC_VARIABLES declaracio_var*
                            TK_PC_FVARIABLES;
declaracio_var: { ArrayList<String> vars = new ArrayList<>();}
                (nom = TK_IDENT {
                    if(TS.existeix($nom.getText())){
                        errorVariableJaDefinida($nom);
                    }
                    else {
                        vars.add($nom.getText());
                    }
                }(',' nom2 = TK_IDENT {
                        if(TS.existeix($nom2.getText()) || vars.contains($nom2.getText())){
                            errorVariableJaDefinida($nom2);
                        }
                        else {
                            vars.add($nom2.getText());
                        }
                    }
                    )* ':' tipus = TK_TIPUS_BASIC {
                    for(int i = 0; i < vars.size(); i++) {
                        ArrayList<Character> t = new ArrayList<>();
                        t.add(tipusAChar($tipus.getText()));
                        TS.inserir(vars.get(i), new Registre(vars.get(i),t,varCount++));
                    }
                    vars.clear();
                }TK_SEMI);
//sentencia
sentencia returns [Vector<Long> trad]
@init   {
    $trad=new Vector<Long>(10);
    } :
    declaracio_var+
    |TK_PC_SI a = e {Vector<Long> trad2 = new Vector<Long>(10);Vector<Long> trad3 = new Vector<Long>(10);}
    TK_PC_LLAVORS (s1 = sentencia {trad2.addAll($s1.trad);})+
    (TK_PC_ALTRAMENT (s2 = sentencia {trad3.addAll($s2.trad);})+)? TK_PC_FSI {
        if($a.tipus.get(0) == 'B'){
            $trad=$a.trad;
            $trad.add(x.IFEQ);
            Long salt=trad2.size()+6L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.addAll(trad2);
            $trad.add(x.GOTO);
            salt=trad3.size()+3L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.addAll(trad3);
        }
        else{
            errorTipus($a.line, 'B', $a.tipus.get(0));
        }
    }
    | TK_PC_PER b1 = TK_IDENT {Vector<Long> trad2 = new Vector<Long>(10);}
        TK_PC_DE b2 = e TK_PC_FINS b3 = e {
            if(!TS.existeix($b1.getText())){
                ArrayList<Character> al = new ArrayList<>();
                al.add('E');
                Registre reg = new Registre($b1.getText(),al,varCount++);
                TS.inserir($b1.getText(), reg);
            }
        }
        TK_PC_FER (s = sentencia {
            trad2.addAll($s.trad);
        })* TK_PC_FPER {
            Registre reg = TS.obtenir($b1.getText());
            if(reg.tipus.get(0) == 'E'){
                if($b2.tipus.get(0) == 'E'){
                    if($b3.tipus.get(0) == 'E'){
                        $trad=$b2.trad; // Posem el valor inicial a la pila
                        $trad.add(x.ISTORE);
                        $trad.add(Long.valueOf(reg.getAdreca()));
                        // Adreça de l'iterador conté inici
                        $trad.add(x.ILOAD);
                        $trad.add(Long.valueOf(reg.getAdreca()));
                        // Carreguem la traducció de b3 i comparem
                        $trad.addAll($b3.trad);
                        $trad.add(x.IF_ICMPGT);
                        Long salt = 6L + trad2.size() + 6L;
                        $trad.add(x.nByte(salt,2));
                        $trad.add(x.nByte(salt,1));
                        // Executem sentencia
                        $trad.addAll(trad2);
                        // Incrementem it
                        $trad.add(x.ILOAD);
                        $trad.add(Long.valueOf(reg.getAdreca()));
                        $trad.add(x.ICONST_1);
                        $trad.add(x.IADD);
                        // Guardem el valor de l'iterador
                        $trad.add(x.ISTORE);
                        $trad.add(Long.valueOf(reg.getAdreca()));
                        $trad.add(x.GOTO);
                        salt = 0L - trad2.size() - $b3.trad.size() - 11L;
                        $trad.add(x.nByte(salt,2));
                        $trad.add(x.nByte(salt,1));
                    }
                    else{
                        errorTipus($b3.line, 'E', $b3.tipus.get(0));
                    }
                }
                else{
                    errorTipus($b2.line, 'E', $b2.tipus.get(0));
                }
            }
            else{
                errorTipus($b1, 'E', reg.tipus.get(0));
            }
           }
    | TK_PC_MENTRE c = e {Vector<Long> trad2 = new Vector<Long>(10);}
    TK_PC_FER (s1 = sentencia {trad2.addAll($s1.trad);})+ TK_PC_FMENTRE {
         if($c.tipus.get(0) == 'B'){
            $trad.addAll($c.trad);
            $trad.add(x.IFEQ);
            Long salt = 6L + trad2.size();
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.addAll(trad2);
            salt = 0L - $trad.size();
            $trad.add(x.GOTO);
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
         }
         else{
             errorTipus($c.line, 'B', $c.tipus.get(0));
         }
     }
    | d1 = TK_IDENT TK_OP_ASSIG d2 = e TK_SEMI {
        if(TS.existeix($d1.text)){
            Registre reg = TS.obtenir($d1.text);
            char tReg = reg.tipus.get(0);
            if(tReg == 'V' || tReg == 'T'){
                errorAssignacio($d1);
            }
            else if(esSuperTipus(tReg, $d2.tipus.get($d2.tipus.size()-1))){
                $trad.addAll($d2.trad);
                if(tReg == 'R') {
                    if($d2.tipus.get(0) != 'R') $trad.add(x.I2F);
                    $trad.add(x.FSTORE);
                }
                else $trad.add(x.ISTORE);
                $trad.add(Long.valueOf(reg.getAdreca()));
            }
            else if ($d2.tipus.get(0) != 'A'){
                errorTipus($d1, tReg, $d2.tipus.get(0));
            }
        }
        else {
            //Això ara permet assignar variables sense declarar
            ArrayList<Character> tipus = new ArrayList<>();
            tipus.add($d2.tipus.get($d2.tipus.size()-1));
            if(tipus.get(0) == 'V' || tipus.get(0) == 'T'){
                errorAssignacio($d1);
            }
            else{
                Registre reg = new Registre($d1.getText(),tipus,varCount++);
                TS.inserir($d1.getText(), reg);
                $trad.addAll($d2.trad);
                if($d2.tipus.get(0) == 'R') $trad.add(x.FSTORE);
                else $trad.add(x.ISTORE);
                $trad.add(Long.valueOf(reg.getAdreca()));
            }

        }
    }
    | e1 = TK_IDENT {
        $trad = new Vector<Long>();
        Long adr = -1L;
        Registre reg = null;
        int i = 0;
        char tipusVec = '0';
        if(TS.existeix($e1.getText())){
            reg = TS.obtenir($e1.getText());
            if(reg.tipus.get(0) != 'V') errorTipus($e1, 'V', reg.tipus.get(0));
            tipusVec = reg.tipus.get(reg.tipus.size()-1);
            adr = reg.getAdreca();

        }
        else {
            errorVariableInexistent($e1);
        }
        $trad.add(x.ALOAD);
        $trad.add(adr);

    }(TK_OP_OVEC e2 = e TK_OP_CVEC {
        $trad.addAll($e2.trad);
        if(reg.inicis.size() > 0){
            $trad.add(x.BIPUSH);
            $trad.add(Long.valueOf(reg.inicis.get(i))); //Offset inicis
            $trad.add(x.ISUB);
        }
        if(i >= reg.mides.size()){
            errorAccesDimensionsIncorrectes($e1, reg.mides.size());
        }
        else if(i < reg.mides.size() - 1){
            $trad.add(x.AALOAD);
        }
        //else -> No cal fer res, ja ve implicit quan fem $e3.trad
        i++;
    })+ TK_OP_ASSIG e3 = e {
        if(i < reg.mides.size()){
            errorAccesDimensionsIncorrectes($e1, reg.mides.size());
        }
        else if(!esSuperTipus(tipusVec,$e3.tipus.get($e3.tipus.size() - 1))){
            errorTipus($e3.line, tipusVec, $e3.tipus.get($e3.tipus.size() - 1));
        }
        $trad.addAll($e3.trad);
        $trad.add(x.IASTORE);
    } TK_SEMI
    | f1 = TK_IDENT '.' f2 = TK_IDENT TK_OP_ASSIG f3 = e TK_SEMI {
        String c = $f1.getText() + "." + $f2.getText();

        if(TS.existeix($f1.getText())){
            if (TS.existeix(c)) {
                Registre reg = TS.obtenir(c);
                char tReg = reg.tipus.get(0);
                if(tReg == 'V' || tReg == 'T'){
                    errorAssignacio($f2);
                }
                else if(esSuperTipus(tReg, $f3.tipus.get(0))){
                    $trad.addAll($f3.trad);
                    if(tReg == 'R') {
                        if($f3.tipus.get(0) != 'R') $trad.add(x.I2F);
                        $trad.add(x.FSTORE);
                    }
                    else $trad.add(x.ISTORE);
                    $trad.add(Long.valueOf(reg.getAdreca()));
                }
                else{
                    errorTipus($f2, tReg, $f3.tipus.get(0));
                }
            }
            else {
                errorVariableInexistent($f2);
            }
        }
        else {
            errorVariableInexistent($f1);
        }
    }
    | g1 = TK_IDENT {
        ArrayList<Character> paramsLlegits = new ArrayList<>();
        ArrayList<Long> entsorVars = new ArrayList<>();
        ArrayList<Long> originalAddr = new ArrayList<>();
        int p = 0;
        Registre reg = null;
        if (TS.existeix($g1.text)){
            reg = TS.obtenir($g1.text);
        }
        else {
            errorCridaInexistent($g1);
            error = true;
        }
    } TK_LPAREN (g2 = e {
        paramsLlegits.add($g2.tipus.get($g2.tipus.size()-1));

        if(reg.isEntSor.get(p)) { // Si la variable és E/S
            Long l = varCount++;
            entsorVars.add(l);

            $trad.add(x.BIPUSH);
            $trad.add(1L);
            $trad.add(x.NEWARRAY);
            char tip = reg.tipus.get(p+1);
            $trad.add(getVectorType(tip)); //tipus del vector
            $trad.add(x.ASTORE);
            $trad.add(l);

            $trad.add(x.ALOAD);
            $trad.add(l);
            $trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
            $trad.add(0L);
            $trad.addAll($g2.trad);
            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
            if(tip == 'R') $trad.add(x.FASTORE);
            else if(tip == 'E') $trad.add(x.IASTORE); // ArrayRef, Index, Val
            else $trad.add(x.BASTORE);

            // Carreguem array perque l'agafi per paràmetre
            $trad.add(x.ALOAD);
            $trad.add(l);
            if($g2.addrVar != null) {
                originalAddr.add($g2.addrVar);
            }
            else {
                originalAddr.add(-1L);
            }
        }
        else {
            originalAddr.add(-1L);
            $trad.addAll($g2.trad);
            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
        }
        p++;
    }(','g3 = e {
        paramsLlegits.add($g3.tipus.get($g3.tipus.size()-1));

        if(reg.isEntSor.get(p)) { // Si la variable és E/S
            Long l = varCount++;
            entsorVars.add(l);

            $trad.add(x.BIPUSH);
            $trad.add(1L);
            $trad.add(x.NEWARRAY);
            char tip = reg.tipus.get(p+1);
            $trad.add(getVectorType(tip)); //tipus del vector
            $trad.add(x.ASTORE);
            $trad.add(l);

            $trad.add(x.ALOAD);
            $trad.add(l);
            $trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
            $trad.add(0l);
            $trad.addAll($g3.trad);
            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
            if(tip == 'R') $trad.add(x.FASTORE);
            else if(tip == 'E') $trad.add(x.IASTORE); // ArrayRef, Index, Val
            else $trad.add(x.BASTORE);
            $trad.add(x.ALOAD);
            $trad.add(l);

            if($g3.addrVar != null) {
                originalAddr.add($g3.addrVar);
            }
            else {
                originalAddr.add(-1L);
            }
        }
        else {
            originalAddr.add(-1L);
            $trad.addAll($g3.trad);
            if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
        }
        p++;
    })*)? TK_RPAREN TK_SEMI{
        int i = 0;
        if (reg.tipus.get(0) == 'A') {
            if (paramsLlegits.size()+1 != reg.tipus.size()) {
                System.err.println("Error, l'accio \"" + $g1.getText() + "\" esperava un nombre diferent de parametres.");
                error = true;
            }
            while(i < paramsLlegits.size()) {
                if (!esSuperTipus(reg.tipus.get(i+1), paramsLlegits.get(i))) {
                    errorTipusParametreIncorrecte($g1, i+1, reg.tipus.get(i+1), paramsLlegits.get(i));
                }
                i++;
            }
        }
        else if (reg.tipus.get(0) == 'F') {
            if (paramsLlegits.size()+2 != reg.tipus.size()) {
                System.err.println("Error, la funció " + $g1.getText() + " esperava un nombre diferent de parametres.");
                error = true;
            }
            while(i < paramsLlegits.size()) {
                if (!esSuperTipus(reg.tipus.get(i+1), paramsLlegits.get(i))) {
                    errorTipusParametreIncorrecte($g1, i+1, reg.tipus.get(i+1), paramsLlegits.get(i));
                }
                i++;
            }
        }

        if (error == false) {
            $trad.add(x.INVOKESTATIC);
            $trad.add(x.nByte(Long.valueOf(reg.getAdreca()),2));
            $trad.add(x.nByte(Long.valueOf(reg.getAdreca()),1));

            int es = 0;
            // Hem de posar als vectors les variables d'entrada-sortida que es troben als paràmetres.
            for(int j = 0; j< paramsLlegits.size(); j++){
                if(reg.isEntSor.get(j) && originalAddr.get(j) != -1L) {
                    $trad.add(x.ALOAD);
                    $trad.add(entsorVars.get(es)); // Variable que conté l'array
                    $trad.add(x.BIPUSH); // Pos 0 de l'array
                    $trad.add(0L);
                    char tip = reg.tipus.get(j+1);
                    if(tip == 'R') {
                        $trad.add(x.FALOAD);
                        if(paramsLlegits.get(j) == 'R') $trad.add(x.FSTORE);
                        else{
                            $trad.add(x.F2I);
                            $trad.add(x.ISTORE);
                        }
                    }
                    else{
                        if(tip == 'E') $trad.add(x.IALOAD);
                        else $trad.add(x.BALOAD);
                        $trad.add(x.ISTORE);
                    }
                    $trad.add(originalAddr.get(j)); // Num de paràmetre actual
                    es++;
                }
            }
        }
    }
    | h = inst_lectura {$trad = $h.trad;}
    | i = inst_escriptura {$trad = $i.trad;}
    ;
inst_lectura returns [ArrayList<Character> tipus, Vector<Long> trad]
@init   {
    $tipus = new ArrayList<Character>();
    $trad=new Vector<Long>(10);
    }:
    TK_FUNC_LLEGIR TK_LPAREN a1 = TK_IDENT ('.' b = TK_IDENT)?{
        Character tip = '0';
        Vector<String> v = new Vector<>();
    } (':' a2 = TK_TIPUS_BASIC {
        v.add($a2.getText());
    })? TK_RPAREN TK_SEMI {
        Character tipusALlegir = null;
        Registre reg = null;

        if(TS.existeix($a1.getText())){
            if($b != null) reg = TS.obtenir($a1.getText() + "." + $b.getText());
            else reg = TS.obtenir($a1.getText());
            tip = reg.tipus.get(0);
            v.add(tipusAString(tip));
            if(v.size()>0 && !esSuperTipus(tip, tipusAChar(v.get(0)))){
                errorTipus($a1, tip, tipusAChar(v.get(0)));
                error = true;
            }
            else {
                tipusALlegir = tipusAChar(v.get(0));
            }
        }
        else{
            ArrayList<Character> tipus2 = new ArrayList<>();
            if(v.size()<=0){
                System.err.println("S'esperava un tipus a la linia " + $a1.getLine() + ", despres de " + $a1.getText() + ".");
                error = true;
            }
            else{
                tipusALlegir = tipusAChar(v.get(0));
                tipus2.add(tipusALlegir);
                reg = new Registre($a1.getText(), tipus2, varCount++);
                TS.inserir($a1.text, reg);
            }
        }
        $trad.add(x.INVOKESTATIC);

        switch (tipusALlegir) {
            case 'E':
                $trad.add(x.nByte(x.mGetInt,2));
                $trad.add(x.nByte(x.mGetInt,1));
                if(tip == 'R') {
                    $trad.add(x.I2F);
                    $trad.add(x.FSTORE);
                }
                else $trad.add(x.ISTORE);
                break;
            case 'R':
                $trad.add(x.nByte(x.mGetFloat,2));
                $trad.add(x.nByte(x.mGetFloat,1));
                $trad.add(x.FSTORE);
                break;
            case 'B':
                $trad.add(x.nByte(x.mGetBoolean,2));
                $trad.add(x.nByte(x.mGetBoolean,1));
                $trad.add(x.ISTORE);
                break;
            default:
                System.err.println("El tipus " + tipusAString(tipusALlegir) + " no esta contemplat per la lectura.");
                error = true;
                break;
        }
        $trad.add(Long.valueOf(reg.getAdreca()));
    };

inst_escriptura returns [ArrayList<Character> tipus, Vector<Long> trad, Vector<Object> tradMix]
@init{Boolean ln = false;
      String str = "";
      $tipus = new ArrayList<Character>();
      $trad=new Vector<Long>(10);
      int nElements = 0;
      }:
    (TK_FUNC_ESCRIURE {ln = false;} | TK_FUNC_ESCRIURELN {ln = true;})
     TK_LPAREN s1 = e {
         $trad.addAll($s1.trad);
         if($s1.tipus.size()<=0) {
            System.err.println("Tipus no definit a la linia " + $s1.line + ".");
            error = true;
         }
         else {
            afegirInstruccionsEscriure($trad, $s1.tipus.get($s1.tipus.size()-1));
            nElements++;
         }
     }
     (',' s2 = e {
         $trad.addAll($s2.trad);
         afegirInstruccionsEscriure($trad, $s2.tipus.get(0));
         nElements++;
     })* TK_RPAREN TK_SEMI {
         $tipus.add('A');
         //En cas que hi hagi d'haver un salt de linia
         if(ln){
            $trad.add(x.LDC_W);
            $trad.add(x.nByte(saltLinia,2));
            $trad.add(x.nByte(saltLinia,1));
            $trad.add(x.INVOKESTATIC);
            $trad.add(x.nByte(x.mPutString,2));
            $trad.add(x.nByte(x.mPutString,1));
         }
     };

/** EXPRESSIONS */

// Op unary té més prioritat que les binaries, que tenen més prioritat que les ternaries (ifthenelse)
e returns [ArrayList<Character> tipus, Vector<Long> trad, int line, Long addrVar]
@init   {
    $tipus = new ArrayList<Character>();
    $trad = new Vector<Long>(10);
    $addrVar = null;
    }:
    str = TK_STRING {
        $tipus.add('S');
        String str = $str.getText().substring(1, $str.getText().length() - 1);
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
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(saltLinia,2));
                $trad.add(x.nByte(saltLinia,1));
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mPutString,2));
                $trad.add(x.nByte(x.mPutString,1));
            }
            else{
                Long l = x.addConstant("S", element);
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(l,2));
                $trad.add(x.nByte(l,1));
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mPutString,2));
                $trad.add(x.nByte(x.mPutString,1));
            }
        }
    }
    |
    TK_LPAREN a = e {
        $tipus = $a.tipus;
        $trad = $a.trad;
        $line = $a.line;
        $addrVar = $a.addrVar;
    } TK_RPAREN
    | b = e_num {
        $tipus = $b.tipus;
        $trad = $b.trad;
        $line = $b.line;
    }
    | c = e_bool {
        $tipus = $c.tipus;
        $trad = $c.trad;
        $line = $c.line;
    }
    | d = TK_IDENT {
        if(TS.existeix($d.getText())){
            Registre reg = TS.obtenir($d.text);
            $tipus = reg.tipus;
            Long adreca = Long.valueOf(reg.adreca);
            if($tipus.get(0) == 'R') $trad.add(x.FLOAD);
            else $trad.add(x.ILOAD);
            $trad.add(Long.valueOf(adreca));
            $line = $d.line;
            $addrVar = adreca;
        }
        else{
            errorVariableInexistent($d);
        }
    }
    | f = TK_OP_NO f1 = e {
        $line = $f.getLine();
        if($f1.tipus.get($f1.tipus.size()-1)=='B'){
            $tipus.add('B');
            $trad.addAll($f1.trad);
            $trad.add(x.ICONST_1);
            $trad.add(x.IADD);
            $trad.add(x.ICONST_2);
            $trad.add(x.IREM);
        }
        else {
            errorTipus($f1.line, 'B', $f1.tipus.get($f1.tipus.size()-1));
        }
    }
    | op = TK_OP_MINUS_UN op2 = e {
            char t = $op2.tipus.get($op2.tipus.size()-1);
            if(t == 'E'){
                $line = $f.line;
                $tipus.add('E');
                $trad.addAll($op2.trad);
                $trad.add(x.INEG);
            }
            else if (t == 'R'){
                $line = $f.line;
                $tipus.add('R');
                $trad.addAll($op2.trad);
                $trad.add(x.FNEG);
            }
            else {
                errorTipus($f1.line, 'N', $op2.tipus.get($op2.tipus.size()-1));
            }
        }
    | g1 = e op = TK_OP_MULT g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            if(t1 == 'R') {
                if(t2 == 'R' || t2 == 'E') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    if(t2 != 'R') $trad.add(x.I2F);
                    $trad.add(x.FMUL);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else if (t1 == 'E'){
                if(t2 == 'R') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.FMUL);
                }
                else if (t2 == 'E') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    $trad.add(x.IMUL);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else {
               errorTipus($g1.line, 'N', t1);
            }
            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_DIV g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            if(t1 == 'R') {
                if(t2 == 'R' || t2 == 'E') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    if(t2 != 'R') $trad.add(x.I2F);
                    $trad.add(x.FDIV);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else if (t1 == 'E'){
                if(t2 == 'R') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.FDIV);
                }
                else if (t2 == 'E') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.I2F);
                    $trad.add(x.FDIV);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else {
               errorTipus($g1.line, 'N', t1);
            }
            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_DIV_INT g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            if(t1 == 'R') {
                if(t2 == 'R' || t2 == 'E') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    if(t2 != 'R') $trad.add(x.I2F);
                    $trad.add(x.FDIV);
                    $trad.add(x.F2I);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else if (t1 == 'E'){
                if(t2 == 'R') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.FDIV);
                    $trad.add(x.F2I);
                }
                else if (t2 == 'E') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    $trad.add(x.IDIV);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else {
               errorTipus($g1.line, 'N', t1);
            }
            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_MOD g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            if(t1 == 'R') {
                if(t2 == 'R' || t2 == 'E') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    if(t2 != 'R') $trad.add(x.I2F);
                    $trad.add(x.FREM);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else if (t1 == 'E'){
                if(t2 == 'R') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.FREM);
                }
                else if (t2 == 'E') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    $trad.add(x.IREM);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else {
               errorTipus($g1.line, 'N', t1);
            }
            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_PLUS g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            if(t1 == 'R') {
                if(t2 == 'R' || t2 == 'E') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    if(t2 != 'R') $trad.add(x.I2F);
                    $trad.add(x.FADD);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else if (t1 == 'E'){
                if(t2 == 'R') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.FADD);
                }
                else if (t2 == 'E') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    $trad.add(x.IADD);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else {
               errorTipus($g1.line, 'N', t1);
            }
            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_MINUS g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            if(t1 == 'R') {
                if(t2 == 'R' || t2 == 'E') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    if(t2 != 'R') $trad.add(x.I2F);
                    $trad.add(x.FSUB);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else if (t1 == 'E'){
                if(t2 == 'R') {
                    $tipus.add('R');
                    $trad = $g1.trad;
                    $trad.add(x.I2F);
                    $trad.addAll($g2.trad);
                    $trad.add(x.FSUB);
                }
                else if (t2 == 'E') {
                    $tipus.add('E');
                    $trad = $g1.trad;
                    $trad.addAll($g2.trad);
                    $trad.add(x.ISUB);
                }
                else {
                   errorTipus($g2.line, 'N', t2);
                }
            }
            else {
               errorTipus($g1.line, 'N', t1);
            }
            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_NEQUAL g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if((t1 == 'B' || t1 == 'E') && (t2 == 'E' || t2 == 'B')) {
                $trad = $g1.trad;
                $trad.addAll($g2.trad);
                $trad.add(x.IF_ICMPEQ); //Si els operands són iguals, salta a posar 0
                Long salt = 7L; //6+1
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
                salt = 4L; //3+1
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
            }
            else if(t1 == 'R' || t2 == 'R') {
                $trad = $g1.trad;
                if (t1 == 'E' || t1 == 'B') $trad.add(x.I2F);

                $trad.addAll($g2.trad);
                if (t2 == 'E' || t2 == 'B') $trad.add(x.I2F);

                $trad.add(x.FCMPL); //Si iguals 0 (Fals), altrament 1 o -1 (Cert)
            }
            else {
               errorTipus($g2.line, t1, t2);
            }

            $line = $op.getLine();
            }
        | g1 = e op = TK_OP_SMALLER g2 = e{
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
                $trad = $g1.trad;
                $trad.addAll($g2.trad);
                $trad.add(x.IF_ICMPLT); //Si els operands són iguals, salta a posar 0
                Long salt = 7L; //6+1
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
                salt = 4L; //3+1
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
            }
            else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
                $trad = $g1.trad;
                if (t1 == 'E' || t1 == 'B') $trad.add(x.I2F);

                $trad.addAll($g2.trad);
                if (t2 == 'E' || t2 == 'B') $trad.add(x.I2F);

                $trad.add(x.FCMPL); // si a > b deixa un 1, i si són iguals hi deixa un 0
                $trad.add(x.INEG); // si a > b deixa un -1, i si són iguals hi deixa un 0
                $trad.add(x.I2F);
                $trad.add(x.ICONST_1);
                $trad.add(x.I2F);
                $trad.add(x.FCMPL);  // Si la negació havia donat 1 això donarà 0 i si no, -1
                $trad.add(x.ICONST_1);
                $trad.add(x.IADD); //Ara afegim 1
                //Si l'últim fcmpl havia deixat un 0, ara tindrem un 1
                //Altrament, hi tindrem un 0
            }
            else if (t1 != 'E' && t1 != 'R' && t1 != 'B'){
               errorTipus($g1.line, t1, 'N');
            }
            else {
               errorTipus($g2.line, t2, 'N');
            }

            $line = $op.getLine();
        }
        | g1 = e op = TK_OP_SMALLEREQ g2 = e{
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
                $trad = $g1.trad;
                $trad.addAll($g2.trad);
                $trad.add(x.IF_ICMPLE); //Si els operands són iguals, salta a posar 0
                Long salt = 7L; //6+1
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
                salt = 4L; //3+1
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
            }
            else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
                $trad = $g1.trad;
                if (t1 == 'E' || t1 == 'B') $trad.add(x.I2F);

                $trad.addAll($g2.trad);
                if (t2 == 'E' || t2 == 'B') $trad.add(x.I2F);

                $trad.add(x.FCMPL); // si a > b deixa un 1
                $trad.add(x.ICONST_1);
                $trad.add(x.ISUB); //Restem 1
                $trad.add(x.I2F);
                $trad.add(x.ICONST_0);
                $trad.add(x.I2F);
                $trad.add(x.FCMPL); //Comparem amb 0
                //Si el primer fcmlp havia donat 1, quedarà un 0 a la pila
                //Altrament, quedarà un -1
                $trad.add(x.INEG); // Així quedarà un 0 o un 1
            }
            else if (t1 != 'E' && t1 != 'R'){
               errorTipus($g1.line, t1, 'N');
            }
            else {
               errorTipus($g2.line, t2, 'N');
            }

            $line = $op.getLine();
        }
        | g1 = e op = TK_OP_GREATER g2 = e{
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
                $trad = $g1.trad;
                $trad.addAll($g2.trad);
                $trad.add(x.IF_ICMPGT); //Si els operands són iguals, salta a posar 0
                Long salt = 7L; //6+1
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
                salt = 4L; //3+1
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
            }
            else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
                $trad = $g1.trad;
                if (t1 == 'E' || t1 == 'B') $trad.add(x.I2F);

                $trad.addAll($g2.trad);
                if (t2 == 'E' || t2 == 'B') $trad.add(x.I2F);

                $trad.add(x.FCMPL); // si a < b deixa un -1, i si són iguals hi deixa un 0
                $trad.add(x.I2F);
                $trad.add(x.ICONST_1);
                $trad.add(x.I2F);
                $trad.add(x.FCMPL);  // Si havia donat 1 això donarà 0 i si no, -1
                $trad.add(x.ICONST_1);
                $trad.add(x.IADD); //Ara afegim 1
                //Si l'últim fcmpl havia deixat un 0, ara tindrem un 1
                //Altrament, hi tindrem un 0
            }
            else if (t1 != 'E' && t1 != 'R'){
               errorTipus($g1.line, t1, 'N');
            }
            else {
               errorTipus($g2.line, t2, 'N');
            }

            $line = $op.getLine();
        }
        | g1 = e op = TK_OP_GREATEREQ g2 = e{
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
                $trad = $g1.trad;
                $trad.addAll($g2.trad);
                $trad.add(x.IF_ICMPGE); //Si els operands són iguals, salta a posar 0
                Long salt = 7L; //6+1
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
                salt = 4L; //3+1
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
            }
            else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
                $trad = $g1.trad;
                if (t1 == 'E' || t1 == 'B') $trad.add(x.I2F);

                $trad.addAll($g2.trad);
                if (t2 == 'E' || t2 == 'B') $trad.add(x.I2F);

                $trad.add(x.FCMPL); // si a < b deixa un -1
                $trad.add(x.ICONST_1);
                $trad.add(x.IADD); //Sumem 1
                $trad.add(x.I2F);
                $trad.add(x.ICONST_0);
                $trad.add(x.I2F);
                $trad.add(x.FCMPL); //Comparem amb 0
                //Si el primer fcmlp havia donat -1 quedarà un 0 a la pila
                //Altrament quedarà un 1
            }
            else if (t1 != 'E' && t1 != 'R'){
               errorTipus($g1.line, t1, 'N');
            }
            else {
               errorTipus($g2.line, t2, 'N');
            }

            $line = $op.getLine();
        }
        | g1 = e op = TK_OP_AND g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if(t1 == 'B' && t2 == 'B') {
                $trad = $g1.trad;
                $trad.add(x.IFEQ); //Si el primer es 0, salta a posar 0 (fals)
                Long salt = 10L + $g2.trad.size();
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.addAll($g2.trad);
                $trad.add(x.IFEQ);
                salt = 7L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
                $trad.add(x.GOTO);
                salt = 4L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
            }
            else if (t1 != 'B'){
               errorTipus($g1.line, t1, 'B');
            }
            else {
               errorTipus($g2.line, t2, 'B');
            }

            $line = $op.getLine();
        }
        | g1 = e op = TK_OP_OR g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if(t1 == 'B' && t2 == 'B') {
                $trad = $g1.trad;
                $trad.add(x.IFNE); //Si el primer es 0, saltem
                Long salt = 10L + $g2.trad.size();
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.addAll($g2.trad);
                $trad.add(x.IFNE);
                salt = 7L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
                $trad.add(x.GOTO);
                salt = 4L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
            }
            else if (t1 != 'B'){
               errorTipus($g1.line, t1, 'B');
            }
            else {
               errorTipus($g2.line, t2, 'B');
            }

            $line = $op.getLine();
        }
        | g1 = e op = TK_OP_EQUAL g2 = e {
            $tipus = new ArrayList<Character>();
            char t1 = $g1.tipus.get($g1.tipus.size()-1);
            char t2 = $g2.tipus.get($g2.tipus.size()-1);

            $tipus.add('B');

            if((t1 == 'E' || t1 == 'B') && (t2 == 'E' || t2 == 'B')) {
                $trad = $g1.trad;
                $trad.addAll($g2.trad);
                $trad.add(x.IF_ICMPEQ); //Si els operands són iguals, salta a posar 1
                Long salt = 7L; //6+1
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_0);
                salt = 4L; //3+1
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.ICONST_1);
            }
            else if((t1 == 'R' && (t2=='E' || t2=='R' || t2=='B')) || (t2 == 'R' && (t1=='E' || t1=='B'))) {
                $trad = $g1.trad;
                if (t1 == 'E' || t1 == 'B') $trad.add(x.I2F);

                $trad.addAll($g2.trad);
                if (t2 == 'E' || t2 == 'B') $trad.add(x.I2F);

                $trad.add(x.FCMPL); //Si iguals 0, altrament 1 o -1
                //Sumem 1 i fem el mòdul entre 2 per negar el resultat (si teníem 0 queda 1, altrament queda 0)
                $trad.add(x.ICONST_1);
                $trad.add(x.IADD);
                $trad.add(x.ICONST_2);
                $trad.add(x.IREM);
                //Si es compleix el nequal, a la pila hi quedarà un 0
            }
            else {
               errorTipus($g2.line, t1, t2);
            }

            $line = $op.getLine();
        }
    | h1 = e TK_OP_QMARK h2 = e TK_COLON h3 = e {
        if($h1.tipus.get(0) == 'B'){
            if($h2.tipus.get(0) == $h3.tipus.get(0)){
                $tipus = $h2.tipus;

                $trad=$h1.trad;
                $trad.add(x.IFEQ);
                Long salt=$h2.trad.size()+6L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.addAll($h2.trad);
                $trad.add(x.GOTO);
                salt=$h3.trad.size()+3L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.addAll($h3.trad);
                $line = $h1.line;
            }
            else {
                errorTipus($h3.line, $h2.tipus.get(0), $h3.tipus.get(0));
            }
        }
        else{
            errorTipus($h1.line, 'B', $h1.tipus.get(0));
        }
    }
    | i1 = TK_IDENT {
            ArrayList<Character> paramsLlegits = new ArrayList<>();
            ArrayList<Long> entsorVars = new ArrayList<>();
            ArrayList<Long> originalAddr = new ArrayList<>(); // Contains the original address of the variables passed by parameter if it exists.
            int p = 0;
            Registre reg = null;
            if (TS.existeix($i1.text)){
                reg = TS.obtenir($i1.getText());
                $tipus = reg.tipus;
                if(reg.tipus.get(0) == 'A') errorAccioIncorrecta($i1);
            }
            else {
                errorCridaInexistent($i1);
                error = true;
            }
        } TK_LPAREN (i2 = e {
            paramsLlegits.add($i2.tipus.get($i2.tipus.size()-1));

            if(reg.isEntSor.get(p)) { // Si la variable és E/S
                Long l = varCount++;
                entsorVars.add(l);

                $trad.add(x.BIPUSH);
                $trad.add(1L);
                $trad.add(x.NEWARRAY);
                char tip = reg.tipus.get(p+1);
                $trad.add(getVectorType(tip)); //tipus del vector
                $trad.add(x.ASTORE);
                $trad.add(l);
                $trad.add(x.ALOAD);
                $trad.add(l);
                $trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
                $trad.add(0l);
                $trad.addAll($i2.trad);
                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
                if(tip == 'R') $trad.add(x.FASTORE);
                else if (tip == 'E') $trad.add(x.IASTORE);
                else $trad.add(x.BASTORE);


                $trad.add(x.ALOAD);
                $trad.add(l);

                if($i2.addrVar != null) {
                    originalAddr.add($i2.addrVar);
                }
                else {
                    originalAddr.add(-1L);
                }
            }
            else {
                originalAddr.add(-1L);
                $trad.addAll($i2.trad);
                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
            }
            p++;
        }(',' i3 = e {
            paramsLlegits.add($i3.tipus.get($i3.tipus.size()-1));

            if(reg.isEntSor.get(p)) { // Si la variable és E/S
                Long l = varCount++;
                entsorVars.add(l);
                $trad.add(x.BIPUSH);
                $trad.add(1L);
                $trad.add(x.NEWARRAY);
                char tip = reg.tipus.get(p+1);
                $trad.add(getVectorType(tip)); //tipus del vector
                $trad.add(x.ASTORE);
                $trad.add(l);

                $trad.add(x.ALOAD);
                $trad.add(l);
                $trad.add(x.BIPUSH); // Carreguem a la posició 0 el contingut de la variable
                $trad.add(0l);
                $trad.addAll($i3.trad);
                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
                if(tip == 'R') $trad.add(x.FASTORE);
                else if (tip == 'E') $trad.add(x.IASTORE);
                else $trad.add(x.BASTORE);

                $trad.add(x.ALOAD);
                $trad.add(l);

                if($i3.addrVar != null) {
                    originalAddr.add($i3.addrVar);
                }
                else {
                    originalAddr.add(-1L);
                }
            }
            else {
                originalAddr.add(-1L);
                $trad.addAll($i3.trad);
                if(paramsLlegits.get(paramsLlegits.size()-1) == 'E' & reg.tipus.get(paramsLlegits.size()) == 'R') $trad.add(x.I2F);
            }
            p++;
        })*)? TK_RPAREN {
            int i = 0;
            if (reg.tipus.get(0) == 'F') {
                if (paramsLlegits.size()+2 != reg.tipus.size()) {
                    System.err.println("Error, la funcio " + $i1.getText() + " esperava un nombre diferent de parametres.");
                    error = true;
                }
                while(i < paramsLlegits.size()) {
                    if (!esSuperTipus(reg.tipus.get(i+1), paramsLlegits.get(i))) {
                        errorTipusParametreIncorrecte($i1, i+1, reg.tipus.get(i+1), paramsLlegits.get(i));
                    }
                    i++;
                }
            }

            if (error == false) {
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(Long.valueOf(reg.getAdreca()),2));
                $trad.add(x.nByte(Long.valueOf(reg.getAdreca()),1));

                int es = 0;
                // Hem de posar als vectors les variables d'entrada-sortida que es troben als paràmetres.
                for(int j = 0; j< paramsLlegits.size(); j++){
                    if(reg.isEntSor.get(j) && originalAddr.get(j) != -1L) {
                        $trad.add(x.ALOAD);
                        $trad.add(entsorVars.get(es)); // Variable que conté l'array
                        $trad.add(x.BIPUSH); // Pos 0 de l'array
                        $trad.add(0L);
                        char tip = reg.tipus.get(j+1);
                        if(tip == 'R'){
                            $trad.add(x.FALOAD);
                            if(paramsLlegits.get(j) == 'R') $trad.add(x.FSTORE);
                            else{
                                $trad.add(x.F2I);
                                $trad.add(x.ISTORE);
                            }
                        }
                        else {
                            if(tip == 'E') $trad.add(x.IALOAD);
                            else $trad.add(x.BALOAD);
                            $trad.add(x.ISTORE);
                        }
                        $trad.add(originalAddr.get(es)); // Num de paràmetre actual
                        es++;
                    }
                }
            }
        }
    | j1 = TK_IDENT {
        $line = $j1.getLine();
        Long adr = -1L;
        int parametresLlegits = 0;
        ArrayList<Character> t;
        Registre reg = null;
        if(TS.existeix($j1.getText())){
            reg = TS.obtenir($j1.getText());
            t = reg.tipus;
            if(t.get(0) != 'V') {
                errorTipus($j1,'V',t.get(0));
            }
            ArrayList<Character> tip = new ArrayList<>();
            tip.add(t.get(t.size() - 1));
            $tipus = tip;
            adr = reg.getAdreca();
        }
        else{
            errorVariableInexistent($j1);
        }
        $trad.add(x.ALOAD);
        $trad.add(adr);
        int i = 0;
    }(TK_OP_OVEC j2 = e {
        if($j2.tipus.get($j2.tipus.size() - 1) != 'E'){
            errorTipus($j2.line,'E', $j2.tipus.get(0));
        }
        $trad.addAll($j2.trad);
        $trad.add(x.BIPUSH);
        $trad.add(Long.valueOf(reg.inicis.get(i)));
        $trad.add(x.ISUB);
        if(i < reg.mides.size() - 1){
            $trad.add(x.AALOAD);
        }
        else{
            $trad.add(x.IALOAD);
        }
        i++;
    } TK_OP_CVEC)+
    | k1 = TK_IDENT '.' k2 = TK_IDENT {
        String c = $k1.getText() + "." + $k2.getText();
        $line = $k1.getLine();
        if(TS.existeix($k1.getText())){
            if(TS.existeix(c)){
                Registre reg = TS.obtenir(c);
                $tipus = reg.tipus;
                Long adreca = Long.valueOf(reg.adreca);
                if($tipus.get(0) == 'R') $trad.add(x.FLOAD);
                else $trad.add(x.ILOAD);
                $trad.add(Long.valueOf(adreca));
                $line = $d.line;
            } else{
                errorVariableInexistent($k2);
            }
        }
        else{
            errorVariableInexistent($k1);
        }
    };

e_bool returns [ArrayList<Character> tipus, Vector<Long> trad, int line]
@init   {
    $tipus = new ArrayList<Character>();
    $trad=new Vector<Long>(10);
    }:
    a = TK_BOOL {
        $tipus.add('B');
        $trad.add(x.BIPUSH);
        //true = 1, false = 0
        Long lng = $a.getText().equals("Cert") ? 1L : 0L;
        $trad.add(lng);
        $line = $a.getLine();
    };

e_num returns [ArrayList<Character> tipus, Vector<Long> trad, int line]
@init   {
    $tipus = new ArrayList<Character>();
    $trad=new Vector<Long>(10);
    }:
    a = TK_REAL {
        $tipus.add('R');

        //Afegim el valor a la constant pool
        Long l = x.addConstant("F", $a.getText());
        $trad.add(x.LDC_W);
        $trad.add(x.nByte(l,2));
        $trad.add(x.nByte(l,1));
        $line = $a.getLine();
    }
   | b = TK_ENTER {
         $tipus.add('E');
         //Carreguem el valor a la pila
         $trad.add(x.BIPUSH);
         $trad.add(Long.valueOf($b.text));
         $line = $b.getLine();
   }
   ;

// Regles Lexiques

TK_WS: ( ' ' | '\t ' | '\n' | '\r' | '\t')+ -> skip;
TK_LPAREN : '(';
TK_RPAREN : ')';
TK_SEMI : ';';
TK_COMMA : ',';

//Operadors
TK_OP_PLUS : '+';
TK_OP_MINUS : '-';
TK_OP_MULT : '*';
TK_OP_DIV : '/';
TK_OP_DIV_INT : '\\';
TK_OP_MOD : '%';
TK_OP_MINUS_UN : '~';
TK_OP_EQUAL : '==';
TK_OP_NEQUAL : '!=';
TK_OP_SMALLER : '<';
TK_OP_SMALLEREQ : '<=';
TK_OP_GREATER : '>';
TK_OP_GREATEREQ : '>=';
TK_OP_NO : 'no';
TK_OP_AND : '&';
TK_OP_OR : '|';
TK_OP_QMARK : '?';
TK_COLON : ':';
TK_OP_OVEC : '[';
TK_OP_CVEC : ']';
TK_OP_GET : '.';
TK_OP_ASSIG : ':=';
//Paraules clau
TK_PC_PROGRAMA : 'programa';
TK_PC_FPROGRAMA : 'fprograma';
//TK_PC_PERIODE : 'periode';
//Mentre
TK_PC_MENTRE : 'mentre';
TK_PC_FMENTRE : 'fmentre';
TK_PC_FER : 'fer';
//Per
TK_PC_PER : 'per';
TK_PC_DE : 'de';
TK_PC_FINS : 'fins';
TK_PC_FPER : 'fper';
//Si
TK_PC_SI : 'si';
TK_PC_LLAVORS : 'llavors';
TK_PC_ALTRAMENT : 'altrament';
TK_PC_FSI: 'fsi';
//Altres PC
TK_PC_TIPUS : 'tipus';
TK_PC_FTIPUS : 'ftipus';
TK_PC_VECTOR : 'vector';
TK_PC_MIDA : 'mida';
TK_PC_INICI : 'inici';
TK_PC_TUPLA : 'tupla';
TK_PC_FTUPLA : 'ftupla';
TK_PC_ACCIO : 'accio';
TK_PC_FACCIO : 'faccio';
TK_PC_FUNCIO : 'funcio';
TK_PC_FFUNCIO : 'ffuncio';
TK_PC_RETORNA : 'retorna';
TK_PC_VARIABLES : 'variables';
TK_PC_FVARIABLES : 'fvariables';
TK_PC_ENTRADA : 'ent';
TK_PC_ENTRADA_SORTIDA : 'entsor';
//Tipus Basics
TK_TIPUS_BASIC : 'bool' | 'enter' | 'real';
//Funcions del sistema
TK_FUNC_LLEGIR : 'llegir';
TK_FUNC_ESCRIURE : 'escriure';
TK_FUNC_ESCRIURELN : 'escriureln';
//Comentaris
TK_COMENTARI : ('//' .*? '\n'
                | '/*' .*? '*/') -> skip;
//Enters i identificadors
fragment
DIGIT : '1' .. '9';
fragment
LLETRA : 'a' .. 'z' | 'A' .. 'Z';
TK_ENTER : ('0' | DIGIT (DIGIT|'0')*);
TK_BOOL : 'Cert' | 'Fals';
TK_REAL :  (TK_ENTER | '0') '.' ('0' | DIGIT)+ ('E' ('-' | '+')? ('0' | TK_ENTER))? ;
TK_STRING : '"' .*? '"';
TK_IDENT : LLETRA (LLETRA | DIGIT | '0')*;
