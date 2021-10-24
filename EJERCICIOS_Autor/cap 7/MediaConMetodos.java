// Programa MEDIA CON METODOS
// Elaborado por: Leobardo López Román
// MediaConMetodos.java

import java.util.Scanner;

public class MediaConMetodos 
{
   public static void main(String args[]) 
   {
    // Declarar
    // Variables
       float vector[] = new float[10];
       float promedio;

       System.out.println("\nCALCULA E IMPRIME LA MEDIA DE 10 NUMEROS ENTEROS\n");
       leerVector(vector);
       promedio = calcularMedia(vector);
       imprimirVector(vector);
       System.out.println("Media = " + promedio);
   }

   public static void leerVector(float vec[])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Declarar variable
       int n;

    // Leer datos
       for (n = 0; n <= 9; n++)
       {
           System.out.print("Teclee vector[" + n + "]: ");
           vec[n] = entrada.nextFloat();
       }
   }

   public static float calcularMedia(float v[])
   {
   // Declarar variable
      float sumatoria, prom;
      int i;

      sumatoria = 0;
      for (i = 0; i <= 9; i++)
      {
          sumatoria = sumatoria + v[i];
      }
      prom = sumatoria / 10F;
      return prom;
   }

   public static void imprimirVector(float vect[])
   {
   // Declarar variable
      int x;

      System.out.println("\n------ Vector de numeros ------");
      for (x = 0; x <= 9; x++)
      {
          System.out.println(vect[x]);
      }
   }
}
