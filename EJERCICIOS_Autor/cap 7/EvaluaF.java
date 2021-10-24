// Programa EVALUA EL VALOR DE F
// Elaborado por: Leobardo López Román
// EvaluaF.java

import java.util.Scanner;

public class EvaluaF
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int x=0, y=0;
       float f;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("\n-------- Lectura de datos --------");
       System.out.print("Teclee valor de x: ");
       x = entrada.nextInt();

       System.out.print("Teclee valor de y: ");
       y = entrada.nextInt();

    // Calcular
       f = calcularFactorial(x) / (calcularFactorial(y) * calcularFactorial(x-y));

    // Imprimir salida
       System.out.println("\n----------- Resultado ------------");
       System.out.println("F = " + f);
   }
   
   public static int calcularFactorial(int n) 
   {
   // Declarar variable
      int fact, i;

      if (n == 0)
         fact = 1;
      else
      {
         fact = 1;
         for (i = n; i >= 1; i--)
         {
            fact = fact * i;
         }
      }         
      return fact;       
   }
}
