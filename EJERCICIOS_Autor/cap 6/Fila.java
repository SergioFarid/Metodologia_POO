// Programa FILA DE DATOS
// Elaborado por: Leobardo López Román
// Fila.java

import java.util.Scanner;

public class Fila
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int fila[] = new int[10];
        int i, valor;
        String entradaChar;
        char desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n           SIMULA UNA FILA\n");

    // Leer datos
       System.out.println("---------- Lectura de datos ----------");
       for (i = 0; i <= 9; i++)
       {
           System.out.print("Teclee elemento[" + i + "]: ");
           fila[i] = entrada.nextInt();
       }

       System.out.println("\n------------ Imprime fila ------------");
       for (i = 0; i <= 9; i++)
       {
           System.out.print(fila[i] + " ");
       }

       System.out.print("\n\n¿Desea introducir un nuevo elemento(S/N)?: ");
       entradaChar = entrada.next();
       desea = entradaChar.charAt(0);
       entrada.nextLine();
       while (desea == 'S' || desea == 's')
       {
          System.out.print("Teclee el nuevo valor: ");
          valor = entrada.nextInt();
          for (i = 8; i >= 0; i--)
          {
              fila[i+1] = fila[i];
          }
          fila[0] = valor;

          System.out.println("\n--------- Imprime nueva fila ---------");
          for (i = 0; i <= 9; i++)
          {
              System.out.print(fila[i] + " ");
          } 

          System.out.print("\n\n¿Desea introducir un nuevo elemento(S/N)?: ");
          entradaChar = entrada.next();
          desea = entradaChar.charAt(0);
          entrada.nextLine();
       }
   }
}

