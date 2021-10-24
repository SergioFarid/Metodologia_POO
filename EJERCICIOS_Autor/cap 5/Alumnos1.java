// Programa CALIFICACIONES DE ALUMNOS
// Elaborado por: Leobardo López Román
// Alumnos1.java

import java.util.Scanner;

public class Alumnos1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreAlum, entradaChar;
       int    totAlumnos;
       float  calif1, calif2, calif3, calif4, promedio, promCal1, promCal2,
              promCal3, promCal4, promProm, totCal1, totCal2, totCal3, totCal4, totProm;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n                   CALCULA CALIFICACIONES DE ALUMNOS\n");

       System.out.println("                      ANALISIS DE CALIFICACIONES");
       System.out.print("  NOMBRE                       CAL.1  CAL.2");
       System.out.println("  CAL.3  CAL.4  PROMEDIO");
       System.out.print("-------------------------------------------");
       System.out.println("------------------------");
       totAlumnos = 0;
       totCal1 = 0; totCal2 = 0; totCal3 = 0; 
       totCal4 = 0; totProm = 0; 
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreAlum = entrada.nextLine();

           System.out.print("Teclee calificacion 1: ");
           calif1 = entrada.nextFloat();

           System.out.print("Teclee calificacion 2: ");
           calif2 = entrada.nextFloat();

           System.out.print("Teclee calificacion 3: ");
           calif3 = entrada.nextFloat();

           System.out.print("Teclee calificacion 4: ");
           calif4 = entrada.nextFloat();

        // Calcular
           promedio = (calif1 + calif2 + calif3 + calif4) / 4;

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreAlum);
           System.out.println("Calificacion 1 = " + calif1);
           System.out.println("Calificacion 2 = " + calif2);
           System.out.println("Calificacion 3 = " + calif3);
           System.out.println("Calificacion 4 = " + calif4);
           System.out.println("Promedio = " + promedio);

           totAlumnos = totAlumnos + 1;
           totCal1 = totCal1 + calif1;
           totCal2 = totCal2 + calif2;
           totCal3 = totCal3 + calif3;
           totCal4 = totCal4 + calif4;
           totProm = totProm + promedio;

           System.out.print("\n¿Desea procesar otro alumno(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       promCal1 = totCal1 / totAlumnos;
       promCal2 = totCal2 / totAlumnos;
       promCal3 = totCal3 / totAlumnos;
       promCal4 = totCal4 / totAlumnos;
       promProm = totProm / totAlumnos;
       System.out.println("\n--------------- Promedios Generales --------------");
       System.out.println("Promedio Calificacion 1 = " + promCal1);
       System.out.println("Promedio Calificacion 2 = " + promCal2);
       System.out.println("Promedio Calificacion 3 = " + promCal3);
       System.out.println("Promedio Calificacion 4 = " + promCal4);
       System.out.println("Promedio de promedios   = " + promProm);
   }
}
