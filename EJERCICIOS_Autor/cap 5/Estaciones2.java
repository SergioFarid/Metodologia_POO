// Programa ESTACIONES DE TRABAJO
// Elaborado por: Leobardo López Román
// Estaciones2.java

import java.util.Scanner;

public class Estaciones2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String observacion, entradaChar;
       char   otra, hay;
       int    estacion, proDia, totProd, nivProductividad, toTotProd,
              estacionMayor=0, prodMayor;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nPROCESA PRODUCCION DE ESTACIONES DE TRABAJO\n");

       System.out.println("\n            REPORTE DE PRODUCCION");
       System.out.println("ESTACION   TOTAL PRODUCCION  NIVEL PRODUCTIVIDAD");
       System.out.println("------------------------------------------------");
       toTotProd = 0;
       prodMayor = 0;
       System.out.print("Teclee nivel de productividad: ");
       nivProductividad = entrada.nextInt();

       for (estacion=1; estacion<=10; estacion++)
       {
           System.out.println("\nEstacion " + estacion);
        // Leer datos
           System.out.println("\n-------------- Lectura de datos --------------");
           totProd = 0;
           System.out.print("\n¿Hay dia de produccion(S/N)?: ");
           entradaChar = entrada.next();
           hay = entradaChar.charAt(0);
           entrada.nextLine();
           while (hay == 'S' || hay == 's')
           {
              System.out.print("Teclee produccion del dia: ");
              proDia = entrada.nextInt();
              totProd = totProd + proDia;

              System.out.print("\n¿Hay otro dia de produccion(S/N)?: ");
              entradaChar = entrada.next();
              hay = entradaChar.charAt(0);
              entrada.nextLine();
           } 

           if (totProd < nivProductividad)
              observacion = "Deficiente";
           else
              if (totProd == nivProductividad)
                 observacion = "Bueno";
              else
                 observacion = "Excelente";

           System.out.println("\n----------------- Resultados -----------------");
           System.out.println("Estacion = " + estacion);
           System.out.println("Total produccion = " + totProd);
           System.out.println("Nivel productividad = " + observacion);

           if (totProd > prodMayor)
           {
              prodMayor = totProd;
              estacionMayor = estacion;
           }
          
           toTotProd = toTotProd + totProd;
       }
       System.out.println("\n------------------- Total --------------------");
       System.out.println("Total produccion = " + toTotProd); 
       System.out.println("Estacion mas productiva = " + estacionMayor); 
       System.out.println("Produccion mayor = " + prodMayor); 
   }
}
