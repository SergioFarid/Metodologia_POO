// Programa ARREGLO CUATRO DIMENSIONES 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empresa2 y EjecutaEmpresa2
// EjecutaEmpresa2.java

import java.util.Scanner;

public class EjecutaEmpresa2
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int prod[][][][] = new int[6][3][4][5];
        int prod2[][][][] = new int[6][3][4][5];
        int pla, est, obr, dia, totEst, totDia, totObr, totPlanta, totProd;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nPROCESA ARREGLO DE CUATRO DIMENSIONES\n");

     // Se declara, crea e inicia el objeto de la clase Empresa2
        Empresa2 objEmpresa = new Empresa2();

        System.out.println("--------Lectura de datos--------");
        for (pla=0; pla<=5; pla++)
        {
          for (est=0; est<=2; est++)
          {
            for (obr=0; obr<=3; obr++)
            {
              for (dia=0; dia<=4; dia++)
              {
                System.out.print("Teclee produccion[" + pla + "][" + est + "][" + obr + "][" + dia + "]: ");
                prod[pla][est][obr][dia] = entrada.nextInt();
              }
            } 
          }
        }

     // Establecer
        objEmpresa.establecerProduccion(prod);

     // Obtener
        prod2 = objEmpresa.obtenerProduccion();

     // Imprimir
        System.out.println("        REPORTE SEMANAL DE PRODUCCION");
        totProd = 0;
        for (pla=0; pla<=5; pla++)
        {
          System.out.println("---------------------- PLANTA " + pla + "--------------------------");
          totPlanta = 0;
          for (est=0; est<=2; est++)
          {
            System.out.println("--------------------- ESTACION " + est + "-------------------------");
            System.out.println("              DIA 1 DIA 2 DIA 3 DIA 4 DIA 5 TOTAL");
            System.out.println("              -------------------------------------------");
            for (obr=0; obr<=3; obr++)
            {
              System.out.print("OBRERO  " + obr + "   ");
              totObr = 0;
              for (dia=0; dia<=4; dia++)
              {
                System.out.print(prod2[pla][est][obr][dia] + " ");
                totObr = totObr + prod2[pla][est][obr][dia];
              }
              System.out.println(totObr + " ");
            }
            System.out.print("TOTALES   ");
            totEst = 0;
            for (dia=0; dia<=4; dia++)
            {
              totDia = 0;
              for (obr=0; obr<=3; obr++)
              {
                totDia = totDia + prod2[pla][est][obr][dia];
              }
              System.out.print(totDia + " ");
              totEst = totEst + totDia;
            }
            System.out.println(totEst);
            totPlanta = totPlanta + totEst;
          }
          System.out.println("TOTAL PLANTA                   " + totPlanta);
          totProd = totProd + totPlanta;
        }
        System.out.println("TOTAL GENERAL DE PRODUCCION    " + totProd);
   }
}
