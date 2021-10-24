// Programa VENDEDORES CON ARTICULOS
// Elaborado por: Leobardo López Román
// Vendedores1.java

import java.util.Scanner;

public class Vendedores1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreVend, articulo, entradaChar;
       char   otro, hay;
       int    totVend, cantidad, clave;
       float  precio, totVendido, incentivo, totIncentivo, 
              venta, totGralIncentivo, totGralVenta;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n    PROCESA LA VENTA DE VARIOS VENDEDORES\n");

       System.out.println("              REPORTE DE INCENTIVOS");
       System.out.println("NOMBRE           ARTICULO        TOTAL PAGAR");
       System.out.println("--------------------------------------------");
       totVend = 0;
       totGralVenta = 0;
       totGralIncentivo = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreVend = entrada.nextLine();
           totVendido = 0;
           totIncentivo = 0;
           do
           {
              System.out.print("Teclee articulo: ");
              articulo = entrada.nextLine();

              System.out.print("Teclee clave de venta (1,2,3,4): ");
              clave = entrada.nextInt();

              System.out.print("Teclee cantidad de articulos: ");
              cantidad = entrada.nextInt();

              System.out.print("Teclee precio unitario: ");
              precio = entrada.nextFloat();

              venta = cantidad * precio;

              switch (clave)
              {
                  case 1:
                          incentivo = venta * 0.15F;
                          break;
                  case 2:
                          incentivo = venta * 0.1F;
                          break;
                  case 3:
                          incentivo = venta * 0.05F;
                          break;
                  case 4:
                          incentivo = venta * 0.03F;
                          break;
                  default:
                          incentivo = 0.0F;
              }
              
              totVendido = totVendido + venta;
              totIncentivo = totIncentivo + incentivo;

              System.out.print("\n¿Desea procesar otro articulo(S/N)?: ");
              entradaChar = entrada.next();
              hay = entradaChar.charAt(0);
              entrada.nextLine();
           } while (hay == 'S' || hay == 's');

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreVend);
           System.out.println("Total vendido = " + totVendido);
           System.out.println("Total incentivo = " + totIncentivo);

           totVend = totVend + 1;
           totGralVenta = totGralVenta + totVendido;
           totGralIncentivo = totGralIncentivo + totIncentivo;

           System.out.print("\n¿Desea procesar otro vendedor(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
       } while (otro == 'S' || otro == 's');
       System.out.println("\n---------------------- Total ---------------------");
       System.out.println("Total vendedores = " + totVend);
       System.out.println("Total general venta = " + totGralVenta);
       System.out.println("Total general incentivo = " + totGralIncentivo);
   }
}
