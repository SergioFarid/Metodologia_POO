// Programa MULTIPLICACION DE MATRICES
// Elaborado por: Leobardo López Román
// MultiplicaMatrices.java

import java.util.Scanner;

public class MultiplicaMatrices
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int a[][] = new int[2][3];
       int b[][] = new int[3][4];
       int p[][] = new int[2][4];
       int r, c, i;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       System.out.println("------------ Matriz 1 ------------");
       for (r = 0; r <= 1; r++)
       {
           for (c = 0; c <= 2; c++)
           {
               System.out.print("Teclee a[" + r + "," + c + "]: ");
               a[r][c] = entrada.nextInt();
           }
       }  

       System.out.println("------------ Matriz 2 ------------");
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 3; c++)
           {
               System.out.print("Teclee a[" + r + "," + c + "]: ");
               b[r][c] = entrada.nextInt();
           }
       }  

       for (i = 0; i <= 1; i++)
       {
           for (c = 0; c <= 3; c++)
           {
               p[i][c] = 0;
               for (r = 0; r <= 2; r++)
               {
                   p[i][c] = p[i][c] + (a[i][r] * b[r][c]);
               }
           }
       }  

    // Imprimir salida
       System.out.println("------------- Salida -------------");
       System.out.println("------------ Matriz 1 ------------");
       for (r = 0; r <= 1; r++)
       {
           for (c = 0; c <= 2; c++)
           {
               System.out.print(a[r][c] + "  ");
           }
           System.out.println();
       } 

       System.out.println("------------ Matriz 2 ------------");
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 3; c++)
           {
               System.out.print(b[r][c] + "  ");
           }
           System.out.println();
       } 

       System.out.println("------------ Matriz p ------------");
       for (r = 0; r <= 1; r++)
       {
           for (c = 0; c <= 3; c++)
           {
               System.out.print(p[r][c] + "  ");
           }
           System.out.println();
       } 
   }
}

