// Programa INVERSION 24 MESES
// Elaborado por: Leobardo López Román
// Interes1.java

public class Interes1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int mes;
       float saldo, capital, interes, totInteres;

       System.out.println("\n IMPRIME EL COMPORTAMIENTO DE UNA INVERSION\n");

       System.out.println("               INVERSION");
       System.out.println("  MES      CAPITAL      INTERES      SALDO");
       System.out.println("---------------------------------------------");
       capital = 10000.00F;
       totInteres = 0;
       for (mes=1; mes<=24; mes++)
       {
           interes = capital * (0.36F/12F);
           saldo = capital + interes;
           System.out.println(mes + "     " + capital + "   " + interes + "   " + saldo);  
           totInteres = totInteres + interes;
           capital = saldo;
       }
       System.out.println("---------------------------------------------");
       System.out.println("                   " + totInteres);  
   }
}