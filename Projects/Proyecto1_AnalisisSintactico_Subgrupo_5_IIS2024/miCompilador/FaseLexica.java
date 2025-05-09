import java.util.ArrayList;
import java.util.List;


public class FaseLexica {
    
    public FaseLexica() {
        
    }

    /*
     * 
     * Función encargada de realizar un analisis lexico al código fuente
     * escrito en un archivo
     * Entrada: Un string que representa el código fuente a analizar lexicamente
     * Salida: La lista de Tokens identificados en el código fuente
     * 
     */
    private TablaSimbolos tabla = new TablaSimbolos();
    public List<Token> analizar(String codigoFuente){

        boolean despSimbolo = false;
        
        List<Token> tokens = new ArrayList<>();
        int posicionActual = 0;
        int posicionAnterior = 0;
        char caracter;
        int longitud = codigoFuente.length();
        int estado=0;
        int numero_linea = 1;
        
        while(posicionActual < longitud){

            switch(estado){

                case -1:

                System.out.println(" Error [Fase Léxica]: La línea "+numero_linea +" error, lexema no reconocido: " + codigoFuente.substring(posicionAnterior, posicionActual+1));
                return null;

                case 0:

                caracter = codigoFuente.charAt(posicionActual);

                if (Character.isWhitespace(caracter)) {
                    
                    if(caracter == '\n'){
                        numero_linea++;
                    }

                    estado=0;
                    ++posicionActual;
                    posicionAnterior=posicionActual;
                }

                else
                {
                    
                    estado = 1;
                }
                break;


                //IDENTIFICADOR
                case 1:

                caracter = codigoFuente.charAt(posicionActual);
                if (Character.isWhitespace(caracter)) {
                    
                    estado=0;
                    ++posicionActual;
                }
                else 
                {

                    if (Character.isLetter(caracter)) {estado=2;++posicionActual;}
                    else {estado = 4;}
                }
                break;


                case 2:

                caracter = codigoFuente.charAt(posicionActual);
                if (Character.isWhitespace(caracter)) {
                        
                    estado=3;
                }
                   
                else if (Character.isLetter(caracter)) {
                        
                    estado = 2;
                    ++posicionActual;

                } 
                else if(!Character.isDigit(caracter)){
                    estado = 23;
                }
                else { estado = -1;};
                break;     

                
                // Estado de aceptación del identificador cuando lo siguiente es un simbolo (-, +, =, (, ), ;, *, /)
                // Su número es 23 porque es un estado intermedio entre el 2 y 3
                case 23:

                if(codigoFuente.substring(posicionAnterior, posicionActual).length() <= 12){
                    Token tokensito = new Token("IDENTIFICADOR",codigoFuente.substring(posicionAnterior, posicionActual));
                    if(tabla.buscar(tokensito.getValor()) != null){
                        InformacionSimbolo info = tabla.buscar(tokensito.getValor());
                        List<Integer> nrosLinea = info.getNrosLinea();
                        nrosLinea.add(numero_linea);
                        info.setNroLinea(nrosLinea);

                    }
                    else{
                        List<Integer> nrosLinea = new ArrayList<>();
                        nrosLinea.add(numero_linea);
                        tabla.agregar(tokensito.getValor(), new InformacionSimbolo("entero", nrosLinea,"global"));
                    }
                    
                    //despSimbolo = true;
                    
                    
    
                tokens.add(tokensito);
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: IDENTIFICADOR");
                posicionAnterior = posicionActual;
                estado=7;

                }
                else{

                    estado = -1;
                }

                break;


                // Aceptación identificador cuando lo siguiente es un whitespace
                case 3:

                if(codigoFuente.substring(posicionAnterior, posicionActual).length() <= 12){
                    Token tokensito = new Token("IDENTIFICADOR",codigoFuente.substring(posicionAnterior, posicionActual));
                    if(tabla.buscar(tokensito.getValor()) != null){
                        InformacionSimbolo info = tabla.buscar(tokensito.getValor());
                        List<Integer> nrosLinea = info.getNrosLinea();
                        nrosLinea.add(numero_linea);
                        info.setNroLinea(nrosLinea);
                        

                    }
                    else{
                        List<Integer> nrosLinea = new ArrayList<>();
                        nrosLinea.add(numero_linea);
                        tabla.agregar(tokensito.getValor(), new InformacionSimbolo("entero", nrosLinea,"global"));
                    }
                          
                tokens.add(tokensito);
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: IDENTIFICADOR");
                ++posicionActual;
                posicionAnterior = posicionActual;
                estado=0;

                }
                else{

                    estado = -1;
                }

                break; 

                 
                //NUMERO
                case 4:

                caracter = codigoFuente.charAt(posicionActual);
                if (Character.isWhitespace(caracter)) {

                    estado=0;
                } else
                {
                    
                    if (Character.isDigit(caracter)) { estado = 5; ++posicionActual;}
                    else if (Character.isWhitespace(caracter)) estado = 6;
                        
                    else estado = 7;
                }
                break;


                case 5:
                
                caracter = codigoFuente.charAt(posicionActual);
                if (Character.isWhitespace(caracter)) {
                    
                    estado=6;
                }
                else if (Character.isLetter(caracter)) {
                    estado = -1;
                }
                else if (Character.isDigit(caracter)) {
                    estado = 5;
                    ++posicionActual;
                }
                else estado = 67;
                break;                    


                // Aceptación número cuando lo siguiente es un whitespace
                case 6:

                tokens.add(new Token("NUMERO",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: NUMERO");
                ++posicionActual;
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                // Aceptación número cuando lo siguiente es un simbolo (-, +, =, (, ), ;, *, /)
                // Su número es 67 porque es un estado intermedio entre el 6 y el 7
                case 67:

                tokens.add(new Token("NUMERO",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: NUMERO");
                posicionAnterior = posicionActual;
                estado=7;   
                break;


                // Resto de simbolos
                case 7:
                
                caracter = codigoFuente.charAt(posicionActual);

                if (Character.isWhitespace(caracter)) {
                    
                    estado=0;
                    ++posicionActual;
                }

                else if (caracter == '=') {estado=8; ++posicionActual;}
                else if (caracter == '+') {estado=9;++posicionActual;}
                else if (caracter == '-') {estado=10; ++posicionActual;}
                else if (caracter == '*') {estado=11; ++posicionActual;}
                else if (caracter == '/') {estado=12; ++posicionActual;}
                else if (caracter == '(') {estado=13; ++posicionActual;}
                else if (caracter == ')') {estado=14; ++posicionActual;}
                else if (caracter == ';') {estado=15; ++posicionActual;}
                else{estado = -1;}
                break;


                case 8:
                despSimbolo = true;
                tokens.add(new Token("ASIGNACIÓN",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: ASIGNACION");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 9:
                despSimbolo = true;
                tokens.add(new Token("SUMA",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: SUMA");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 10:
                despSimbolo = true;
                tokens.add(new Token("RESTA",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: RESTA");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 11:
                despSimbolo = true;
                tokens.add(new Token("MULTIPLICACION",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: MULTIPLICACION");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 12:
                despSimbolo = true;
                tokens.add(new Token("DIVISION",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: DIVISION");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 13:
                despSimbolo = true;
                tokens.add(new Token("PARENTESIS_IZQ",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: PARENTESIS_IZQ");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 14:
                despSimbolo = true;
                tokens.add(new Token("PARENTESIS_DER",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: PARENTESIS_DER");
                posicionAnterior = posicionActual;
                estado=0;   
                break;


                case 15:
                despSimbolo = false;
                tokens.add(new Token("PUNTO_COMA",codigoFuente.substring(posicionAnterior, posicionActual)));
                System.out.println("Valor: " +codigoFuente.substring(posicionAnterior, posicionActual)+  ", " +"Tipo: PUNTO_COMA");
                posicionAnterior = posicionActual;
                estado=0;   
                break;

            }

        }
        //tabla.leer();
        return tokens;
    }

    public TablaSimbolos enviarTabla(){
        return tabla;
    }
    



}
