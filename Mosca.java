import java.io.*;
/**
 * Programa para trabajar con metodos de la clase String
 * @author  Benjamín Martínez Osorio
 * @version 1.0
 */

public class Mosca {
  public static void main (String [] pps) {
      String frase = new String (" Una mosca parada en la pared, en la pared      "); 
    String frase1, frase2, frase3, frase4, frase5;

  //imprime la cadena original
    System.out.println(" \nCadena original: \"" + frase + "\""); 

    //Imprimela cadena, y cuenta los caracteres de la frase compreta (cadena)
    System.out.println(" \nLongitud de la cadena: "+ frase.length() );  

    frase1 = frase.trim();  // los espacios en blanco al final de la frase
    System.out.println(" \nLongitud de la cadena sin espacios: "+ frase1.length() ); //"legth" cuenta los espacios
  
    frase2 = frase.toUpperCase(); //cambia las letras minusculas por MAYUSCULAS
    frase3 = frase1 + " PINTADA DE ROJO";  // en el pdf dice que agregue la frase a la cadena original, asi que eso hice; pero como que se ve feito. por eso mejor decidi hacer lo que se mencionaba qui.
    

    // imprime cada cambio que se hizo en la cadena
    System.out.println("\t\nFrase #1: " + frase1);
    System.out.println("\t\nFrase #2: " + frase2);
    System.out.println("\t\nFrase #3: " + frase3 + ("\n\n"));
  }
}
