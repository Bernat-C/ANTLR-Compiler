// Generated from E:/UdG/4t/Compiladors/GitFolderP1/Compiladors-ANTLR/prova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link provaParser}.
 */
public interface provaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link provaParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(provaParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(provaParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void enterBloc_declaracio_tipus(provaParser.Bloc_declaracio_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void exitBloc_declaracio_tipus(provaParser.Bloc_declaracio_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_tipus(provaParser.Declaracio_tipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#declaracio_tipus}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_tipus(provaParser.Declaracio_tipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#declaracio_vector}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_vector(provaParser.Declaracio_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#declaracio_vector}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_vector(provaParser.Declaracio_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#declaracio_tupla}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracio_tupla(provaParser.Declaracio_tuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#declaracio_tupla}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracio_tupla(provaParser.Declaracio_tuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_declaracio_accions_funcions}.
	 * @param ctx the parse tree
	 */
	void enterBloc_declaracio_accions_funcions(provaParser.Bloc_declaracio_accions_funcionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_declaracio_accions_funcions}.
	 * @param ctx the parse tree
	 */
	void exitBloc_declaracio_accions_funcions(provaParser.Bloc_declaracio_accions_funcionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#accio}.
	 * @param ctx the parse tree
	 */
	void enterAccio(provaParser.AccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#accio}.
	 * @param ctx the parse tree
	 */
	void exitAccio(provaParser.AccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#funcio}.
	 * @param ctx the parse tree
	 */
	void enterFuncio(provaParser.FuncioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#funcio}.
	 * @param ctx the parse tree
	 */
	void exitFuncio(provaParser.FuncioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#parametres_formals}.
	 * @param ctx the parse tree
	 */
	void enterParametres_formals(provaParser.Parametres_formalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#parametres_formals}.
	 * @param ctx the parse tree
	 */
	void exitParametres_formals(provaParser.Parametres_formalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bloc_declaracio_var_def}.
	 * @param ctx the parse tree
	 */
	void enterBloc_declaracio_var_def(provaParser.Bloc_declaracio_var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bloc_declaracio_var_def}.
	 * @param ctx the parse tree
	 */
	void exitBloc_declaracio_var_def(provaParser.Bloc_declaracio_var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#inst_lectura}.
	 * @param ctx the parse tree
	 */
	void enterInst_lectura(provaParser.Inst_lecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#inst_lectura}.
	 * @param ctx the parse tree
	 */
	void exitInst_lectura(provaParser.Inst_lecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#inst_escriptura}.
	 * @param ctx the parse tree
	 */
	void enterInst_escriptura(provaParser.Inst_escripturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#inst_escriptura}.
	 * @param ctx the parse tree
	 */
	void exitInst_escriptura(provaParser.Inst_escripturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#e_if_then_else}.
	 * @param ctx the parse tree
	 */
	void enterE_if_then_else(provaParser.E_if_then_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#e_if_then_else}.
	 * @param ctx the parse tree
	 */
	void exitE_if_then_else(provaParser.E_if_then_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(provaParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(provaParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#e_bool}.
	 * @param ctx the parse tree
	 */
	void enterE_bool(provaParser.E_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#e_bool}.
	 * @param ctx the parse tree
	 */
	void exitE_bool(provaParser.E_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#op_comparator}.
	 * @param ctx the parse tree
	 */
	void enterOp_comparator(provaParser.Op_comparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#op_comparator}.
	 * @param ctx the parse tree
	 */
	void exitOp_comparator(provaParser.Op_comparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#op_binaryLogic}.
	 * @param ctx the parse tree
	 */
	void enterOp_binaryLogic(provaParser.Op_binaryLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#op_binaryLogic}.
	 * @param ctx the parse tree
	 */
	void exitOp_binaryLogic(provaParser.Op_binaryLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#e_num}.
	 * @param ctx the parse tree
	 */
	void enterE_num(provaParser.E_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#e_num}.
	 * @param ctx the parse tree
	 */
	void exitE_num(provaParser.E_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#e_entera}.
	 * @param ctx the parse tree
	 */
	void enterE_entera(provaParser.E_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#e_entera}.
	 * @param ctx the parse tree
	 */
	void exitE_entera(provaParser.E_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#e_real}.
	 * @param ctx the parse tree
	 */
	void enterE_real(provaParser.E_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#e_real}.
	 * @param ctx the parse tree
	 */
	void exitE_real(provaParser.E_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(provaParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(provaParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(provaParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(provaParser.Op2Context ctx);
}