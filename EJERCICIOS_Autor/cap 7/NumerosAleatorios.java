// Programa NUMEROS ALEATORIOS
// Elaborado por: Leobardo López Román
// NumerosAleatorios.java

public class NumerosAleatorios
{
   public static void main(String args[]) 
   {
    // Declarar
    // Variables
       double numeros[][] = new double[20][10];

       System.out.println("\nGENERA 200 NUMEROS ALEATORIOS");

       generarNumeros(numeros);
       imprimirMatriz(numeros);
   }

   public static void generarNumeros(double mat[][])
   {
    // Declarar variables
       int r, c;

       for (r = 0; r <= 19; r++)
       {
           for (c = 0; c <= 9; c++)
           {
               mat[r][c] = Math.random();
            }
       }  
   }

   public static void imprimirMatriz(double ma[][])
   {
   // Declarar variables
      int re, co;

      System.out.println("\n------ Matriz de numeros ------");
      for (re = 0; re <= 19; re++)
      {
          for (co = 0; co <= 9; co++)
          {
              System.out.print(ma[re][co] + "  ");
          }
          System.out.println();
      }       
   }
}
