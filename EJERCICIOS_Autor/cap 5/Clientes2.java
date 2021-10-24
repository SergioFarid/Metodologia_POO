// Programa CLIENTES CON ARTICULOS
// Elaborado por: Leobardo López Román
// Clientes2.java

import java.util.Scanner;

public class Clientes2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreClie, articulo, entradaChar;
       char   otro, hay;
       int    totClientes, cantidad;
       float  precio, totPagar, totPagarClie, totPagarGral;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n     PROCESA LA VENTA A VARIOS CLIENTES\n");

       System.out.println("             REPORTE DE VENTAS");
       System.out.println("NOMBRE           ARTICULO        TOTAL PAGAR");
       System.out.println("--------------------------------------------");
       totClientes = 0;
       totPagarGral = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreClie = entrada.nextLine();
           System.out.println("Nombre = " + nombreClie);
           totPagarClie = 0;
           do
           {
              System.out.print("Teclee articulo: ");
              articulo = entrada.nextLine();

              System.out.print("Teclee cantidad de articulos: ");
              cantidad = entrada.nextInt();

              System.out.print("Teclee precio unitario: ");
              precio = entrada.nextFloat();

              totPagar = cantidad * precio;

              System.out.println("\n------------------- Resultados -------------------");
              System.out.println("Articulo = " + articulo);
              System.out.println("Total a Pagar = " + totPagar);
              totPagarClie = totPagarClie + totPagar;

              System.out.print("\n¿Desea procesar otro articulo(S/N)?: ");
              entradaChar = entrada.next();
              hay = entradaChar.charAt(0);
              entrada.nextLine();
           } while (hay == 'S' || hay == 's');

        // Imprimir salida
           System.out.println("Total pagar cliente = " + totPagarClie);

           totClientes = totClientes + 1;
           totPagarGral = totPagarGral + totPagarClie;

           System.out.print("\n¿Desea procesar otro cliente(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
       } while (otro == 'S' || otro == 's');
       System.out.println("\n---------------------- Total ---------------------");
       System.out.println("Total clientes = " + totClientes);
       System.out.println("Total pagar general = " + totPagarGral);
   }
}
