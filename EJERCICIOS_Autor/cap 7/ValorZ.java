// Programa VALOR Z
// Elaborado por: Leobardo López Román
// ValorZ.java

import java.util.Scanner;

public class ValorZ
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int n;
       double x[] = new double[1];
       double y[] = new double[1];
       double z;

       for (n=1; n<=10; n++)
       {
           leerNumeros(x, y);
           z = elevarPotencia(y[0], x[0]);
           imprimirNumeros(x[0],y[0],z);
       }
   }
   
   public static void leerNumeros(double a[], double b[]) 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("\n-------- Lectura de datos --------");
       System.out.print("Teclee x: ");
       a[0] = entrada.nextDouble();

       System.out.print("Teclee y: ");
       b[0] = entrada.nextDouble();
   }

   public static double elevarPotencia(double b, double e) 
   {
   // Declarar variable
      double potencia;

      potencia = Math.pow(b,e);
      return potencia;              
   }

   public static void imprimirNumeros(double x2, double y2, double z2) 
   {
   // Imprimir salida
      System.out.println("\n----------- Resultado ------------");
      System.out.println("x = " + x2 + "    y = " + y2 + "    z = " + z2);
   }
}
