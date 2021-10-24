// Programa MAYOR 4 NUMEROS
// Elaborado por: Leobardo López Román
// Mayor4Numeros1.java

import java.util.Scanner;

public class Mayor4Numeros1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int a, b, c, d;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n       IMPRIME EL MAYOR DE 4 NUMEROS\n");

    // Leer datos
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee número 1: ");
       a = entrada.nextInt();

       System.out.print("Teclee número 2: ");
       b = entrada.nextInt();

       System.out.print("Teclee número 3: ");
       c = entrada.nextInt();

       System.out.print("Teclee número 4: ");
       d = entrada.nextInt();

    // Imprimir salida
       System.out.println("\n--------------- Resultado ----------------");
       if (a > b)
          if (a > c)
             if (a > d)
                System.out.println("El mayor es " + a);
             else
                System.out.println("El mayor es " + d);
          else
             if (c > d)
                System.out.println("El mayor es " + c);
             else
                System.out.println("El mayor es " + d);
       else
          if (b > c)
             if (b > d)
                System.out.println("El mayor es " + b);
             else
                System.out.println("El mayor es " + d);
          else
             if (c > d)
                System.out.println("El mayor es " + c);
             else
                System.out.println("El mayor es " + d);
  }
}
