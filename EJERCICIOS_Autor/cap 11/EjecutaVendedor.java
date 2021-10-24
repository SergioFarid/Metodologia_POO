// Clase ejecutora del programa VENDEDORES DE AUTOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases:  Vendedor y EjecutaVendedor
// EjecutaVendedor.java

import java.util.Scanner;

public class EjecutaVendedor
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nombre, entradaChar;
        char desea, otro;
        int totAutos, totVend;
        float precioAuto, salMin, sueldo, totSueldos, totVendido;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nPROCESA LAS VENTAS DE VENDEDORES DE AUTOS\n");

       System.out.print("Teclee salario minimo quincenal: ");
       salMin = entrada.nextFloat();
       entrada.nextLine();

       System.out.println("\n             NOMINA QUINCENAL");
       System.out.println("       NOMBRE                     SUELDO");
       System.out.println("------------------------------------------");
       totSueldos = 0;
       totVend = 0;
       do
       {
        // Se declara, crea e inicia el objeto de la clase Vendedor
           Vendedor objVendedor = new Vendedor();

        // Leer datos
           System.out.println("\n------------ Entrada de datos ------------");
           System.out.print("Teclee nombre: ");
           nombre = entrada.nextLine();
 
           totAutos = 0;
           totVendido = 0;
           System.out.print("\n¿Hay auto vendido(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
           while (otro == 'S' || otro == 's')
           {
              System.out.print("Teclee precio del auto: ");
              precioAuto = entrada.nextFloat();

              totAutos = totAutos + 1;
              totVendido = totVendido + precioAuto;

              System.out.print("\n¿Hay otro auto vendido(S/N)?: ");
              entradaChar = entrada.next();
              otro = entradaChar.charAt(0);
              entrada.nextLine();
           } 

        // Establecer los valores leidos, en los datos del objeto
           objVendedor.establecerNombreVend(nombre);
           objVendedor.establecerTotalVentas(totVendido);
           objVendedor.establecerTotalAutosVend(totAutos); 
           objVendedor.establecerSalarioMinimo(salMin);

        // Calcular
           objVendedor.calcularSueldoVend();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Nombre = " + objVendedor.obtenerNombreVend());
           System.out.println("Sueldo = " + objVendedor.obtenerSueldoVend());

           totVend = totVend + 1;
           totSueldos = totSueldos + objVendedor.obtenerSueldoVend();

           System.out.print("\n¿Desea procesar otro vendedor(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
        } while (desea == 'S' || desea == 's');
        System.out.println("\n----------------- Totales ----------------");
        System.out.println("Total vendedores = " + totVend);
        System.out.println("Total sueldos = " + totSueldos);
   }
}
