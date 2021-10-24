// Programa TRANSPUESTA
// Elaborado por: Leobardo López Román
// Transpuesta.java

import java.util.Scanner;

public class Transpuesta
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int a[][] = new int[4][5];
       int b[][] = new int[5][4];
       int r, c;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Entrada de datos --------");
       for (r = 0; r <= 3; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print("Teclee a[" + r + "," + c + "]: ");
               a[r][c] = entrada.nextInt();
           }
       }  

       for (r = 0; r <= 3; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               b[c][r] = a[r][c];
           }
       }  

    // Imprimir salida
       System.out.println("------------- Salida -------------");
       System.out.println("------------- Matriz -------------");
       for (r = 0; r <= 3; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print(a[r][c] + "  ");
           }
           System.out.println();
       } 

       System.out.println("----------- Transpuesta ----------");
       for (r = 0; r <= 4; r++)
       {
           for (c = 0; c <= 3; c++)
           {
               System.out.print(b[r][c] + "  ");
           }
           System.out.println();
       } 
   }
}

