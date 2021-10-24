// Programa SUMA MATRICES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Matrices1 y EjecutaMatrices1
// EjecutaMatrices1.java

import java.util.Scanner;

public class EjecutaMatrices1
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int matr1[][] = new int[5][5];
        int matr12[][] = new int[5][5];
        int matr2[][] = new int[5][5];
        int matr22[][] = new int[5][5];
        int matr3[][] = new int[5][5];
        int matr32[][] = new int[5][5];
        int ren, col;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nSUMA DOS MATRICES DE NUMEROS\n");

     // Se declara, crea e inicia el objeto de la clase Matrices1
        Matrices1 objMatrices = new Matrices1();

        System.out.println("--------Lectura de datos--------");
        System.out.println("--------  Matriz 1  --------");
        for (ren=0; ren<=4; ren++)
        {
           for (col=0; col<=4; col++)
           {
              System.out.print("Teclee matriz1[" + ren + "][" +  col + "]: ");
              matr1[ren][col] = entrada.nextInt();
           } 
        }

        System.out.println("--------  Matriz 2  --------");
        for (ren=0; ren<=4; ren++)
        {
           for (col=0; col<=4; col++)
           {
              System.out.print("Teclee matriz2[" + ren + "][" +  col + "]: ");
              matr2[ren][col] = entrada.nextInt();
           } 
        }

     // Establecer
        objMatrices.establecerMatriz1(matr1);
        objMatrices.establecerMatriz2(matr2);

     // Calcular
        objMatrices.calcularMatriz3();

     // Obtener
        matr12 = objMatrices.obtenerMatriz1();
        matr22 = objMatrices.obtenerMatriz2();
        matr32 = objMatrices.obtenerMatriz3();

     // Imprimir
        System.out.println("        MATRIZ 1    ");
        System.out.println("------------------------------");
        for (ren=0; ren<=4; ren++)
        {
           for (col=0; col<=4; col++)
           {
               System.out.print(matr12[ren][col] + "  ");
           }
           System.out.println();
        }

        System.out.println("        MATRIZ 2    ");
        System.out.println("------------------------------");
        for (ren=0; ren<=4; ren++)
        {
           for (col=0; col<=4; col++)
           {
               System.out.print(matr22[ren][col] + "  ");
           }
           System.out.println();
        }

        System.out.println("        MATRIZ 3    ");
        System.out.println("------------------------------");
        for (ren=0; ren<=4; ren++)
        {
           for (col=0; col<=4; col++)
           {
               System.out.print(matr32[ren][col] + "  ");
           }
           System.out.println();
        }
   }
}
