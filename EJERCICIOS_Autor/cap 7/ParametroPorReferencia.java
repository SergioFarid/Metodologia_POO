// Programa PARAMETRO POR REFERENCIA
// Elaborado por: Leobardo López Román
// ParametroPorReferencia.java

public class ParametroPorReferencia
{  
   public static void main(String args[])
   {
   // Declarar variable
      int x[] = new int[1];

      x[0] = 0;
      System.out.println("x = " + x[0]);
      cambiar(x);
      System.out.println("x = " + x[0]);
   }
   
   public static void cambiar(int y[])
   {
      y[0] = 1;
   }
}
