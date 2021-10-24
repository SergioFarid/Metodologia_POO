// Clase ejecutora del programa CLIENTES HOJAS HIELO SECO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Cliente3 y EjecutaCliente3
// EjecutaCliente3.java

import java.util.Scanner;

public class EjecutaCliente3
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String nomCli, entradaChar;
       int    tiCli, cant, totClientes;
       float  preUni, totSubTot, totDescuento, totNeto;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n              PROCESA VARIOS CLIENTES\n");

       System.out.println("               REPORTE DE CLIENTES");
       System.out.println("  NOMBRE                 SUB.TOT. DESCUENTO  NETO");
       System.out.println("-------------------------------------------------");
       totClientes = 0;
       totSubTot = 0;
       totDescuento = 0;
       totNeto = 0;
       do
       {
        // Se declara, crea e inicia el objeto de la clase Cliente3
           Cliente3 objCliente = new Cliente3();

           System.out.println("\n------------ Lectura de datos ------------");
           System.out.print("Teclee nombre: ");
           nomCli = entrada.nextLine();

           System.out.print("Teclee tipo de cliente (1-4): ");
           tiCli = entrada.nextInt();

           System.out.print("Teclee cantidad de piezas compradas: ");
           cant = entrada.nextInt();

           System.out.print("Teclee precio unitario: ");
           preUni = entrada.nextFloat();

        // Establecer los valores leidos, en los datos del objeto
           objCliente.establecerNombreClie(nomCli);
           objCliente.establecerTipoClie(tiCli);
           objCliente.establecerCantidad(cant);
           objCliente.establecerPrecioUni(preUni);

        // Calcular
           objCliente.calcularSubTotal();
           objCliente.calcularDescuento();
           objCliente.calcularNetoPagar();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Nombre = " + objCliente.obtenerNombreClie());
           System.out.println("Subtotal = " + objCliente.obtenerSubTotal());
           System.out.println("Descuento = " + objCliente.obtenerDescuento());
           System.out.println("Neto a pagar = " + objCliente.obtenerNetoPagar());

           totClientes = totClientes + 1;
           totSubTot = totSubTot + objCliente.obtenerSubTotal();
           totDescuento = totDescuento + objCliente.obtenerDescuento();
           totNeto = totNeto + objCliente.obtenerNetoPagar();

           System.out.print("\n¿Desea procesar otro cliente(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\nTotal clientes = " + totClientes);
       System.out.println("Total subtotal = " + totSubTot);
       System.out.println("Total descuento = " + totDescuento);
       System.out.println("Total neto = " + totNeto);
   }
}
