// Programa VENDEDORES MAYOR VENTA DIA
// Elaborado por: Leobardo López Román
// Vendedores3.java

import java.util.Scanner;

public class Vendedores3
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreVend, entradaChar;
       char   otro;
       int    totVend, dia, mejorDia=0;
       float  ventaDia, totVenta, totVentaGral, mayorVenta;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n    PROCESA LA VENTA DE VARIOS VENDEDORES\n");

       System.out.println("              REPORTE SEMANAL DE VENTAS");
       System.out.println("NOMBRE           VENTA SEMANAL  DIA MAYOR VENTA");
       System.out.println("-----------------------------------------------");
       totVend = 0;
       totVentaGral = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreVend = entrada.nextLine();
           totVenta = 0;
           mayorVenta = 0;
           for (dia=1; dia<=6; dia++)
           {
               System.out.print("Teclee venta del dia: ");
               ventaDia = entrada.nextFloat();
               totVenta = totVenta + ventaDia;
               if (ventaDia > mayorVenta)
               {
                  mayorVenta = ventaDia;
                  mejorDia = dia;
               }              
           }
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreVend);
           System.out.println("Total venta = " + totVenta);
           System.out.println("Mejor dia = " + mejorDia);

           totVend = totVend + 1;
           totVentaGral = totVentaGral + totVenta;

           System.out.print("\n¿Hay otro vendedor(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
       } while (otro == 'S' || otro == 's');
       System.out.println("\n---------------------- Total ---------------------");
       System.out.println("Total vendedores = " + totVend);
       System.out.println("Total general venta = " + totVentaGral);
   }
}
