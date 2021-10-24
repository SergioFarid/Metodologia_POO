// Clase ejecutora del programa PRODUCCION 20 OBREROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: ObrerosProd y EjecutaObrerosProd
// EjecutaObrerosProd.java

import java.util.Scanner;

public class EjecutaObrerosProd
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        String obreros[] = new String[20];
        String obreros2[] = new String[20];
        int prod[][] = new int[20][6];
        int prod2[][] = new int[20][6];
        int toPro[] = new int[20];
        int toMeses[] = new int[6];
        int ren, col;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nPROCESA LA PRODUCCION DE 20 OBREROS\n");

     // Crear objeto
        ObrerosProd objObrero = new ObrerosProd();

        System.out.println("--------Lectura de datos--------");
        for (ren=0; ren<=19; ren++)
        {
           System.out.print("Teclee nombre del obrero " + ren +": ");
           obreros[ren] = entrada.nextLine();           
           for (col=0; col<=5; col++)
           {
              System.out.print("Teclee produccion[" + ren + "][" +  col + "]: ");
              prod[ren][col] = entrada.nextInt();
           } 
           entrada.nextLine();
        }

     // Establecer
        objObrero.establecerNombres(obreros);
        objObrero.establecerProduccion(prod);

     // Calcular
        objObrero.calcularTotProd();
        objObrero.calcularTotMes();
        objObrero.calcularToTotProd();

     // Obtener
        obreros2 = objObrero.obtenerNombres();
        prod2 = objObrero.obtenerProduccion();
        toPro = objObrero.obtenerTotProd();
        toMeses = objObrero.obtenerTotMes();

     // Imprimir
        System.out.println("              REPORTE SEMESTRAL DE PRODUCCION");
        System.out.println(" NOMBRE          MES1 MES 2 MES3 MES4 MES5 MES6 TOT.PROD.");
        System.out.println("---------------------------------------------------------");
        for (ren=0; ren<=19; ren++)
        {
          System.out.print(obreros2[ren] + " ");
          for (col=0; col<=5; col++)
          {
            System.out.print(prod2[ren][col] + " ");
          }
          System.out.println(toPro[ren]);
        }
        System.out.print("TOTAL                ");
        for (col=0; col<=5; col++)
            System.out.print(toMeses[col] + " ");
        System.out.println("  " + objObrero.obtenerToTotProd());
   }
}
