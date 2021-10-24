// Programa ARREGLO TETRADIMENSIONAL
// Elaborado por: Leobardo López Román
// ArregloCuatroDim1.java

import java.util.Scanner;

public class ArregloCuatroDim1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int numeros[][][][] = new int[4][3][5][5];
       int ren1, col1, ren2, col2;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE NUMEROS EN UN ARREGLO TETRADIMENSIONAL");
       System.out.println("       Y LOS IMPRIME EN LA PANTALLA");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (ren1 = 0; ren1 <= 3; ren1++)
       {
         for (col1 = 0; col1 <= 2; col1++)
         {
           for (ren2 = 0; ren2 <= 4; ren2++)
           {
             for (col2 = 0; col2 <= 4; col2++)
             {
               System.out.print("Teclee a[" + ren1 + "," + col1 + "," + ren2 + "," + col2 + "]: ");
               numeros[ren1][col1][ren2][col2] = entrada.nextInt();
             }
           }
         }
       }  

    // Imprimir salida
       System.out.println("------------ Salida ------------");
       for (ren1 = 0; ren1 <= 3; ren1++)
       {
         for (col1 = 0; col1 <= 2; col1++)
         {
           for (ren2 = 0; ren2 <= 4; ren2++)
           {
             for (col2 = 0; col2 <= 4; col2++)
             {
               System.out.print(numeros[ren1][col1][ren2][col2] + "    ");
             }
             System.out.println();
           }
           System.out.println();
         }             
       }
   }
}
