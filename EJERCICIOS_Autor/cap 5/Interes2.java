// Programa INVERSION LEYENDO DATOS
// Elaborado por: Leobardo López Román
// Interes2.java

import java.util.Scanner;

public class Interes2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int mes, plazo;
       float saldo, capital, interes, totInteres, tasaAnual;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n IMPRIME EL COMPORTAMIENTO DE UNA INVERSION\n");

       System.out.print("Teclee el capital: ");
       capital = entrada.nextFloat();

       System.out.print("Teclee tasa interes anual: ");
       tasaAnual = entrada.nextFloat();

       System.out.print("Teclee plazo en meses: ");
       plazo = entrada.nextInt();

       System.out.println("               INVERSION");
       System.out.println("CAPITAL = " + capital);
       System.out.println("TASA INTERES ANUAL = " + tasaAnual);
       System.out.println("PLAZO EN MESES = " + plazo);
       System.out.println("  MES      CAPITAL      INTERES      SALDO");
       System.out.println("---------------------------------------------");
       totInteres = 0;
       for (mes=1; mes<=plazo; mes++)
       {
           interes = capital * (tasaAnual/100/12F);
           saldo = capital + interes;
           System.out.println(mes + "     " + capital + "   " + 
                                         interes + "   " + saldo);  
           totInteres = totInteres + interes;
           capital = saldo;
       }
       System.out.println("---------------------------------------------");
       System.out.println("                   " + totInteres);  
   }
}