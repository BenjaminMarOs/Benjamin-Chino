import java.util.Scanner;

public class palindrome{
    
    public static boolean Palindromo(String Palabra)
    {
        for(int i = 0; i < Palabra.length(); i++)
        {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String Palabra;
        Scanner Teclado = new Scanner(System.in);
	System.out.println("\n~~~~~~~~~~~~~~\n");
        System.out.println("Teclee la frase a verificar\n ");
        Palabra = Teclado.next();
        
        if (Palindromo(Palabra) == true)
        {
            System.out.println("\ntrue\n");
        } else
        {
            System.out.println("\nfalse\n");
	    System.out.println("\n~~~~~~~~~~~~~~");	
        }
        
    }
}
