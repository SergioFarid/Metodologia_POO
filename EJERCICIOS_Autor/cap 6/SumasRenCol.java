// Programa SUMA POR RENGLONES Y COLUMNAS
// Elaborado por: Leobardo López Román
// SumasRenCol.java

import java.util.Scanner;

public class SumasRenCol
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int matriz[][] = new int[4][5];
       int r, c, renMay=0, colMay=0, sumaRen, sumaCol, mayorRen, mayorCol;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Entrada de datos --------");
       for (r = 0; r <= 3; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print("Teclee matriz[" + r + "," + c + "]: ");
               matriz[r][c] = entrada.nextInt();
           }
       } 

    // Imprimir salida
       System.out.println("------------- Salida -------------");
       mayorRen = -9999;
       for (r = 0; r <= 3; r++)
       {
           sumaRen = 0;
           for (c = 0; c <= 4; c++)
           {
               System.out.print(matriz[r][c] + "  ");
               sumaRen = sumaRen + matriz[r][c];
           }
           System.out.println("  suma   " + sumaRen);
           if (sumaRen > mayorRen)
           {
              mayorRen = sumaRen;
              renMay = r;
           }
       } 

       mayorCol = -9999;
       for (c = 0; c <= 4; c++)
       {
           sumaCol = 0;
           for (r = 0; r <= 3; r++)
           {
               sumaCol = sumaCol + matriz[r][c];
           }
           System.out.print(sumaCol + "  ");
           if (sumaCol > mayorCol)
           {
              mayorCol = sumaCol;
              colMay = c;
           }
       } 
       System.out.println("\nRenglon mayor = " + renMay);
       System.out.println("Columna mayor = " + colMay);
   }
}

