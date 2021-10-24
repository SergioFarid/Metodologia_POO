// Programa ARREGLO TRES DIMENSIONES 
// Elaborado por: Leobardo López Román
// ArregloTresDim2.java

import java.util.Scanner;

public class ArregloTresDim2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int prod[][][] = new int[6][4][5];
       int pla, est, dia;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nLEE LA PRODUCCION EN UN ARREGLO DE TRES DIMENSIONES");
       System.out.println("E IMPRIME EL REPORTE DE PRODUCCION EN LA PANTALLA");
       System.out.println("PRODUCCION[PLANTA][ESTACION][DIA]");

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       for (pla = 0; pla <= 5; pla++)
       {
           for (est = 0; est <= 3; est++)
           {
               System.out.print("  Planta " + (pla+1) + "  ");
               System.out.println("Estacion " + (est+1)); 
               for (dia = 0; dia <= 4; dia++)
               {
                 System.out.print("Produccion dia " + (dia+1) + ": ");
                 prod[pla][est][dia] = entrada.nextInt();
               }
           }
       }  

    // Imprimir salida
       for (pla = 0; pla <= 5; pla++)
       {
           System.out.println("\n------------ Planta " + (pla+1) + " ------------");
           System.out.println("            Dia 1  Dia 2  Dia 3  Dia 4  Dia 5");
           System.out.println("            -----  -----  -----  -----  -----");
           for (est = 0; est <= 3; est++)
           {
               System.out.print("Estacion-" + (est+1) + "     ");
               for (dia = 0; dia <= 4; dia++)
               {
                   System.out.print(prod[pla][est][dia] + "    ");
               }
               System.out.println();
           } 
       }
   }
}

