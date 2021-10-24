// Programa RECURSIVIDAD2 
// Elaborado por: Leobardo López Román
// Recursividad2.java

import java.util.Scanner;

public class Recursividad2
{
    // Declarar variables
         static int num;

   public static void main(String args[])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer dato
       System.out.println("\n-------- Lectura del dato --------");
       System.out.print("Teclee numero: ");
       num = entrada.nextInt();

    // Imprimir salida
       System.out.println("\n----------- Resultado ------------");
       imprimirNumero(1);
   }
   
   public static void imprimirNumero(int x) 
   {
      System.out.println("X = " + x);
      if (x<num)
      {
         x=x+1;
         imprimirNumero(x);
      }         
   }
}
