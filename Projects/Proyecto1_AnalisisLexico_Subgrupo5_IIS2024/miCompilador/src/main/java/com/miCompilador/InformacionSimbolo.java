package com.miCompilador;


public class InformacionSimbolo {
    private String tipo;
    private int nroLinea;
    private String ambito;
    
    public InformacionSimbolo(String tipo, int nroLinea, String ambito) {
        this.tipo = tipo;
        this.nroLinea = nroLinea;
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
    
    public int getNroLinea() {
        return nroLinea;
    }
    public void setNroLinea(int nroLinea) {
        this.nroLinea = nroLinea;
    }

    @Override
    public String toString(){
        return "Tipo: "  + tipo + '\n' +"Ambito: " + ambito + '\n' +"Número de linea: " + nroLinea + '\n';
    }
}
