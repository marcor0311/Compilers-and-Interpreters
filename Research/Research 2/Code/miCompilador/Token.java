

public class Token {
    private String atributo;
    private String valor;
    
    //Constuctor
    public Token(String atributo, String valor) {
        this.atributo = atributo;
        this.valor = valor;
    }
      
    //Sets y Gets
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    //toString
    @Override
    public String toString() {
        return "Token{" + "atributo=" + atributo + ", valor=" + valor + '}';
    }
}
