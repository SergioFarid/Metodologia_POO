// Programa RECURSIVIDAD1 
// Elaborado por: Leobardo López Román
// Recursividad1.java

import java.util.Scanner;

public class Recursividad1
{
   public static void main(String args[])
   {
    // Declarar variables
         int num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer dato
       System.out.println("\n-------- Lectura del dato --------");
       System.out.print("Teclee numero: ");
       num = entrada.nextInt();

    // Imprimir salida
       System.out.println("\n----------- Resultado ------------");
       imprimirNumero(num);
   }
   
   public static void imprimirNumero(int x) 
   {
      System.out.println("X = " + x);
      if (x>1)
      {
         x=x-1;
         imprimirNumero(x);
      }         
   }
}
