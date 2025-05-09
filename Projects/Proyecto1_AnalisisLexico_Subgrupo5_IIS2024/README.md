# README - Cómo ejecutar el programa

## Ejecutar el programa

Para ejecutar el programa usar el siguiente comando:
```
mvn exec:java -Dexec.args="rutaarchivo.txt"
```
## Ejemplos sin errores léxicos y evidencia de la tokenización con el lexer
### Ejemplo 1
```
mvn exec:java -Dexec.args="lexCorrecto1.txt"
```
### Ejemplo 2
```
mvn exec:java -Dexec.args="lexCorrecto2.txt" 
```
## Ejemplos con errores léxicos y evidencia de cómo se maneja el error
### Ejemplo 1
```
mvn exec:java -Dexec.args="lexError1.txt"
```
### Ejemplo 2
```
mvn exec:java -Dexec.args="lexError2.txt"
```