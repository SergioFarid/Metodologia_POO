// Programa PRODUCCION PROMEDIO
// Elaborado por: Leobardo López Román
// ProduccionObrero.java

import java.util.Scanner;

public class ProduccionObrero
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nombreObr;
        int produccion[] = new int[30];
        int i, totArriba, sumaProd, diaMayor=0, prodMayor;
        float promedio;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n   PROCESA PRODUCCION DE UN OBRERO\n");

    // Leer datos
       System.out.println("\n---------- Lectura de datos ----------");
       System.out.print("Teclee nombre: ");
       nombreObr = entrada.nextLine();
       sumaProd = 0;
       for (i = 0; i <= 29; i++)
       {
           System.out.print("Teclee produccion[" + i + "]: ");
           produccion[i] = entrada.nextInt();
           sumaProd = sumaProd + produccion[i];
       }
       promedio = (float)sumaProd / 30;
       totArriba = 0;
       prodMayor = 0;
    // Imprimir salida
       System.out.println("\n------------- Resultados -------------");
       System.out.println("Nombre = " + nombreObr);

       for (i = 0; i <= 29; i++)
       {
           System.out.println("Produccion[" + i + "]= " + produccion[i]);

           if (produccion[i] > promedio)
           {
              totArriba = totArriba + 1;
           }

           if (produccion[i] > prodMayor)
           {
              prodMayor = produccion[i];
              diaMayor = i;
           }
       }
       System.out.println("Promedio de produccion = " + promedio);
       System.out.println("Total de dias arriba del Promedio = " + totArriba);
       System.out.println("Cantidad Producida mas alta = " + prodMayor);
       System.out.println("Dia mas productivo = " + diaMayor);
   }
}

