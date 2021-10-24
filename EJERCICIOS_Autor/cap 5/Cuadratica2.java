// Programa ECUACION CUADRATICA PARA A DE 1-5
// Elaborado por: Leobardo López Román
// Cuadratica2.java

public class Cuadratica2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       double a, b, c=0, raizUnica, parteReal, parteImaginaria,
              raizReal1, raizReal2;

       System.out.println("\n REALIZA CALCULOS CON LA ECUACION CUADRATICA\n");

       System.out.println("  A    B    C   TIENE     RAIZ 1     RAIZ 2");
       System.out.println("---------------------------------------------");
       for (a=1; a<=5; a++)
       {
           c = c - a;
           b = a - c;
           System.out.print(a + "  " + b + "  " + c);
           if ((Math.pow(b,2)-4*a*c) == 0)
           {
              raizUnica = -b/(2*a);
              System.out.println(" Raiz unica  " + raizUnica);  
           }
           else
              if ((Math.pow(b,2)-4*a*c) < 0)
              {
                 parteReal = -b/(2*a);
                 parteImaginaria = Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c))/(2*a);
                 System.out.print(" Raices complejas ");        
                 System.out.println("   Parte real      Parte imaginaria");
                 System.out.println(parteReal + " + " + parteImaginaria);  
                 System.out.println(parteReal + " - " + parteImaginaria);
              }
              else
              {
                 raizReal1 = -b + Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a);
                 raizReal2 = -b - Math.sqrt(Math.pow(b,2)-4*a*c)/(2*a);
                 System.out.print(" Raices reales ");        
                 System.out.println(raizReal1 + "   " + raizReal2);  
              }
       }
   }
}