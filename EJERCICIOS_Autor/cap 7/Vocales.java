// Programa VOCALES
// Elaborado por: Leobardo López Román
// Vocales.java

import java.util.Scanner;

public class Vocales
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String frase, car2;
       int l, a, e, i, o, u;
       char car; 

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  DADA UNA FRASE, DICE CUANTAS VECES SE");
       System.out.println("           UTILIZA CADA VOCAL\n");

    // Leer dato
       System.out.println("----------- Lectura de la frase ----------");
       System.out.print("Teclee frase: ");
       frase = entrada.nextLine();

       a = 0;
       e = 0;
       i = 0;
       o = 0;
       u = 0;

       for (l=frase.length()-1; l>=0; l--)
       {
           car = obtenerCaracter(frase,l);
           if (car == 'a' || car == 'A') a = a + 1;
           if (car == 'e' || car == 'E') e = e + 1;
           if (car == 'i' || car == 'I') i = i + 1;
           if (car == 'o' || car == 'O') o = o + 1;
           if (car == 'u' || car == 'U') u = u + 1;
       }

    // Imprimir salida
       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("LAS VOCALES DE UTILIZARON");
       System.out.println("------------------------------------------");
       System.out.println(" A = " + a + " Veces");
       System.out.println(" E = " + e + " Veces");
       System.out.println(" I = " + i + " Veces");
       System.out.println(" O = " + o + " Veces");
       System.out.println(" U = " + u + " Veces");
   }

   public static char obtenerCaracter(String fra, int i)
   {
   // Declarar variable
      char carAux;

      carAux = fra.charAt(i);
      return carAux;
   }
}