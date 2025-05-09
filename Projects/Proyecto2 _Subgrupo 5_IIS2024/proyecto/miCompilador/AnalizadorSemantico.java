import java.util.HashSet;
import java.util.Set;

public class AnalizadorSemantico extends l2BaseListener{

    private Set<String> variables = new HashSet<>();

    public Set<String> getVariables() {
        return variables;
    }
    
    @Override 
    public void enterExpresion(l2Parser.ExpresionContext ctx) {
        //si la expresion tiene un identificador se declara en la lista de variables
        //se verifica primera que hay una expresion y esta tiene hijos asociados en el arbol
        if(ctx.expresion()!= null && ctx.getChildCount() > 1){
            //cuando el identificador esta al lado izquierdo del igual
            if(ctx.getChild(1).getText().equals("=")){
                //revision del largo del nombre del identificador
                if (ctx.identificador().getText().length() > 12) {
                    System.out.println("Nombre de identificador muy largo: " + ctx.identificador().getText());
                    System.exit(1);
                    
                }
                System.out.println("Asignacion: " + ctx.identificador().getText());
                String nombre = ctx.identificador().getText(); // se saca el nombre del identificador
                variables.add(nombre);
            }
            //cuando el identificador esta al lado derecho del igual
            // se recorren los hijos de la expresion y se verifica si son identificadores, si lo son se verifica si estan declarados
            for(int i = 1; i < ctx.getChildCount(); i++){
                if(ctx.getChild(i) instanceof l2Parser.ExpresionContext){
                    
                    String REGEX = "[a-zA-Z]+"; // una expresion que es un identificador
                    String nodo = ctx.getChild(i).getText();
                    boolean esVariable = nodo.matches(REGEX);
                    if(esVariable){
                        String nombre = ctx.getChild(i).getText();
                        if(!variables.contains(nombre)){
                            System.out.println("Error semantico: variable no declarada " + nombre);
                            System.exit(1);
                        }
                    }
                }
            }

            //chequeo division por cero
            //si el operador es una division se verifica si el nodo derecho es 0
            if(ctx.getChild(1).getText().equals("/")){
               
                String nodo = ctx.getChild(2).getText(); //nodo derecho de la division
                if(nodo.equals("0")){
                    System.out.println("Error semantico: division por cero");
                    System.exit(1);
                }
            }
            
            
        }
    }

    
	
	

}
