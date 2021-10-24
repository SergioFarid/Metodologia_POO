// Clase ejecutora del programa CALCULA PROMEDIO DE VARIOS ALUMNOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Alumno5 y EjecutaAlumno5
// EjecutaAlumno5.java

import java.util.Scanner;

public class EjecutaAlumno5
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String nombre, entradaChar;
       int totAlumnos;
       float c1, c2, c3, c4, promCal1, promCal2, promCal3, promCal4;      
       float promProm, totCal1, totCal2, totCal3, totCal4, totProm;
       char desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n       CALCULA EL PROMEDIO DE VARIOS ALUMNOS\n");

       System.out.println("            ANALISIS DE CALIFICACIONES");
       System.out.println("  NOMBRE            CAL.1 CAL.2 CAL.3 CAL.4 PROMEDIO");
       System.out.println("----------------------------------------------------");
       totAlumnos = 0;
       totCal1 = 0; totCal2 = 0; totCal3 = 0; totCal4 = 0; totProm = 0;
       do
       {
        // Se declara, crea e inicia el objeto de la clase Alumno5
           Alumno5 objAlumno = new Alumno5();

           System.out.println("\n------------ Lectura de datos ------------");
           System.out.print("Teclee nombre: ");
           nombre = entrada.nextLine();

           System.out.print("Teclee calificacion 1: ");
           c1 = entrada.nextFloat();

           System.out.print("Teclee calificacion 2: ");
           c2 = entrada.nextFloat();

           System.out.print("Teclee calificacion 3: ");
           c3 = entrada.nextFloat();

           System.out.print("Teclee calificacion 4: ");
           c4 = entrada.nextFloat();

        // Establecer los valores leidos, en los datos del objeto
           objAlumno.establecerNombreAlum(nombre);
           objAlumno.establecerCalif1(c1);
           objAlumno.establecerCalif2(c2);
           objAlumno.establecerCalif3(c3);
           objAlumno.establecerCalif4(c4);

        // Calcular
           objAlumno.calcularPromedio();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Nombre = " + objAlumno.obtenerNombreAlum());
           System.out.println("Calificacion 1 = " + objAlumno.obtenerCalif1());
           System.out.println("Calificacion 2 = " + objAlumno.obtenerCalif2());
           System.out.println("Calificacion 3 = " + objAlumno.obtenerCalif3());
           System.out.println("Calificacion 4 = " + objAlumno.obtenerCalif4());
           System.out.println("Promedio = " + objAlumno.obtenerPromedio());

           totAlumnos = totAlumnos + 1;
           totCal1 = totCal1 + objAlumno.obtenerCalif1();
           totCal2 = totCal2 + objAlumno.obtenerCalif2();
           totCal3 = totCal3 + objAlumno.obtenerCalif3();
           totCal4 = totCal4 + objAlumno.obtenerCalif4();
           totProm = totProm + objAlumno.obtenerPromedio();

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

       System.out.println("Promedio calificacion 1 = " + promCal1);
       System.out.println("Promedio calificacion 2 = " + promCal2);
       System.out.println("Promedio calificacion 3 = " + promCal3);
       System.out.println("Promedio calificacion 4 = " + promCal4);
       System.out.println("Promedio total = " + promProm);
   }
}
