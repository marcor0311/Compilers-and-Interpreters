# Proyecto 2 compiladores
### Generar los arhivos
```
antlr4 l2.g4
``` 

### Para compilar
```
javac -cp .:compilacion/antlr-4.13.2-complete.jar *.java

Para windows:
javac -cp .;compilacion/antlr-4.13.2-complete.jar *.java
```

### Para ejecutar 
```
java -cp .:compilacion/antlr-4.13.2-complete.jar Main

Para windows:
java -cp .;compilacion/antlr-4.13.2-complete.jar *.java
```

Nota: El archivo de entrada que recibe el main es Input.txt
