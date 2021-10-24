// Programa SISTEMA DE VENDEDORES
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: RegVendedor, RegDepto, RegSuc y EjecutaRegVendedor
// EjecutaRegVendedor.java

import java.util.Scanner;
import java.io.*;
public class EjecutaRegVendedor
{
   public static void main(String args[])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion;
       do
       {
          System.out.println("-------------------------------------");
          System.out.println("|       SISTEMA DE VENDEDORES       |");
          System.out.println("|-----------------------------------|");
          System.out.println("|  1. MANTENIMIENTO VENDEDORES      |");
          System.out.println("|  2. MANTENIMIENTO DEPARTAMENTOS   |");
          System.out.println("|  3. MANTENIMIENTO SUCURSALES      |");
          System.out.println("|  4. CONSULTAS VENDEDORES          |");
          System.out.println("|  5. CONSULTAS DEPARTAMENTOS       |");
          System.out.println("|  6. CONSULTAS SUCURSALES          |");
          System.out.println("|  7. CAPTURA DE VENTAS DIARIAS     |");
          System.out.println("|  8. REPORTE DE INCENTIVOS         |");
          System.out.println("|  9. REPORTE DE VENTAS             |");
          System.out.println("| 10. FIN                           |");
          System.out.println("|-----------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion = entrada.nextInt();        
          switch (opcion)
          {
             case 1:
                  mantenimVendedores();
                  break;
             case 2:
                  mantenimDeptos();
                  break;
             case 3:
                  mantenimSucs();
                  break;
             case 4:
                  consultasVendedores();
                  break;
             case 5:
                  consultasDeptos();
                  break;
             case 6:
                  consultasSucs();
                  break;
             case 7:
                  capturaVentas();
                  break;
             case 8:
                  reporteIncentivos();
                  break;
             case 9:
                  reporteVentas();
                  break;
          }
       } while (opcion != 10);
   }

   public static void mantenimVendedores()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion2;
       do
       {
          System.out.println("---------------------------------------");
          System.out.println("|        SISTEMA DE VENDEDORES        |");
          System.out.println("|  MANTENIMIENTO ARCHIVO VENDEDORES   |");
          System.out.println("|-------------------------------------|");
          System.out.println("|  1. CREAR ARCHIVO DE VENDEDORES     |");
          System.out.println("|  2. EXPANSION ARCHIVO DE VENDEDORES |");
          System.out.println("|  3. ALTAS DE VENDEDORES             |");
          System.out.println("|  4. BAJAS DE VENDEDORES             |");
          System.out.println("|  5. CAMBIOS DE VENDEDORES           |");
          System.out.println("|  6. FIN                             |");
          System.out.println("|-------------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion2 = entrada.nextInt();        
          switch (opcion2)
          {
             case 1:
                  crearVendedores();
                  break;
             case 2:
                  expansionVendedores();
                  break;
             case 3:
                  altasVendedores();
                  break;
             case 4:
                  bajasVendedores();
                  break;
             case 5:
                  cambiosVendedores();
                  break;
          }
       } while (opcion2 != 6);
   }

   public static void crearVendedores()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");
       int    i, n, numRegs;
       float  ven;
       int    numVen; 
       String nomVen;
       int    cveSuc;
       int    cveDep;
       float  vtas[] = new float[5];

       System.out.print("Teclee cantidad de registros que tendra el archivo: ");
       numRegs = entrada.nextInt();

       numVen = 0; 
       nomVen = "                              ";
       cveSuc = 0;
       cveDep = 0;
       for (i=0; i<=4; i++)
           vtas[i] = 0;
       RegVendedor objVendor = new RegVendedor();
       objVendor.establecerNumero(numVen);
       objVendor.establecerNombreVen(nomVen);
       objVendor.establecerClaveSuc(cveSuc);
       objVendor.establecerClaveDepto(cveDep);
       objVendor.establecerVentas(vtas);
       for (i=1; i<=numRegs; i++)
       {
           vendedores.writeInt(objVendor.obtenerNumero()); 
           vendedores.writeUTF(objVendor.obtenerNombreVen()); 
           vendedores.writeInt(objVendor.obtenerClaveSuc());
           vendedores.writeInt(objVendor.obtenerClaveDepto());
           vtas = objVendor.obtenerVentas();
           for (n=0; n<=4; n++)
           {
              ven = vtas[n];
              vendedores.writeFloat(ven);
           }
       } 
       nomVen = "FIN";
       objVendor.establecerNombreVen(nomVen);
       vendedores.writeInt(objVendor.obtenerNumero()); 
       vendedores.writeUTF(objVendor.obtenerNombreVen()); 
       vendedores.writeInt(objVendor.obtenerClaveSuc());   
       vendedores.writeInt(objVendor.obtenerClaveDepto());
       vtas = objVendor.obtenerVentas();
       for (n=0; n<=4; n++)
       {
           ven = vtas[n];
           vendedores.writeFloat(ven);
       }
       vendedores.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void expansionVendedores() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");

       int    i, n, numRegs;
       long   apuntador;
       float  ven;
       int    numVen; 
       String nomVen;
       int    cveSuc;
       int    cveDep;
       float  vtas[] = new float[5];

       System.out.print("Teclee cantidad de registros que agregara al archivo: ");
       numRegs = entrada.nextInt();

       RegVendedor objVendor = new RegVendedor();
    // Lee los datos del primer vendedor del archivo         
       apuntador = vendedores.getFilePointer(); 

