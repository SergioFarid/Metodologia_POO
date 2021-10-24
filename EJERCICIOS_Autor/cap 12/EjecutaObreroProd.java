// Clase ejecutora del programa PRODUCCION PROMEDIO DE OBRERO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: ObreroProd y EjecutaObreroProd
// EjecutaObreroProd.java

import java.util.Scanner;

public class EjecutaObreroProd
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       String nombre;
       int prod[] = new int[30];
       int prod2[] = new int[30];
       int i;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase ObreroProd  
       ObreroProd objObrero = new ObreroProd();

       System.out.println("\n       PROCESA LA PRODUCCION DE OBRERO\n");

    // Leer datos
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee nombre: ");
       nombre = entrada.nextLine();
       for (i=0; i<=29; i++)
       {
          System.out.print("Teclee produccion[" + i + "]: ");
          prod[i] = entrada.nextInt();
       } 

     // Establecer los valores leidos, en los datos del objeto
        objObrero.establecerNombreObr(nombre);
        objObrero.establecerProduccion(prod);

     // Calcular
        objObrero.calcularPromProd();
        objObrero.calcularTotArriba();
        objObrero.CalcularProdMayorDiaMayor();

     // Obtenerr
        prod2 = objObrero.obtenerProduccion();

     // Imprimir
        System.out.println("------------ Salida ------------");
        System.out.println("Nombre = " + objObrero.obtenerNombreObr());
        for (i=0; i<=29; i++)
        {
           System.out.println("Produccion dia " + i + ": " + prod2[i]);
        }
        System.out.println("Promedio de produccion = " + objObrero.obtenerPromProd());
        System.out.println("Total dias arriba del promedio = " + objObrero.obtenerTotArriba());
        System.out.println("Produccion mayor = " + objObrero.obtenerProdMayor());
        System.out.println("Dia de la produccion mayor = " + objObrero.obtenerDiaMayor());
   }
}
