// Programa MAYOR RENGLON MENOR COLUMNA
// Elaborado por: Leobardo López Román
// MayorRenMenorCol.java

import java.util.Scanner;

public class MayorRenMenorCol
{
   public static void main(String args[]) 
   {
    // Declarar
    // Variables
       int matriz[][] = new int[4][3];

       System.out.println("\nLEE NUMEROS EN UNA MATRIZ; E IMPRIME LOS ELEMENTOS");
       System.out.println("      QUE A SU VEZ ES EL MAYOR DE SU RENGLON");
       System.out.println("            Y EL MENOR EN SU COLUMNA");

       leerMatriz(matriz);
       imprimirMatriz(matriz);
   }

   public static void leerMatriz(int mat[][])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Declarar variables
       int r, c;

    // Leer datos
       System.out.println("-------- Entrada de datos --------");
       System.out.println("------------- Matriz -------------");
       for (r = 0; r <= 3; r++)
       {
           for (c = 0; c <= 2; c++)
           {
               System.out.print("Teclee Matriz[" + r + "," + c + "]: ");
               mat[r][c] = entrada.nextInt();
           }
       }  
   }

   public static void imprimirMatriz(int ma[][])
   {
   // Declarar variables
      int re, co, r, c, ren, mayRen, menCol, reMa, coMa, reMe, coMe;

      System.out.println("\n------ Matriz de numeros ------");
      for (re = 0; re <= 3; re++)
      {
          for (co = 0; co <= 2; co++)
          {
              System.out.print(ma[re][co] + "  ");
          }
          System.out.println();
      } 
      
      for (ren=0; ren<=3; ren++)
      {
          mayRen = ma[ren][0];
          reMa = ren; 
          coMa = 0;
          for (c=1; c<=2; c++)
          {
              if (ma[ren][c] > mayRen)
              {
                 mayRen = ma[ren][c];
                 reMa = ren;
                 coMa = c;    
              }
          }
          menCol = ma[0][coMa];
          reMe = 0;
          coMe = coMa;

          for (r=1; r<=3; r++)
          {
              if (ma[r][coMa] < menCol)
              {
                 menCol = ma[r][coMa];
                 reMe = r;
                 coMe = coMa;    
              }
          }

          if (reMa == reMe && coMa == coMe)
          {
             System.out.println("\nEL MAYOR DE SU RENGLON Y MENOR EN SU COLUMNA ES\n");
             System.out.println("Elemento = " + ma[reMa][coMa]);
             System.out.println("Renglon No. = " + reMa);
             System.out.println("Columna No. = " + coMa);
          }
      }
   }
}
