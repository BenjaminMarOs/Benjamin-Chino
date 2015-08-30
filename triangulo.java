import java.util.Scanner;
public class Triangulo{
    /*la foumula del triangulo equilatero lleva una raiz pero no se como ponerla. No quise poner a la altura como variable instanciada porque no puede haber un triangulo equilatero con lado = 3 y altura 5. yo quise poner la altura, como variable dependiente del lado. pero como veras no pude. Seria Posible que me mandes como hacerlo en el correo de respuesta?
*/
 

    //atributos del Ttiangulo
    double lado;
    String color;
    double altura= (((3)^(1/2))/2)*lado;

    //constructor
    public Triangulo(double lado, String color){
	this.lado=lado;
	this.color=color;
    }
   

    //metodos
    
    public double getPerimetroTriangulo(){//perimetro
	double perimetro= (lado*3);
	return perimetro;
    }

    public double getAreaTriangulo(){//area
	double area= (lado*altura)/2;
	return area;
    }
    
    public String getColor(){//color
	return color;
    }

    public void setColor(String color){//color
	this.color=color;
    }
 
    public void setLado(double lado){
	this.lado=lado;
    }

    public void setAltura(double altura){
	this.altura=altura;
    }

    public double getAltura(){
	return altura;
    }

    public double getLado(){
	return lado;
    }

    public String toString(){
	return "\n~~~~~~~~~\n Triangulo\n Base= " + lado +"\n altura=  "+ altura +" \n Color= " + color +"\n Area= "+ getAreaTriangulo() + "\n Perimetro= "+ getPerimetroTriangulo() + ("\n");
    }

    public static void main (String args[]){
	Scanner in = new Scanner (System.in);
	System.out.println("\n\ndime tu color favorito ");
	String color=in.nextLine();

	Triangulo triangulo1= new Triangulo (5, color);
	System.out.println(triangulo1);
    }               
} 
