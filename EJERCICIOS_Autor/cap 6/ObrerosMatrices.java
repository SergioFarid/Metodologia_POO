// Programa PRODUCCION 20 OBREROS
// Elaborado por: Leobardo López Román
// ObrerosMatrices.java

import java.util.Scanner;

public class ObrerosMatrices
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String nombres[] = new String[20];
       int produccion[][] = new int[20][6];
       int ren, col, totProd, toTotProd;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n       PROCESA PRODUCCION DE OBREROS\n");

    // Leer datos
       System.out.println("-------------- Lectura de datos --------------");
       for (ren = 0; ren <= 19; ren++)
       {
           System.out.print("Teclee obreros[" + ren + "]: ");
           nombres[ren] = entrada.nextLine();
           for (col = 0; col <= 5; col++)
           {
               System.out.print("Teclee produccion[" + ren + "][" + col + "]: ");
               produccion[ren][col] = entrada.nextInt();
           }
           entrada.nextLine();
       }
 
    // Imprimir salida
       System.out.println("               REPORTE SEMESTRAL DE PRODUCCION");
       System.out.print("NOMBRE DEL OBRERO        MES1 MES2 ");
       System.out.println("MES3 MES4 MES5 MES6 TOT.PRODUCCION");
       System.out.print("-----------------------------------");
       System.out.println("----------------------------------");
       toTotProd = 0;
       for (ren = 0; ren <= 19; ren++)
       {
           System.out.print(nombres[ren] + "   ");
           totProd = 0;
           for (col = 0; col <= 5; col++)
           {
               System.out.print(produccion[ren][col] + " ");
               totProd = totProd + produccion[ren][col];
           }
           System.out.println(totProd);
           toTotProd = toTotProd + totProd;
       }
       System.out.print("-----------------------------------");
       System.out.println("----------------------------------");
       System.out.println("Total                                      " + toTotProd);
   }
}

