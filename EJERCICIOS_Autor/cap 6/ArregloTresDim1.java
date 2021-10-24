// Programa ARREGLO TRIDIMENSIONAL
// Elaborado por: Leobardo López Román
// ArregloTresDim1.java

import java.util.Scanner;

public class ArregloTresDim1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int numeros[][][] = new int[4][5][5];
       int pri, seg, ter;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (pri = 0; pri <= 3; pri++)
       {
           for (seg = 0; seg <= 4; seg++)
           {
               for (ter = 0; ter <= 4; ter++)
               {
                 System.out.print("Teclee a[" + pri + "," + seg + "," + ter + "]: ");
                 numeros[pri][seg][ter] = entrada.nextInt();
               }
           }
       }  


    // Imprimir salida
       System.out.println("------------ Salida ------------");
       for (pri = 0; pri <= 3; pri++)
       {
           System.out.println("----------- Matriz " + pri + " -----------");
           for (seg = 0; seg <= 4; seg++)
           {
               for (ter = 0; ter <= 4; ter++)
               {
                   System.out.print(numeros[pri][seg][ter] + "    ");

               }
               System.out.println();
           } 
       }
   }
}

