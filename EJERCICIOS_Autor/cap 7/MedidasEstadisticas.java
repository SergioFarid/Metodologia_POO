// Programa MEDIDAS ESTADISTICAS
// Elaborado por: Leobardo López Román
// MedidasEstadisticas.java

import java.util.Scanner;

public class MedidasEstadisticas 
{
// Declarar variables globales o de clase
   static float numeros[] = new float[20];
   static int n, opcion = 0;
   static double sumatoria, media, varianza, desviacion, desviacionEstandar;
   static String datoEntrada;

   public static void main(String args[]) 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("---------------------------");
       System.out.println("|  MEDIDAS ESTADISTICAS   |");
       System.out.println("|-------------------------|");
       System.out.println("|  1. MEDIA               |");
       System.out.println("|  2. VARIANZA            |");
       System.out.println("|  3. DESVIACION ESTANDAR |");
       System.out.println("|  4. TODAS               |");
       System.out.println("|  5. FIN                 |");
       System.out.println("|-------------------------|");
       System.out.print("   TECLEE OPCION: ");
       opcion = entrada.nextInt();         

       for (n = 0; n <= 19; n++)
       {
           System.out.print("Teclee numeros[" + n + "]: ");
           numeros[n] = entrada.nextFloat();
       }

       System.out.println("\n-------- Numeros --------");
       for (n = 0; n <= 19; n++)
       {
           System.out.println("Numeros[" + n + "] = " + numeros[n]);
       }

       if (opcion == 1 || opcion == 4)
       {
          calcularMedia();
          System.out.println("Media = " + media);
       }

       if (opcion == 2 || opcion == 4)
       {
          calcularVarianza();
          System.out.println("Varianza = " + varianza);
       }

       if (opcion == 3 || opcion == 4)
       {
          calcularDesviacion();
          System.out.println("Desviacion estandar = " + desviacion);
       }
   }

   public static void calcularMedia()
   {
      sumatoria = 0;
      for (n = 0; n <= 19; n++)
      {
          sumatoria = sumatoria + numeros[n];
      }
      media = sumatoria / 20D;
   }

   public static void calcularVarianza()
   {
      calcularMedia();
      sumatoria = 0;
      for (n = 0; n <= 19; n++)
      {
          desviacion = numeros[n] - media;
          if (desviacion > 0)
          {
              desviacion = Math.pow(desviacion,2);
              sumatoria = sumatoria + desviacion;
          }
      }
      varianza = sumatoria / 19D;
   }

   public static void calcularDesviacion()
   {
      calcularVarianza();
      desviacionEstandar = Math.sqrt(varianza);
   }
}
