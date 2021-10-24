// Clase ejecutora del programa FACTORIALES DE N NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Factorial3 y EjecutaFactorial3
// EjecutaFactorial3.java

import java.util.Scanner;

public class EjecutaFactorial3
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int n, j, num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n    CALCULA EL FACTORIAL DE N NUMEROS\n");

    // Se declara, crea e inicia el objeto de la clase Factorial3 
       Factorial3 objFactorial = new Factorial3();

       System.out.print("Teclee cantidad de numeros a procesar: ");
       n = entrada.nextInt();
       System.out.println("--------------------------------------");
       for (j = 1; j <= n; j++)
       {
           System.out.print("\nTeclee numero: ");
           num = entrada.nextInt();
        // Establecer los valores leidos, en los datos del objeto
           objFactorial.establecerNumero(num);

        // Calcular
           objFactorial.calcularFactorial();
           System.out.println("Factorial = " + objFactorial.obtenerFactorial());
       }
   }
}