       objVendor.establecerNumero(vendedores.readInt()); 
       objVendor.establecerNombreVen(vendedores.readUTF());
       objVendor.establecerClaveSuc(vendedores.readInt()); 
       objVendor.establecerClaveDepto(vendedores.readInt());
       for (n=0; n<=4; n++)
       {
           ven = vendedores.readFloat();
           vtas[n] = ven;
       }
       objVendor.establecerVentas(vtas);
       while (objVendor.obtenerNombreVen().compareTo("FIN") != 0)
       {
         // Lee los datos del siguiente vendedor del archivo         
            apuntador = vendedores.getFilePointer(); 
            objVendor.establecerNumero(vendedores.readInt()); 
            objVendor.establecerNombreVen(vendedores.readUTF());
            objVendor.establecerClaveSuc(vendedores.readInt()); 
            objVendor.establecerClaveDepto(vendedores.readInt()); 
            for (n=0; n<=4; n++)
            {
                ven = vendedores.readFloat();
                vtas[n] = ven;
            }
            objVendor.establecerVentas(vtas);
       }
       vendedores.seek(apuntador);
       numVen = 0; 
       nomVen = "                              ";
       cveSuc = 0;
       cveDep = 0;
       for (i=0; i<=4; i++)
           vtas[i] = 0;
       objVendor = new RegVendedor();
       objVendor.establecerNumero(numVen);
       objVendor.establecerNombreVen(nomVen);
       objVendor.establecerClaveSuc(cveSuc);
       objVendor.establecerClaveDepto(cveDep);
       objVendor.establecerVentas(vtas);
       for (i=1; i<=numRegs; i++)
       {
           vendedores.writeInt(objVendor.obtenerNumero()); 
           vendedores.writeUTF(objVendor.obtenerNombreVen()); 
           vendedores.writeInt(objVendor.obtenerClaveSuc());   
           vendedores.writeInt(objVendor.obtenerClaveDepto());   
           vtas = objVendor.obtenerVentas();
           for (n=0; n<=4; n++)
           {
              ven = vtas[n];
              vendedores.writeFloat(ven);
           }
       } 
       nomVen = "FIN";
       objVendor.establecerNombreVen(nomVen);
       vendedores.writeInt(objVendor.obtenerNumero()); 
       vendedores.writeUTF(objVendor.obtenerNombreVen()); 
       vendedores.writeInt(objVendor.obtenerClaveSuc());   
       vendedores.writeInt(objVendor.obtenerClaveDepto());   
       vtas = objVendor.obtenerVentas();
       for (n=0; n<=4; n++)
       {
          ven = vtas[n];
          vendedores.writeFloat(ven);
       }
       vendedores.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void altasVendedores()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");

