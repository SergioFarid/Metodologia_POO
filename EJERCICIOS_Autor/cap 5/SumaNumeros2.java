// Programa SUMA NUMEROS 2-160
// Elaborado por: Leobardo López Román
// SumaNumeros2.java

public class SumaNumeros2
{
   public static void main(String args[])
   {
    // Declarar  
    // Variables
       int i, suma;

       System.out.println("\nIMPRIME LA SUMATORIA DE LOS NUMEROS DEL 2 AL 160\n");
       
       suma = 0;
       for (i = 2; i <= 160; i++)
       {
           suma = suma + i; 
       } 
       System.out.println("La sumatoria es = " + suma);
   }
}

