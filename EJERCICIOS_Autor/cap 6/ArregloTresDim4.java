// Programa ARREGLO TRES DIMENSIONES 
// Elaborado por: Leobardo López Román
// ArregloTresDim4.java

import java.util.Scanner;

public class ArregloTresDim4
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int prod[][][] = new int[6][4][5];
       int pla, est, dia, totEst, totDia, totPlanta, totProd,
           mayPla, mayProdPla, mayEst=0, mayProdEst=0;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE LA PRODUCCION EN UN ARREGLO DE TRES DIMENSIONES");
       System.out.println("E IMPRIME EL REPORTE DE PRODUCCION EN LA PANTALLA");
       System.out.println("PRODUCCION[PLANTA][ESTACION][DIA]");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (pla = 0; pla <= 5; pla++)
       {
           for (est = 0; est <= 3; est++)
           {
               System.out.print("  Planta " + (pla+1) + "  ");
               System.out.println("Estacion " + (est+1)); 
               for (dia = 0; dia <= 4; dia++)
               {
                 System.out.print("Produccion dia " + (dia+1) + ": ");
                 prod[pla][est][dia] = entrada.nextInt();
               }
           }
       }  

    // Imprimir salida
       System.out.println("\n          REPORTE SEMANAL DE PRODUCCION");
       totProd = 0;
       mayProdPla = 0;
       for (pla = 0; pla <= 5; pla++)
       {
           System.out.println("\n------------------- Planta " + (pla+1) + " ------------------");
           System.out.println("            Dia 1 Dia 2 Dia 3 Dia 4 Dia 5 TOTAL");
           System.out.println("            ----- ----- ----- ----- ----- -----");
           mayProdEst = 0;
           for (est = 0; est <= 3; est++)
           {
               System.out.print("Estacion-" + (est+1) + "     ");
               totEst = 0;
               for (dia = 0; dia <= 4; dia++)
               {
                   System.out.print(prod[pla][est][dia] + "     ");
                   totEst = totEst + prod[pla][est][dia];
               }
               System.out.println(totEst);
               if (totEst > mayProdEst)
               { 
                  mayProdEst = totEst;
                  mayEst = est + 1; 
               }
           }
           System.out.println("            ----- ----- ----- ----- ----- -----");
           System.out.print("     Totales   ");
           totPlanta = 0;
           for (dia = 0; dia <= 4; dia++)
           {
               totDia = 0;
               for (est = 0; est <= 3; est++)
               {
                   totDia = totDia + prod[pla][est][dia];
               }
               System.out.print(totDia + "    ");
               totPlanta = totPlanta + totDia;        
           }
           System.out.println(totPlanta);
           System.out.println("              Estacion mas productiva = " + mayEst);           
           System.out.println("Produccion de estacion mas productiva = " + mayProdEst);           
           if (totPlanta > mayProdPla)
           { 
              mayProdPla = totPlanta;
              mayPla = pla + 1; 
           }
           totProd = totProd + totPlanta;
       }
       System.out.println("          Total general de produccion =     " + totProd);           
       System.out.println("\n              Planta mas productiva = " + mayEst);           
       System.out.println("Produccion de planta mas productiva = " + mayProdEst);           
   }
}

