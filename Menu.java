/**
 *este es un programa que muestra un menu al usuario y dependiendo lo que 
 *lija el usuario validara opciones.
 *
 *Equipo 6:
 *Garcia Arellano Javier
 *Martínez Osorio Benjamin
 *Martínez Tamayo Omar Arturo
 *Mendoza Delgado Alejandro
 *
 *version 1.0
 **/
import java.util.Scanner;

public class Menu{//inicia clase
    double x, y, r;
    String nombre, palabra;
    char t, w;

    public void Bienvenida(){
	Scanner in =new Scanner (System.in);
	System.out.println("Hola. \nPorfavor ingresa tu nombre ");
	String nombre=in.nextLine();
	System.out.println("\nBienvenid@ "+nombre+"\n");
    }
    
    public void operacionS(){
	Scanner suma=new Scanner (System.in);
	System.out.println("\n~~~~~~~~~~");
	System.out.println("Hola. Este es un programa para hacer sumas ");
	System.out.println("Dame el primer numero a sumar");
	double x=suma.nextDouble();
	System.out.println("Dame el segundo numero a sumar");
	double y=suma.nextDouble();
	double r= x+y;
	System.out.println("tu resultado es: "+r+"\n~~~~~~~~~~\n");
	}
    /**
     *en este metodo intente repetir el metodo si el usuario queria pero no pude. en este metodo lo intente con if
     **/
    public void repetirS(){
	Scanner otro= new Scanner(System.in);
	System.out.println("quieres hacer otra suma? [S/N]");
	String w= otro.nextLine().toLowerCase();	
	if("w"=="s"){
	    operacionS();
	    repetirS();
	}else {
	    System.out.println("adios");
	}
    }

    public void Suma(){
	operacionS();
	repetirS();
    }


    public void operacionR(){
	Scanner resta=new Scanner (System.in);
	System.out.println("\n~~~~~~~~~~");
	System.out.println("Hola. Este es un programa para hacer restas ");
	System.out.println("Dame el primer numero ");
	double x=resta.nextDouble();
	System.out.println("Dame el segundo numero para hacer la resta ");
	double y=resta.nextDouble();
	double r= x-y;
	System.out.println("tu resultado es: "+r+"\n~~~~~~~~~~\n");
    }
    /**
     *en este caso intente repetir el metodo usando el Do while pero no se sale del metodo, no se que hice mal
     **/
    public void repetirR(){
	Scanner otro= new Scanner(System.in);
	System.out.println("quieres hacer otra resta? [S/N]");
	String w= otro.nextLine();
	do{
	    operacionR();
	    repetirR();
	}while('w'=='s'||'w'== 'S');
    }
    
    public void Resta(){
	operacionR();
	repetirR();
    }

    public void operacionM(){
	Scanner Mul=new Scanner(System.in);
	System.out.println("\n~~~~~~~~~~");
	System.out.println("Hola. Este es un programa para hacer multiplicaciones ");
	System.out.println("Dame el primer numero a multiplicar");	   
	double x=Mul.nextDouble();
	System.out.println("Dame el segundo numero ");
	double y=Mul.nextDouble();
	double r= x*y;
	System.out.println("tu resultado es: "+r+"\n~~~~~~~~~~\n");
    }   
    public void repetirM(){
	Scanner otro= new Scanner(System.in);
	System.out.println("quieres hacer otra Multiplicacion? [S/N]");
	String w= otro.nextLine();
	do{
	    operacionM();
	    repetirM();
	}while('w'=='s'||'w'== 'S');	
    }

    public void Multiplicacion(){
	operacionM();
	repetirM();
    }
    public void operacionD(){
	Scanner div=new Scanner (System.in);
	System.out.println("\n~~~~~~~~~~");
	System.out.println("Hola. Este es un programa que hace divisiones por ti");
	System.out.println("que numero deseas dividir (dividendo)? ");
	double x=div.nextDouble();
	System.out.println("Dame el valor del divisor ");
	double y=div.nextDouble();
	double r=x/y;
	if (y!=0){
	    System.out.println("tu resultado es: "+r+"\n~~~~~~~~~~\n");
	}else{
	    System.out.println("tu dividendo no puede ser 0, porfavor ingresa otro numero ");
	    operacionD();
	}
    }
    
    public void otroD(){
	Scanner otro= new Scanner(System.in);
	System.out.println("quieres hacer otra division? [S/N]");
	String w= otro.nextLine();
	do{
	    operacionD();
	    otroD();
	}while('w'=='s'||'w'== 'S');	
    }
    
    public void Division(){
	operacionD();
	otroD();
    }

    public void Factorial(){
	Scanner Scan=new Scanner(System.in);
	
	System.out.println("este programa te calcula el factorial de cualquier numero mayor a Cero ['0']");
	System.out.println("ingresa el numero del que quieres el factorial" );
	int numero=Scan.nextInt();
	int x = numero;
	int fact=1;
	if (x<0){
	    Factorial();
	}else{
	    if(x==0|| x==1){
		System.out.println("1");
	    }else{
		while (x>1){
		    fact = fact*x;
		    x--;
		}
	    }
	}
	System.out.println("El factorial de "+numero+" es "+fact);
    }

    
    public void Palindromo(){
	Scanner scan=new Scanner(System.in);
	int i=0, j;
	String frase;
	boolean esPalindromo=true;
	
	System.out.println("introcue la frace, yo te dire si es palindromo o no");
	frase=scan.nextLine();
	j=(frase.length()-1);
	while (1<j & esPalindromo)
	    if(!Character.isLetter(frase.charAt(i)))
		i++;
	    else
		if (!Character.isLetter(frase.charAt(j)))
		    j--;
		else
		    if (frase.charAt(i)==frase.charAt(j)){
			i++;
			j--;
		    }else{
			esPalindromo= false;
		    }
	if(i>=j)
	    System.out.println("la frase es un palindromo ");
	else
	    System.out.println("la frase no es un palindromo ");
    }

    public void casos (){//empieza el metodo  con el switch
	Scanner entrada =new Scanner(System.in);
	System.out.println ("Escoge que deceas hacer.\n\tA)Suma \n\tB)Resta \n\tC)Multiplicación \n\tD)División \n\tE)Factorial \n\tF)Palindromo \n\tS)Salir");

	String caso=entrada.nextLine();

	switch (caso){
	case "a": case "A":
	    Suma();
	    break;
	case "b": case "B":
	    Resta();
	    break;
	case "c": case "C":
	    Multiplicacion();
	    break;
	case "d": case "D":
	    Division();
	    break;
	case "e": case "E":
	    Factorial();
	    break;
	case "f": case "F":
	    Palindromo();
	    break;
	case "s": case "S":
       	    System.out.println("Gracias, fue un placer ayudarte");
	    break;
	default:
	    System.out.println("Opción INCORRECTA. \nPor favor elige una opcion valida o presiona 'S' para salir");
	    casos();
	    break;
	}
    }

    public static void main(String []args){
	Menu m=new Menu();
	m.Bienvenida();
	m.casos();
    }
}
