import java.io.*;

import org.antlr.v4.runtime.*;


//Jordi LANS Compiler. Exemple de classe i metode main
public class main {


	public static void main(String args[]) throws Exception{
		if(args.length == 0){
			System.out.println("Es requereix un fitxer d'entrada");
			System.exit(0);
		}

		CharStream input = CharStreams.fromFileName(args[0]);
		compiladorLexer lexer = new compiladorLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		compiladorParser arrel = new compiladorParser(tokens);

		arrel.arrel();
		if(arrel.getNumberOfSyntaxErrors()==0){
			System.out.println("No errors");
		}
		else
			System.out.println("Errors");
	}

}
