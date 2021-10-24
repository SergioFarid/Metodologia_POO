// Programa DESVIACION DE MEDIA
// Elaborado por: Leobardo López Román
// DesviacionMedia.java

import java.util.Scanner;

public class DesviacionMedia
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int   numeros[] = new int[15];
        int   r, sumatoria;
        float media, desviacion;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nCALCULA LA DESVIACION DE LA MEDIA\n");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       sumatoria = 0;
       for (r = 0; r <= 14; r++)
       {
           System.out.print("Teclee numeros[" + r + "]: ");
           numeros[r] = entrada.nextInt();
           sumatoria = sumatoria + numeros[r];
       }
       media = sumatoria / (float)15;

    // Imprimir salida
       System.out.println("\n----- Resultados ------");
       System.out.println("\n ELEMENTO   DESVIACION");
       System.out.println("-----------------------");

       for (r = 0; r <= 14; r++)
       {
           desviacion = numeros[r] - media;
           System.out.println("   " + numeros[r] + "        " + desviacion);
        }
        System.out.println("-----------------------");
        System.out.println("Media = " + media);
   }
}

