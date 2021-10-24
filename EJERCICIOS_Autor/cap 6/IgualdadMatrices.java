// Programa IGUALDAD DE MATRICES
// Elaborado por: Leobardo López Román
// IgualdadMatrices.java

import java.util.Scanner;

public class IgualdadMatrices
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int a[][] = new int[3][5];
       int b[][] = new int[3][5];
       int r, c, bandera;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Entrada de datos --------");
       System.out.println("------------ Matriz 1 ------------");
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print("Teclee a[" + r + "," + c + "]: ");
               a[r][c] = entrada.nextInt();
            }
       }  

       System.out.println("------------ Matriz 2 ------------");
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print("Teclee b[" + r + "," + c + "]: ");
               b[r][c] = entrada.nextInt();
           }
       }  

    // Imprimir salida
       System.out.println("------------- Salida -------------");
       System.out.println("------------ Matriz 1 ------------");
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print(a[r][c] + "  ");
           }
           System.out.println();
       } 

       System.out.println("\n------------ Matriz 2 ------------");
       bandera = 0;
       for (r = 0; r <= 2; r++)
       {
           for (c = 0; c <= 4; c++)
           {
               System.out.print(b[r][c] + "  ");
               if (a[r][c] != b[r][c])
               {
                  bandera = 1;
               }
           }
           System.out.println();
       } 
       if (bandera == 0)
          System.out.println("\nLas matrices son iguales");
       else
          System.out.println("\nLas matrices no son iguales");
   }
}

