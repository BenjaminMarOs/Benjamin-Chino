import java.util.Scanner;
public class Cuadrado{
    //atributos del cuadrado
    double lado;
    String color;

    //constructor
    public Cuadrado(double lado, String color){
	this.lado=lado;
	this.color=color;
    }
   

    //metodos
    
    public double getPerimetroCuadrado(){//perimetro
	double perimetro= (lado*4);
	return perimetro;
    }

    public double getAreaCuadrado(){//area
	double area= (lado*lado);
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

    public double getLado(){
	return lado;
    }

    public String toString(){
	return "\n~~~~~~~~~\n Cuadrado\n lado= " + lado +" \n Color= " + color +"\n Area= "+ getAreaCuadrado() + "\n Perimetro= "+ getPerimetroCuadrado() + ("\n");
    }

    public static void main (String args[]){
	Scanner in = new Scanner (System.in);
	System.out.println("\n\ndime tu color favorito ");
	String color=in.nextLine();

	Cuadrado cuadrado1= new Cuadrado (5, color);
	System.out.println(cuadrado1);
    }
}
