// Programa EXPONENCIACION
// Elaborado por: Leobardo López Román
// Exponenciacion.java

import java.util.Scanner;

public class Exponenciacion
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       double base, exponente, resultado;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  ELEVA UNA BASE A UN EXPONENTE");

    // Leer datos
       System.out.println("\n-------- Lectura de datos --------");
       System.out.print("Teclee la base: ");
       base = entrada.nextDouble();

       System.out.print("Teclee el exponente: ");
       exponente = entrada.nextDouble();

    // Calcular
       resultado = elevar(base, exponente);

    // Imprimir salida
       System.out.println("\n----------- Resultado ------------");
       System.out.println("Resultado = " + resultado);
   }
   
   public static double elevar(double b, double e) 
   {
   // Declarar variable
      double poten;

      poten = Math.pow(b,e);
      return poten;              
   }
}
