import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {
    public static void main(String[] args) throws IOException{
        CharStream input = CharStreams.fromFileName("input.txt");
        
        // Crear Lexer y Parser
        l2Lexer analizadorLexico = new l2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(analizadorLexico);
        l2Parser analizadorSintactico = new l2Parser(tokens);

        // Parsear el archivo y crear arbol
        ParseTree arbol = analizadorSintactico.programa();
        
        
        // Crear el listener y recorrer el árbol
        ParseTreeWalker walker = new ParseTreeWalker(); //recorre el arbol
        AnalizadorSemantico analizadorSemantico = new AnalizadorSemantico();
        walker.walk(analizadorSemantico, arbol); //se inicia el recorrido del arbol
        
    }
    
}
