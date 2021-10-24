// Clase ejecutora del programa CALCULAR SUELDO DE VARIOS EMPLEADOS -Usando this-
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado9this y EjecutaEmpleado9this
// EjecutaEmpleado9this.java

import java.util.Scanner;

public class EjecutaEmpleado9this
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String nombreEmp, entradaChar;
       int    horasTrab;
       float  cuótaHora;        
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n   CALCULA EL SUELDO DE VARIOS EMPLEADOS");

       do
       {
       // Se declara, crea e inicia el objeto de la clase Empleado8
          Empleado9this objEmpleado = new Empleado9this();

          System.out.println("\n------------ Lectura de datos ------------");
          System.out.print("Teclee nombre: ");
          nombreEmp = entrada.nextLine();

          System.out.print("Teclee horas trabajadas: ");
          horasTrab = entrada.nextInt();

          System.out.print("Teclee cuóta por hora: ");
          cuótaHora = entrada.nextFloat();

       // Establecer los valores leidos, en los datos del objeto
          objEmpleado.establecerNombreEmp(nombreEmp);
          objEmpleado.establecerHorasTrab(horasTrab);
          objEmpleado.establecerCuotaHora(cuótaHora);

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
