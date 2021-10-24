// Clase ejecutora del programa ESTACIONES DE TRABAJO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases:  Estacion y EjecutaEstacion
// EjecutaEstacion.java

import java.util.Scanner;

public class EjecutaEstacion
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String entradaChar;
        char   hay;
        int    estacion, proDia, totProd, toTotProd;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nPROCESA PRODUCCION DE ESTACIONES DE TRABAJO\n");

        System.out.println("\n          REPORTE DE PRODUCCION");
        System.out.println("ESTACION   PRODUCCION  NIVEL PRODUCTIVIDAD");
        System.out.println("------------------------------------------");
        toTotProd = 0;
        for (estacion=1; estacion<=10; estacion++)
        {
        // Se declara, crea e inicia el objeto de la clase Estacion
           Estacion objEstacion = new Estacion();

        // Leer datos
           System.out.println("\n------------ Lectura de datos ------------");
           System.out.println("\nEstacion " + estacion);
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

        // Establecer los valores leidos, en los datos del objeto
           objEstacion.establecerNumEstacion(estacion);
           objEstacion.establecerTotProduccion(totProd);

        // Calcular
           objEstacion.calcularNivProductividad();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Estacion = " + objEstacion.obtenerNumEstacion());
           System.out.println("Total produccion  = " + objEstacion.obtenerTotProduccion());
           System.out.println("Nivel productividad  = " + objEstacion.obtenerNivProductividad());

           toTotProd = toTotProd + totProd;
        }
        System.out.println("\n----------------- Total -----------------");
        System.out.println("Total produccion = " + toTotProd); 
   }
}
