// Programa MATRIZ SIMETRICA
// Elaborado por: Leobardo López Román
// MatrizSimetrica.java

import java.util.Scanner;

public class MatrizSimetrica 
{
   public static void main(String args[]) 
   {
    // Declarar
    // Variables
       int matriz[][] = new int[4][4];
       int resultado;

       System.out.println("\nLEE NUMEROS EN UNA MATRIZ; E INDICA SI ES SIMETRICA");

       leerMatriz(matriz);
       resultado = simetrica(matriz);
       imprimirMatriz(matriz);

       if (resultado == 1)
          System.out.println("\nLA MATRIZ ES SIMETRICA");
       else
          System.out.println("\nLA MATRIZ NO ES SIMETRICA");
   }

   public static void leerMatriz(int mat[][])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Declarar variables
       int r, c;

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       System.out.println("------------- Matriz -------------");
       for (r = 0; r <= 3; r++)
       {
           for (c = 0; c <= 3; c++)
           {
               System.out.print("Teclee Matriz[" + r + "," + c + "]: ");
               mat[r][c] = entrada.nextInt();
           }
       }  
   }

   public static int simetrica(int m[][])
   {
   // Declarar variables
      int ren, col, resul;

      resul = 1;
      for (ren = 0; ren <= 3; ren++)
      {
          for (col = 0; col <= 3; col++)
          {
              if (m[ren][col] != m[col][ren]) resul = 0;
          }
      }  
      return resul;     
   }

   public static void imprimirMatriz(int ma[][])
   {
   // Declarar variables
      int re, co;

      System.out.println("\n------ Matriz de numeros ------");
      for (re = 0; re <= 3; re++)
      {
          for (co = 0; co <= 3; co++)
          {
              System.out.print(ma[re][co] + "  ");
          }
          System.out.println();
      }       
   }
}
