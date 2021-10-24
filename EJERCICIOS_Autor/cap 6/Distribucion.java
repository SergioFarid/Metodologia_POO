// Programa DISTRIBUCION DE FRECUENCIAS
// Elaborado por: Leobardo López Román
// Distribucion.java

import java.util.Scanner;

public class Distribucion
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int rangos[][] = new int[15][3];
        int i, c, r, numero;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n           DISTRIBUCION DE FRECUENCIAS");

    // Leer datos
       System.out.println("---------- Lectura de datos ----------");
       for (r = 0; r <= 14; r++)
       {
           System.out.print("Teclee rangos[" + r + ",1]: ");
           rangos[r][0] = entrada.nextInt();

           System.out.print("Teclee rangos[" + r + ",2]: ");
           rangos[r][1] = entrada.nextInt();
           rangos[r][2] = 0;
       }

       for (i = 1; i <= 50; i++)
       {
           System.out.print("Teclee numero: ");
           numero = entrada.nextInt();

           r = -1;
           do
           {
               r = r + 1;
               if (numero >= rangos[r][0] && numero <= rangos[r][1])
               {
                  rangos[r][2] = rangos[r][2] + 1;
               }
           } while (!(numero >= rangos[r][0] && numero <= rangos[r][1]));
       }

    // Imprimir salida
       System.out.println("       DISTRIBUCION DE FRECUANCIAS");
       System.out.println("RANGO  LIM.INFERIOR  LIM.SUPERIOR No.OCURRENCIAS");
       System.out.println("------------------------------------------------");
       for (r = 0; r <= 14; r++)
       {
           System.out.print("  " + r + "          ");
           for (c = 0; c <= 2; c++)
           {
               System.out.print(rangos[r][c] + "            ");
           }
           System.out.println();
       }
   }
}

