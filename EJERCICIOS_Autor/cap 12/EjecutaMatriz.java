// Clase ejecutora del programa MATRIZ CON SUMAS POR RENGLONES Y COLUMNAS 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Matriz y EjecutaMatriz
// EjecutaMatriz.java

import java.util.Scanner;

public class EjecutaMatriz
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int mat[][] = new int[5][7];
        int mat2[][] = new int[5][7];
        int sumaRen[] = new int[5];
        int sumaCol[] = new int[7];
        int ren, col;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nMATRIZ CON SUMAS POR RENGLONES Y COLUMNAS\n");

     // Se declara, crea e inicia el objeto de la clase Matrices1
        Matriz objMatriz = new Matriz();

        System.out.println("--------Lectura de datos--------");
        System.out.println("--------     Matriz     --------");
        for (ren=0; ren<=4; ren++)
        {
           for (col=0; col<=6; col++)
           {
              System.out.print("Teclee matriz[" + ren + "][" +  col + "]: ");
              mat[ren][col] = entrada.nextInt();
           } 
        }

     // Establecer
        objMatriz.establecerMatriz(mat);

     // Calcular
        objMatriz.calcularSumaRenglones();
        objMatriz.calcularSumaColumnas();

     // Obtener
        mat2 = objMatriz.obtenerMatriz();
        sumaRen = objMatriz.obtenerSumaRenglones();
        sumaCol = objMatriz.obtenerSumaColumnas();

     // Imprimir
        System.out.println("        MATRIZ             SUMAS");
        System.out.println("--------------------------------");
        for (ren=0; ren<=4; ren++)
        {
           System.out.print("      ");
           for (col=0; col<=6; col++)
           {
               System.out.print(mat2[ren][col] + "  ");
           }
           System.out.println("  " + sumaRen[ren]);
        }
        System.out.print("SUMAS ");
        for (col=0; col<=6; col++)
            System.out.print(sumaCol[col] + "  ");
   }
}
