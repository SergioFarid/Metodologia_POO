// Clase ejecutora del programa FACTORIAL
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Factorial2 y EjecutaFactorial2
// EjecutaFactorial2.java

import java.util.Scanner;

public class EjecutaFactorial2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n    CALCULA EL FACTORIAL DE UN NUMERO\n");

    // Se declara, crea e inicia el objeto de la clase Factorial2 
       Factorial2 objFactorial = new Factorial2();

       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee numero: ");
       num = entrada.nextInt();
    // Establecer los valores leidos, en los datos del objeto
       objFactorial.establecerNumero(num);

    // Calcular
       objFactorial.calcularFactorial();

       System.out.println("\n---------------- Resultado ---------------");
       System.out.println("Factorial = " + objFactorial.obtenerFactorial());
   }
}
