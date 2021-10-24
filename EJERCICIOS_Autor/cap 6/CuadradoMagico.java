// Programa CUADRADO MAGICO
// Elaborado por: Leobardo López Román
// CuadradoMagico.java

import java.util.Scanner;

public class CuadradoMagico
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int cuadrado[][] = new int[3][3];
       int r, c, sumDiag1, sumDiag2, sumRen, sumCol, bandera;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 2; c++)
           {
               System.out.print("Teclee a[" + r + "," + c + "]: ");
               cuadrado[r][c] = entrada.nextInt();
           }
       }  

    // Imprimir salida
       bandera = 0;
       sumDiag1 = 0;
       System.out.println("\n------ Cuadrado magico ------\n");
       for (r = 0; r <= 2; r++)
       {
           System.out.print(" ");
           sumRen = 0;
           for (c = 0; c <= 2; c++)
           {
               System.out.print(cuadrado[r][c] + "     ");
               sumRen = sumRen + cuadrado[r][c];
               if (r == c)
               {
                  sumDiag1 = sumDiag1 + cuadrado[r][c];
               }
           }
           System.out.println("   " + sumRen);

           if (sumRen != 15)
           {
              bandera = 1;
           }
       } 

       System.out.println();
       for (r = 0; r <= 2; r++)
       {
           sumCol = 0;
           for (c = 0; c <= 2; c++)
           {
               sumCol = sumCol + cuadrado[r][c];
           }
           System.out.print(sumCol + "    ");
           if (sumCol != 15)
           {
              bandera = 1;
           }
       } 

       sumDiag2 = 0;
       for (r = 0; r <= 2; r++)
       {
           sumDiag2 = sumDiag2 + cuadrado[r][2-r];
       }

       System.out.println("\n\nDiagonal 1 = " + sumDiag1);
       System.out.println("Diagonal 2 = " + sumDiag2);

       if (sumDiag1 != 15 || sumDiag2 != 15)
       {
          bandera = 1;
       }

       if (bandera == 0)
          System.out.println("\nEs un cuadrado magico");
       else
          System.out.println("\nNo es un cuadrado magico");       
   }
}
