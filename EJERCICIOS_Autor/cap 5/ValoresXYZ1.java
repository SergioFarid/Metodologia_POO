// Programa VALORES X Y Z 
// Elaborado por: Leobardo López Román
// ValoresXYZ1.java

public class ValoresXYZ1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       double x, y, z;

       System.out.println("\nIMPRIME VALORES DE X Y Z\n");
       System.out.println("  VALORES DE X Y Z");
       System.out.println(" X       Y       Z");
       System.out.println("----------------------");

       x = 0;
       while (x < 10)
       {
           x = x + 0.5;
           y = 3 * Math.pow(x,2) + 7 * x - 15;
           z = y - 2 * Math.pow(x,2);
           System.out.println(x + "   " + y + "   " + z);
       } 
   }
}
