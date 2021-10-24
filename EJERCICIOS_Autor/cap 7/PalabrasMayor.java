// Programa PALABRAS Y MAYOR
// Elaborado por: Leobardo López Román
// PalabrasMayor.java

import java.util.Scanner;

public class PalabrasMayor
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String frase, palabra, palabraMayor;
       int l[] = new int[1];
       int tamanioPal, mayorTamanio;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  DADA UNA FRASE, LA SEPARA POR PALABRAS");

    // Leer dato
       System.out.println("----------- Lectura de la frase ----------");
       System.out.print("Teclee frase: ");
       frase = entrada.nextLine();

    // Imprimir salida
       System.out.println("\n--------------- Resultado ----------------");

       mayorTamanio = 0;
       l[0] = 0;
       palabraMayor = "";
       do 
       {
           palabra = obtenerPalabra(frase,l);
           tamanioPal = palabra.length();
           if (tamanioPal > mayorTamanio)
           {
              mayorTamanio = tamanioPal;
              palabraMayor = palabra;
           }
           System.out.println(palabra);
       } while (l[0] < frase.length());
       System.out.println("\nPalabra mayor = " + palabraMayor );
       System.out.println("Tamanio = " + mayorTamanio );
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