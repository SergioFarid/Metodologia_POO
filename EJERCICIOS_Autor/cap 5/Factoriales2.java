// Programa FACTORIALES DE N NUMEROS
// Elaborado por: Leobardo López Román
// Factoriales2.java

import java.util.Scanner;

public class Factoriales2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int n, i, j, fact, num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  CALCULA EL FACTORIAL DE N NUMEROS\n");

       System.out.print("¿A cuantos numeros desea calcular factorial?: ");
       n = entrada.nextInt();
       j = 0;
       do
       {
           j = j + 1;
           System.out.println("\n-------- Lectura del dato --------");
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
           System.out.println("\n----------- Resultado ------------");
           System.out.println("Factorial = " + fact);
       } while (j < n); 
   }
}

