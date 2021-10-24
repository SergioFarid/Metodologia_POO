// Programa RAICES CUADRADAS
// Elaborado por: Leobardo López Román
// RaicesCuadradas.java

public class RaicesCuadradas
{  
   public static void main(String args[])
   {
   // Declarar variable
      double sumatoria[] = new double[1];

      calcularSuma(sumatoria);
      System.out.println("\nIMPRIME LA SUMATORIA DE LAS RAICES CUADRADAS");
      System.out.println("  DE LOS NUMEROS PARES DESDE 2 HASTA 1500");
      System.out.println("\nSumatoria de raices = " + sumatoria[0]);
   }
   
   public static void calcularSuma(double suma[])
   {
    // Declarar variable
       int r;

       suma[0] = 0;
       r = 0;
       do
       {
           r = r + 2;
           suma[0] = suma[0] + Math.sqrt(r);
       } while (r != 1500);
   }
}
