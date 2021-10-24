// Programa PRODUCTO DE VECTORES
// Elaborado por: Leobardo López Román
// ProductoVectores.java

import java.util.Scanner;

public class ProductoVectores
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int vectorA[] = new int[10];
        int vectorB[] = new int[10];
        int r, producto;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nCALCULA EL PRODUCTO DE DOS VECTORES\n");

    // Leer datos
       System.out.println("--------- Lectura de datos --------");
       System.out.println("---------     Vector A     --------");
       for (r = 0; r <= 9; r++)
       {
           System.out.print("Teclee vectorA[" + r + "]: ");
           vectorA[r] = entrada.nextInt();
       }

       System.out.println("---------     Vector B     --------");
       for (r = 0; r <= 9; r++)
       {
           System.out.print("Teclee vectorB[" + r + "]: ");
           vectorB[r] = entrada.nextInt();
       }

    // Imprimir salida
       System.out.println("\n----------- Resultados -----------");
       System.out.println("\nVECTOR A     VECTOR B");
       System.out.println("------------------------");
       producto = 0;
       for (r = 0; r <= 9; r++)
       {
           System.out.println("    " + vectorA[r] + "            " + vectorB[r]);
           producto = producto + (vectorA[r] * vectorB[r]);
       }
       System.out.println("------------------------");
       System.out.println("Producto de los vectores = " + producto);
   }
}

