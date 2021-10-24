// Clase ejecutora del programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado9 y EjecutaEmpleado9
// EjecutaEmpleado9.java

import java.util.Scanner;

public class EjecutaEmpleado9
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String nomEmp, entradaChar;
       int    hrsTra, totEmpleados;
       float  cuoHr, totSueldos;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n   CALCULA EL SUELDO DE VARIOS EMPLEADOS");

       System.out.println("            REPORTE DE EMPLEADOS");
       System.out.println("  NOMBRE                           SUELDO");
       System.out.println("------------------------------------------");
       totEmpleados = 0;
       totSueldos = 0;
       do
       {
        // Se declara, crea e inicia el objeto de la clase Empleado8
           Empleado8 objEmpleado = new Empleado8();

           System.out.println("\n------------ Lectura de datos ------------");
           System.out.print("Teclee nombre: ");
           nomEmp = entrada.nextLine();

           System.out.print("Teclee horas trabajadas: ");
           hrsTra = entrada.nextInt();

           System.out.print("Teclee cuota por hora: ");
           cuoHr = entrada.nextFloat();

        // Establecer los valores leidos, en los datos del objeto
           objEmpleado.establecerNombreEmp(nomEmp);
           objEmpleado.establecerHorasTrab(hrsTra);
           objEmpleado.establecerCuotaHora(cuoHr);

        // Calcular 
           objEmpleado.calcularSueldo();

        // Imprimir salida, obteniendo los datos del objeto
           System.out.println("\n--------------- Resultados ---------------");
           System.out.println("Nombre = " + objEmpleado.obtenerNombreEmp());
           System.out.println("Sueldo = " + objEmpleado.obtenerSueldo());

           totEmpleados = totEmpleados + 1;
           totSueldos = totSueldos + objEmpleado.obtenerSueldo();

           System.out.print("\n¿Desea procesar otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       System.out.println("\nTotal empleados = " + totEmpleados);
       System.out.println("Total sueldos = " + totSueldos);
   }
}
