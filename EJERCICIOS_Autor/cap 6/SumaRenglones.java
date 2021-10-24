// Programa SUMA POR RENGLONES
// Elaborado por: Leobardo López Román
// SumaRenglones.java

import java.util.Scanner;

public class SumaRenglones
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int matriz[][] = new int[5][7];
       int ren, col, suma;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE E IMPRIME UNA MATRIZ DE NUMEROS");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (ren = 0; ren <= 4; ren++)
       {
           for (col = 0; col <= 6; col++)
           {
               System.out.print("Teclee numeros[" + ren + "," + col + "]: ");
               matriz[ren][col] = entrada.nextInt();
           }
       } 

    // Imprimir salida
       System.out.println("----------- Resultados -----------");
       for (ren = 0; ren <= 4; ren++)
       {
           suma = 0;
           for (col = 0; col <= 6; col++)
           {
               System.out.print(matriz[ren][col] + "  ");
               suma = suma + matriz[ren][col];
           }
           System.out.println("  suma   " + suma);
       } 
   }
}

