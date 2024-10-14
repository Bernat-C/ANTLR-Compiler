// Generated from C:/Users/girob/OneDrive/Documents/Udg/7e Semestre/Compiladors/Compiladors-ANTLR/compilador.g4 by ANTLR 4.13.1

    import java.io.*;
    import java.util.*;
    import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorParser}.
 */
public interface compiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladorParser#arrel}.
	 * @param ctx the parse tree
	 */
	void enterArrel(compiladorParser.ArrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#arrel}.
	 * @param ctx the parse tree
	 */
	void exitArrel(compiladorParser.ArrelContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloc_declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void enterBloc_declaracio_tipus(compiladorParser.Bloc_declaracio_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloc_declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void exitBloc_declaracio_tipus(compiladorParser.Bloc_declaracio_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_tipus(compiladorParser.Declaracio_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_tipus(compiladorParser.Declaracio_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracio_vector}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_vector(compiladorParser.Declaracio_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracio_vector}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_vector(compiladorParser.Declaracio_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracio_tupla}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_tupla(compiladorParser.Declaracio_tuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracio_tupla}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_tupla(compiladorParser.Declaracio_tuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloc_declaracio_accions_funcions}.
	 * @param ctx the parse tree
	 */
	void enterBloc_declaracio_accions_funcions(compiladorParser.Bloc_declaracio_accions_funcionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloc_declaracio_accions_funcions}.
	 * @param ctx the parse tree
	 */
	void exitBloc_declaracio_accions_funcions(compiladorParser.Bloc_declaracio_accions_funcionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#accio}.
	 * @param ctx the parse tree
	 */
	void enterAccio(compiladorParser.AccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#accio}.
	 * @param ctx the parse tree
	 */
	void exitAccio(compiladorParser.AccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#funcio}.
	 * @param ctx the parse tree
	 */
	void enterFuncio(compiladorParser.FuncioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#funcio}.
	 * @param ctx the parse tree
	 */
	void exitFuncio(compiladorParser.FuncioContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#parametres_formals}.
	 * @param ctx the parse tree
	 */
	void enterParametres_formals(compiladorParser.Parametres_formalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#parametres_formals}.
	 * @param ctx the parse tree
	 */
	void exitParametres_formals(compiladorParser.Parametres_formalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloc_declaracio_var_def}.
	 * @param ctx the parse tree
	 */
	void enterBloc_declaracio_var_def(compiladorParser.Bloc_declaracio_var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloc_declaracio_var_def}.
	 * @param ctx the parse tree
	 */
	void exitBloc_declaracio_var_def(compiladorParser.Bloc_declaracio_var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracio_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_var(compiladorParser.Declaracio_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracio_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_var(compiladorParser.Declaracio_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(compiladorParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(compiladorParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#inst_lectura}.
	 * @param ctx the parse tree
	 */
	void enterInst_lectura(compiladorParser.Inst_lecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#inst_lectura}.
	 * @param ctx the parse tree
	 */
	void exitInst_lectura(compiladorParser.Inst_lecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#inst_escriptura}.
	 * @param ctx the parse tree
	 */
	void enterInst_escriptura(compiladorParser.Inst_escripturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#inst_escriptura}.
	 * @param ctx the parse tree
	 */
	void exitInst_escriptura(compiladorParser.Inst_escripturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(compiladorParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(compiladorParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#e_bool}.
	 * @param ctx the parse tree
	 */
	void enterE_bool(compiladorParser.E_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#e_bool}.
	 * @param ctx the parse tree
	 */
	void exitE_bool(compiladorParser.E_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#e_num}.
	 * @param ctx the parse tree
	 */
	void enterE_num(compiladorParser.E_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#e_num}.
	 * @param ctx the parse tree
	 */
	void exitE_num(compiladorParser.E_numContext ctx);
}