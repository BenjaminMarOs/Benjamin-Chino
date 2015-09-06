import java.util.Scanner;
/**
 *autor Benjamin Martínez Osorio
 *version 1.0.0
 *
 **/
public class JuegoDados{//empieza clase
    public static void main(String[] pps) {//empieza main

	int valor1, valor2, valor3, valor4;
	int producto1;
	int producto2; 
	String nombre, enter;

	Scanner in = new Scanner(System.in);
	// Pedir al usuario su nombre 
	System.out.println("~~~~~~~~~~\n\nHola. ¿Cómo te llamas? ");
	nombre = in.nextLine();

	// Pedir al usuario que tire su dado (sólo debe dar ENTER)
	System.out.println("teclea ENTER para Lanzar tu dado ");
	enter= in.nextLine();
	valor1=(int)(Math.random()*6)+1;
	System.out.println(valor1);
	// Pedir al usuario que tire otra vez su dado (sólo debe dar ENTER)
	System.out.println("Vuelve a lanzar tu dado ");
	enter=in.nextLine();
	valor2=(int)(Math.random()*6)+1;
       	System.out.println(nombre +"tus numeros fueron: "+valor1+" y "+valor2+"\n");
	producto1=(valor1)*(valor2);// Calcular su producto

	// Hacer la computadora tire dos veces su dado y calcular su producto
	valor3=(int)(Math.random()*6)+1;
	valor4=(int)(Math.random()*6)+1;
	
	System.out.println("la computadora obtuvo "+valor3+ " y "+valor4+ "\n");
	producto2=(valor3)*(valor4);
	if(producto1>producto2){// Determinar el ganador, esto es determinar quien tiene el producto mayor

	    System.out.print("¡¡¡GANASTE!!! "+nombre);
	}else{
	    System.out.println("Perdiste, Gano la Computadora ");
	}
    }
}
