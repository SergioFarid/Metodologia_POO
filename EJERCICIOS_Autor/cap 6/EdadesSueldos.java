// Programa EDADES Y SUELDOS
// Elaborado por: Leobardo López Román
// EdadesSueldos.java

import java.util.Scanner;

public class EdadesSueldos
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nombres[] = new String[15];
        int edades[] = new int[15];
        float sueldos[] = new float[15];
        int i, edadMayor=0;
        float sueldoMayor, totSueldos;
        String empleadoMayor="";

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n PROCESA EDADES Y SUELDOS DE PERSONAS\n");

    // Leer datos
       System.out.println("---------- Lectura de datos ----------");
       for (i = 0; i <= 14; i++)
       {
           System.out.print("Teclee nombres[" + i + "]: ");
           nombres[i] = entrada.nextLine();

           System.out.print("Teclee edades[" + i + "]: ");
           edades[i] = entrada.nextInt();

           System.out.print("Teclee sueldos[" + i + "]: ");
           sueldos[i] = entrada.nextFloat();
           entrada.nextLine();
       }
 
    // Imprimir salida
       System.out.println("           REPORTE DE EMPLEADOS");
       System.out.println("     NOMBRE               EDAD  SUELDO");
       System.out.println("---------------------------------------");
       sueldoMayor = 0;
       totSueldos = 0;
       for (i = 0; i <= 14; i++)
       {
           System.out.println(nombres[i] + "  " + edades[i] + "  " + sueldos[i]);
           totSueldos = totSueldos + sueldos[i];
           if (sueldos[i] > sueldoMayor)
           {
              sueldoMayor = sueldos[i];
              empleadoMayor = nombres[i];
              edadMayor = edades[i];
           }
       }
       System.out.println("---------------------------------------");
       System.out.println("Total sueldos = " + totSueldos);
       System.out.println("Empleado con mayor sueldo = " + empleadoMayor);
       System.out.println("Edad del empleado con mayor sueldo = " + edadMayor);
   }
}

