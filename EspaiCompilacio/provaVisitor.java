// Generated from E:/UdG/4t/Compiladors/GitFolderP1/Compiladors-ANTLR/prova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link provaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface provaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link provaParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(provaParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#bloc_declaracio_tipus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_declaracio_tipus(provaParser.Bloc_declaracio_tipusContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_tipus(provaParser.Declaracio_tipusContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#declaracio_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_vector(provaParser.Declaracio_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#declaracio_tupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracio_tupla(provaParser.Declaracio_tuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#bloc_declaracio_accions_funcions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_declaracio_accions_funcions(provaParser.Bloc_declaracio_accions_funcionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#accio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccio(provaParser.AccioContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#funcio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncio(provaParser.FuncioContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#parametres_formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametres_formals(provaParser.Parametres_formalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#bloc_declaracio_var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc_declaracio_var_def(provaParser.Bloc_declaracio_var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#inst_lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_lectura(provaParser.Inst_lecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#inst_escriptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_escriptura(provaParser.Inst_escripturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#e_if_then_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_if_then_else(provaParser.E_if_then_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(provaParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#e_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_bool(provaParser.E_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#op_comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_comparator(provaParser.Op_comparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#op_binaryLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_binaryLogic(provaParser.Op_binaryLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#e_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_num(provaParser.E_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#e_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_entera(provaParser.E_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#e_real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_real(provaParser.E_realContext ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(provaParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link provaParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(provaParser.Op2Context ctx);
}