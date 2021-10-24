// Programa LEER IMPRIMIR N VALIDANDO
// Elaborado por: Leobardo López Román
// LeeImprimeValidando.java

import java.util.Scanner;

public class LeeImprimeValidando
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       long n;
       int i, bandera;
       String numero;
       char num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE Y VALIDA UN NUMERO ENTERO POSITIVO Y LO IMPRIME");
       System.out.println("      SOLO TOMA COMO VALIDAS HASTA 5 CIFRAS\n");

       System.out.println("------------ Lectura del dato ------------");
       do 
       {
           do 
           {
               bandera = 1;
               System.out.print("Teclee numero: ");
               numero = entrada.nextLine();
               for (i=0; i<=numero.length()-1; i++)
               {
                  num = numero.charAt(i);
                  if (!((num >= '0' && num <= '9') || num == '-')) bandera = 0;
                  if (num == '-' && i > 0) bandera = 0;
               }
           } while (bandera != 1);
           n = Long.parseLong(numero);
           if (n < -32768 || n > 32767)
              bandera = 0;
       } while (bandera != 1);

    // Imprimir salida
       System.out.println("\n----------------- Salida -----------------");
       System.out.println("Numero = " + n);
   }
}