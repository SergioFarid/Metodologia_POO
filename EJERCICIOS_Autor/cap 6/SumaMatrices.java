// Programa SUMA MATRICES
// Elaborado por: Leobardo López Román
// SumaMatrices.java

import java.util.Scanner;

public class SumaMatrices
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int matriz1[][] = new int[5][5];
       int matriz2[][] = new int[5][5];
       int matriz3[][] = new int[5][5];
       int ren, col;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Entrada de datos --------");
       System.out.println("--------     Matriz 1     --------");
       for (ren = 0; ren <= 4; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print("Teclee matriz1[" + ren + "," + col + "]: ");
               matriz1[ren][col] = entrada.nextInt();
           }
       }  

       System.out.println("--------     Matriz 2     --------");
       for (ren = 0; ren <= 4; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print("Teclee matriz2[" + ren + "," + col + "]: ");
               matriz2[ren][col] = entrada.nextInt();
           }
       }  

       for (ren = 0; ren <= 4; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               matriz3[ren][col] = matriz1[ren][col] + matriz2[ren][col];
           }
       }  

    // Imprimir salida
       System.out.println("----------- Resultados -----------");
       System.out.println("--------     Matriz 1     --------");
       for (ren = 0; ren <= 3; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print(matriz1[ren][col] + "  ");
           }
           System.out.println();
       } 

       System.out.println("--------     Matriz 1     --------");
       for (ren = 0; ren <= 3; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print(matriz2[ren][col] + "  ");
           }
           System.out.println();
       } 

       System.out.println("--------     Matriz 3     --------");
       for (ren = 0; ren <= 3; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print(matriz3[ren][col] + "  ");
           }
           System.out.println();
       } 
   }
}

