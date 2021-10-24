// Programa LEE E IMPRIME REGISTROS DE EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RegEmpleado1 y EjecutaRegEmpleado1
// EjecutaRegEmpleado1.java

import java.util.Scanner;
import java.io.*;
public class EjecutaRegEmpleado1
{
   public static void main(String args[]) throws IOException  
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       String  entradaChar;
       char    desea;

       int     numEmp; 
       String  nomEmp;
       int     depEmp; 
       int     pueEmp; 
       float   sueEmp; 

       do
       {
           RegEmpleado1 objEmpleado = new RegEmpleado1();
           System.out.println("-------- Entrada de datos del empleado --------");
           System.out.print("Teclee numero: ");
           numEmp = entrada.nextInt();
           entrada.nextLine();
           System.out.print("Teclee nombre: ");
           nomEmp = entrada.nextLine();
           System.out.print("Teclee departamento: ");
           depEmp = entrada.nextInt();
           System.out.print("Teclee puesto: ");
           pueEmp = entrada.nextInt();
           System.out.print("Teclee sueldo: ");
           sueEmp = entrada.nextFloat();
           objEmpleado.establecerNumero(numEmp);
           objEmpleado.establecerNombreEmp(nomEmp);
           objEmpleado.establecerDepto(depEmp);
           objEmpleado.establecerPuesto(pueEmp);
           objEmpleado.establecerSueldo(sueEmp);
           System.out.println("------Salida de informacion del empleado ------");
           System.out.println("Numero = " + objEmpleado.obtenerNumero());
           System.out.println("Nombre = " + objEmpleado.obtenerNombreEmp());
           System.out.println("Departamento = " + objEmpleado.obtenerDepto());
           System.out.println("Puesto = " + objEmpleado.obtenerPuesto());
           System.out.println("Sueldo = " + objEmpleado.obtenerSueldo());
           System.out.print("\n¿Otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }

}