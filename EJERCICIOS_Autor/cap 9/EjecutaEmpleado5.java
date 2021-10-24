// Programa CALCULA SUELDO DE UN EMPLEADO
// Elaborado por: Leobardo López Román
// EjecutaEmpleado5.java

import java.util.Scanner;

public class EjecutaEmpleado5
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String nomEmp;
        int    hrsTra;
        float  cuoHr;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

     // Se declara, crea e inicia el objeto objEmpleado de la clase Empleado5 
        Empleado5 objEmpleado = new Empleado5();

        System.out.println("\n------------ Lectura de datos ------------");
        System.out.print("Teclee nombre: ");
        nomEmp = entrada.nextLine();

        System.out.print("Teclee horas trabajadas: ");
        hrsTra = entrada.nextInt();

        System.out.print("Teclee cuota por hora: ");
        cuoHr = entrada.nextFloat();

     // Invoca metodos para colocar los datos en los atributos del objeto

        objEmpleado.establecerNombreEmp(nomEmp);
        objEmpleado.establecerHorasTrab(hrsTra);
        objEmpleado.establecerCuotaHora(cuoHr);

     // Invoca metodo para calcular el sueldo

        objEmpleado.calcularSueldo();


    // Imprimir los datos obteniendolos de los atributos del objeto

       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("Nombre = " + objEmpleado.obtenerNombreEmp());
       System.out.println("Sueldo = " + objEmpleado.obtenerSueldo());
   }
}
