// Clase ejecutora del programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado8 y EjecutaEmpleado8
// EjecutaEmpleado8.java

import java.util.Scanner;

public class EjecutaEmpleado8
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String nomEmp, entradaChar;
       int    hrsTra;
       float  cuoHr;        
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n   CALCULA EL SUELDO DE VARIOS EMPLEADOS");

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

          System.out.print("\n¿Desea procesar otro empleado(S/N)?: ");
          entradaChar = entrada.next();
          desea = entradaChar.charAt(0);
          entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }
}
