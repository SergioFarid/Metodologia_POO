// Programa ARREGLO TRES DIMENSIONES 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empresa1 y EjecutaEmpresa1
// EjecutaEmpresa1.java

import java.util.Scanner;

public class EjecutaEmpresa1
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int prod[][][] = new int[6][4][5];
        int prod2[][][] = new int[6][4][5];
        int pla, est, dia, totEst, totDia, totPlanta, totProd;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nPROCESA ARREGLO DE TRES DIMENSIONES\n");

     // Se declara, crea e inicia el objeto de la clase Empresa1
        Empresa1 objEmpresa = new Empresa1();

        System.out.println("--------Lectura de datos--------");
        for (pla=0; pla<=5; pla++)
        {
          for (est=0; est<=3; est++)
          {
            for (dia=0; dia<=4; dia++)
            {
              System.out.print("Teclee produccion[" + pla + "][" + est + "][" +  dia + "]: ");
              prod[pla][est][dia] = entrada.nextInt();
            } 
          }
        }
     // Establecer
        objEmpresa.establecerProduccion(prod);

     // Obtener
        prod2 = objEmpresa.obtenerProduccion();

     // Imprimir
        System.out.println("           REPORTE SEMANAL DE PRODUCCION");
        totProd = 0;
        for (pla=0; pla<=5; pla++)
        {
          System.out.println("---------------------- PLANTA " + pla + "--------------------------");
          System.out.println("              DIA 1 DIA 2 DIA 3 DIA 4 DIA 5 TOTAL");
          System.out.println("              -------------------------------------------");
          for (est=0; est<=3; est++)
          {
            System.out.print("ESTACION " + est + "   ");
            totEst = 0;
            for (dia=0; dia<=4; dia++)
            {
              System.out.print(prod2[pla][est][dia] + " ");
              totEst = totEst + prod2[pla][est][dia];
            }
            System.out.println(totEst + " ");
          }
          System.out.print("TOTALES   ");
          totPlanta = 0;
          for (dia=0; dia<=4; dia++)
          {
            totDia = 0;
            for (est=0; est<=3; est++)
            {
              totDia = totDia + prod2[pla][est][dia];
            }
            System.out.print(totDia + " ");
            totPlanta = totPlanta + totDia;
          }
          System.out.println(totPlanta);
          totProd = totProd + totPlanta;
        }
        System.out.println("TOTAL GENERAL DE PRODUCCION    " + totProd);
   }
}
