// Programa SECUENCIA FIBONACCI
// Elaborado por: Leobardo López Román
// Fibonacci.java

public class Fibonacci
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int i, numero, penultimo, ultimo;

       System.out.println("\nIMPRIME 20 NUMEROS FIBONACCI\n");
       penultimo = 0;
       ultimo = 1;
       for (i = 1; i <= 20; i++)
       {
           numero = penultimo + ultimo;
           System.out.println(numero + " ");
           penultimo = ultimo;
           ultimo = numero;
       } 
   }
}
