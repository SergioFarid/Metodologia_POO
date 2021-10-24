// Clase ejecutora del programa LLUVIAS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases:  Poblacion y EjecutaPoblacion
// EjecutaPoblacion.java

import java.util.Scanner;

public class EjecutaPoblacion
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String poblacion, entradaChar;
        char   otro, hay;
        int    totPobla, totPobNoLluvia;
        float  lluvia, totLluvia, toTotLluvia;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n   PROCESA LAS LLUVIAS DE POBLACIONES\n");

       System.out.println("\n                REPORTE DE LLUVIAS");
       System.out.println("     POBLACION              TOTAL LLUVIA  NIVEL LLUVIA");
       System.out.println("------------------------------------------------------");
       totPobla = 0;
       totPobNoLluvia = 0;
       toTotLluvia = 0;
       System.out.print("\n¿Hay poblacion(S/N)?: ");
       entradaChar = entrada.next();
       hay = entradaChar.charAt(0);
       entrada.nextLine();
       while (hay == 'S' || hay == 's')
       {
        // Se declara, crea e inicia el objeto de la clase Poblacion
           Poblacion objPoblacion = new Poblacion();

        // Leer datos
           System.out.println("\n------------ Lectura de datos ------------");
           System.out.print("Teclee nombre: ");
           poblacion = entrada.nextLine();
 
           totLluvia = 0;
           System.out.print("\n¿Hay lluvia(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
           while (otro == 'S' || otro == 's')
           {
              System.out.print("Teclee cantidad de lluvia: ");
              lluvia = entrada.nextFloat();
              totLluvia = totLluvia + lluvia;
              System.out.print("\n¿Hay otra lluvia(S/N)?: ");
              entradaChar = entrada.next();
              otro = entradaChar.charAt(0);
              entrada.nextLine();
           } 

        // Establecer los valores leidos, en los datos del objeto
           objPoblacion.establecerNombrePob(poblacion);
           objPoblacion.establecerCantLluvia(totLluvia);

        // Calcular
           objPoblacion.calcularNivelLluvia();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Poblacion = " + objPoblacion.obtenerNombrePob());
           System.out.println("Total lluvia = " + objPoblacion.obtenerCantLluvia());
           System.out.println("Nivel lluvia = " + objPoblacion.obtenerNivelLluvia());

           totPobla = totPobla + 1;
           toTotLluvia = toTotLluvia + objPoblacion.obtenerCantLluvia();

           if (objPoblacion.obtenerCantLluvia() == 0)
           {
              totPobNoLluvia = totPobNoLluvia + 1;
           }
           System.out.print("\n¿Hay otra poblacion(S/N)?: ");
           entradaChar = entrada.next();
           hay = entradaChar.charAt(0);
           entrada.nextLine();
        } while (hay == 'S' || hay == 's');
        System.out.println("\n----------------- Totales ----------------");
        System.out.println("Total poblaciones = " + totPobla);
        System.out.println("Total lluvia = " + toTotLluvia);
        System.out.println("Total poblaciones donde no llovio = " + totPobNoLluvia);
   }
}
