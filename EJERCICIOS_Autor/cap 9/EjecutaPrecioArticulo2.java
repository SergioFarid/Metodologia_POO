// Clase ejecutora del programa PRECIO DE VENTA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: PrecioArticulo2 y EjecutaPrecioArticulo2
// EjecutaPrecioArticulo2.java

import java.util.Scanner;

public class EjecutaPrecioArticulo2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       String desc;
       float  cos;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase PrecioArticulo2 
       PrecioArticulo2 objArticulo = new PrecioArticulo2();

       System.out.println("\n     CALCULA PRECIO DE VENTA DE UN ARTICULO\n");

    // Leer datos
       System.out.println("--------------- Lectura de datos ---------------");
       System.out.print("Teclee descripcion del articulo: ");
       desc = entrada.nextLine();

       System.out.print("Teclee costo de produccion: ");
       cos = entrada.nextFloat();

    // Establecer los valores leidos, en los datos del objeto
       objArticulo.establecerDescripcion(desc);
       objArticulo.establecerCosto(cos);

    // Calcular
       objArticulo.calcularPrecioVta();

    // Imprimir salida, obteniendo los datos del objeto
       System.out.println("\n------------------ Resultados ------------------");
       System.out.println("Articulo = " + objArticulo.obtenerDescripcion());
       System.out.println("Precio de venta = " + objArticulo.obtenerPrecioVta());
   }
}
