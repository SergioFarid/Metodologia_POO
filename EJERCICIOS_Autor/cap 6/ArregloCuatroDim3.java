// Programa ARREGLO CUATRO DIMENSIONES 
// Elaborado por: Leobardo López Román
// ArregloCuatroDim3.java

import java.util.Scanner;

public class ArregloCuatroDim3
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int prod[][][][] = new int[6][3][4][5];
       int pla, est, obr, dia, totEst, totDia, totObr, totPlanta, totProd;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE LA PRODUCCION EN UN ARREGLO DE 4 DIMENSIONES");
       System.out.println("E IMPRIME EL REPORTE DE PRODUCCION EN LA PANTALLA");
       System.out.println("PRODUCCION[PLANTA][ESTACION][OBRERO][DIA]");
    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (pla = 0; pla <= 5; pla++)
       {
         for (est = 0; est <= 2; est++)
         {
           for (obr = 0; obr <= 3; obr++)
           {
             System.out.print("    Planta " + (pla+1) + "  ");
             System.out.println("Estacion " + (est+1)); 
             System.out.println("    Obrero " + (obr+1)); 
             for (dia = 0; dia <= 4; dia++)
             {
               System.out.print("Produccion dia " + (dia+1) + ": ");
               prod[pla][est][obr][dia] = entrada.nextInt();
             }
           }
         }
       }  

    // Imprimir salida
       System.out.println("\n        REPORTE SEMANAL DE PRODUCCION");
       totProd = 0;
       for (pla = 0; pla <= 5; pla++)
       {
         System.out.println("----------------------------------------------");
         System.out.println("                 Planta " + (pla+1) );
         System.out.println("----------------------------------------------");
         totPlanta = 0;
         for (est = 0; est <= 2; est++)
         {
           System.out.println("              Estacion " + (est+1));
           System.out.println("           Dia 1 Dia 2 Dia 3 Dia 4 Dia 5 Total");
           System.out.println("           ----- ----- ----- ----- ----- -----");
           for (obr = 0; obr <= 2; obr++)
           {
             System.out.print("Obrero - " + (obr+1) + "    ");
             totObr = 0;
             for (dia = 0; dia <= 4; dia++)
             {
               System.out.print(prod[pla][est][obr][dia] + "     ");
               totObr = totObr + prod[pla][est][obr][dia];
             }
             System.out.println(totObr);
           }
           System.out.println("           ----- ----- ----- ----- ----- -----");
           System.out.print("   Totales     ");
           totEst = 0;
           for (dia = 0; dia <= 4; dia++)
           {
              totDia = 0;
              for (obr = 0; obr <= 2; obr++)
              {
                 totDia = totDia + prod[pla][est][obr][dia];
              }
              System.out.print(totDia + "    ");
              totEst = totEst + totDia;
           }
           System.out.println(totEst);
           System.out.println("----------------------------------------------");             
           totPlanta = totPlanta + totEst;
         } 
         System.out.println("    Total produccion planta         " + totPlanta);
         System.out.println("----------------------------------------------");             
         totProd = totProd + totPlanta;
       }
       System.out.println("Total general de produccion        " + totProd);
   }
}

