// Programa FACTORIAL
// Elaborado por: Leobardo López Román
// Factorial1.java

import java.util.Scanner;

public class Factorial1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int num, i, fact;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nCALCULA EL FACTORIAL DE UN NUMERO\n");

       System.out.println("\n---------------- Lectura del dato ----------------");
       System.out.print("Teclee numero: ");
       num = entrada.nextInt();
       if (num == 0)
          fact = 1;
       else
       {
          fact = 1;
          for (i = num; i >= 1; i--)
          {
              fact = fact * i;
          }
       }         
       System.out.println("\n------------------- Resultado --------------------");
       System.out.println("Factorial = " + fact);
   }
}

