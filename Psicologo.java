import java.util.Scanner;
/**
 * Programa para tener sesiones con un psicologo
 * @author Benjamin Martínez Osorio
 * @version 1.0
 */
public class Psicologo {
    public static void main(String [] pps) {
	//este es un objeto que le permite a la computadora leer las respuestas de los usuarios y tomarlas para otro metodo
	Scanner in = new Scanner(System.in);

 	//da la bienvenida, y le pregunta su nombre al usuario
	System.out.println("\n\nBienvenido, ¿Cuál es tu nombre?"); 
	//lee el nombre del usuario
	String name = in.nextLine();
	//Dece buenas tardes y pregunta por el problema
	System.out.println("Buenas tardes " + name + " ¿Cuál es tu problema? "); 
	String problema = in.nextLine(); //escribe el problema en la siguiente linea

	System.out.println("¿Por qué crees que tu problema sea: " +problema + "?"); //Manda a llamar a "problema" que la persona escribió anteriormente


	//recibe la informacion del problema2
	String problema2 = in.nextLine(); 
	System.out.println("Interesante, hablaremos de ello la siguiente sesión. \n\n");
    //Lee respuestas y decie Interesante...	
    }
}
