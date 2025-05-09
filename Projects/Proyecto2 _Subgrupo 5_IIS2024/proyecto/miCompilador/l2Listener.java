// Generated from l2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link l2Parser}.
 */
public interface l2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link l2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(l2Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(l2Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(l2Parser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(l2Parser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(l2Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(l2Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#control_flujo}.
	 * @param ctx the parse tree
	 */
	void enterControl_flujo(l2Parser.Control_flujoContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#control_flujo}.
	 * @param ctx the parse tree
	 */
	void exitControl_flujo(l2Parser.Control_flujoContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(l2Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(l2Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(l2Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(l2Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(l2Parser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(l2Parser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(l2Parser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(l2Parser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(l2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(l2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#operador_aditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aditivo(l2Parser.Operador_aditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#operador_aditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aditivo(l2Parser.Operador_aditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_multiplicativo(l2Parser.Operador_multiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_multiplicativo(l2Parser.Operador_multiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(l2Parser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(l2Parser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(l2Parser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(l2Parser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(l2Parser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(l2Parser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(l2Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(l2Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link l2Parser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetra(l2Parser.LetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link l2Parser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetra(l2Parser.LetraContext ctx);
}