/****
 * Clase que simula el comportamiento de un robot
 * autor Benjamin Martinez
 * version 1.0.0
 ****/
public class Robot {
    private String nombre;
    private String marca;
    private String numSerie;
    private boolean estaDormido;
    private boolean estaDespierto;

    /**
     * Constructor por omision. Crea a Robotina, de la marca Hasbro,
     * con numero de serie Rob2011
     */
    public Robot () {
        this.nombre = "Robotina";
        this.marca = "Hasbro";
        this.numSerie = "Rob2011";
    }
    /**
     * Constructor de un robot a partir de su nombre, marca y número de serie
     * @param n - nombre del robot
     * @param m - marca del robot
     * @param num - número de serie del robot
     */
    public Robot (String n, String m, String num) {
        this.nombre = n;
        this.marca = m;
        this.numSerie = num;
    }
    /**
     * Método para asignar nombre al robot
     * @param nomb -- cadena con el nombre del robot
     */
    public void asignarNombre(String nomb) {
        this.nombre = nombre;
    }
    /**
     * Método para asignar marca al robot
     * @param marca -- cadena con la marca del robot
     */
    public void asignarMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método para asignar numSerie al robot
     * @param num -- cadena con el numero de serie del robot
     */
    public void asignarNumSerie(String num) {
        this.numSerie = num;
    }
    /**
     * Método para obtener el nombre del robot
     * @return String -  nombre del robot
     */
    public String obtenerNombre() {
        return this.nombre;
    }
    /**
     * Método para obtener la marca del robot
     * @return String -  marca del robot
     */
    public String obtenerMarca() {
        return this.marca;
    }
    /**
     * Método para obtener el número de Serie del robot
     * @return String -  número de serie del robot
     */
    public String obtenerNumSerie() {
        return this.numSerie;
    }
    /** 
     * Método para hacer dormir al robot
     */
    public void dormir() {
        this.estaDormido = false;
    }
    /** 
     * Método para despertar al robot
     */
    public void despertar() {
        this.estaDespierto = true;
    }
    /**
     * Método para saber si el robot está despierto
     * @return boolean -- Si es true el robot está despierto y false si esta dormindo
     */
    public boolean estaDespierto() {
        return this.estaDespierto;
    }
    /**
     * Método para que el robot repita lo que se le dice
     * @param rollo -- cadena con el rollo que se desea repita el robot
     */
    public void repetir(String rollo) {
        System.out.println(rollo);
    }
    /**
     * Método para determinar si dos robots son iguales
     * @param robot -- robot con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Robot robot) {
        return this.equals(robot);
    }
    /**
     * Método para devolver una cadeena con el nombre del robot.
     * @return String -- cadena que devolvera
     */
    public String toString () {
        return this.nombre;
    }

    /**
     * Método para que el robot reste los números que se le dan
     * @param num1 -- minuendo
     * @param num2 -- sustraendo
     */
    public void restar() {
	Scanner resta = new Scanner(System.in);

	System.out.println("dame un numero");
	double num1=resta.nextDouble();
	System.out.println("dame otro numero");
	double num2=resta.netxDouble();
        System.out.println("la resta es: "+(num1 + num2));
        System.out.println(num1 - num2);
    }
    /**
     * Método para que el robot sume los números que se le dan
     * @param num1 -- primer sumando
     * @param num2 -- segundo sumando
     */
    public void sumar() {
	Scanner suma = new Scanner(System.in);

	System.out.println("dame un numero");
	double num1=suma.nextDouble();
	System.out.println("dame otro numero");
        System.out.println("la suma es: "+(num1 + num2));
    }

    /**
     * Método para que el robot multiplique los números que se le dan
     * @param num1 -- primer factor
     * @param num2 -- segundo factor
     */
    public void multiplicar() {
	Scanner on = new Scanner (System.in);

       	System.out.println ("dame un numero ");
	double num1 =on.nexDouble();
	System.out.println("dame el numero por el cual lo quieres multiplicar ");
	double num2 =on.nextDouble();
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);
    }
    /**
     * Método para que el robot divida los números que se le dan
     * @param num1 -- dividendo
     * @param num2 -- divisor
     */
    public void dividir() {
	Scanner in = new Scanner(System.in);

	System.out.println ("dame el numero a dividir ");
	double num1 =in.nexDouble();
	System.out.println("dame el numero por el cual dividir ");
	double num2 =in.nextDouble();
        System.out.println(num1 / num2);
    }

    public static void main(String[]pps){
	//no supe como meter todo en el main :'C
    }//termina metodo main
}
