// Programa CLASIFICA ARCHIVO DE EMPLEADOS POR NOMBRE
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RegEmpleado4 y EjecutaRegEmpleado4
// EjecutaRegEmpleado4.java

import java.util.Scanner;
import java.io.*;
public class EjecutaRegEmpleado4
{
   public static void main(String args[])
   {
        clasificarArchivo();
        imprimirCatalogo();
   }

   public static void clasificarArchivo()
   {
       String nombres[] = new String[100]; 
       long direcciones[] = new long[100]; 
       long   posicion, auxiliar2;
       String auxiliar;
       int    i, c, bandera;

     try
     {
       RandomAccessFile empleados = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.dat", "rw");
       posicion = empleados.getFilePointer();
       RegEmpleado4 objEmpleado = new RegEmpleado4();
    // Lee los datos del primer empleado del archivo         
       objEmpleado.establecerNumero(empleados.readInt()); 
       objEmpleado.establecerNombreEmp(empleados.readUTF());
       objEmpleado.establecerDepto(empleados.readInt()); 
       objEmpleado.establecerPuesto(empleados.readInt()); 
       objEmpleado.establecerSueldo(empleados.readFloat()); 
       i = -1;
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
          i = i + 1;
          nombres[i] = objEmpleado.obtenerNombreEmp();
          direcciones[i] = posicion;
          posicion = empleados.getFilePointer();
          objEmpleado = new RegEmpleado4();
          // Lee los datos del siguiente empleado del archivo         
          objEmpleado.establecerNumero(empleados.readInt()); 
          objEmpleado.establecerNombreEmp(empleados.readUTF());
          objEmpleado.establecerDepto(empleados.readInt()); 
          objEmpleado.establecerPuesto(empleados.readInt()); 
          objEmpleado.establecerSueldo(empleados.readFloat()); 
       }
       do
       {
          bandera = 0;
          for (c=1; c<=i; c++)
          {
	      if (nombres[c-1].compareToIgnoreCase(nombres[c]) > 0)
	      {
	         auxiliar = nombres[c];
	         auxiliar2 = direcciones[c];
	         nombres[c] = nombres[c-1];
	         direcciones[c] = direcciones[c-1];
	         nombres[c-1] = auxiliar;
	         direcciones[c-1] = auxiliar2;
	         bandera = 1;
	      }
          }
       } while (bandera!=0);
       RandomAccessFile empleados2 = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.cla", "rw");
       for (c=0; c<=i; c++)
       {
           empleados.seek(direcciones[c]);
           objEmpleado = new RegEmpleado4();
           // Lee los datos del siguiente empleado del archivo sin clasificar        
           objEmpleado.establecerNumero(empleados.readInt()); 
           objEmpleado.establecerNombreEmp(empleados.readUTF());
           objEmpleado.establecerDepto(empleados.readInt()); 
           objEmpleado.establecerPuesto(empleados.readInt()); 
           objEmpleado.establecerSueldo(empleados.readFloat()); 

           // Imprime los datos del empleado en el archivo clasificado        
           empleados2.writeInt(objEmpleado.obtenerNumero()); 
           empleados2.writeUTF(objEmpleado.obtenerNombreEmp()); 
           empleados2.writeInt(objEmpleado.obtenerDepto());   
           empleados2.writeInt(objEmpleado.obtenerPuesto());   
           empleados2.writeFloat(objEmpleado.obtenerSueldo());   
       }
       objEmpleado = new RegEmpleado4();
       // Crea registro centinela de fin de archivo        
       objEmpleado.establecerNumero(0); 
       objEmpleado.establecerNombreEmp("FIN");
       objEmpleado.establecerDepto(0); 
       objEmpleado.establecerPuesto(0); 
       objEmpleado.establecerSueldo(0.00F); 

       // Graba registro centinela de fin de archivo         
       empleados2.writeInt(objEmpleado.obtenerNumero()); 
       empleados2.writeUTF(objEmpleado.obtenerNombreEmp()); 
       empleados2.writeInt(objEmpleado.obtenerDepto());   
       empleados2.writeInt(objEmpleado.obtenerPuesto());   
       empleados2.writeFloat(objEmpleado.obtenerSueldo());   

       empleados.close();
       empleados2.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   } // Fin Método clasificarArchivo

   public static void imprimirCatalogo()
   {
       int   totEmpleados;
       float totSueldos;
     try
     {
       RandomAccessFile empleados2 = new RandomAccessFile("g:/LLR-USB/Libros/LibroOO 2da Ed progsJava/capitulo15/Empl2.cla", "rw");
       System.out.println("-------------------------------------------------------------");
       System.out.println("                  CATALOGO DE EMPLEADOS     ");
       System.out.println("NUMERO NOMBRE                         DEPTO  PUESTO    SUELDO");
       System.out.println("-------------------------------------------------------------");
       totEmpleados = 0;
       totSueldos = 0;
       RegEmpleado4 objEmpleado = new RegEmpleado4();
    // Lee los datos del primer empleado del archivo         
       objEmpleado.establecerNumero(empleados2.readInt()); 
       objEmpleado.establecerNombreEmp(empleados2.readUTF());
       objEmpleado.establecerDepto(empleados2.readInt()); 
       objEmpleado.establecerPuesto(empleados2.readInt()); 
       objEmpleado.establecerSueldo(empleados2.readFloat()); 
       while (objEmpleado.obtenerNombreEmp().compareTo("FIN") != 0)
       {
         // Imprime los datos            
            System.out.printf("%6d ", objEmpleado.obtenerNumero());
            System.out.printf("%30s ", objEmpleado.obtenerNombreEmp());
            System.out.printf("%4d", objEmpleado.obtenerDepto());
            System.out.printf("%7d", objEmpleado.obtenerPuesto());
            System.out.printf("%12.2f\n", objEmpleado.obtenerSueldo());
            totEmpleados = totEmpleados + 1;
            totSueldos = totSueldos + objEmpleado.obtenerSueldo();
            objEmpleado = new RegEmpleado4();
         // Lee los datos del siguiente empleado del archivo         
            objEmpleado.establecerNumero(empleados2.readInt()); 
            objEmpleado.establecerNombreEmp(empleados2.readUTF());
            objEmpleado.establecerDepto(empleados2.readInt()); 
            objEmpleado.establecerPuesto(empleados2.readInt()); 
            objEmpleado.establecerSueldo(empleados2.readFloat()); 
       }
       System.out.println("-------------------------------------------------------------");
       System.out.printf(" Total  %4d   Empleados  %35.2f\n", totEmpleados, totSueldos);
       System.out.println("-------------------------------------------------------------");
       empleados2.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
}
