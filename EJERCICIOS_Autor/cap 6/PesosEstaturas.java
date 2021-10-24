// Programa PESOS Y ESTATURAS
// Elaborado por: Leobardo López Román
// PesosEstaturas.java

import java.util.Scanner;

public class PesosEstaturas
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nombres[] = new String[10];
        float pesos[] = new float[10];
        float estaturas[] = new float[10];
        int i;
        float totPeso, totEstatura, promPeso, promEstatura;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nPROCESA PESOS Y ESTATURAS DE PERSONAS\n");

    // Leer datos
       System.out.println("---------- Lectura de datos ----------");
       for (i = 0; i <= 9; i++)
       {
           System.out.print("Teclee nombres[" + i + "]: ");
           nombres[i] = entrada.nextLine();

           System.out.print("Teclee pesos[" + i + "]: ");
           pesos[i] = entrada.nextFloat();

           System.out.print("Teclee estaturas[" + i + "]: ");
           estaturas[i] = entrada.nextFloat();
           entrada.nextLine();
       }
 
    // Imprimir salida
       System.out.println("           REPORTE DE PERSONAS");
       System.out.println("     NOMBRE              PESO  ESTATURA");
       System.out.println("---------------------------------------");
       totPeso = 0;
       totEstatura = 0;
       for (i = 0; i <= 9; i++)
       {
           System.out.println(nombres[i] + "  " + pesos[i] + "  " + estaturas[i]);
           totPeso = totPeso + pesos[i];
           totEstatura = totEstatura + estaturas[i];
       }
       promPeso = totPeso / 10F;
       promEstatura = totEstatura / 10F;
       System.out.println("---------------------------------------");
       System.out.println("Promedio peso = " + promPeso);
       System.out.println("Promedio estatura = " + promEstatura);
   }
}

