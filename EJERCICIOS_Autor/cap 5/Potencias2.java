// Programa POTENCIAS 1-8
// Elaborado por: Leobardo López Román
// Potencias2.java

public class Potencias2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables     
       int i, numero, potencia;

       System.out.println("\nIMPRIME POTENCIAS 1-8\n");
       System.out.println("\nNUMERO    POTENCIA");
       System.out.println("\n------------------");
       for (numero = 1; numero <= 8; numero++)
       {
           potencia = numero;
           for (i = 1; i < numero; i++)
           {
               potencia = potencia * numero;
           }
           System.out.println("   " + numero + "      " + potencia);
       } 
   }
}
