// Programa TRABAJADORES
// Elaborado por: Leobardo López Román
// Trabajadores.java

import java.util.Scanner;

public class Trabajadores
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreTra;
       int    t, d, totTrab, proDia, totProd, totProdGral;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  PROCESA LA PRODUCCION DE 15 TRABAJADORES\n");

       System.out.println("        REPORTE SEMANAL DE PRODUCCION");
       System.out.println("NOMBRE DEL TRABAJADOR    UNIDADES PRODUCIDAS");
       System.out.println("--------------------------------------------");
       totTrab = 0;
       totProdGral = 0;
       for (t=1; t<=15; t++)
       {
        // Leer datos
           System.out.println("\n------------ Lectura de datos ------------");
           System.out.print("Teclee nombre: ");
           nombreTra = entrada.nextLine();

           totProd = 0;
           for (d=1; d<=6; d++)
           {
               System.out.print("Teclee produccion del dia: ");
               proDia = entrada.nextInt();
               totProd = totProd + proDia;
           } 

        // Imprimir salida
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Nombre = " + nombreTra);
           System.out.println("Unidades producidas = " + totProd);

           totTrab = totTrab + 1;
           totProdGral = totProdGral + totProd;
           entrada.nextLine();
       }
       System.out.println("\n------------------ Total -----------------");
       System.out.println("Total trabajadores = " + totTrab);
       System.out.println("Total produccion general = " + totProdGral);
   }
}
