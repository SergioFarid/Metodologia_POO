// Programa EQUIVALENCIAS FAHRENHEIT CELSIUS
// Elaborado por: Leobardo López Román
// EquivalenciasFahr2.java

public class EquivalenciasFahr2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       float fahrenheit, celsius;

       System.out.println("\nCALCULA EQUIVALENCIAS FAHRENHEIT CELSIUS\n");

       System.out.println("Fahrenheit         Celsius");
       System.out.println("-------------------------------");
       fahrenheit = 0;
       do 
       {
          fahrenheit = fahrenheit + 1;
          celsius = (5F/9F) * (fahrenheit-32);
          System.out.println(fahrenheit + "               " + celsius);
       } while (fahrenheit != 65);
   }
}
