// Programa CALCULA SUELDOS DE EMPLEADOS
// Elaborado por: Leobardo López Román
// Empleados2.java

import java.util.Scanner;

public class Empleados2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreEmp, entradaChar;
       int    horasTrab, totEmpleados;
       float  cuotaHora;
       float  sueldo, totSueldos; 
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n        CALCULA EL SUELDO DE VARIOS EMPLEADOS");

       System.out.println("             REPORTE DE EMPLEADOS");
       System.out.println("  NOMBRE                               SUELDO");
       System.out.println("--------------------------------------------------");
       totEmpleados = 0;
       totSueldos = 0;
       do
       {
        // Leer datos
           System.out.println("\n---------------- Lectura de datos ----------------");
           System.out.print("Teclee nombre: ");
           nombreEmp = entrada.nextLine();

           System.out.print("Teclee horas trabajadas: ");
           horasTrab = entrada.nextInt();

           System.out.print("Teclee cuota por hora: ");
           cuotaHora = entrada.nextFloat();

        // Calcular
           sueldo = horasTrab * cuotaHora;

        // Imprimir salida
           System.out.println("\n------------------- Resultados -------------------");
           System.out.println("Nombre = " + nombreEmp);
           System.out.println("Sueldo = " + sueldo);

           totEmpleados = totEmpleados + 1;
           totSueldos = totSueldos + sueldo;

           System.out.print("\n¿Desea procesar otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\n---------------------- Total ---------------------");
       System.out.println("Total empleados = " + totEmpleados);
       System.out.println("Total sueldos = " + totSueldos);
   }
}
