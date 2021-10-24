// Clase ejecutora del programa CALCULAR SUELDO DOBLE DE UN EMPLEADO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado6 y EjecutaEmpleado6
// EjecutaEmpleado6.java

import java.util.Scanner;

public class EjecutaEmpleado6
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       String nomEmp;
       int    hrsTra;
       float  cuoHr;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Empleado5 
       Empleado6 objEmpleado = new Empleado6();

       System.out.println("\n    CALCULA SUELDO DOBLE DE UN EMPLEADO\n");

    // Leer datos
       System.out.println("------------ Lectura de datos ------------");
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
   }
}
