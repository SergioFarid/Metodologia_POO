// Programa SUMA CUADRADOS
// Elaborado por: Leobardo López Román
// SumaCuadrados.java

import java.util.Scanner;

public class SumaCuadrados
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int n;
       double sumatoria[] = new double[1];

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nIMPRIME LA SUMATORIA DE LOS CUADRADOS");
       System.out.println("     DE LOS NUMEROS ENTRE 0 Y N");

    // Leer dato
       System.out.println("\n-------- Lectura del dato --------");
       System.out.print("Teclee el numero: ");
       n = entrada.nextInt();

    // Llama metodo
       calcularSuma(sumatoria, n);

    // Imprimir salida
       System.out.println("\n----------- Resultado ------------");
       System.out.println("Sumatoria = " + sumatoria[0]);
   }
   
   public static void calcularSuma(double suma[], int x) 
   {
   // Declarar variable
      int r;

      suma[0] = 0;
      r = 0;
      do
      {
          r = r +1;
          suma[0] = suma[0] + Math.pow(r, 2);
      } while (r != x);          
   }
}
