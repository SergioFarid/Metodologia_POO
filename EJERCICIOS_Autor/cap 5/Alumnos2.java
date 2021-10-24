// Programa ALUMNOS APROBADOS REPROBADOS
// Elaborado por: Leobardo López Román
// Alumnos2.java

import java.util.Scanner;

public class Alumnos2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreAlum, entradaChar;
       int    totAprobados, totReprobados;
       float  calif1, calif2, calif3, caliFinal;
       String observacion;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n                   CALCULA CALIFICACIONES DE ALUMNOS\n");

       System.out.println("                         CALIFICACIONES FINALES");
       System.out.print("  NOMBRE                       CAL.1  CAL.2");
       System.out.println("  CAL.3  CALIF.FINAL  OBSERVACION");
       System.out.print("-------------------------------------------");
       System.out.println("---------------------------------");
       totAprobados = 0; 
       totReprobados = 0;
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

        // Calcular
           caliFinal = (calif1 * 0.2F) + (calif2 * 0.3F) + (calif3 *0.5F);
           if (caliFinal >= 60)
           {
              totAprobados = totAprobados + 1;
              observacion = "Aprobado";
           }
           else
           {
              totReprobados = totReprobados + 1;
              observacion = "Reprobado";
           }

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreAlum);
           System.out.println("Calificacion 1 = " + calif1);
           System.out.println("Calificacion 2 = " + calif2);
           System.out.println("Calificacion 3 = " + calif3);
           System.out.println("Calificacion final = " + caliFinal);
           System.out.println("Observacion = " + observacion);

           System.out.print("\n¿Desea procesar otro alumnoss(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\n--------------------- Totales --------------------");
       System.out.println("Total Aprobados  = " + totAprobados);
       System.out.println("Total Reprobados = " + totReprobados);
   }
}
