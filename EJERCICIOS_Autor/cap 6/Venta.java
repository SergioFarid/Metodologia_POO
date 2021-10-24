// Programa VENTAS MES
// Elaborado por: Leobardo López Román
// Venta.java

import java.util.Scanner;

public class Venta
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nombreVend;
        float  ventas[] = new float[30];
        int    i;
        float  totVenta;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n    PROCESA LAS VENTAS DE UN VENDEDOR\n");

    // Leer datos
       System.out.println("\n------------ Lectura de datos ------------");
       System.out.print("Teclee nombre: ");
       nombreVend = entrada.nextLine();

       for (i = 0; i <= 29; i++)
       {
           System.out.print("Teclee venta dia[" + i + "]: ");
           ventas[i] = entrada.nextFloat();
       }
 
    // Imprimir salida
       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("Nombre = " + nombreVend);
       totVenta = 0;
       for (i = 0; i <= 29; i++)
       {
           System.out.println("Venta dia[" + i + "]= " + ventas[i]);
           totVenta = totVenta + ventas[i];
       }
       System.out.println("Total venta = " + totVenta);
   }
}

