// Programa PAR IMPAR
// Elaborado por: Leobardo López Román
// ParImpar.java

import java.util.Scanner;

public class ParImpar
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int numero, residuo;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n     IMPRIME SI UN NUMERO ES PAR O IMPAR\n");
       System.out.println("\n-------------- Lectura del dato --------------");
       System.out.print("Teclee numero: ");
       numero = entrada.nextInt();

       residuo = numero;
       while (residuo > 1)
       {
          residuo = residuo - 2;
       }

       System.out.println("\n----------------- Resultado ------------------");
       if (residuo == 0)
          System.out.println("El numero " + numero + " es Par");
       else
          System.out.println("El numero " + numero + " es Impar");
   }
}
