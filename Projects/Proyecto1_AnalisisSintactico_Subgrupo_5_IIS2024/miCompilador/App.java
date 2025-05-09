import java.util.ArrayList;
import java.util.List;



public class App {
    public static void main(String[] args) {
        
        if(args.length==0){
            System.out.println("No se ingreso un archivo de entrada");
            return;
        }
        else if (args.length>1){
            System.out.println("Se ingresaron demasiados argumentos");
            return;
        }

        FaseLexica lexer = new FaseLexica();
        Archivo miArchivoFuente = new Archivo();
        List<Token> tokens = new ArrayList<>();

        String codigoFuente = miArchivoFuente.leer("../"+args[0]);
        System.out.println("");
        System.out.println("--- Fase Lexica ---");
        System.out.println("");
        tokens=lexer.analizar(codigoFuente);
        Archivo miArchivoTokens = new Archivo();
        miArchivoTokens.guardar("../tokens.txt",tokens.toString());

        TablaSimbolos tabla = lexer.enviarTabla();
        System.out.println("");
        System.out.println("--- Tabla de simbolos antes de la fase sintactica ---");
        System.out.println("");
        tabla.leer();

        System.out.println("--- Fase Sintactica ---");
        System.out.println("");
        FaseSintactica parser = new FaseSintactica(tabla);
        parser.Programa(tokens);
        
        tabla = parser.enviarTablaActualizada();
        System.out.println("");
        System.out.println("--- Tabla de simbolos despues de la fase sintactica ---");
        System.out.println("");
        tabla.leer();
        Archivo miArchivoTabla = new Archivo();
        miArchivoTabla.guardar("../TablaDeSimbolos.txt",tabla.getTabla().toString());

        
    }
}
