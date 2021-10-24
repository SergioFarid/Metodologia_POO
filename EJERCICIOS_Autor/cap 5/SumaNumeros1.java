// Programa SUMA NUMEROS 1-100
// Elaborado por: Leobardo López Román
// SumaNumeros1.java

public class SumaNumeros1
{
   public static void main(String args[])
   {
    // Declarar  
    // Variables
       int indice, sumatoria;

       System.out.println("\nIMPRIME LA SUMATORIA DE LOS NUMEROS DEL 1 AL 100\n");
       
       sumatoria = 0;
       for (indice = 1; indice <= 100; indice++)
       {
           sumatoria = sumatoria + indice; 
       } 
       System.out.println("La sumatoria es = " + sumatoria);
   }
}

