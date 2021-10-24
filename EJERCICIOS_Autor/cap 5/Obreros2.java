// Programa OBREROS
// Elaborado por: Leobardo López Román
// Obreros2.java

import java.util.Scanner;

public class Obreros2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreObr, obrMayor="", obrMenor="", entradaChar;
       int    proDia, totProd, toTotProd, totObreros, mayorProd, menorProd;
       float  sueldo=0, totSueldos; 
       char   otro, desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  PROCESA LA PRODUCCION DE VARIOS OBREROS\n");

       System.out.println("         REPORTE DE PRODUCCION");
       System.out.println("NOMBRE DEL OBRERO           TOTAL PRODUCCION");
       System.out.println("--------------------------------------------");
       totObreros = 0;
       toTotProd = 0;
       totSueldos = 0;
       mayorProd = 0;
       menorProd = 10000;
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

           if (totProd <= 500)
              sueldo = totProd * 20.00F;
           if (totProd > 500 && totProd <= 800)
              sueldo = totProd * 25.00F;
           if (totProd > 800)
              sueldo = totProd * 30.00F;

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreObr);
           System.out.println("Unidades producidas = " + totProd);
           System.out.println("Sueldo = " + sueldo);

           if (totProd > mayorProd)
           {
              mayorProd = totProd;
              obrMayor = nombreObr;
           }

           if (totProd < menorProd)
           {
              menorProd = totProd;
              obrMenor = nombreObr;
           }

           totObreros = totObreros + 1;
           toTotProd = toTotProd + totProd;
           totSueldos = totSueldos + sueldo;

           System.out.print("\n¿Desea procesar otro obrero(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\n---------------------- Total ---------------------");
       System.out.println("Total obreros = " + totObreros);
       System.out.println("Total produccion = " + toTotProd);
       System.out.println("Total sueldos = " + totSueldos);
       System.out.println("Nombre Obrero mas Productivo = " + obrMayor);
       System.out.println("Produccion que Fabrico= " + mayorProd);
       System.out.println("Nombre Obrero menos Productivo = " + obrMenor);
       System.out.println("Produccion que Fabrico= " + menorProd);
   }
}
