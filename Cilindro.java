import java.util.Scanner;
public class Cilindro{
    //atributos del cilindro
 
    double radio;
    double pi=3.1416;
    String color;
    double altura;

    //constructor
    public Cilindro(double altura, double radio, String color){
	this.radio=radio;
	this.color=color;
	this.altura=altura;
    }
   

    //metodos
   

    public double getAreaCilindro(){//area
	double area= (2*pi*radio)*(radio+altura);
	return area;
    }

    public double getVolumenCilindro(){
	double volumen= (pi*radio*radio*altura);
	return volumen;
    }
	
    public String getColor(){//color
	return color;
    }

    public void setColor(String color){//color
	this.color=color;
    }
 
    public void setRadio(double lado){
	this.radio=radio;
    }

    public void setAltura(double altura){
	this.altura=altura;
    }

    public double getAltura(){
	return altura;
    }

    public double getRadio(){
	return radio;
    }

    public String toString(){
	return "\n~~~~~~~~~\n Cilindro\n Radio= " + radio +"\n altura=  "+ altura +" \n Color= " + color +"\n Area= "+ getAreaCilindro() + "\n Volumen= "+ getVolumenCilindro() + ("\n");
    }

    public static void main (String args[]){
	Scanner in = new Scanner (System.in);
	System.out.println("\n\ndime tu color favorito\n ");
	String color=in.nextLine();

	Cilindro cilindro1= new Cilindro (5, 7, color);
	System.out.println(cilindro1);
    }
}
