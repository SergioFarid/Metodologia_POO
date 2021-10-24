// Clase ejecutora del programa CLIENTE HOJAS HIELO SECO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Cliente2 y EjecutaCliente2
// EjecutaCliente2.java

import java.util.Scanner;

public class EjecutaCliente2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       String nomCli;
       int    tiCli, cant;        
       float  preUni;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Cliente2 
       Cliente2 objCliente = new Cliente2();

       System.out.println("\n      REALIZA CALCULOS DE UN CLIENTE\n");

    // Leer datos
       System.out.println("------------ Lectura de datos ------------");
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
   }
}
