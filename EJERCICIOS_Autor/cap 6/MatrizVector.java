// Programa MATRIZ POR VECTOR COLUMNA
// Elaborado por: Leobardo López Román
// MatrizVector.java

import java.util.Scanner;

public class MatrizVector
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int a[][] = new int[5][6];
       int x[] = new int[5];
       int z[] = new int[5];
       int r, c;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Entrada de datos --------");
       System.out.println("------------- Matriz -------------");
       for (r = 0; r <= 4; r++)
       {
           for (c = 0; c <= 5; c++)
           {
               System.out.print("Teclee a[" + r + "," + c + "]: ");
               a[r][c] = entrada.nextInt();
           }
       }  

       System.out.println("------------- Vector -------------");
       for (r = 0; r <= 4; r++)
       {
           System.out.print("Teclee x[" + r + "]: ");
           x[r] = entrada.nextInt();
       }  

       for (r = 0; r <= 4; r++)
       {
           z[r] = 0;
           for (c = 0; c <= 5; c++)
           {
               z[r] = z[r] + (x[r] * a[r][c]); 
           }
       }  

    // Imprimir salida
       System.out.println("------------- Salida -------------");
       System.out.println("   Matriz         x    z");
       System.out.println("----------------------------------");
       for (r = 0; r <= 4; r++)
       {
           for (c = 0; c <= 5; c++)
           {
               System.out.print(a[r][c] + "  ");
           }
           System.out.println(x[r] + "   " + z[r]);
       } 
   }
}

