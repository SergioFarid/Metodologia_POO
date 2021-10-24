// Programa SUMA ARREGLOS
// Elaborado por: Leobardo López Román
// SumaArreglos.java

import java.util.Scanner;

public class SumaArreglos
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int a[] = new int[10];
        int b[] = new int[10];
        int s[] = new int[10];
        int i;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nSUMA LOS ELEMENTOS DE DOS ARREGLOS\n");

    // Leer datos
       System.out.println("\n-------- Lectura de datos --------");
       for (i = 0; i <= 9; i++)
       {
           System.out.print("Teclee a[" + i + "]: ");
           a[i] = entrada.nextInt();

           System.out.print("Teclee b[" + i + "]: ");
           b[i] = entrada.nextInt();
           s[i] = a[i] + b[i];
       }
 
    // Imprimir salida
       System.out.println("\n----------- Resultados -----------");
       System.out.println("Arreglo A  Arreglo B  Arreglo S");
       System.out.println("----------------------------------");
       for (i = 0; i <= 9; i++)
       {
           System.out.println("    " + a[i] + "         " + b[i] + "         " + s[i]);
       }
   }
}