       String entradaChar;
       char   desea;
       int    i, n; 
       float  ven;
       int    numVen; 
       String nomVen;
       int    cveSuc;
       int    cveDep;
       float  vtas[] = new float[5];
       do
       {
           RegVendedor objVendor = new RegVendedor();
           System.out.println("             SISTEMA DE VENDEDORES     ");
           System.out.println("          ALTAS ARCHIVO DE VENDEDORES     ");
           System.out.print("Teclee numero: ");
           numVen = entrada.nextInt();
           entrada.nextLine();
           System.out.print("Teclee nombre: ");
           nomVen = entrada.nextLine();
           while (nomVen.length() < 30) nomVen = nomVen + " ";
           System.out.print("Teclee clave sucursal: ");
           cveSuc = entrada.nextInt();
           System.out.print("Teclee clave departamento: ");
           cveDep = entrada.nextInt();
           for (i=0; i<=4; i++)
               vtas[i] = 0;
           objVendor.establecerNumero(numVen);
           objVendor.establecerNombreVen(nomVen);
           objVendor.establecerClaveSuc(cveSuc);
           objVendor.establecerClaveDepto(cveDep);
           objVendor.establecerVentas(vtas);
           vendedores.seek((objVendor.obtenerNumero()-1) * 64);
           vendedores.writeInt(objVendor.obtenerNumero()); 
           vendedores.writeUTF(objVendor.obtenerNombreVen()); 
           vendedores.writeInt(objVendor.obtenerClaveSuc());   
           vendedores.writeInt(objVendor.obtenerClaveDepto());   
           vtas = objVendor.obtenerVentas();
           for (n=0; n<=4; n++)
           {
              ven = vtas[n];
              vendedores.writeFloat(ven);
           }
           System.out.print("\n¿Otra alta(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       vendedores.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void bajasVendedores()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea, seguro;
       int    num, i, n;
       float  ven;
       int    numVen; 
       String nomVen;
       int    cveSuc;
       int    cveDep;
       float  vtas[] = new float[5];
     try
     {
       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE VENDEDORES     ");
         System.out.println("         BAJAS ARCHIVO DE VENDEDORES     ");
         System.out.print("Teclee numero: ");
         num = entrada.nextInt();
         RegVendedor objVendor = new RegVendedor();
    // Lee los datos del vendedor del archivo   
         vendedores.seek((num -1) * 64);     
         objVendor.establecerNumero(vendedores.readInt()); 
         objVendor.establecerNombreVen(vendedores.readUTF());
         objVendor.establecerClaveSuc(vendedores.readInt()); 
         objVendor.establecerClaveDepto(vendedores.readInt()); 
         for (n=0; n<=4; n++)
         {
             ven = vendedores.readFloat();
             vtas [n] = ven;
         }
         objVendor.establecerVentas(vtas);
         System.out.println("Nombre: " + objVendor.obtenerNombreVen());
         System.out.println("Clave sucursal: " + objVendor.obtenerClaveSuc());
         System.out.println("Clave departamento: " + objVendor.obtenerClaveDepto());
         System.out.print("\nSon los datos que dara de baja, ¿seguro(S/N)?: ");
         entradaChar = entrada.next();
         seguro = entradaChar.charAt(0);
         entrada.nextLine();
         if (seguro == 'S' || seguro == 's')
         {
            numVen = 0; 
            nomVen = "                              ";
            cveSuc = 0;
            cveDep = 0;
            for (i=0; i<=4; i++)
                vtas[i] = 0;
            objVendor = new RegVendedor();
            objVendor.establecerNumero(numVen);
            objVendor.establecerNombreVen(nomVen);
            objVendor.establecerClaveSuc(cveSuc);
            objVendor.establecerClaveDepto(cveDep);
            objVendor.establecerVentas(vtas);
            vendedores.seek((num-1) * 64);
            vendedores.writeInt(objVendor.obtenerNumero()); 
            vendedores.writeUTF(objVendor.obtenerNombreVen()); 
            vendedores.writeInt(objVendor.obtenerClaveSuc());   
            vendedores.writeInt(objVendor.obtenerClaveDepto());   
            vtas = objVendor.obtenerVentas();
            for (n=0; n<=4; n++)
            {
               ven = vtas[n];
               vendedores.writeFloat(ven);
            }
         }
         System.out.print("\n¿Desea dar de baja otro vendedor(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       vendedores.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void cambiosVendedores()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    n, opcion2;
       float  ven;
       int    numVen; 
       String nomVen;
       int    cveSuc;
       int    cveDep;
       float  vtas[] = new float[5];
     try
     {
       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE VENDEDORES     ");
         System.out.println("        CAMBIOS ARCHIVO DE VENDEDORES     ");
         System.out.print("   Teclee numero: ");
         numVen = entrada.nextInt();
         RegVendedor objVendor = new RegVendedor();
    // Lee los datos del vendedor del archivo   
         vendedores.seek((numVen-1) * 64);    
         objVendor.establecerNumero(vendedores.readInt()); 
         objVendor.establecerNombreVen(vendedores.readUTF());
         objVendor.establecerClaveSuc(vendedores.readInt()); 
         objVendor.establecerClaveDepto(vendedores.readInt()); 
         for (n=0; n<=4; n++)
         {
             ven = vendedores.readFloat();
             vtas [n] = ven;
         }
         objVendor.establecerVentas(vtas);
         System.out.println("1: Nombre: " + objVendor.obtenerNombreVen());
         System.out.println("2: Clave sucrsal: " + objVendor.obtenerClaveSuc());
         System.out.println("3: Clave departamento: " + objVendor.obtenerClaveDepto());
         System.out.print("\nDato a cambiar(1, 2, 3, 0=FIN): ");
         opcion2 = entrada.nextInt();
         entrada.nextLine();
         while (opcion2 > 0 && opcion2 < 3)
         {
            switch (opcion2)
            {
              case 1:
                   System.out.print("Teclee nombre: ");
                   nomVen = entrada.nextLine();
                   while (nomVen.length() < 30) nomVen = nomVen + " ";
                   objVendor.establecerNombreVen(nomVen);
                   break;
              case 2:
                   System.out.print("Teclee clave sucursal: ");
                   cveSuc = entrada.nextInt();
                   objVendor.establecerClaveSuc(cveSuc);
                   break;
              case 3:
                   System.out.print("Teclee clave departamento: ");
                   cveDep = entrada.nextInt();
                   objVendor.establecerClaveDepto(cveDep);
                   break;
            }
            System.out.print("\nDato a cambiar(1, 2, 3, 0=FIN): ");
            opcion2 = entrada.nextInt();
            entrada.nextLine();
         }
         vendedores.seek((numVen-1) * 64);
         vendedores.writeInt(objVendor.obtenerNumero()); 
         vendedores.writeUTF(objVendor.obtenerNombreVen()); 
         vendedores.writeInt(objVendor.obtenerClaveSuc());  
         vendedores.writeInt(objVendor.obtenerClaveDepto());  
         vtas = objVendor.obtenerVentas();
         for (n=0; n<=4; n++)
         {
            ven = vtas[n];
            vendedores.writeFloat(ven);
         }
         System.out.print("\n¿Desea hacer otro cambio obrero(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       vendedores.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void mantenimDeptos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion3;
       do
       {
          System.out.println("------------------------------------------");
          System.out.println("|         SISTEMA DE VENDEDORES          |");
          System.out.println("|   MANTENIMIENTO ARCHIVO DEPARTAMENTOS  |");
          System.out.println("|----------------------------------------|");
          System.out.println("|  1. CREAR ARCHIVO DE DEPARTAMENTOS     |");
          System.out.println("|  2. EXPANSION ARCHIVO DE DEPARTAMENTOS |");
          System.out.println("|  3. ALTAS DE DEPARTAMENTOS             |");
          System.out.println("|  4. BAJAS DE DEPARTAMENTOS             |");
          System.out.println("|  5. CAMBIOS DE DEPARTAMENTOS           |");
          System.out.println("|  6. FIN                                |");
          System.out.println("|----------------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion3 = entrada.nextInt();        
          switch (opcion3)
          {
             case 1:
                  crearDeptos();
                  break;
             case 2:
                  expansionDeptos();
                  break;
             case 3:
                  altasDeptos();
                  break;
             case 4:
                  bajasDeptos();
                  break;
             case 5:
                  cambiosDeptos();
                  break;
          }
       } while (opcion3 != 6);
   }
 
   public static void crearDeptos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile deptos = new RandomAccessFile("C:/arDep.dat", "rw");
       int    i, numRegs;
       int    cveDep;
       String nomDep;
       System.out.print("Teclee cantidad de registros que tendra el archivo: ");
       numRegs = entrada.nextInt();
       cveDep = 0; 
       nomDep = "                              ";
       RegDepto objDepto = new RegDepto();
       objDepto.establecerClaveDepto(cveDep);
       objDepto.establecerNomDepto(nomDep);
       for (i=1; i<=numRegs; i++)
       {
           deptos.writeInt(objDepto.obtenerClaveDepto()); 
           deptos.writeUTF(objDepto.obtenerNomDepto()); 
       } 
       nomDep = "FIN";
       objDepto.establecerNomDepto(nomDep);
       deptos.writeInt(objDepto.obtenerClaveDepto()); 
       deptos.writeUTF(objDepto.obtenerNomDepto()); 
       deptos.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
  
   public static void expansionDeptos() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile deptos = new RandomAccessFile("C:/arDep.dat", "rw");
       int  i, numRegs;
       long apuntador;
       int    cveDep;
       String nomDep;

       System.out.print("Teclee cantidad de registros que agregara al archivo: ");
       numRegs = entrada.nextInt();
       RegDepto objDepto = new RegDepto();
    // Lee los datos del primer departamento del archivo         
       apuntador = deptos.getFilePointer(); 

       objDepto.establecerClaveDepto(deptos.readInt()); 
       objDepto.establecerNomDepto(deptos.readUTF());
       while (objDepto.obtenerNomDepto().compareTo("FIN") != 0)
       {
         // Lee los datos del siguiente departamento del archivo         
            apuntador = deptos.getFilePointer(); 
            objDepto.establecerClaveDepto(deptos.readInt()); 
            objDepto.establecerNomDepto(deptos.readUTF());
       }
       deptos.seek(apuntador);
       cveDep = 0; 
       nomDep = "                              ";

       objDepto = new RegDepto();
       objDepto.establecerClaveDepto(cveDep);
       objDepto.establecerNomDepto(nomDep);
       for (i=1; i<=numRegs; i++)
       {
           deptos.writeInt(objDepto.obtenerClaveDepto()); 
           deptos.writeUTF(objDepto.obtenerNomDepto()); 
       } 
       nomDep = "FIN";
       objDepto.establecerNomDepto(nomDep);
       deptos.writeInt(objDepto.obtenerClaveDepto()); 
       deptos.writeUTF(objDepto.obtenerNomDepto()); 
       deptos.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void altasDeptos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile deptos = new RandomAccessFile("C:/arDep.dat", "rw");
       String entradaChar;
       char   desea;
       int    cveDep;
       String nomDep;

       do
       {
           RegDepto objDepto = new RegDepto();
           System.out.println("             SISTEMA DE VENDEDORES     ");
           System.out.println("         ALTAS ARCHIVO DE DEPARTAMENTOS     ");
           System.out.print("Teclee clave depto.: ");
           cveDep = entrada.nextInt();
           entrada.nextLine();
           System.out.print("Teclee nombre depto.: ");
           nomDep = entrada.nextLine();
           while (nomDep.length() < 30) nomDep = nomDep + " ";
           objDepto.establecerClaveDepto(cveDep);
           objDepto.establecerNomDepto(nomDep);
           deptos.seek((objDepto.obtenerClaveDepto()-1) * 36);
           deptos.writeInt(objDepto.obtenerClaveDepto()); 
           deptos.writeUTF(objDepto.obtenerNomDepto()); 
           System.out.print("\n¿Otra alta(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       deptos.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void bajasDeptos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       String entradaChar;
       char   desea, seguro;
       int    cveDep, num;
       String nomDep;

     try
     {
       RandomAccessFile deptos = new RandomAccessFile("C:/arSuc.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE VENDEDORES     ");
         System.out.println("       BAJAS ARCHIVO DE DEPARTAMENTOS     ");
         System.out.print("Teclee clave depto.: ");
         num = entrada.nextInt();
         RegDepto objDepto = new RegDepto();
    // Lee los datos del departamento del archivo   
         deptos.seek((num -1) * 36);     
         objDepto.establecerClaveDepto(deptos.readInt()); 
         objDepto.establecerNomDepto(deptos.readUTF());
         System.out.println("Nombre departamento: " + objDepto.obtenerNomDepto());
         System.out.print("\nSon los datos que dara de baja, ¿seguro(S/N)?: ");
         entradaChar = entrada.next();
         seguro = entradaChar.charAt(0);
         entrada.nextLine();
         if (seguro == 'S' || seguro == 's')
         {
            cveDep = 0; 
            nomDep = "                              ";
            objDepto = new RegDepto();
            objDepto.establecerClaveDepto(cveDep);
            objDepto.establecerNomDepto(nomDep);

            deptos.seek((num-1) * 36);
            deptos.writeInt(objDepto.obtenerClaveDepto()); 
            deptos.writeUTF(objDepto.obtenerNomDepto()); 
         }
         System.out.print("\n¿Desea dar de baja otro depto.(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       deptos.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void cambiosDeptos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    opcion3;
       int    cveDep;
       String nomDep;
     try
     {
       RandomAccessFile deptos = new RandomAccessFile("C:/arDep.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE VENDEDORES     ");
         System.out.println("       CAMBIOS ARCHIVO DE DEPARTAMENTOS     ");
         System.out.print("   Teclee clave depto.: ");
         cveDep = entrada.nextInt();
         RegDepto objDepto = new RegDepto();
    // Lee los datos del departamento del archivo   
         deptos.seek((cveDep - 1) * 36);     
         objDepto.establecerClaveDepto(deptos.readInt()); 
         objDepto.establecerNomDepto(deptos.readUTF());
         System.out.println("1: Nombre depto.: " + objDepto.obtenerNomDepto());
         System.out.print("\nDato a cambiar(1, 0=FIN): ");
         opcion3 = entrada.nextInt();
         entrada.nextLine();
         while (opcion3 > 0 && opcion3 < 2)
         {
            switch (opcion3)
            {
              case 1:
                   System.out.print("Teclee nombre depto.: ");
                   nomDep = entrada.nextLine();
                   while (nomDep.length() < 30) nomDep = nomDep + " ";
                   objDepto.establecerNomDepto(nomDep);
                   break;
            }
            System.out.print("\nDato a cambiar(1, 0=FIN): ");
            opcion3 = entrada.nextInt();
            entrada.nextLine();
         }
         deptos.seek((cveDep-1) * 36);
         deptos.writeInt(objDepto.obtenerClaveDepto()); 
         deptos.writeUTF(objDepto.obtenerNomDepto()); 
         System.out.print("\n¿Desea hacer otro cambio depto.(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       deptos.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void mantenimSucs()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion3;
       do
       {
          System.out.println("---------------------------------------");
          System.out.println("|         SISTEMA DE VENDEDORES       |");
          System.out.println("|   MANTENIMIENTO ARCHIVO SUCURSALES  |");
          System.out.println("|-------------------------------------|");
          System.out.println("|  1. CREAR ARCHIVO DE SUCURSALES     |");
          System.out.println("|  2. EXPANSION ARCHIVO DE SUCURSALES |");
          System.out.println("|  3. ALTAS DE SUCURSALES             |");
          System.out.println("|  4. BAJAS DE SUCURSALES             |");
          System.out.println("|  5. CAMBIOS DE SUCURSALES           |");
          System.out.println("|  6. FIN                             |");
          System.out.println("|-------------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion3 = entrada.nextInt();        
          switch (opcion3)
          {
             case 1:
                  crearSucs();
                  break;
             case 2:
                  expansionSucs();
                  break;
             case 3:
                  altasSucs();
                  break;
             case 4:
                  bajasSucs();
                  break;
             case 5:
                  cambiosSucs();
                  break;
          }
       } while (opcion3 != 6);
   }
 
   public static void crearSucs()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile sucs = new RandomAccessFile("C:/arSuc.dat", "rw");
       int    i, numRegs;
       int    cveSuc;
       String nomSuc;
       System.out.print("Teclee cantidad de registros que tendra el archivo: ");
       numRegs = entrada.nextInt();
       cveSuc = 0; 
       nomSuc = "                              ";
       RegSuc objSuc = new RegSuc();
       objSuc.establecerClaveSuc(cveSuc);
       objSuc.establecerNomSuc(nomSuc);
       for (i=1; i<=numRegs; i++)
       {
           sucs.writeInt(objSuc.obtenerClaveSuc()); 
           sucs.writeUTF(objSuc.obtenerNomSuc()); 
       } 
       nomSuc = "FIN";
       objSuc.establecerNomSuc(nomSuc);
       sucs.writeInt(objSuc.obtenerClaveSuc()); 
       sucs.writeUTF(objSuc.obtenerNomSuc()); 
       sucs.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void expansionSucs() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile sucs = new RandomAccessFile("C:/arSuc.dat", "rw");
       int  i, numRegs;
       long apuntador;
       int    cveSuc;
       String nomSuc;
       System.out.print("Teclee cantidad de registros que agregara al archivo: ");
       numRegs = entrada.nextInt();
       RegSuc objSuc = new RegSuc();
    // Lee los datos de la primera sucursal del archivo         
       apuntador = sucs.getFilePointer(); 
       objSuc.establecerClaveSuc(sucs.readInt()); 
       objSuc.establecerNomSuc(sucs.readUTF());
       while (objSuc.obtenerNomSuc().compareTo("FIN") != 0)
       {
         // Lee los datos de la siguiente sucursal del archivo         
            apuntador = sucs.getFilePointer(); 
            objSuc.establecerClaveSuc(sucs.readInt()); 
            objSuc.establecerNomSuc(sucs.readUTF());
       }
       sucs.seek(apuntador);
       cveSuc = 0; 
       nomSuc = "                              ";
       objSuc = new RegSuc();
       objSuc.establecerClaveSuc(cveSuc);
       objSuc.establecerNomSuc(nomSuc);
       for (i=1; i<=numRegs; i++)
       {
           sucs.writeInt(objSuc.obtenerClaveSuc()); 
           sucs.writeUTF(objSuc.obtenerNomSuc()); 
       } 
       nomSuc = "FIN";
       objSuc.establecerNomSuc(nomSuc);
       sucs.writeInt(objSuc.obtenerClaveSuc()); 
       sucs.writeUTF(objSuc.obtenerNomSuc()); 
       sucs.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
  
   public static void altasSucs()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile sucs = new RandomAccessFile("C:/arSuc.dat", "rw");
       String entradaChar;
       char   desea;
       int    cveSuc;
       String nomSuc;
       do
       {
           RegSuc objSuc = new RegSuc();
           System.out.println("             SISTEMA DE VENDEDORES     ");
           System.out.println("          ALTAS ARCHIVO DE SUCURSALES     ");
           System.out.print("Teclee clave sucursal: ");
           cveSuc = entrada.nextInt();
           entrada.nextLine();
           System.out.print("Teclee nombre sucursal: ");
           nomSuc = entrada.nextLine();
           while (nomSuc.length() < 30) nomSuc = nomSuc + " ";
           objSuc.establecerClaveSuc(cveSuc);
           objSuc.establecerNomSuc(nomSuc);
           sucs.seek((objSuc.obtenerClaveSuc()-1) * 36);
           sucs.writeInt(objSuc.obtenerClaveSuc()); 
           sucs.writeUTF(objSuc.obtenerNomSuc()); 
           System.out.print("\n¿Otra alta(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       sucs.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void bajasSucs()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea, seguro;
       int    cveSuc, num;
       String nomSuc;
     try
     {
       RandomAccessFile sucs = new RandomAccessFile("C:/arSuc.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE VENDEDORES     ");
         System.out.println("         BAJAS ARCHIVO DE SUCURSALES     ");
         System.out.print("Teclee clave sucursal: ");
         num = entrada.nextInt();
         RegSuc objSuc = new RegSuc();
    // Lee los datos de la sucursal del archivo   
         sucs.seek((num -1) * 36);     
         objSuc.establecerClaveSuc(sucs.readInt()); 
         objSuc.establecerNomSuc(sucs.readUTF());
         System.out.println("Nombre sucursal: " + objSuc.obtenerNomSuc());
         System.out.print("\nSon los datos que dara de baja, ¿seguro(S/N)?: ");
         entradaChar = entrada.next();
         seguro = entradaChar.charAt(0);
         entrada.nextLine();
         if (seguro == 'S' || seguro == 's')
         {
            cveSuc = 0; 
            nomSuc = "                              ";
            objSuc = new RegSuc();
            objSuc.establecerClaveSuc(cveSuc);
            objSuc.establecerNomSuc(nomSuc);
            sucs.seek((num-1) * 36);
            sucs.writeInt(objSuc.obtenerClaveSuc()); 
            sucs.writeUTF(objSuc.obtenerNomSuc()); 
         }
         System.out.print("\n¿Desea dar de baja otra sucursal(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       sucs.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
  
   public static void cambiosSucs()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       String entradaChar;
       char   desea;
       int    opcion3;
       int    cveSuc;
       String nomSuc;
     try
     {
       RandomAccessFile sucs = new RandomAccessFile("C:/arSuc.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE VENDEDORES     ");
         System.out.println("        CAMBIOS ARCHIVO DE SUCURSALES     ");
         System.out.print("   Teclee clave sucursal: ");
         cveSuc = entrada.nextInt();
         RegSuc objSuc = new RegSuc();
    // Lee los datos de la sucursal del archivo   
         sucs.seek((cveSuc - 1) * 36);     
         objSuc.establecerClaveSuc(sucs.readInt()); 
         objSuc.establecerNomSuc(sucs.readUTF());
         System.out.println("1: Nombre sucursal: " + objSuc.obtenerNomSuc());
         System.out.print("\nDato a cambiar(1, 0=FIN): ");
         opcion3 = entrada.nextInt();
         entrada.nextLine();
         while (opcion3 > 0 && opcion3 < 2)
         {
            switch (opcion3)
            {
              case 1:
                   System.out.print("Teclee nombre sucursal: ");
                   nomSuc = entrada.nextLine();
                   while (nomSuc.length() < 30) nomSuc = nomSuc + " ";
                   objSuc.establecerNomSuc(nomSuc);
                   break;
            }
            System.out.print("\nDato a cambiar(1, 0=FIN): ");
            opcion3 = entrada.nextInt();
            entrada.nextLine();
         }
         sucs.seek((cveSuc - 1) * 36);
         sucs.writeInt(objSuc.obtenerClaveSuc()); 
         sucs.writeUTF(objSuc.obtenerNomSuc()); 
         System.out.print("\n¿Desea hacer otro cambio sucursal(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       sucs.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void consultasVendedores()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    numVen, i, n;
       float  ven;
       float  vtas[] = new float[5];
     try
     {

       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");
       do
       {
         System.out.println("               SISTEMA DE VENDEDORES     ");
         System.out.println("          CONSULTAS ARCHIVO DE VENDEDORES     ");
         System.out.print("Teclee numero: ");
         numVen = entrada.nextInt();
         RegVendedor objVendor = new RegVendedor();
    // Lee los datos del vendedor del archivo   
         vendedores.seek((numVen - 1) * 64);     
         objVendor.establecerNumero(vendedores.readInt()); 
         objVendor.establecerNombreVen(vendedores.readUTF());
         objVendor.establecerClaveSuc(vendedores.readInt()); 
         objVendor.establecerClaveDepto(vendedores.readInt()); 
         for (n=0; n<=4; n++)
         {
             ven = vendedores.readFloat();
             vtas[n] = ven;
         }
         objVendor.establecerVentas(vtas);
         System.out.println("Nombre: " + objVendor.obtenerNombreVen());
         System.out.println("Clave sucursal: " + objVendor.obtenerClaveSuc());
         System.out.println("Clave depto.: " + objVendor.obtenerClaveDepto());
         vtas = objVendor.obtenerVentas();
         for (i=0; i<=4; i++)
           System.out.printf("Venta dia: %d :  %10.2f\n", i+1, vtas[i]);
         System.out.print("\n¿Desea consultar otro vendedor(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       vendedores.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void consultasDeptos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    cveDep;
     try
     {
       RandomAccessFile deptos = new RandomAccessFile("C:/arDep.dat", "rw");
       do
       {
         System.out.println("                SISTEMA DE VENDEDORES     ");
         System.out.println("         CONSULTAS ARCHIVO DE DEPARTAMENTOS     ");
         System.out.print("Teclee numero depto.: ");
         cveDep = entrada.nextInt();
         RegDepto objDepto = new RegDepto();
    // Lee los datos del departamento del archivo   
         deptos.seek((cveDep - 1) * 36);     
         objDepto.establecerClaveDepto(deptos.readInt()); 
         objDepto.establecerNomDepto(deptos.readUTF());
         System.out.println("Nombre depto.: " + objDepto.obtenerNomDepto());
         System.out.print("\n¿Desea consultar otro depto.(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       deptos.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
  
   public static void consultasSucs()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    cveSuc;
     try
     {

       RandomAccessFile sucs = new RandomAccessFile("C:/arSuc.dat", "rw");
       do
       {
         System.out.println("                SISTEMA DE VENDEDORES     ");
         System.out.println("          CONSULTAS ARCHIVO DE SUCURSALES     ");
         System.out.print("Teclee numero sucursal: ");
         cveSuc = entrada.nextInt();
         RegSuc objSuc = new RegSuc();
    // Lee los datos de la sucursal del archivo   
         sucs.seek((cveSuc - 1) * 36);     
         objSuc.establecerClaveSuc(sucs.readInt()); 
         objSuc.establecerNomSuc(sucs.readUTF());
         System.out.println("Nombre sucursal: " + objSuc.obtenerNomSuc());
         System.out.print("\n¿Desea consultar otra sucursal(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       sucs.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void capturaVentas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       String entradaChar;
       char   desea;
       int    numVen, i, n, d; 
       float  ven;
       float  vtas[] = new float[5];

       RandomAccessFile vendedores = new RandomAccessFile("C:/arVen.dat", "rw");
       System.out.print("Teclee numero(1-5) de dia capturar: ");
       d = entrada.nextInt();
       i = d - 1; // Se usa d para hacer el ajuste entre el numero de dia y la posicion donde se guardara en el arreglo
       do
       {
           RegVendedor objVendor = new RegVendedor();
           System.out.println("           SISTEMA DE VENDEDORES");
           System.out.println("          CAPTURA DE VENTA DIARIA");
           System.out.print("Teclee numero: ");
           numVen = entrada.nextInt();
           entrada.nextLine();
        // Lee los datos del vendedor del archivo   
           vendedores.seek((numVen - 1) * 64);     
           objVendor.establecerNumero(vendedores.readInt()); 
           objVendor.establecerNombreVen(vendedores.readUTF());
           objVendor.establecerClaveSuc(vendedores.readInt()); 
           objVendor.establecerClaveDepto(vendedores.readInt()); 
           for (n=0; n<=4; n++)
           {
             ven = vendedores.readFloat();
             vtas[n] = ven;
           }
           objVendor.establecerVentas(vtas);
           System.out.println("Nombre: " + objVendor.obtenerNombreVen());
           vtas = objVendor.obtenerVentas();
           System.out.printf("Teclee venta del dia %d : ", d);
           vtas[i] = entrada.nextInt();
           entrada.nextLine();
           objVendor.establecerVentas(vtas);
           vendedores.seek((numVen - 1) * 64);
           vendedores.writeInt(objVendor.obtenerNumero()); 
           vendedores.writeUTF(objVendor.obtenerNombreVen()); 
           vendedores.writeInt(objVendor.obtenerClaveSuc());   
           vendedores.writeInt(objVendor.obtenerClaveDepto());   
           vtas = objVendor.obtenerVentas();
           for (n=0; n<=4; n++)
           {
              ven = vtas[n];
              vendedores.writeFloat(ven);
           }
           System.out.print("\n¿Otro vendedor(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       vendedores.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void reporteIncentivos()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       int   sucursalProceso, totVenSuc, totVen, n, i, d;
       float vtaSem, vtaSuc, vtaTot, incentivo, incentSuc, incentTot, ven;
       float incentivos[][] = new float[5][3];
       float vtas[] = new float[5];

     try
     {
       for (i=0; i<=4; i++)
       {
            d = i + 1; // Se usa d para hacer el ajuste entre el numero de dia y la posicion donde se guardara en el arreglo
            System.out.print("Teclee limite inferior[" + d + "][" +  1 + "]: ");
            incentivos[i][0] = entrada.nextInt();
            System.out.print("Teclee limite superior[" + d + "][" +  2 + "]: ");
            incentivos[i][1] = entrada.nextInt();
            System.out.print("Teclee incentivo[" + d + "]: ");
            incentivos[i][2] = entrada.nextInt();
       }
       totVen = 0; vtaTot = 0; incentTot = 0;
       System.out.println("--------------------------------------------------------------------------");
       System.out.println("                           REPORTE DE INCENTIVOS");
       System.out.println("NUMERO NOMBRE                          SUCURSAL   VENTA SEMANA   INCENTIVO");
       System.out.println("--------------------------------------------------------------------------");
       RandomAccessFile vendedores = new RandomAccessFile("c:/arVen.dat", "rw");
       RandomAccessFile sucs = new RandomAccessFile("c:/arSuc.dat", "rw");
       RegVendedor objVendor = new RegVendedor();
       RegSuc objSuc = new RegSuc();
    // Lee los datos del primer vendedor del archivo   
       objVendor.establecerNumero(vendedores.readInt()); 
       objVendor.establecerNombreVen(vendedores.readUTF());
       objVendor.establecerClaveSuc(vendedores.readInt()); 
       objVendor.establecerClaveDepto(vendedores.readInt()); 
       for (n=0; n<=4; n++)
       {   
           ven = vendedores.readFloat();
           vtas[n] = ven;
       }
       objVendor.establecerVentas(vtas);
       while (objVendor.obtenerNombreVen().compareTo("FIN") != 0)
       {
          sucursalProceso = objVendor.obtenerClaveSuc();
          totVenSuc = 0; vtaSuc = 0; incentSuc = 0; 
          while (sucursalProceso==objVendor.obtenerClaveSuc() && objVendor.obtenerNombreVen().compareTo("FIN") != 0)
          {
            vtas = objVendor.obtenerVentas();
            vtaSem = 0;
            for (i=0; i<=4; i++)
            {
               vtaSem = vtaSem + vtas[i];
            }
            i = -1;
            do
            {
               i = i + 1;
            } while(!(vtaSem >= incentivos[i][0] &&
                                    vtaSem <= incentivos[i][1]));
            incentivo = incentivos[i][2];
            System.out.printf("%6d ", objVendor.obtenerNumero());
            System.out.printf("%30s ", objVendor.obtenerNombreVen());
            System.out.printf("%6d ", objVendor.obtenerClaveSuc());
            System.out.printf("%16.2f", vtaSem);            
            System.out.printf("%13.2f\n", incentivo);            
            totVenSuc = totVenSuc + 1;
            vtaSuc = vtaSuc + vtaSem;
            incentSuc = incentSuc + incentivo;
            objVendor = new RegVendedor();
            objVendor.establecerNumero(vendedores.readInt()); 
            objVendor.establecerNombreVen(vendedores.readUTF());
            objVendor.establecerClaveSuc(vendedores.readInt()); 
            objVendor.establecerClaveDepto(vendedores.readInt()); 
            for (n=0; n<=4; n++)
            {
                ven = vendedores.readFloat();
                vtas[n] = ven;
            }
            objVendor.establecerVentas(vtas);
          }
          sucs.seek((sucursalProceso - 1) * 36);     
          objSuc = new RegSuc();
          objSuc.establecerClaveSuc(sucs.readInt()); 
          objSuc.establecerNomSuc(sucs.readUTF());
          System.out.printf("TOTAL SUCURSAL  %30s\n", objSuc.obtenerNomSuc());
          System.out.printf("%24d VENDEDORES ", totVenSuc);
          System.out.printf("%25.2f", vtaSuc);
          System.out.printf("%13.2f\n", incentSuc);
          totVen = totVen + totVenSuc;
          vtaTot = vtaTot + vtaSuc; 
          incentTot = incentTot + incentSuc;
       }
       System.out.printf("TOTAL GENERAL %10d VENDEDORES   %23.2f %12.2f\n", totVen, vtaTot, incentTot);
       vendedores.close();
       sucs.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void reporteVentas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       int   deptoProceso, sucursalProceso, totVenDepto, totVenSuc, totVen, i, n;
       float vtaSem, vtaDepto, vtaSuc, vtaTot, nivelVta, nivelVtaDepto, nivelVtaSuc, ven;
       String obs, obsSuc, obsDep;
       float vtas[] = new float[5];

     try
     {
       System.out.print("Teclee nivel venta por vendedor: ");
       nivelVta = entrada.nextFloat();
       System.out.print("Teclee nivel venta por depto.: ");
       nivelVtaDepto = entrada.nextFloat();
       System.out.print("Teclee nivel venta por sucursal: ");
       nivelVtaSuc = entrada.nextFloat();
       totVen = 0; vtaTot = 0; 
       System.out.println("------------------------------------------------------------------------------");
       System.out.println("                                  REPORTE DE VENTAS");
       System.out.println("NUMERO NOMBRE                        SUCURSAL  DEPTO. VENTA SEMANA NIVEL VENTA");
       System.out.println("------------------------------------------------------------------------------");
       RandomAccessFile vendedores = new RandomAccessFile("c:/arVen.dat", "rw");
       RandomAccessFile sucs = new RandomAccessFile("c:/arSuc.dat", "rw");
       RandomAccessFile deptos = new RandomAccessFile("c:/arDep.dat", "rw");
       RegVendedor objVendor = new RegVendedor();
       RegSuc objSuc = new RegSuc();
       RegDepto objDepto = new RegDepto();
    // Lee los datos del primer vendedor del archivo   
       objVendor.establecerNumero(vendedores.readInt()); 
       objVendor.establecerNombreVen(vendedores.readUTF());
       objVendor.establecerClaveSuc(vendedores.readInt()); 
       objVendor.establecerClaveDepto(vendedores.readInt()); 
       for (n=0; n<=4; n++)
       {   
           ven = vendedores.readFloat();
           vtas[n] = ven;
       }
       objVendor.establecerVentas(vtas);
       while (objVendor.obtenerNombreVen().compareTo("FIN") != 0)
       {
          sucursalProceso = objVendor.obtenerClaveSuc();
          totVenSuc = 0; vtaSuc = 0;  
          while (sucursalProceso==objVendor.obtenerClaveSuc() && objVendor.obtenerNombreVen().compareTo("FIN") != 0)
          {
             deptoProceso = objVendor.obtenerClaveDepto();
             totVenDepto = 0; vtaDepto = 0;
             while (deptoProceso==objVendor.obtenerClaveDepto())
             {
               vtas = objVendor.obtenerVentas();
               vtaSem = 0;
               for (i=0; i<=4; i++)
               {
                  vtaSem = vtaSem + vtas[i];
               }
               if (vtaSem < nivelVta)
                  obs = "DEFICIENTE";
               else
                  if (vtaSem < (nivelVta * 1.2))
                     obs = "BUENO";
                  else
                     obs = "EXCELENTE";
               System.out.printf("%6d ", objVendor.obtenerNumero());
               System.out.printf("%30s ", objVendor.obtenerNombreVen());
               System.out.printf("%6d ", objVendor.obtenerClaveSuc());
               System.out.printf("%6d ", objVendor.obtenerClaveDepto());
               System.out.printf("%12.2f   ", vtaSem);            
               System.out.printf("%-13s\n", obs);            
               totVenDepto = totVenDepto + 1;
               vtaDepto = vtaDepto + vtaSem;
               objVendor = new RegVendedor();
               objVendor.establecerNumero(vendedores.readInt()); 
               objVendor.establecerNombreVen(vendedores.readUTF());
               objVendor.establecerClaveSuc(vendedores.readInt()); 
               objVendor.establecerClaveDepto(vendedores.readInt()); 
               for (n=0; n<=4; n++)
               {
                   ven = vendedores.readFloat();
                   vtas[n] = ven;
               }
               objVendor.establecerVentas(vtas);
             }
             if (vtaDepto < nivelVtaDepto) 
                obsDep = "DEFICIENTE";
             else
                if (vtaDepto < (nivelVtaDepto * 1.2)) 
                   obsDep = "BUENO";
                else
                   obsDep = "EXCELENTE";
             deptos.seek((deptoProceso - 1) * 36);     
             objDepto = new RegDepto();
             objDepto.establecerClaveDepto(deptos.readInt()); 
             objDepto.establecerNomDepto(deptos.readUTF());
             System.out.printf("TOTAL DEPARTAMENTO  %30s\n", objDepto.obtenerNomDepto());
             System.out.printf("%24d VENDEDORES ", totVenDepto);
             System.out.printf("%28.2f   ", vtaDepto);
             System.out.printf("%-13s\n", obsDep);
             totVenSuc = totVenSuc + totVenDepto;
             vtaSuc = vtaSuc + vtaDepto; 
          }
          if (vtaSuc < nivelVtaSuc) 
             obsSuc = "DEFICIENTE";
          else
             if (vtaSuc < (nivelVtaSuc * 1.2)) 
                obsSuc = "BUENO";
             else
                obsSuc = "EXCELENTE";
          sucs.seek((sucursalProceso - 1) * 36);     
          objSuc = new RegSuc();
          objSuc.establecerClaveSuc(sucs.readInt()); 
          objSuc.establecerNomSuc(sucs.readUTF());
          System.out.printf("TOTAL SUCURSAL  %30s\n", objSuc.obtenerNomSuc());
          System.out.printf("%24d VENDEDORES ", totVenSuc);
          System.out.printf("%28.2f   ", vtaSuc);
          System.out.printf("%-13s\n", obsSuc);
          totVen = totVen + totVenSuc;
          vtaTot = vtaTot + vtaSuc; 
       }
       System.out.printf("TOTAL GENERAL %10d VENDEDORES   %26.2f\n", totVen, vtaTot);
       vendedores.close();
       sucs.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 }
