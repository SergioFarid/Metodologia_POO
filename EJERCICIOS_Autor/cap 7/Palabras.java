// Programa PALABRAS
// Elaborado por: Leobardo López Román
// Palabras.java

import java.util.Scanner;

public class Palabras
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String frase, palabra;
       int l[] = new int[1];

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  DADA UNA FRASE, LA SEPARA POR PALABRAS");

    // Leer dato
       System.out.println("----------- Lectura de la frase ----------");
       System.out.print("Teclee frase: ");
       frase = entrada.nextLine();

    // Imprimir salida
       System.out.println("\n--------------- Resultado ----------------");

       l[0] = 0;
       do 
       {
           palabra = obtenerPalabra(frase,l);
           System.out.println(palabra);
       } while (l[0] < frase.length());
   }

   public static String obtenerPalabra(String fra, int c[])
   {
   // Declarar variable
      char car; 

      String pal, car2;
      pal = "";
      do 
      {
          car = fra.charAt(c[0]);
          car2 = String.valueOf(car);
          if (!Character.isSpace(car))
          {
             pal = pal.concat(car2);
          }
          c[0] = c[0] + 1;
      } while (!Character.isSpace(car) && c[0] != fra.length());         
      return pal;
   }
}