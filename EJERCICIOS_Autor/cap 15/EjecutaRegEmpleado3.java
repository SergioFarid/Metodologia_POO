// Programa SISTEMA DE NOMINA DIRECTO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RegEmpleado3 y EjecutaRegEmpleado3
// EjecutaRegEmpleado3.java

import java.util.Scanner;
import java.io.*;
public class EjecutaRegEmpleado3
{
   public static void main(String args[])
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
          System.out.println("|  2. EXPANDIR ARCHIVO   |");
          System.out.println("|  3. ALTAS              |");
          System.out.println("|  4. BAJAS              |");
          System.out.println("|  5. CAMBIOS            |");
          System.out.println("|  6. CONSULTAS          |");
          System.out.println("|  7. CATALOGO EMPLEADOS |");
          System.out.println("|  8. NOMINA QUINCENAL   |");
          System.out.println("|  9. FIN                |");
          System.out.println("|------------------------|");
          System.out.print("   TECLEE OPCION: ");
          opcion = entrada.nextInt();        
          switch (opcion)
          {
             case 1:
                  crear();
                  break;
             case 2:
                  expandir();
                  break;
             case 3:
                  altas();
                  break;
             case 4:
                  bajas();
                  break;
             case 5:
                  cambios();
                  break;
             case 6:
                  consultas();
                  break;
             case 7:
                  catalogo();
                  break;
             case 8:
                  nomina();
                  break;
          }
       } while (opcion != 9);
   }

   public static void crear()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");
       int i, numRegs;

       int    numEmp; 
       String nomEmp;
       int    depEmp;
       int    pueEmp;  
       float  sueEmp; 

       System.out.print("Teclee cantidad de registros que tendra el archivo: ");
       numRegs = entrada.nextInt();

       numEmp = 0; 
       nomEmp = "                              ";
       depEmp = 0;
       pueEmp = 0;  
       sueEmp = 0.0F; 

       RegEmpleado3 objEmpleado = new RegEmpleado3();
       objEmpleado.establecerNumero(numEmp);
       objEmpleado.establecerNombreEmp(nomEmp);
       objEmpleado.establecerDepto(depEmp);
       objEmpleado.establecerPuesto(pueEmp);
       objEmpleado.establecerSueldo(sueEmp);
       for (i=1; i<=numRegs; i++)
       {
           empleados.writeInt(objEmpleado.obtenerNumero()); 
           empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
           empleados.writeInt(objEmpleado.obtenerDepto());   
           empleados.writeInt(objEmpleado.obtenerPuesto());   
           empleados.writeFloat(objEmpleado.obtenerSueldo());   
       } 
       nomEmp = "FIN";
       objEmpleado.establecerNombreEmp(nomEmp);
       empleados.writeInt(objEmpleado.obtenerNumero()); 
       empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
       empleados.writeInt(objEmpleado.obtenerDepto());   
       empleados.writeInt(objEmpleado.obtenerPuesto());   
       empleados.writeFloat(objEmpleado.obtenerSueldo());   
       empleados.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void expandir() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");

       int  i, numRegs;
       long apuntador;

       int    numEmp; 
       String nomEmp;
       int    depEmp;
       int    pueEmp;  
       float  sueEmp; 

       System.out.print("Teclee cantidad de registros que agregara al archivo: ");
       numRegs = entrada.nextInt();

       RegEmpleado3 objEmpleado = new RegEmpleado3();
    // Lee los datos del primer empleado del archivo         
       apuntador = empleados.getFilePointer(); 
       objEmpleado.establecerNumero(empleados.readInt()); 
       objEmpleado.establecerNombreEmp(empleados.readUTF());
       objEmpleado.establecerDepto(empleados.readInt()); 
       objEmpleado.establecerPuesto(empleados.readInt()); 
       objEmpleado.establecerSueldo(empleados.readFloat()); 
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
         // Lee los datos del siguiente empleado del archivo         
            apuntador = empleados.getFilePointer(); 
            objEmpleado.establecerNumero(empleados.readInt()); 
            objEmpleado.establecerNombreEmp(empleados.readUTF());
            objEmpleado.establecerDepto(empleados.readInt()); 
            objEmpleado.establecerPuesto(empleados.readInt()); 
            objEmpleado.establecerSueldo(empleados.readFloat()); 
       }
       empleados.seek(apuntador);
       numEmp = 0; 
       nomEmp = "                              ";
       depEmp = 0;
       pueEmp = 0;  
       sueEmp = 0.0F; 
       objEmpleado = new RegEmpleado3();
       objEmpleado.establecerNumero(numEmp);
       objEmpleado.establecerNombreEmp(nomEmp);
       objEmpleado.establecerDepto(depEmp);
       objEmpleado.establecerPuesto(pueEmp);
       objEmpleado.establecerSueldo(sueEmp);
       for (i=1; i<=numRegs; i++)
       {
           empleados.writeInt(objEmpleado.obtenerNumero()); 
           empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
           empleados.writeInt(objEmpleado.obtenerDepto());   
           empleados.writeInt(objEmpleado.obtenerPuesto());   
           empleados.writeFloat(objEmpleado.obtenerSueldo());   
       } 
       nomEmp = "FIN";
       objEmpleado.establecerNombreEmp(nomEmp);
       empleados.writeInt(objEmpleado.obtenerNumero()); 
       empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
       empleados.writeInt(objEmpleado.obtenerDepto());   
       empleados.writeInt(objEmpleado.obtenerPuesto());   
       empleados.writeFloat(objEmpleado.obtenerSueldo());   
       empleados.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void altas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");

       String  entradaChar;
       char    desea;

       int     numEmp; 
       String  nomEmp;
       int     depEmp; 
       int     pueEmp; 
       float   sueEmp; 
       do
       {
           RegEmpleado3 objEmpleado = new RegEmpleado3();
           System.out.println("                  ALTAS DE EMPLEADOS     ");

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
           empleados.seek((objEmpleado.obtenerNumero()-1) * 48);
           empleados.writeInt(objEmpleado.obtenerNumero()); 
           empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
           empleados.writeInt(objEmpleado.obtenerDepto());   
           empleados.writeInt(objEmpleado.obtenerPuesto());   
           empleados.writeFloat(objEmpleado.obtenerSueldo());   

           System.out.print("\n¿Otro empleado(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       empleados.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void bajas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea, seguro;
       int    num;
       int    numEmp; 
       String nomEmp;
       int    depEmp;
       int    pueEmp;  
       float  sueEmp; 

     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");
       do
       {
         System.out.println("                  BAJAS DE EMPLEADOS     ");
         System.out.print("Teclee numero: ");
         num = entrada.nextInt();
         RegEmpleado3 objEmpleado = new RegEmpleado3();
    // Lee los datos del empleado del archivo   
         empleados.seek((num -1) * 48);     
         objEmpleado.establecerNumero(empleados.readInt()); 
         objEmpleado.establecerNombreEmp(empleados.readUTF());
         objEmpleado.establecerDepto(empleados.readInt()); 
         objEmpleado.establecerPuesto(empleados.readInt()); 
         objEmpleado.establecerSueldo(empleados.readFloat()); 

         System.out.println("Nombre: " + objEmpleado.obtenerNombreEmp());
         System.out.println("Departamento: " + objEmpleado.obtenerDepto());
         System.out.println("Puesto: " + objEmpleado.obtenerPuesto());
         System.out.println("Sueldo: " + objEmpleado.obtenerSueldo());

         System.out.print("\nSon los datos que dara de baja, ¿seguro(S/N)?: ");
         entradaChar = entrada.next();
         seguro = entradaChar.charAt(0);
         entrada.nextLine();
         if (seguro == 'S' || seguro == 's')
         {
            numEmp = 0; 
            nomEmp = "                              ";
            depEmp = 0;
            pueEmp = 0;  
            sueEmp = 0.0F; 
            objEmpleado.establecerNumero(numEmp);
            objEmpleado.establecerNombreEmp(nomEmp);
            objEmpleado.establecerDepto(depEmp);
            objEmpleado.establecerPuesto(pueEmp);
            objEmpleado.establecerSueldo(sueEmp);
            empleados.seek((num-1) * 48);
            empleados.writeInt(objEmpleado.obtenerNumero()); 
            empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
            empleados.writeInt(objEmpleado.obtenerDepto());   
            empleados.writeInt(objEmpleado.obtenerPuesto());   
            empleados.writeFloat(objEmpleado.obtenerSueldo());    
         }
         System.out.print("\n¿Desea dar de baja otro empleado(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       empleados.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void cambios()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    num, opcion2;
       int    numEmp; 
       String nomEmp;
       int    depEmp;
       int    pueEmp;  
       float  sueEmp; 

     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");
       do
       {
         System.out.println("                  CAMBIOS DE EMPLEADOS     ");
         System.out.print("   Teclee numero: ");
         num = entrada.nextInt();
         RegEmpleado3 objEmpleado = new RegEmpleado3();
    // Lee los datos del empleado del archivo   
         empleados.seek((num -1) * 48);     
         objEmpleado.establecerNumero(empleados.readInt()); 
         objEmpleado.establecerNombreEmp(empleados.readUTF());
         objEmpleado.establecerDepto(empleados.readInt()); 
         objEmpleado.establecerPuesto(empleados.readInt()); 
         objEmpleado.establecerSueldo(empleados.readFloat()); 

         System.out.println("1: Nombre: " + objEmpleado.obtenerNombreEmp());
         System.out.println("2: Departamento: " + objEmpleado.obtenerDepto());
         System.out.println("3: Puesto: " + objEmpleado.obtenerPuesto());
         System.out.println("4: Sueldo: " + objEmpleado.obtenerSueldo());

         System.out.print("\nDato a cambiar(1, 2, 3, 4, 0=FIN): ");
         opcion2 = entrada.nextInt();
         entrada.nextLine();
         while (opcion2 > 0 && opcion2 < 5)
         {
            switch (opcion2)
            {
              case 1:
                   System.out.print("Teclee nombre: ");
                   nomEmp = entrada.nextLine();
                   while (nomEmp.length() < 30) nomEmp = nomEmp + " ";
                   objEmpleado.establecerNombreEmp(nomEmp);
                   break;
              case 2:
                   System.out.print("Teclee departamento: ");
                   depEmp = entrada.nextInt();
                   objEmpleado.establecerDepto(depEmp);
                   break;
              case 3:
                   System.out.print("Teclee puesto: ");
                   pueEmp = entrada.nextInt();
                   objEmpleado.establecerPuesto(pueEmp);
                   break;
              case 4:
                   System.out.print("Teclee sueldo: ");
                   sueEmp = entrada.nextFloat();
                   objEmpleado.establecerSueldo(sueEmp);
                   break;
            }
            System.out.print("\nDato a cambiar(1, 2, 3, 4, 0=FIN): ");
            opcion2 = entrada.nextInt();
            entrada.nextLine();
         }
         empleados.seek((num-1) * 48);
         empleados.writeInt(objEmpleado.obtenerNumero()); 
         empleados.writeUTF(objEmpleado.obtenerNombreEmp()); 
         empleados.writeInt(objEmpleado.obtenerDepto());   
         empleados.writeInt(objEmpleado.obtenerPuesto());   
         empleados.writeFloat(objEmpleado.obtenerSueldo());    
         System.out.print("\n¿Desea hacer otro cambio empleado(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       empleados.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void consultas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    numEmp;
     try
     {

       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");
       do
       {
         System.out.println("                  CONSULTAS DE EMPLEADOS     ");
         System.out.print("Teclee numero: ");
         numEmp = entrada.nextInt();
         RegEmpleado3 objEmpleado = new RegEmpleado3();
    // Lee los datos del empleado del archivo   
         empleados.seek((numEmp -1) * 48);     
         objEmpleado.establecerNumero(empleados.readInt()); 
         objEmpleado.establecerNombreEmp(empleados.readUTF());
         objEmpleado.establecerDepto(empleados.readInt()); 
         objEmpleado.establecerPuesto(empleados.readInt()); 
         objEmpleado.establecerSueldo(empleados.readFloat()); 

         System.out.println("Nombre: " + objEmpleado.obtenerNombreEmp());
         System.out.println("Departamento: " + objEmpleado.obtenerDepto());
         System.out.println("Puesto: " + objEmpleado.obtenerPuesto());
         System.out.println("Sueldo: " + objEmpleado.obtenerSueldo());
         System.out.print("\n¿Desea consultar otro empleado(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       empleados.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void catalogo()
   {
       int    totEmpleados, totEmpDep, deptoProceso;
       float  totSueldos, totSueldosDep;
     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");
       System.out.println("-------------------------------------------------------------");
       System.out.println("                  CATALOGO DE EMPLEADOS     ");
       System.out.println("NUMERO NOMBRE                         DEPTO  PUESTO    SUELDO");
       System.out.println("-------------------------------------------------------------");
       totEmpleados = 0;
       totSueldos = 0;
       RegEmpleado3 objEmpleado = new RegEmpleado3();
    // Lee los datos del primer empleado del archivo         
       objEmpleado.establecerNumero(empleados.readInt()); 
       objEmpleado.establecerNombreEmp(empleados.readUTF());
       objEmpleado.establecerDepto(empleados.readInt()); 
       objEmpleado.establecerPuesto(empleados.readInt()); 
       objEmpleado.establecerSueldo(empleados.readFloat()); 
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
         totEmpDep = 0; totSueldosDep = 0;
         deptoProceso = objEmpleado.obtenerDepto();
         while (objEmpleado.obtenerDepto() == deptoProceso)
         {
         // Imprime los datos            
            System.out.printf("%6d ", objEmpleado.obtenerNumero());
            System.out.printf("%30s ", objEmpleado.obtenerNombreEmp());
            System.out.printf("%4d", objEmpleado.obtenerDepto());
            System.out.printf("%7d", objEmpleado.obtenerPuesto());
            System.out.printf("%12.2f\n", objEmpleado.obtenerSueldo());
            totEmpDep = totEmpDep + 1;
            totSueldosDep = totSueldosDep + objEmpleado.obtenerSueldo();
            objEmpleado = new RegEmpleado3();
         // Lee los datos del siguiente empleado del archivo         
            objEmpleado.establecerNumero(empleados.readInt()); 
            objEmpleado.establecerNombreEmp(empleados.readUTF());
            objEmpleado.establecerDepto(empleados.readInt()); 
            objEmpleado.establecerPuesto(empleados.readInt()); 
            objEmpleado.establecerSueldo(empleados.readFloat()); 
         }
         System.out.printf(" Total departamento %4d   Empleados  %23.2f\n", totEmpDep, totSueldosDep);
         totEmpleados = totEmpleados + totEmpDep ;
         totSueldos = totSueldos + totSueldosDep ;
       }
       System.out.println("-------------------------------------------------------------");
       System.out.printf(" Total  %4d   Empleados  %35.2f\n", totEmpleados, totSueldos);
       System.out.println("-------------------------------------------------------------");
       empleados.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void nomina()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");

       int totEmpleados, totEmpDep, deptoProceso;
       float bruto, impuesto, neto, totBrutoDep, totImpuestoDep, totNetoDep, totBruto, totImpuesto, totNeto,salMin;

       totEmpleados = 0;
       totBruto = 0;
       totImpuesto = 0;
       totNeto = 0;

       System.out.print("Teclee salario minimo quincenal: ");
       salMin = entrada.nextFloat();
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("                           NOMINA QUINCENAL");
       System.out.println("NUMERO NOMBRE                          DEPTO  S.BRUTO  IMPUESTO    S.NETO");
       System.out.println("-------------------------------------------------------------------------");
       RegEmpleado3 objEmpleado = new RegEmpleado3();
    // Lee los datos del primer empleado del archivo         
       objEmpleado.establecerNumero(empleados.readInt()); 
       objEmpleado.establecerNombreEmp(empleados.readUTF());
       objEmpleado.establecerDepto(empleados.readInt()); 
       objEmpleado.establecerPuesto(empleados.readInt()); 
       objEmpleado.establecerSueldo(empleados.readFloat()); 
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
         totEmpDep = 0; totBrutoDep = 0; totImpuestoDep = 0; totNetoDep = 0;
         deptoProceso = objEmpleado.obtenerDepto();
         while (objEmpleado.obtenerDepto() == deptoProceso)
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
            totEmpDep = totEmpDep + 1;
            totBrutoDep = totBrutoDep + bruto;
            totImpuestoDep = totImpuestoDep + impuesto;
            totNetoDep = totNetoDep + neto;
            objEmpleado = new RegEmpleado3();
         // Lee los datos del siguiente empleado del archivo         
            objEmpleado.establecerNumero(empleados.readInt()); 
            objEmpleado.establecerNombreEmp(empleados.readUTF());
            objEmpleado.establecerDepto(empleados.readInt()); 
            objEmpleado.establecerPuesto(empleados.readInt()); 
            objEmpleado.establecerSueldo(empleados.readFloat()); 
         }
         System.out.printf(" Total departamento %4d   Empleados ", totEmpDep);
         System.out.printf("%16.2f %9.2f %9.2f\n", totBrutoDep, totImpuestoDep, totNetoDep);
         totEmpleados = totEmpleados + totEmpDep;
         totBruto = totBruto + totBrutoDep;
         totImpuesto = totImpuesto + totImpuestoDep;
         totNeto = totNeto + totNetoDep;
       }
       System.out.println("-------------------------------------------------------------------------");
       System.out.printf(" Total  %4d   Empleados ", totEmpleados);
       System.out.printf("%28.2f %9.2f %9.2f\n", totBruto, totImpuesto, totNeto);
       System.out.println("-------------------------------------------------------------------------");
       empleados.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
}
