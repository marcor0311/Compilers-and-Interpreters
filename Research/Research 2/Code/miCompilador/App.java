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

        faseLexica lexer = new faseLexica();
        Archivo miArchivoFuente = new Archivo();
        List<Token> tokens = new ArrayList<>();
        String codigoFuente = miArchivoFuente.leer("../"+args[0]);
        tokens=lexer.analizar(codigoFuente);
        
    }
}
