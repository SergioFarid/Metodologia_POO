// Clase ejecutora del programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado10 y EjecutaEmpleado10
// EjecutaEmpleado10.java

import java.util.Scanner;

public class EjecutaEmpleado10
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nomEmp, entradaChar;
        int hrsTra;
        float cuoHr;
        char desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n    CALCULA EL SUELDO DE VARIOS EMPLEADOS\n");

       System.out.print("¿Desea procesar empleado(S/N)?: ");
       entradaChar = entrada.next();
       desea = entradaChar.charAt(0);
       entrada.nextLine();
       while (desea == 'S' || desea == 's')
       {
        // Se declara, crea e inicia el objeto de la clase Empleado10
           Empleado10 objEmpleado = new Empleado10();

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

           System.out.print("¿Desea procesar otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
        } 
   }
}
