// Programa SISTEMA DE NOMINA SECUENCIAL
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RegEmpleado2 y EjecutaRegEmpleado2
// EjecutaRegEmpleado2.java

import java.util.Scanner;
import java.io.*;
public class EjecutaRegEmpleado2
{
   public static void main(String args[]) throws IOException  
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion;
       do
       {
          System.out.println("--------------------------");
          System.out.println("|    SISTEMA DE NOMINA   |");
          System.out.println("|------------------------|");
          System.out.println("|  1. CREAR ARCHIVO      |");
          System.out.println("|  2. CATALOGO EMPLEADOS |");
          System.out.println("|  3. NOMINA QUINCENAL   |");
          System.out.println("|  4. FIN                |");
          System.out.println("|------------------------|");
          System.out.print("   TECLEE OPCION: ");
          opcion = entrada.nextInt();        
          switch (opcion)
          {
             case 1:
                  crear();
                  break;
             case 2:
                  catalogo();
                  break;
             case 3:
                  nomina();
                  break;
          }
       } while (opcion != 4);
   }

   public static void crear() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       File empleados = new File("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl1.dat");
       FileOutputStream flujoEmpleados = new FileOutputStream(empleados);
       ObjectOutputStream flujoObjEmpleados = new ObjectOutputStream(flujoEmpleados);

       String  entradaChar;
       char    desea;

       int     numEmp; 
       String  nomEmp;
       int     depEmp; 
       int     pueEmp; 
       float   sueEmp; 

       do
       {
           RegEmpleado2 objEmpleado = new RegEmpleado2();
           System.out.println("-------- Captura datos de empleado --------");
           System.out.print("Teclee numero: ");
           numEmp = entrada.nextInt();
           entrada.nextLine();
           System.out.print("Teclee nombre: ");
           nomEmp = entrada.nextLine();
           while (nomEmp.length() < 30) nomEmp = nomEmp + " ";
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
           flujoObjEmpleados.writeObject(objEmpleado);
           System.out.print("\n¿Otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       numEmp = 0; 
       nomEmp = "FIN";
       depEmp = 0;
       pueEmp = 0;  
       sueEmp = 0F; 
       RegEmpleado2 objEmpleado = new RegEmpleado2();
       objEmpleado.establecerNumero(numEmp);
       objEmpleado.establecerNombreEmp(nomEmp);
       objEmpleado.establecerDepto(depEmp);
       objEmpleado.establecerPuesto(pueEmp);
       objEmpleado.establecerSueldo(sueEmp);
       flujoObjEmpleados.writeObject(objEmpleado);
       flujoObjEmpleados.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void catalogo() throws IOException
   {
       int totEmpleados;
       float totSueldos;
     try
     {
       File empleados = new File("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl1.dat");
       FileInputStream flujoEmpleados = new FileInputStream(empleados);
       ObjectInputStream flujoObjEmpleados = new ObjectInputStream(flujoEmpleados);
       System.out.printf("-------------------------------------------------------------\n");
       System.out.printf("                  CATALOGO DE EMPLEADOS     \n");
       System.out.printf("NUMERO NOMBRE                         DEPTO  PUESTO    SUELDO\n");
       System.out.printf("-------------------------------------------------------------\n");
       totEmpleados = 0;
       totSueldos = 0;
       RegEmpleado2 objEmpleado = new RegEmpleado2();
       objEmpleado = (RegEmpleado2) flujoObjEmpleados.readObject();
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
           System.out.printf("%6d ", objEmpleado.obtenerNumero());
           System.out.printf("%30s ", objEmpleado.obtenerNombreEmp());
           System.out.printf("%4d", objEmpleado.obtenerDepto());
           System.out.printf("%7d", objEmpleado.obtenerPuesto());
           System.out.printf("%12.2f\n", objEmpleado.obtenerSueldo());
           totEmpleados = totEmpleados + 1;
           totSueldos = totSueldos + objEmpleado.obtenerSueldo();
           objEmpleado = (RegEmpleado2) flujoObjEmpleados.readObject();
       }
       System.out.printf("-------------------------------------------------------------\n");
       System.out.printf(" Total  %4d   Empleados  %35.2f\n", totEmpleados, totSueldos);
       System.out.printf("-------------------------------------------------------------\n");
       flujoObjEmpleados.close();
     } 
     catch (ClassNotFoundException error)
     {
        System.out.println("Error, no se encontro la clase RegEmpleado2");
     }
   }

   public static void nomina() throws IOException
   {
       int totEmpleados;
       float bruto, impuesto, neto, totBruto, totImpuesto, totNeto, salMin;
     try
     {
       File empleados = new File("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl1.dat");
       FileInputStream flujoEmpleados = new FileInputStream(empleados);
       ObjectInputStream flujoObjEmpleados = new ObjectInputStream(flujoEmpleados);

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       totEmpleados = 0;
       totBruto = 0;
       totImpuesto = 0;
       totNeto = 0;

       System.out.print("Teclee salario minimo quincenal: ");
       salMin = entrada.nextFloat();
       System.out.printf("-------------------------------------------------------------------------\n");
       System.out.printf("                            NOMINA QUINCENAL\n");
       System.out.printf("NUMERO NOMBRE                          DEPTO  S.BRUTO  IMPUESTO    S.NETO\n");
       System.out.printf("-------------------------------------------------------------------------\n");
       RegEmpleado2 objEmpleado = new RegEmpleado2();
       objEmpleado = (RegEmpleado2) flujoObjEmpleados.readObject();
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
             bruto = objEmpleado.obtenerSueldo(); 
             bruto = bruto / 2;
             if (bruto > salMin)
               impuesto = (bruto-salMin) * 0.05F;
             else
               impuesto = 0;
             neto = bruto - impuesto;
             System.out.printf("%6d ", objEmpleado.obtenerNumero());
             System.out.printf("%30s ", objEmpleado.obtenerNombreEmp());
             System.out.printf("%5d ", objEmpleado.obtenerDepto());
             System.out.printf("%9.2f %9.2f %9.2f\n", bruto, impuesto, neto);
             totEmpleados = totEmpleados + 1;
             totBruto = totBruto + bruto;
             totImpuesto = totImpuesto + impuesto;
             totNeto = totNeto + neto;
             objEmpleado = (RegEmpleado2) flujoObjEmpleados.readObject();
       }
       System.out.printf("-------------------------------------------------------------------------\n");
       System.out.printf(" Total  %4d   Empleados ", totEmpleados);
       System.out.printf("%28.2f %9.2f %9.2f\n", totBruto, totImpuesto, totNeto);
       System.out.printf("-------------------------------------------------------------------------\n");
       flujoObjEmpleados.close();
     } 
     catch (ClassNotFoundException error)
     {
        System.out.println("Error, no se encontro la clase RegEmpleado2");
     }
   }
}