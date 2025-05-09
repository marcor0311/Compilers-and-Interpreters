import java.util.List;

public class FaseSintactica{

    // Variables utiles

    private int nroLinea = 1;

    private int posicion = 0;

    private TablaSimbolos tabla;

    private String ultimoId;

    // Constructor

    public FaseSintactica(TablaSimbolos tabla){
        this.tabla = tabla;
    }

    // Funcion encargada de hacer match con el token de entrada y lo que se espera que sea
    // Entrada: String de lo esperado y string de lo que se recibe
    // Salida: True si son iguales, false si no

    public boolean match(String esperado, String entrada){

        if(esperado == entrada){ return true;}
        else{return false;}
    }

    // Funcion que representa la producción "Factor"
    // Entrada: Lista de tokens
    // Salida: True si sintacticamente Factor está correcto, false si no

    public boolean Factor(List<Token> tokensitos){
        
        if(match("IDENTIFICADOR", tokensitos.get(posicion).getAtributo())){

            String idEncontrado = tokensitos.get(posicion).getValor().toString();
            System.out.println("Encontre id: " +idEncontrado);
            posicion++;
            return true;

        }
        else if(match("NUMERO", tokensitos.get(posicion).getAtributo())){

            String num = tokensitos.get(posicion).getValor().toString();
            System.out.println("Encontre numero: "+num);
            posicion++;
            return true;

        }
        else if(match("PARENTESIS_IZQ", tokensitos.get(posicion).getAtributo())){

            posicion++;
            System.out.println("Encontre (");

            if(DeltaExpresion(tokensitos)){

                if(posicion < tokensitos.size() && match("PARENTESIS_DER", tokensitos.get(posicion).getAtributo())){

                    System.out.println("Encontre )");
                    posicion++;
                    return true;

                }
                else{

                    System.out.println("Error [Fase Sintactica]: La linea " + nroLinea + " contiene un error en su gramatica, falta token )");
                    return false;

                }
            }
            else{
                
                return false;

            }
        }
        else{

            System.out.println("Error [Fase Sintactica]: La linea " + nroLinea + " contiene un error en su gramatica, falta token id o numero o (");
            return false;

        }
    }

    // Funcion que representa la producción "Termino"
    // Entrada: Lista de tokens
    // Salida: True si sintacticamente Termino está correcto, false si no

    public boolean Termino(List<Token> tokensitos){
        
        if(Factor(tokensitos)){
            
            if(posicion < tokensitos.size()){
                
                while(match("MULTIPLICACION", tokensitos.get(posicion).getAtributo()) || match("DIVISION", tokensitos.get(posicion).getAtributo())){

                    if(posicion == tokensitos.size()){
                        
                        break;

                    }

                    System.out.println("Encontre * o /");
                    posicion++;
                    
                    if(!Factor(tokensitos)){
                        
                        return false;

                    }else{


                        if(posicion == tokensitos.size()){
                        
                            break;
    
                        } else{

                            continue;

                        }
                    }
                }
                
                return true;

            }else{
                
                return true;

            }
        }
        
        return false;
        
    }

    // Funcion que representa la producción "DeltaExpresion"
    // Entrada: Lista de tokens
    // Salida: True si sintacticamente DeltaExpresion está correcto, false si no

    public boolean DeltaExpresion(List<Token> tokensitos){

        if(Termino(tokensitos)){
            
            if(posicion < tokensitos.size()){
                
                while(match("SUMA", tokensitos.get(posicion).getAtributo()) || match("RESTA", tokensitos.get(posicion).getAtributo())){
                    
                    if(posicion == tokensitos.size()){
                        
                        break;

                    }

                    System.out.println("Encontre + o -");
                    posicion++;

                    if(!Termino(tokensitos)){
                    
                        return false;

                    }else{
                        
                        if(posicion == tokensitos.size()){
                        
                            break;
    
                        } else{

                            continue;

                        }

                    }
                }

                return true;

            }
            else{
                
                return true;

            }
        }

        return false;

    }

    // Funcion que representa la producción "Expresion"
    // Entrada: Lista de tokens
    // Salida: True si sintacticamente Expresion está correcto, false si no

    public boolean Expresion(List<Token> tokensitos){ 
        
        if(match("IDENTIFICADOR", tokensitos.get(posicion).getAtributo()) ){

            ultimoId = tokensitos.get(posicion).getValor().toString();
            System.out.println("Encontre id: " + ultimoId);
            posicion++;

            if(match("ASIGNACIÓN", tokensitos.get(posicion).getAtributo())){

                System.out.println("Encontre =");
                posicion++;

                if(!DeltaExpresion(tokensitos)){

                    System.out.println("Hay que sacar el id: "+ultimoId);
                    tabla.borrar(ultimoId);
                    return false;

                }else{
                    
                    return true;

                }
            }
            else{

                System.out.println("Error [Fase Sintactica]: La linea " + nroLinea + " contiene un error en su gramatica, falta token =");
                return false;
                
            }
        }
            
        return false;

    }

    // Funcion que representa la producción "Programa"
    // Entrada: Lista de tokens
    // Salida: True si sintacticamente Programa está correcto, false si no

    public void Programa(List<Token> tokensitos){

        if(Expresion(tokensitos)){
            
                if(posicion < tokensitos.size()){
                    
                    if(match("PUNTO_COMA", tokensitos.get(posicion).getAtributo())){

                        System.out.println("Encontre ;");
                        nroLinea++;
                        posicion++;

                        if(posicion == tokensitos.size()){

                            return;

                        }
                        else{
                            
                            Programa(tokensitos);

                        }
                    }
                    else{

                        tabla.borrar(ultimoId);
                        System.out.println("Error [Fase Sintactica]: La linea " + nroLinea + " contiene un error en su gramatica, falta token ;");
                        return;

                    }
                }
                else{

                    tabla.borrar(ultimoId);
                    System.out.println("Error [Fase Sintactica]: La linea " + nroLinea + " contiene un error en su gramatica, falta token ; o Expresion");
                    return;

                }
        }
        else{

            tabla.borrar(ultimoId);
            System.out.println("Error [Fase Sintactica]: La linea " + nroLinea + " contiene un error en su gramatica, falta Expresión");
            return;

        }
    }


    /*Función encargada de enviar la tabla de simbolos despues del análisis sintactico */

    public TablaSimbolos enviarTablaActualizada(){
        return tabla;
    }

}