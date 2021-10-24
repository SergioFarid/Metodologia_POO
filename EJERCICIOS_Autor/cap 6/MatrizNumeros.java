// Programa MATRIZ NUMEROS
// Elaborado por: Leobardo López Román
// MatrizNumeros.java

import java.util.Scanner;

public class MatrizNumeros
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int numeros[][] = new int[4][5];
       int ren, col;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE E IMPRIME UNA MATRIZ DE NUMEROS");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (ren = 0; ren <= 3; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print("Teclee numeros[" + ren + "," + col + "]: ");
               numeros[ren][col] = entrada.nextInt();
           }
       }  

    // Imprimir salida
       System.out.println("------------- Salida -------------");
       for (ren = 0; ren <= 3; ren++)
       {
           for (col = 0; col <= 4; col++)
           {
               System.out.print(numeros[ren][col] + "  ");
           }
           System.out.println();
       } 
   }
}

