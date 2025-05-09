package com.miCompilador;
import java.util.HashMap;
import java.util.Map;


public class TablaSimbolos {
    private HashMap<String, InformacionSimbolo> tabla = new HashMap<>();

    // Constructor, getters, setters

    public HashMap<String, InformacionSimbolo> getTabla() {
        return tabla;
    }

    public void setTabla(HashMap<String, InformacionSimbolo> tabla) {
        this.tabla = tabla;
    }

    public TablaSimbolos() {
        this.tabla = new HashMap<>();
    }

    /*
     * 
     * Función encargada de agregar el token y su información a la tabla de simbolos
     * Entrada: El token y la información
     * 
     */

    public void agregar(String token, InformacionSimbolo info){
        tabla.put(token, info);
    }


    /*
     * 
     * Función encargada de leer el contenido de la tabla de simbolos
     * 
     */
    public void leer(){

        for (Map.Entry<String, InformacionSimbolo> entry : tabla.entrySet()){
            System.out.println("Nombre token: "+ entry.getKey()+ "\n" + "Informacion: \n"+ entry.getValue().toString());
        }
        
    }

}
