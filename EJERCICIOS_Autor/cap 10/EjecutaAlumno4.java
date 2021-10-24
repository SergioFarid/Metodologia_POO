// Clase ejecutora del programa CALCULA PROMEDIO DE UN ALUMNO
// Elaborado por: Leobardo L�pez Rom�n
// Esta formado por dos clases: Alumno4 y EjecutaAlumno4
// EjecutaAlumno4.java

import java.util.Scanner;

public class EjecutaAlumno4
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       String nombre;
       float c1, c2, c3, c4;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Empleado5 
       Alumno4 objAlumno = new Alumno4();

       System.out.println("\n       CALCULA PROMEDIO DE UN ALUMNO\n");

    // Leer datos
       System.out.println("------------ Lectura de datos -------------");
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
       objAlumno.calcularObservacion();

    // Imprimir salida, obteniendo los datos del objeto
       System.out.println("\n--------------- Resultados ----------------");
       System.out.println("Nombre = " + objAlumno.obtenerNombreAlum());
       System.out.println("Promedio = " + objAlumno.obtenerPromedio());
       System.out.println("Observacion = " + objAlumno.obtenerObservacion());
   }
}
