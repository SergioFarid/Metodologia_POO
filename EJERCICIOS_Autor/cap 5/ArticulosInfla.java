// Programa INFLACION DE ARTICULOS
// Elaborado por: Leobardo López Román
// ArticulosInfla.java

import java.util.Scanner;

public class ArticulosInfla
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String articulo, articuloMayor, entradaChar;
       int    totArticulos;
       float  precioAct, precioAnt, ptjeInfla, totInfla, mayorInfla, promInfla;
       char   otro;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n           PROCESA INFLACION DE VARIOS ARTICULOS\n");

       System.out.println("                        ANALISIS DE INFLACION");
       System.out.println("                                  PRECIO   PRECIO  PORCENTAJE");
       System.out.println("  ARTICULO                       ANTERIOR  ACTUAL  INFLACION");
       System.out.println("-------------------------------------------------------------");
       totArticulos = 0; 
       totInfla = 0;
       articuloMayor = "";
       mayorInfla = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee Articulo: ");
           articulo = entrada.nextLine();

           System.out.print("Teclee Precio Anterior: ");
           precioAnt = entrada.nextFloat();

           System.out.print("Teclee Precio Actual: ");
           precioAct = entrada.nextFloat();

        // Calcular
           ptjeInfla = ((precioAct - precioAnt) / precioAnt) * 100;

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Articulo = " + articulo);
           System.out.println("Precio Anterior = " + precioAnt);
           System.out.println("Precio Actual = " + precioAct);
           System.out.println("Porcentaje de Inflacion = " + ptjeInfla);
 
           if (ptjeInfla > mayorInfla)
           {
              mayorInfla = ptjeInfla;
              articuloMayor = articulo;
           }

           totArticulos = totArticulos + 1; 
           totInfla = totInfla + ptjeInfla;
 
           System.out.print("\n¿Desea procesar otro articulo(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
       } while (otro == 'S' || otro == 's');
       promInfla = totInfla / totArticulos;
       System.out.println("\n--------------------- Totales --------------------");
       System.out.println("Promedio de Inflacion  = " + promInfla);
       System.out.println("Articulo con Mayor Inflacion = " + articuloMayor);
       System.out.println("Porcentaje Mayor de Inflacion = " + mayorInfla);
   }
}
