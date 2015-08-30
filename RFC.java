import java.util.Scanner;
/**
 * Programa para calcular el RFC de una persona.
 * Objetivo Utilizar algunos métodos de la clase String
 * @author  Benjamín Martínez Osorio
 * @version 1.0
 */
public class RFC {
  static public void main(String [] args) {
    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    String fechaNac;
    String rfc="";
    Scanner in = new Scanner(System.in);
    
    //La Bienvenida
    System.out.println("\n---------------\n\t Bienvenid@.\n Te solicito de favor que ingreses los datos que a continuación se te piden ");

    // Pide nombre
    System.out.println("\t Nombre ");
    nombre = in.nextLine();
    // Pide apellido paterno
    System.out.println("\t Apellido paterno");
    apellidoPaterno = in.nextLine();
    // Pide apellido materno
    System.out.println("\t Apellido materno");
    apellidoMaterno = in.nextLine();
    // Extrae las dos primeras letras del apellido paterno y lo agreaga al RFC
    rfc = apellidoPaterno.trim().substring(0, 2);
    // Extrae la primera letra del apellildo materno y lo agrega a RFC
    rfc = rfc.concat( apellidoMaterno.trim().substring(0, 1));
    // Extrae la primera letra del nombre y lo agrega a RFC
    rfc = rfc.concat(nombre.trim().substring(0, 1));

    System.out.println("\t Ingresa tu fecha de nacimiento con el siguiente formato aammdd; ejemplo 951020. \n");    // Solicita la fecha de nac.
    
    fechaNac = in.nextLine();// Lee la fecha de nacimiento
   	 
    rfc = rfc.concat(fechaNac.trim());// Extrae la fecha
        
	
    System.out.println("\nEl RFC de " + nombre.toUpperCase() + " es  " +  rfc.toUpperCase()+("\n\n")); //pasa a MAYUSCULAS el RFC y despues lo muestra.
  
  }
}
