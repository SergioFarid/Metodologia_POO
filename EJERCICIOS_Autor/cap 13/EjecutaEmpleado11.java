// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado11, EmpleadoPorHoras1, 
//                                 EmpleadoAsalariado1 y EjecutaEmpleado11
// EjecutaEmpleado11.java

import java.util.Scanner;

public class EjecutaEmpleado11
{
   public static void main(String args[])
   {
    // Declaraciones
    // Variables
       String nomEmp, depto, puesto, entradaChar;
       int    hrsTra, tipoEmp;
       float  cuoHr, sdoMen;
       char   desea;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nCALCULA EL SUELDO DE VARIOS EMPLEADOS\n");

       do
       {
           System.out.println("<<<      Tipos de empleado    >>>");
           System.out.println("<<< ------------------------- >>>");
           System.out.println("    1. Empleado por horas");
           System.out.println("    2. Empleado asalariado");
           System.out.println("<<< ------------------------- >>>");
           System.out.print("       Teclee tipo: ");
           tipoEmp = entrada.nextInt();
           entrada.nextLine();

           System.out.println("\n------------ Lectura de datos ------------");
           System.out.print("Teclee nombre: ");
           nomEmp = entrada.nextLine();

           System.out.print("Teclee departamento: ");
           depto = entrada.nextLine();

           System.out.print("Teclee puesto: ");
           puesto = entrada.nextLine();

           if (tipoEmp == 1)
           {
           // Se declara, crea e inicia el objeto de la clase EmpleadoPorHoras1
              EmpleadoPorHoras1 objEmpleado = new EmpleadoPorHoras1();

           // Leer datos
              System.out.print("Teclee horas trabajadas: ");
              hrsTra = entrada.nextInt();

              System.out.print("Teclee cuota por hora: ");
              cuoHr = entrada.nextFloat();

           // Establecer
              objEmpleado.establecerNombreEmp(nomEmp);
              objEmpleado.establecerDeptoEmp(depto);
              objEmpleado.establecerPuestoEmp(puesto);
              objEmpleado.establecerHorasTrab(hrsTra);
              objEmpleado.establecerCuotaHora(cuoHr);

           // Calcular 
              objEmpleado.calcularSueldoQnaHoras();

           // Imprimir los datos obteniendolos de los atributos del objeto
              System.out.println("\n--------------- Resultados ---------------");
              System.out.println("Nombre = " + 
                                  objEmpleado.obtenerNombreEmp());
              System.out.println("Departamento = " + 
                                  objEmpleado.obtenerDeptoEmp());
              System.out.println("Puesto = " + 
                                  objEmpleado.obtenerPuestoEmp());
              System.out.println("Sueldo = " + 
                                  objEmpleado.obtenerSueldoQnaHoras());
           }
           else
           {
           // Se declara, crea e inicia el objeto de la clase EmpleadoPorHoras1
              EmpleadoAsalariado1 objEmpleado = new EmpleadoAsalariado1();

           // Lee dato
              System.out.print("Teclee sueldo mensual: ");
              sdoMen = entrada.nextFloat();
 
           // Establecer              
              objEmpleado.establecerNombreEmp(nomEmp);
              objEmpleado.establecerDeptoEmp(depto);
              objEmpleado.establecerPuestoEmp(puesto);
              objEmpleado.establecerSueldoMensual(sdoMen);

           // Calcular 
              objEmpleado.calcularSueldoQnaAsal();

           // Imprimir los datos obteniendolos de los atributos del objeto
              System.out.println("\n--------------- Resultados ---------------");
              System.out.println("Nombre = " + 
                                  objEmpleado.obtenerNombreEmp());
              System.out.println("Departamento = " + 
                                  objEmpleado.obtenerDeptoEmp());
              System.out.println("Puesto = " + 
                                  objEmpleado.obtenerPuestoEmp());
              System.out.println("Sueldo = " + 
                                  objEmpleado.obtenerSueldoQnaAsal());

           }
           System.out.print("\n¿Desea procesar otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }
}

