package com.miCompilador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Archivo {


    /*
     * 
     * Función encargada de leer la ruta de un archivo, obtener su contenido y guardarlo en un string
     * Entrada: El string de la ruta del archivo a leer
     * Salida: El string del contenido del archivo
     * 
     */
    public String leer(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
                
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contenido.toString();
    }
    


    public void guardar(String rutaArchivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }  
}
