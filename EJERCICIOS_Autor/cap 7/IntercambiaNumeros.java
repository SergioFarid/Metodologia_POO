// Programa INTERCAMBIA NUMEROS
// Elaborado por: Leobardo López Román
// IntercambiaNumeros.java

import java.util.Scanner;

public class IntercambiaNumeros
{  
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       float a[] = new float[1];
       float b[] = new float[1];

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n       INTERCAMBIA NUMEROS\n");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       System.out.print("Teclee numero 1: ");
       a[0] = entrada.nextFloat();

       System.out.print("Teclee numero 2: ");
       b[0] = entrada.nextFloat();

    // Imprimir salida
       System.out.println("\n------------- Salida -------------");
       System.out.println("------ Antes del intercambio -----");
       System.out.println("a = " + a[0]);
       System.out.println("b = " + b[0]);

       intercambiar(a,b);

       System.out.println("\n----- Despues del intercambio ----");
       System.out.println("a = " + a[0]);         
       System.out.println("b = " + b[0]);
   }
   
   public static void intercambiar(float a1[], float b1[])
   {
   // Declarar variable
      float auxiliar;

      auxiliar = a1[0];
      a1[0] = b1[0];
      b1[0] = auxiliar;
   }
}