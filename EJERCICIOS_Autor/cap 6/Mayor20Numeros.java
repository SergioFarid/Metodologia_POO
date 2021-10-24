// Programa MAYOR 20 NUMEROS
// Elaborado por: Leobardo López Román
// Mayor20Numeros.java

import java.util.Scanner;

public class Mayor20Numeros
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int numeros[] = new int[20];
        int r, mayor, totIguales;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nIMPRIME EL MAYOR DE UN ARREGLO DE NUMEROS\n");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (r = 0; r <= 19; r++)
       {
           System.out.print("Teclee numeros[" + r + "]: ");
           numeros[r] = entrada.nextInt();
       }

    // Imprimir salida
       System.out.println("\n----------- Resultados -----------");
       System.out.println("\nVECTOR DE NUMEROS");
       System.out.println("-----------------");
       for (r = 0; r <= 19; r++)
       {
           System.out.println("    " + numeros[r]);
       }
       System.out.println("-----------------");
       mayor = numeros[0];
       totIguales = 0;
       for (r = 0; r <= 19; r++)
       {
           if (numeros[r] > mayor)
           {
              mayor = numeros[r];
              totIguales = 1;
           }
           else
              if (numeros[r] == mayor)
                 totIguales = totIguales + 1;
       }
       System.out.println("Numero mayor = " + mayor);
       System.out.println("Total de veces que se presento = " + totIguales);
   }
}
