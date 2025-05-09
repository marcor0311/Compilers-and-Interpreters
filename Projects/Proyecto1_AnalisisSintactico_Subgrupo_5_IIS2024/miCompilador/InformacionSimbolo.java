
import java.util.List;

public class InformacionSimbolo {
    private String tipo;
    //private int nroLinea;
    private String ambito;
    private List<Integer> nrosLinea;
    
    public InformacionSimbolo(String tipo, List<Integer> nrosLinea, String ambito) {
        this.tipo = tipo;
        this.nrosLinea = nrosLinea;
        this.ambito = ambito;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getAmbito() {
        return ambito;
    }
    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    
    public List<Integer> getNrosLinea() {
        return nrosLinea;
    }
    public void setNroLinea(List<Integer> nroLinea) {
        this.nrosLinea = nroLinea;
    }

    @Override
    public String toString(){
        return "Tipo: "  + tipo + '\n' +"Ambito: " + ambito + '\n' +"Números de linea: " + nrosLinea + '\n';
    }
}
