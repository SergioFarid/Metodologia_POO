// Programa LLUVIAS
// Elaborado por: Leobardo López Román
// Lluvias.java

import java.util.Scanner;

public class Lluvias
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

       System.out.println("\n           REPORTE DE LLUVIAS");
       System.out.println("     POBLACION              TOTAL LLUVIA");
       System.out.println("------------------------------------------");
       totPobla = 0;
       totPobNoLluvia = 0;
       toTotLluvia = 0;
       System.out.print("\n¿Hay poblacion(S/N)?: ");
       entradaChar = entrada.next();
       hay = entradaChar.charAt(0);
       entrada.nextLine();
       while (hay == 'S' || hay == 's')
       {
        // Leer datos
           System.out.println("\n-------------- Lectura de datos --------------");
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

        // Imprimir salida
           System.out.println("\n----------------- Resultados -----------------");
           System.out.println("Poblacion = " + poblacion);
           System.out.println("Total lluvia = " + totLluvia);
 
           totPobla = totPobla + 1;
           toTotLluvia = toTotLluvia + totLluvia;

           if (totLluvia == 0)
           {
              totPobNoLluvia = totPobNoLluvia + 1;
           }
           System.out.print("\n¿Hay otra poblacion(S/N)?: ");
           entradaChar = entrada.next();
           hay = entradaChar.charAt(0);
           entrada.nextLine();
       } while (hay == 'S' || hay == 's');
       System.out.println("\n------------------ Total -----------------");
       System.out.println("Total poblaciones = " + totPobla);
       System.out.println("Total lluvia = " + toTotLluvia);
       System.out.println("Total poblaciones donde no llovio = " + totPobNoLluvia);
   }
}
