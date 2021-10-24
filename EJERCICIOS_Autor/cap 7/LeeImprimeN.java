// Programa LEER IMPRIMIR N
// Elaborado por: Leobardo López Román
// LeeImprimeN.java

import java.util.Scanner;

public class LeeImprimeN
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       int n;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n       LEE E IMPRIME UN NUMERO ENTERO\n");

    // Leer dato
       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee numero: ");
       n = entrada.nextInt();

    // Imprimir salida
       System.out.println("\n----------------- Salida -----------------");
       System.out.println("Numero = " + n);
   }
}