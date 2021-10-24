// Programa CLIENTES HOJAS HIELO SECO
// Elaborado por: Leobardo López Román
// Clientes1.java

import java.util.Scanner;

public class Clientes1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreClie, entradaChar;
       int    tipoClie, cantidad, totClientes;
       float  precioUni, subTotal, descuento, netoPagar,
              totSubTot, totDescuento, totNeto;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n                         PROCESA VARIOS CLIENTES\n");

       System.out.println("                           REPORTE DE CLIENTES");
       System.out.print("  NOMBRE                       SUB.TOTAL      ");
       System.out.println("DESCUENTO     TOTAL A PAGAR");
       System.out.print("---------------------------------------------");
       System.out.println("----------------------------");
       totClientes = 0; 
       totSubTot = 0;
       totDescuento = 0;
       totNeto = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreClie = entrada.nextLine();

           System.out.print("Teclee tipo de cliente (1-4): ");
           tipoClie = entrada.nextInt();

           System.out.print("Teclee cantidad de piezas compradas: ");
           cantidad = entrada.nextInt();

           System.out.print("Teclee precio unitario: ");
           precioUni = entrada.nextFloat();

        // Calcular
           subTotal = cantidad * precioUni;
           switch (tipoClie)
           {
               case 1:
                      descuento = subTotal * 0.05F;
                      break;  
               case 2:
                      descuento = subTotal * 0.08F;
                      break;  
               case 3:
                      descuento = subTotal * 0.12F;
                      break;  
               case 4:
                      descuento = subTotal * 0.15F;
                      break;  
               default:
                      descuento = 0;
          }
          netoPagar = subTotal - descuento;

       // Imprimir salida
          System.out.println("\n------------------- Resultados -------------------");
          System.out.println("Nombre = " + nombreClie);
          System.out.println("Subtotal = " + subTotal);
          System.out.println("Descuento = " + descuento);
          System.out.println("Neto a pagar = " + netoPagar);

          totClientes = totClientes + 1; 
          totSubTot = totSubTot + subTotal;
          totDescuento = totDescuento + descuento;
          totNeto = totNeto + netoPagar;
 
          System.out.print("\n¿Desea procesar otro cliente(S/N)?: ");
          entradaChar = entrada.next();
          desea = entradaChar.charAt(0);
          entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\n--------------------- Totales --------------------");
       System.out.println("Total Clientes  = " + totClientes);
       System.out.println("Total Sub Total = " + totSubTot);
       System.out.println("Total Descuento = " + totDescuento);
       System.out.println("Total Neto a Pagar = " + totNeto);
   }
}
