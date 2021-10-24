// Programa SENO COSENO ARCO TANGENTE DE -1 HASTA 1
// Elaborado por: Leobardo López Román
// Logaritmos1.java


public class Logaritmos1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       double x, senoX, cosenoX, arcoTanX;

       System.out.println("\nCALCULA SENO COSENO ARCO TANGENTE DE -1 HASTA 1\n");

       System.out.println("    X      Seno X        Coseno X    Arco tangente X");
       System.out.println("----------------------------------------------------");
       for (x = -1; x <= 1; x=x+0.2)
       {
           senoX = Math.sin(x);
           cosenoX = Math.cos(x);
           arcoTanX = Math.atan(x);
           System.out.println(x + "  " + senoX + "  " + cosenoX +"  " + arcoTanX);
       } 
   }
}
