// Programa CALCULA SUELDOS DE EMPLEADOS
// Elaborado por: Leobardo López Román
// Empleados1.java

import java.util.Scanner;

public class Empleados1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String nombreEmp, entradaChar;
       int    horasTrab;
       float  cuotaHora, sueldo;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n  CALCULA EL SUELDO DE VARIOS EMPLEADOS");

       do
       {
            System.out.println("\n------------ Lectura de datos ------------");
            System.out.print("Teclee nombre: ");
            nombreEmp = entrada.nextLine();

            System.out.print("Teclee horas trabajadas: ");
            horasTrab = entrada.nextInt();

            System.out.print("Teclee cuota por hora: ");
            cuotaHora = entrada.nextFloat();

         // Calcular
            sueldo = horasTrab * cuotaHora;

         // Imprimir salida
            System.out.println("\n----------------- Salida -----------------");
            System.out.println("Nombre = " + nombreEmp);
            System.out.println("Sueldo = " + sueldo);

            System.out.print("\n¿Desea procesar otro empleado(S/N)?: ");
            entradaChar = entrada.next();
            desea = entradaChar.charAt(0);
            entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }
}
