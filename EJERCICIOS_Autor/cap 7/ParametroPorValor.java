// Programa PARAMETRO POR VALOR
// Elaborado por: Leobardo López Román
// ParametroPorValor.java

public class ParametroPorValor
{
   public static void main(String args[])
   {
   // Declarar variable
      int x;

      x = 0;
      System.out.println("x = " + x);
      cambiar(x);
      System.out.println("x = " + x);
   }
   
   public static void cambiar(int y)
   {
      y = 1;
   }
}
