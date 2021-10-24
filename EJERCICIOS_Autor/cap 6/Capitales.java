// Programa CAPITALES ESTADOS
// Elaborado por: Leobardo López Román
// Capitales.java

import java.util.Scanner;

public class Capitales
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String estados[][] = new String[32][2];
        String estado;
        int r;
        char desea;
        String entradaChar;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n           ESTADOS Y CAPITALES");

    // Leer datos
       System.out.println("---------- Lectura de datos ----------");
       for (r = 0; r <= 31; r++)
       {
           System.out.print("Teclee estado[" + r + "]: ");
           estados[r][0] = entrada.nextLine();

           System.out.print("Teclee capital[" + r + "]: ");
           estados[r][1] = entrada.nextLine();
       }

       System.out.print("\n¿Desea consultar capital(S/N)?: ");
       entradaChar = entrada.next();
       desea = entradaChar.charAt(0);
       entrada.nextLine();
       while (desea == 'S' || desea == 's')
       {
           System.out.print("Teclee el estado: ");          
           estado = entrada.nextLine();
           r = -1;
           do
           {
               r = r + 1;
               if (estado.equals(estados[r][0]))
               {
                  System.out.println("Capital = " + estados[r][1]);
               }
           } while (!estado.equals(estados[r][0]));

           System.out.print("\n¿Desea consultar capital(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       }
   }
}

