// Programa PRODUCCION 30 DIAS
// Elaborado por: Leobardo López Román
// Produccion.java

import java.util.Scanner;

public class Produccion
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int produccion[] = new int[30];
       int i;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  LEE E IMPRIME LA PRODUCCION DE 30 DIAS\n");

    // Leer datos
       System.out.println("\n------------ Lectura de datos ------------");
       for (i = 0; i <= 29; i++)
       {
           System.out.print("Teclee produccion[" + i + "]: ");
           produccion[i] = entrada.nextInt();
       }
 
    // Imprimir salida
       System.out.println("\n--------------- Resultados ---------------");
       for (i = 0; i <= 29; i++)
       {
           System.out.println("Produccion[" + i + "]= " + produccion[i]);
       }
   }
}

