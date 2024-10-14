// Generated from C:/Users/girob/OneDrive/Documents/Udg/7e Semestre/Compiladors/Compiladors-ANTLR/compilador.g4 by ANTLR 4.13.1

    import java.io.*;
    import java.util.*;
    import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladorParser#arrel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrel(compiladorParser.ArrelContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bloc_declaracio_tipus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_declaracio_tipus(compiladorParser.Bloc_declaracio_tipusContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_tipus(compiladorParser.Declaracio_tipusContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracio_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_vector(compiladorParser.Declaracio_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracio_tupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_tupla(compiladorParser.Declaracio_tuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bloc_declaracio_accions_funcions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_declaracio_accions_funcions(compiladorParser.Bloc_declaracio_accions_funcionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#accio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccio(compiladorParser.AccioContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#funcio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncio(compiladorParser.FuncioContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#parametres_formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametres_formals(compiladorParser.Parametres_formalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bloc_declaracio_var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_declaracio_var_def(compiladorParser.Bloc_declaracio_var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracio_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_var(compiladorParser.Declaracio_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(compiladorParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#inst_lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_lectura(compiladorParser.Inst_lecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#inst_escriptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_escriptura(compiladorParser.Inst_escripturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(compiladorParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#e_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_bool(compiladorParser.E_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#e_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_num(compiladorParser.E_numContext ctx);
}