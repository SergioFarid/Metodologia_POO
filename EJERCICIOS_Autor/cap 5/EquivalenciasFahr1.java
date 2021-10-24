// Programa EQUIVALENCIAS FAHRENHEIT CELSIUS
// Elaborado por: Leobardo López Román
// EquivalenciasFahr1.java

public class EquivalenciasFahr1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       float fahrenheit, celsius;

       System.out.println("\nCALCULA EQUIVALENCIAS FAHRENHEIT CELSIUS\n");

       System.out.println("Fahrenheit         Celsius");
       System.out.println("-------------------------------");
       for (fahrenheit = 1; fahrenheit <= 65; fahrenheit++)
       {
           celsius = (5F/9F) * (fahrenheit-32);
           System.out.println(fahrenheit + "               " + celsius);
       } 
   }
}
