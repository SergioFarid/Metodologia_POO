// Programa SUMATORIA
// Elaborado por: Leobardo López Román
// SumaNumeros3.java

public class SumaNumeros3
{
   public static void main(String args[])
   {
    // Declarar  
    // Variables
       int i;
       float valor, suma;

       System.out.println("\nIMPRIME LA SUMATORIA DE 1 + 1/2 + .... + 1/50\n");
       
       suma = 0;
       for (i = 2; i <= 160; i++)
       {
           valor = 1 / (float)i;
           suma = suma + valor; 
       } 
       System.out.println("La sumatoria es = " + suma);
   }
}

