// Programa PALINDROMO
// Elaborado por: Leobardo López Román
// Palindromo.java

import java.util.Scanner;

public class Palindromo
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String frase, frase2;
       char car; 
       int l;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nDADA UNA FRASE, DICE SI ES UN PALINDROMO");
       System.out.println("ES DECIR, SE LEE IGUAL EN LOS DOS SENTIDOS\n");

    // Leer dato
       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee frase: ");
       frase = entrada.nextLine();

       frase2 = "";
       for (l=frase.length()-1; l>=0; l--)
       {
           car = frase.charAt(l);
           frase2 =  frase2.concat(String.valueOf(car));
       }

    // Imprimir salida
       System.out.println("\n--------------- Resultado ----------------");

       if (frase.compareTo(frase2) == 0) 
          System.out.println("Es un palindromo");
       else
          System.out.println("No es un palindromo");
   }
}