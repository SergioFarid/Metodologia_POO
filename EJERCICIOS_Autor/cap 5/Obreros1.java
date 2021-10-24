// Programa OBREROS
// Elaborado por: Leobardo López Román
// Obreros1.java

import java.util.Scanner;

public class Obreros1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreObr, entradaChar;
       int    proDia, totProd, toTotProd, totObreros;
       char   otro, desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  PROCESA LA PRODUCCION DE VARIOS OBREROS\n");

       System.out.println("         REPORTE DE PRODUCCION");
       System.out.println("NOMBRE DEL OBRERO           TOTAL PRODUCCION");
       System.out.println("--------------------------------------------");
       totObreros = 0;
       toTotProd = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreObr = entrada.nextLine();

           totProd = 0;
           do
           {
              System.out.print("Teclee produccion del dia: ");
              proDia = entrada.nextInt();
              totProd = totProd + proDia;

              System.out.print("\n¿Desea procesar otro Dia(S/N)?: ");

              entradaChar = entrada.next();
              otro = entradaChar.charAt(0);
              entrada.nextLine();
           } while (otro == 'S' || otro == 's');

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreObr);
           System.out.println("Unidades producidas = " + totProd);

           totObreros = totObreros + 1;
           toTotProd = toTotProd + totProd;

           System.out.print("\n¿Desea procesar otro obrero(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\n---------------------- Total ---------------------");
       System.out.println("Total obreros = " + totObreros);
       System.out.println("Total produccion = " + toTotProd);
   }
}
