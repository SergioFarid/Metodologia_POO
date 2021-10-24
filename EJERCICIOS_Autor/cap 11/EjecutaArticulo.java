// Clase ejecutora del programa CALCULA INFLACION DE ARTICULOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Articulo y EjecutaArticulo
// EjecutaArticulo.java

import java.util.Scanner;

public class EjecutaArticulo
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String art, artMayor="", entradaChar;
       int    totArticulos;
       float  preAn, preAc, totInfla, mayorInfla, promInfla;
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
       mayorInfla = 0;
       do
       {
        // Se declara, crea e inicia el objeto de la clase Articulo
           Articulo objArti = new Articulo();

           System.out.println("\n-------------- Lectura de datos --------------");
           System.out.print("Teclee Articulo: ");
           art = entrada.nextLine();

           System.out.print("Teclee Precio Anterior: ");
           preAn = entrada.nextFloat();

           System.out.print("Teclee Precio Actual: ");
           preAc = entrada.nextFloat();

        // Establecer los valores leidos, en los datos del objeto
           objArti.establecerArticulo(art);
           objArti.establecerPrecioAnt(preAn);
           objArti.establecerPrecioAct(preAc);

        // Calcular 
           objArti.calcularPtjeInfla();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n----------------- Resultados -----------------");
           System.out.println("Articulo = " + objArti.obtenerArticulo());
           System.out.println("Precio Anterior = " + objArti.obtenerPrecioAnt());
           System.out.println("Precio Actual = " + objArti.obtenerPrecioAct());
           System.out.println("Precio Porcentaje de Inflacion = " + objArti.obtenerPtjeInfla());

           if (objArti.obtenerPtjeInfla() > mayorInfla)
           {
              mayorInfla = objArti.obtenerPtjeInfla();
              artMayor = objArti.obtenerArticulo();
           }

           totArticulos = totArticulos + 1; 
           totInfla = totInfla + objArti.obtenerPtjeInfla();
 
           System.out.print("\n¿Desea procesar otro articulo(S/N)?: ");
           entradaChar = entrada.next();
           otro = entradaChar.charAt(0);
           entrada.nextLine();
        } while (otro == 'S' || otro == 's');
        promInfla = totInfla / totArticulos;
        System.out.println("\n------------------- Totales ------------------");
        System.out.println("Promedio de Inflacion  = " + promInfla);
        System.out.println("Articulo con Mayor Inflacion = " + artMayor);
        System.out.println("Porcentaje Mayor de Inflacion = " + mayorInfla);
   }
}
