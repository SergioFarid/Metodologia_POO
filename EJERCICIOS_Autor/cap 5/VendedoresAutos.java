// Programa VENDEDORES DE AUTOS
// Elaborado por: Leobardo López Román
// VendedoresAutos.java

import java.util.Scanner;

public class VendedoresAutos
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreVend, entradaChar;
       char   otro, desea;
       int    totAutos, totVend;
       float  precioAuto, salMin, sueldo, totSueldos, totVendido;

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
        // Leer datos
           System.out.println("\n-------------- Lectura de datos --------------");
           System.out.print("Teclee nombre: ");
           nombreVend = entrada.nextLine();
 
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
           sueldo = salMin + (totAutos*100.00F) + (totVendido*0.02F);

        // Imprimir salida
           System.out.println("\n----------------- Resultados -----------------");
           System.out.println("Nombre = " + nombreVend);
           System.out.println("Sueldo = " + sueldo);
 
           totVend = totVend + 1;
           totSueldos = totSueldos + sueldo;

           System.out.print("\n¿Desea procesar otro vendedor(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\n------------------ Total -----------------");
       System.out.println("Total vendedores = " + totVend);
       System.out.println("Total sueldos = " + totSueldos);
   }
}
