// Programa SISTEMA DE OBREROS
// Elaborado por: Leobardo López Román
// Esta formado por tres clases: RegObrero, RegPlanta y EjecutaRegObrero
// EjecutaRegObrero.java

import java.util.Scanner;
import java.io.*;
public class EjecutaRegObrero
{
   public static void main(String args[])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion;
       do
       {
          System.out.println("-------------------------------------");
          System.out.println("|         SISTEMA DE OBREROS        |");
          System.out.println("|-----------------------------------|");
          System.out.println("|  1. MANTENIMIENTO OBREROS         |");
          System.out.println("|  2. MANTENIMIENTO PLANTAS         |");
          System.out.println("|  3. CONSULTAS OBREROS             |");
          System.out.println("|  4. CONSULTAS PLANTAS             |");
          System.out.println("|  5. CAPTURA PRODUCCION DIARIA     |");
          System.out.println("|  6. REPORTE SEMANAL DE PRODUCCION |");
          System.out.println("|  7. REPORTE PRODUCCION PLANTA     |");
          System.out.println("|  8. REPORTE OBREROS PRODUCTIVOS   |");
          System.out.println("|  9. REPORTE DE PRODUCTIVIDAD      |");
          System.out.println("| 10. FIN                           |");
          System.out.println("|-----------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion = entrada.nextInt();        
          switch (opcion)
          {
             case 1:
                  mantenimObreros();
                  break;
             case 2:
                  mantenimPlantas();
                  break;
             case 3:
                  consultasObreros();
                  break;
             case 4:
                  consultasPlantas();
                  break;
             case 5:
                  capturaProduccion();
                  break;
             case 6:
                  reporteProduccion();
                  break;
             case 7:
                  reportePlanta();
                  break;
             case 8:
                  reporteProductivos();
                  break;
             case 9:
                  reporteProductividad();
                  break;
          }
       } while (opcion != 10);
   }

   public static void mantenimObreros()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion2;
       do
       {
          System.out.println("-------------------------------------");
          System.out.println("|         SISTEMA DE OBREROS        |");
          System.out.println("|   MANTENIMIENTO ARCHIVO OBREROS   |");
          System.out.println("|-----------------------------------|");
          System.out.println("|  1. CREAR ARCHIVO DE OBREROS      |");
          System.out.println("|  2. EXPANSION ARCHIVO DE OBREROS  |");
          System.out.println("|  3. ALTAS DE OBREROS              |");
          System.out.println("|  4. BAJAS DE OBREROS              |");
          System.out.println("|  5. CAMBIOS DE OBREROS            |");
          System.out.println("|  6. FIN                           |");
          System.out.println("|-----------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion2 = entrada.nextInt();        
          switch (opcion2)
          {
             case 1:
                  crearObreros();
                  break;
             case 2:
                  expansionObreros();
                  break;
             case 3:
                  altasObreros();
                  break;
             case 4:
                  bajasObreros();
                  break;
             case 5:
                  cambiosObreros();
                  break;
          }
       } while (opcion2 != 6);
   }

   public static void crearObreros()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");
       int    i, n, pro, numRegs;
       int    numObr; 
       String nomObr;
       int    cvePla;
       int    prod[] = new int[5];

       System.out.print("Teclee cantidad de registros que tendra el archivo: ");
       numRegs = entrada.nextInt();

       numObr = 0; 
       nomObr = "                              ";
       cvePla = 0;
       for (i=0; i<=4; i++)
           prod[i] = 0;

       RegObrero objObrero = new RegObrero();
       objObrero.establecerNumero(numObr);
       objObrero.establecerNombreObr(nomObr);
       objObrero.establecerClavePlanta(cvePla);
       objObrero.establecerProduc(prod);
       for (i=1; i<=numRegs; i++)
       {
           obreros.writeInt(objObrero.obtenerNumero()); 
           obreros.writeUTF(objObrero.obtenerNombreObr()); 
           obreros.writeInt(objObrero.obtenerClavePlanta());
           prod = objObrero.obtenerProduc();
           for (n=0; n<=4; n++)
           {
              pro = prod[n];
              obreros.writeInt(pro);
           }
       } 
       nomObr = "FIN";
       objObrero.establecerNombreObr(nomObr);
       obreros.writeInt(objObrero.obtenerNumero()); 
       obreros.writeUTF(objObrero.obtenerNombreObr()); 
       obreros.writeInt(objObrero.obtenerClavePlanta());   
       prod = objObrero.obtenerProduc();
       for (n=0; n<=4; n++)
       {
           pro = prod[n];
           obreros.writeInt(pro);
       }
       obreros.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void expansionObreros() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");

       int    i, n, pro, numRegs;
       long   apuntador;
       int    numObr; 
       String nomObr;
       int    cvePla;
       int    prod[] = new int[5];

       System.out.print("Teclee cantidad de registros que agregara al archivo: ");
       numRegs = entrada.nextInt();

       RegObrero objObrero = new RegObrero();
    // Lee los datos del primer obrero del archivo         
       apuntador = obreros.getFilePointer(); 

       objObrero.establecerNumero(obreros.readInt()); 
       objObrero.establecerNombreObr(obreros.readUTF());
       objObrero.establecerClavePlanta(obreros.readInt()); 
       for (n=0; n<=4; n++)
       {
           pro = obreros.readInt();
           prod[n] = pro;
       }
       objObrero.establecerProduc(prod);
       while (objObrero.obtenerNombreObr().compareTo("FIN") != 0)
       {
         // Lee los datos del siguiente obrero del archivo         
            apuntador = obreros.getFilePointer(); 
            objObrero.establecerNumero(obreros.readInt()); 
            objObrero.establecerNombreObr(obreros.readUTF());
            objObrero.establecerClavePlanta(obreros.readInt()); 
            for (n=0; n<=4; n++)
            {
                pro = obreros.readInt();
                prod[n] = pro;
            }
            objObrero.establecerProduc(prod);
       }
       obreros.seek(apuntador);
       numObr = 0; 
       nomObr = "                              ";
       cvePla = 0;
       for (i=0; i<=4; i++)
           prod[i] = 0;
       objObrero = new RegObrero();
       objObrero.establecerNumero(numObr);
       objObrero.establecerNombreObr(nomObr);
       objObrero.establecerClavePlanta(cvePla);
       objObrero.establecerProduc(prod);
       for (i=1; i<=numRegs; i++)
       {
           obreros.writeInt(objObrero.obtenerNumero()); 
           obreros.writeUTF(objObrero.obtenerNombreObr()); 
           obreros.writeInt(objObrero.obtenerClavePlanta());   
           prod = objObrero.obtenerProduc();
           for (n=0; n<=4; n++)
           {
              pro = prod[n];
              obreros.writeInt(pro);
           }
       } 
       nomObr = "FIN";
       objObrero.establecerNombreObr(nomObr);
       obreros.writeInt(objObrero.obtenerNumero()); 
       obreros.writeUTF(objObrero.obtenerNombreObr()); 
       obreros.writeInt(objObrero.obtenerClavePlanta());   
       prod = objObrero.obtenerProduc();
       for (n=0; n<=4; n++)
       {
          pro = prod[n];
          obreros.writeInt(pro);
       }
       obreros.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void altasObreros()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");

       String entradaChar;
       char   desea;
       int    i, n, pro; 
       int    numObr; 
       String nomObr;
       int    cvePla;
       int    prod[] = new int[5];

       do
       {
           RegObrero objObrero = new RegObrero();
           System.out.println("             SISTEMA DE OBREROS     ");
           System.out.println("          ALTAS ARCHIVO DE OBREROS     ");

           System.out.println("-------- Captura datos de obrero --------");

           System.out.print("Teclee numero: ");
           numObr = entrada.nextInt();
           entrada.nextLine();

           System.out.print("Teclee nombre: ");
           nomObr = entrada.nextLine();
           while (nomObr.length() < 30) nomObr = nomObr + " ";
           System.out.print("Teclee clave planta: ");
           cvePla = entrada.nextInt();
           for (i=0; i<=4; i++)
               prod[i] = 0;

           objObrero.establecerNumero(numObr);
           objObrero.establecerNombreObr(nomObr);
           objObrero.establecerClavePlanta(cvePla);
           objObrero.establecerProduc(prod);
           obreros.seek((objObrero.obtenerNumero()-1) * 60);
           obreros.writeInt(objObrero.obtenerNumero()); 
           obreros.writeUTF(objObrero.obtenerNombreObr()); 
           obreros.writeInt(objObrero.obtenerClavePlanta());   
           prod = objObrero.obtenerProduc();
           for (n=0; n<=4; n++)
           {
              pro = prod[n];
              obreros.writeInt(pro);
           }
           System.out.print("\n¿Otra alta(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       obreros.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void bajasObreros()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea, seguro;
       int    num, i, n, pro;
       int    numObr; 
       String nomObr;
       int    cvePla;
       int    prod[] = new int[5];

     try
     {
       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE OBREROS     ");
         System.out.println("         BAJAS ARCHIVO DE OBREROS     ");
         System.out.print("Teclee numero: ");
         num = entrada.nextInt();
         RegObrero objObrero = new RegObrero();
    // Lee los datos del obrero del archivo   
         obreros.seek((num -1) * 60);     
         objObrero.establecerNumero(obreros.readInt()); 
         objObrero.establecerNombreObr(obreros.readUTF());
         objObrero.establecerClavePlanta(obreros.readInt()); 
         for (n=0; n<=4; n++)
         {
             pro = obreros.readInt();
             prod [n] = pro;
         }
         objObrero.establecerProduc(prod);
         System.out.println("Nombre: " + objObrero.obtenerNombreObr());
         System.out.println("Departamento: " + objObrero.obtenerClavePlanta());

         System.out.print("\nSon los datos que dara de baja, ¿seguro(S/N)?: ");
         entradaChar = entrada.next();
         seguro = entradaChar.charAt(0);
         entrada.nextLine();
         if (seguro == 'S' || seguro == 's')
         {
            numObr = 0; 
            nomObr = "                              ";
            cvePla = 0;
            for (i=0; i<=4; i++)
                prod[i] = 0;
            objObrero = new RegObrero();
            objObrero.establecerNumero(numObr);
            objObrero.establecerNombreObr(nomObr);
            objObrero.establecerClavePlanta(cvePla);
            objObrero.establecerProduc(prod);

            obreros.seek((num-1) * 60);
            obreros.writeInt(objObrero.obtenerNumero()); 
            obreros.writeUTF(objObrero.obtenerNombreObr()); 
            obreros.writeInt(objObrero.obtenerClavePlanta());   
            prod = objObrero.obtenerProduc();
            for (n=0; n<=4; n++)
            {
               pro = prod[n];
               obreros.writeInt(pro);
            }
         }
         System.out.print("\n¿Desea dar de baja otro obrero(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       obreros.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void cambiosObreros()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    n, pro, opcion2;
       int    numObr; 
       String nomObr;
       int    cvePla;
       int    prod[] = new int[5];

     try
     {
       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE OBREROS     ");
         System.out.println("        CAMBIOS ARCHIVO DE OBREROS     ");
         System.out.print("   Teclee numero: ");
         numObr = entrada.nextInt();
         RegObrero objObrero = new RegObrero();
    // Lee los datos del obrero del archivo   
         obreros.seek((numObr -1) * 60);     
         objObrero.establecerNumero(obreros.readInt()); 
         objObrero.establecerNombreObr(obreros.readUTF());
         objObrero.establecerClavePlanta(obreros.readInt()); 
         for (n=0; n<=4; n++)
         {
             pro = obreros.readInt();
             prod[n] = pro;
         }
         objObrero.establecerProduc(prod);
         System.out.println("1: Nombre: " + objObrero.obtenerNombreObr());
         System.out.println("2: Clave planta: " + objObrero.obtenerClavePlanta());

         System.out.print("\nDato a cambiar(1, 2, 0=FIN): ");
         opcion2 = entrada.nextInt();
         entrada.nextLine();
         while (opcion2 > 0 && opcion2 < 3)
         {
            switch (opcion2)
            {
              case 1:
                   System.out.print("Teclee nombre: ");
                   nomObr = entrada.nextLine();
                   while (nomObr.length() < 30) nomObr = nomObr + " ";
                   objObrero.establecerNombreObr(nomObr);
                   break;
              case 2:
                   System.out.print("Teclee clave planta: ");
                   cvePla = entrada.nextInt();
                   objObrero.establecerClavePlanta(cvePla);
                   break;
            }
            System.out.print("\nDato a cambiar(1, 2, 0=FIN): ");
            opcion2 = entrada.nextInt();
            entrada.nextLine();
         }
         obreros.seek((numObr-1) * 60);
         obreros.writeInt(objObrero.obtenerNumero()); 
         obreros.writeUTF(objObrero.obtenerNombreObr()); 
         obreros.writeInt(objObrero.obtenerClavePlanta());  
         prod = objObrero.obtenerProduc();
         for (n=0; n<=4; n++)
         {
            pro = prod[n];
            obreros.writeInt(pro);
         }
         System.out.print("\n¿Desea hacer otro cambio obrero(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       obreros.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void mantenimPlantas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
       
       int opcion3;
       do
       {
          System.out.println("-------------------------------------");
          System.out.println("|         SISTEMA DE OBREROS        |");
          System.out.println("|   MANTENIMIENTO ARCHIVO PLANTAS   |");
          System.out.println("|-----------------------------------|");
          System.out.println("|  1. CREAR ARCHIVO DE PLANTAS      |");
          System.out.println("|  2. EXPANSION ARCHIVO DE PLANTAS  |");
          System.out.println("|  3. ALTAS DE PLANTAS              |");
          System.out.println("|  4. BAJAS DE PLANTAS              |");
          System.out.println("|  5. CAMBIOS DE PLANTAS            |");
          System.out.println("|  6. FIN                           |");
          System.out.println("|-----------------------------------|");
          System.out.print("        TECLEE OPCION: ");
          opcion3 = entrada.nextInt();        
          switch (opcion3)
          {
             case 1:
                  crearPlantas();
                  break;
             case 2:
                  expansionPlantas();
                  break;
             case 3:
                  altasPlantas();
                  break;
             case 4:
                  bajasPlantas();
                  break;
             case 5:
                  cambiosPlantas();
                  break;
          }
       } while (opcion3 != 6);
   }

   public static void crearPlantas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile plantas = new RandomAccessFile("C:/arPla.dat", "rw");
       int    i, numRegs;
       int    cvePla;
       String nomPla;

       System.out.print("Teclee cantidad de registros que tendra el archivo: ");
       numRegs = entrada.nextInt();

       cvePla = 0; 
       nomPla = "                              ";

       RegPlanta objPlanta = new RegPlanta();
       objPlanta.establecerClavePlanta(cvePla);
       objPlanta.establecerNombrePlanta(nomPla);
       for (i=1; i<=numRegs; i++)
       {
           plantas.writeInt(objPlanta.obtenerClavePlanta()); 
           plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 
       } 
       nomPla = "FIN";
       objPlanta.establecerNombrePlanta(nomPla);
       plantas.writeInt(objPlanta.obtenerClavePlanta()); 
       plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 
       plantas.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void expansionPlantas() 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile plantas = new RandomAccessFile("C:/arPla.dat", "rw");

       int  i, numRegs;
       long apuntador;
       int    cvePla;
       String nomPla;

       System.out.print("Teclee cantidad de registros que agregara al archivo: ");
       numRegs = entrada.nextInt();

       RegPlanta objPlanta = new RegPlanta();
    // Lee los datos de la primera planta del archivo         
       apuntador = plantas.getFilePointer(); 

       objPlanta.establecerClavePlanta(plantas.readInt()); 
       objPlanta.establecerNombrePlanta(plantas.readUTF());
       while (objPlanta.obtenerNombrePlanta().compareTo("FIN") != 0)
       {
         // Lee los datos de la siguiente planta del archivo         
            apuntador = plantas.getFilePointer(); 
            objPlanta.establecerClavePlanta(plantas.readInt()); 
            objPlanta.establecerNombrePlanta(plantas.readUTF());
       }
       plantas.seek(apuntador);

       cvePla = 0; 
       nomPla = "                              ";

       objPlanta = new RegPlanta();
       objPlanta.establecerClavePlanta(cvePla);
       objPlanta.establecerNombrePlanta(nomPla);
       for (i=1; i<=numRegs; i++)
       {
           plantas.writeInt(objPlanta.obtenerClavePlanta()); 
           plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 
       } 
       nomPla = "FIN";
       objPlanta.establecerNombrePlanta(nomPla);
       plantas.writeInt(objPlanta.obtenerClavePlanta()); 
       plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 
       plantas.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void altasPlantas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       RandomAccessFile plantas = new RandomAccessFile("C:/arPla.dat", "rw");

       String entradaChar;
       char   desea;
       int    cvePla;
       String nomPla;

       do
       {
           RegPlanta objPlanta = new RegPlanta();
           System.out.println("             SISTEMA DE OBREROS     ");
           System.out.println("          ALTAS ARCHIVO DE PLANTAS     ");

           System.out.println("-------- Captura datos de la planta --------");

           System.out.print("Teclee clave planta: ");
           cvePla = entrada.nextInt();
           entrada.nextLine();

           System.out.print("Teclee nombre planta: ");
           nomPla = entrada.nextLine();
           while (nomPla.length() < 30) nomPla = nomPla + " ";

           objPlanta.establecerClavePlanta(cvePla);
           objPlanta.establecerNombrePlanta(nomPla);
           plantas.seek((objPlanta.obtenerClavePlanta()-1) * 36);
           plantas.writeInt(objPlanta.obtenerClavePlanta()); 
           plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 

           System.out.print("\n¿Otra alta(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       plantas.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void bajasPlantas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea, seguro;
       int    cvePla, num;
       String nomPla;

     try
     {
       RandomAccessFile plantas = new RandomAccessFile("C:/arPla.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE OBREROS     ");
         System.out.println("         BAJAS ARCHIVO DE PLANTAS     ");
         System.out.print("Teclee clave planta: ");
         num = entrada.nextInt();
         RegPlanta objPlanta = new RegPlanta();
    // Lee los datos de la planta del archivo   
         plantas.seek((num -1) * 36);     
         objPlanta.establecerClavePlanta(plantas.readInt()); 
         objPlanta.establecerNombrePlanta(plantas.readUTF());

         System.out.println("Nombre planta: " + objPlanta.obtenerNombrePlanta());

         System.out.print("\nSon los datos que dara de baja, ¿seguro(S/N)?: ");
         entradaChar = entrada.next();
         seguro = entradaChar.charAt(0);
         entrada.nextLine();
         if (seguro == 'S' || seguro == 's')
         {
            cvePla = 0; 
            nomPla = "                              ";
            objPlanta = new RegPlanta();
            objPlanta.establecerClavePlanta(cvePla);
            objPlanta.establecerNombrePlanta(nomPla);

            plantas.seek((num-1) * 36);
            plantas.writeInt(objPlanta.obtenerClavePlanta()); 
            plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 
         }
         System.out.print("\n¿Desea dar de baja otra planta(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       plantas.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void cambiosPlantas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    opcion3;
       int    cvePla;
       String nomPla;

     try
     {
       RandomAccessFile plantas = new RandomAccessFile("C:/arPla.dat", "rw");
       do
       {
         System.out.println("            SISTEMA DE OBREROS     ");
         System.out.println("        CAMBIOS ARCHIVO DE PLANTAS     ");
         System.out.print("   Teclee clave planta: ");
         cvePla = entrada.nextInt();
         RegPlanta objPlanta = new RegPlanta();
    // Lee los datos de la planta del archivo   
         plantas.seek((cvePla - 1) * 36);     
         objPlanta.establecerClavePlanta(plantas.readInt()); 
         objPlanta.establecerNombrePlanta(plantas.readUTF());

         System.out.println("1: Nombre planta: " + objPlanta.obtenerNombrePlanta());

         System.out.print("\nDato a cambiar(1, 0=FIN): ");
         opcion3 = entrada.nextInt();
         entrada.nextLine();
         while (opcion3 > 0 && opcion3 < 2)
         {
            switch (opcion3)
            {
              case 1:
                   System.out.print("Teclee nombre planta: ");
                   nomPla = entrada.nextLine();
                   while (nomPla.length() < 30) nomPla = nomPla + " ";
                   objPlanta.establecerNombrePlanta(nomPla);
                   break;
            }
            System.out.print("\nDato a cambiar(1, 0=FIN): ");
            opcion3 = entrada.nextInt();
            entrada.nextLine();
         }
         plantas.seek((cvePla-1) * 36);
         plantas.writeInt(objPlanta.obtenerClavePlanta()); 
         plantas.writeUTF(objPlanta.obtenerNombrePlanta()); 
         System.out.print("\n¿Desea hacer otro cambio planta(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       plantas.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void consultasObreros()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    i, n, pro;
       int    numObr; 
       int    prod[] = new int[5];
     try
     {

       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");
       do
       {
         System.out.println("                SISTEMA DE OBREROS     ");
         System.out.println("          CONSULTAS ARCHIVO DE OBREROS     ");
         System.out.print("Teclee numero: ");
         numObr = entrada.nextInt();
         RegObrero objObrero = new RegObrero();
    // Lee los datos del obrero del archivo   
         obreros.seek((numObr - 1) * 60);     
         objObrero.establecerNumero(obreros.readInt()); 
         objObrero.establecerNombreObr(obreros.readUTF());
         objObrero.establecerClavePlanta(obreros.readInt()); 
         for (n=0; n<=4; n++)
         {
             pro = obreros.readInt();
             prod[n] = pro;
         }
         objObrero.establecerProduc(prod);
         System.out.println("Nombre: " + objObrero.obtenerNombreObr());
         System.out.println("Clave planta: " + objObrero.obtenerClavePlanta());

         prod = objObrero.obtenerProduc();
         for (i=0; i<=4; i++)
           System.out.println("Produccion dia: " + i + ": " + prod[i]);
         System.out.print("\n¿Desea consultar otro obrero(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       obreros.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void consultasPlantas()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String entradaChar;
       char   desea;
       int    cvePla;
     try
     {

       RandomAccessFile plantas = new RandomAccessFile("C:/arPla.dat", "rw");
       do
       {
         System.out.println("                SISTEMA DE OBREROS     ");
         System.out.println("          CONSULTAS ARCHIVO DE PLANTAS     ");
         System.out.print("Teclee numero planta: ");
         cvePla = entrada.nextInt();
         RegPlanta objPlanta = new RegPlanta();
    // Lee los datos de la planta del archivo   
         plantas.seek((cvePla - 1) * 36);     
         objPlanta.establecerClavePlanta(plantas.readInt()); 
         objPlanta.establecerNombrePlanta(plantas.readUTF());

         System.out.println("Nombre planta: " + objPlanta.obtenerNombrePlanta());

         System.out.print("\n¿Desea consultar otra planta(S/N)?: ");
         entradaChar = entrada.next();
         desea = entradaChar.charAt(0);
         entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       plantas.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void capturaProduccion()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);
     try
     {
       String entradaChar;
       char   desea;
       int    d, i, n, pro; 
       int    numObr; 
       int    prod[] = new int[5];

       RandomAccessFile obreros = new RandomAccessFile("C:/arObr.dat", "rw");
       System.out.print("Teclee numero(1-5) de dia capturar: ");
       d = entrada.nextInt();
       i = d - 1; // Se usa d para hacer el ajuste entre el numero de dia y la posicion donde se guardara en el arreglo
       do
       {
           RegObrero objObrero = new RegObrero();
           System.out.println("               SISTEMA DE OBREROS");
           System.out.println("          CAPTURA DE PRODUCCION DIARIA");

           System.out.print("Teclee numero: ");
           numObr = entrada.nextInt();
           entrada.nextLine();

        // Lee los datos del obrero del archivo   
           obreros.seek((numObr - 1) * 60);     
           objObrero.establecerNumero(obreros.readInt()); 
           objObrero.establecerNombreObr(obreros.readUTF());
           objObrero.establecerClavePlanta(obreros.readInt()); 
           for (n=0; n<=4; n++)
           {
             pro = obreros.readInt();
             prod [n] = pro;
           }
           objObrero.establecerProduc(prod);
           System.out.println("Nombre: " + objObrero.obtenerNombreObr());
           prod = objObrero.obtenerProduc();
           System.out.print("Teclee produccion del dia " + d + ": ");
           prod[i] = entrada.nextInt();
           entrada.nextLine();
           objObrero.establecerProduc(prod);
           obreros.seek((numObr - 1) * 60);
           obreros.writeInt(objObrero.obtenerNumero()); 
           obreros.writeUTF(objObrero.obtenerNombreObr()); 
           obreros.writeInt(objObrero.obtenerClavePlanta());   
           prod = objObrero.obtenerProduc();
           for (n=0; n<=4; n++)
           {
              pro = prod[n];
              obreros.writeInt(pro);
           }
           System.out.print("\n¿Otro obero(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
       obreros.close();
     } 
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void reporteProduccion()
   {
       int    totObr, prodSem, prodTot, i, n , pro;
       int    prod[] = new int[5];
       int    totProDias[] = new int[5];

     try
     {
       prodTot = 0; 
       totObr = 0;
       for (i=0; i<=4; i++)
           totProDias[i] = 0;
       System.out.println("---------------------------------------------------------------------------");
       System.out.println("                     REPORTE SEMANAL DE PRODUCCION");
       System.out.println("NUMERO NOMBRE                          DIA1 DIA2 DIA3 DIA4 DIA5 PROD.SEMANA");
       System.out.println("---------------------------------------------------------------------------");
       RandomAccessFile obreros = new RandomAccessFile("c:/arObr.dat", "rw");
       RegObrero objObrero = new RegObrero();
    // Lee los datos del primer obrero del archivo   
       objObrero.establecerNumero(obreros.readInt()); 
       objObrero.establecerNombreObr(obreros.readUTF());
       objObrero.establecerClavePlanta(obreros.readInt()); 
       for (n=0; n<=4; n++)
       {   pro = obreros.readInt();
           prod[n] = pro;
       }
       objObrero.establecerProduc(prod);
       while (objObrero.obtenerNombreObr().compareTo("FIN") != 0)
       {

          System.out.printf("%6d ", objObrero.obtenerNumero());
          System.out.printf("%30s ", objObrero.obtenerNombreObr());
          prod = objObrero.obtenerProduc();
          prodSem = 0;
          for (i=0; i<=4; i++)
          {
              System.out.printf("%5d", prod[i]);
              prodSem = prodSem + prod[i];
              totProDias[i] = totProDias[i] + prod[i];
          }
          System.out.printf("%7d\n", prodSem);
          totObr = totObr + 1;
          prodTot = prodTot + prodSem;
          objObrero = new RegObrero();
          objObrero.establecerNumero(obreros.readInt()); 
          objObrero.establecerNombreObr(obreros.readUTF());
          objObrero.establecerClavePlanta(obreros.readInt()); 
          for (n=0; n<=4; n++)
          {
              pro = obreros.readInt();
              prod[n] = pro;
          }
          objObrero.establecerProduc(prod);
       }
       System.out.printf("TOTAL   %7d        OBREROS        ", totObr);
       for (i=0; i<=4; i++)
       {
           System.out.printf("%5d", totProDias[i]);
       }
       System.out.printf("%7d\n", prodTot);
       obreros.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void reportePlanta()
   {
       String obreroMay, obreroMayPl;
       int    prod[] = new int[5];
       int    toGeProDias[] = new int[5];
       int    toPlProDias[] = new int[5];
       int    toObrGe, toObrPl, prodSem, prodSemPl, prodTot, plantaProceso, prodMay, prodMayPl, i, n , pro;

     try
     {
       prodTot = 0; 
       toObrGe = 0;
       prodMay = 0;
       obreroMay = ""; obreroMayPl = "";
       for (i=0; i<=4; i++)
           toGeProDias[i] = 0;
       System.out.println("----------------------------------------------------------------------------------");
       System.out.println("                        REPORTE DE PRODUCCION POR PLANTA");
       System.out.println("NUMERO NOMBRE                          PLANTA DIA1 DIA2 DIA3 DIA4 DIA5 PROD.SEMANA");
       System.out.println("----------------------------------------------------------------------------------");
       RandomAccessFile obreros = new RandomAccessFile("c:/arObr.dat", "rw");
       RandomAccessFile plantas = new RandomAccessFile("c:/arPla.dat", "rw");
       RegObrero objObrero = new RegObrero();
       RegPlanta objPlanta = new RegPlanta();
    // Lee los datos del primer obrero del archivo   
       objObrero.establecerNumero(obreros.readInt()); 
       objObrero.establecerNombreObr(obreros.readUTF());
       objObrero.establecerClavePlanta(obreros.readInt()); 
       for (n=0; n<=4; n++)
       {   pro = obreros.readInt();
           prod[n] = pro;
       }
       objObrero.establecerProduc(prod);
       while (objObrero.obtenerNombreObr().compareTo("FIN") != 0)
       {
          plantaProceso = objObrero.obtenerClavePlanta();
          toObrPl = 0; prodSemPl = 0; prodMayPl = 0;
          for (i=0; i<=4; i++)
              toPlProDias[i] = 0;
          while (objObrero.obtenerClavePlanta() == plantaProceso && objObrero.obtenerNombreObr().compareTo("FIN") != 0)
          {
            prod = objObrero.obtenerProduc();
            System.out.printf("%6d ", objObrero.obtenerNumero());
            System.out.printf("%30s ", objObrero.obtenerNombreObr());
            System.out.printf("%6d ", objObrero.obtenerClavePlanta());
            prodSem = 0;
            for (i=0; i<=4; i++)
            {
               System.out.printf("%5d", prod[i]);
               prodSem = prodSem + prod[i];
               toPlProDias[i] = toPlProDias[i] + prod[i];
            }
            System.out.printf("%7d\n", prodSem);
            if (prodSem > prodMayPl) 
            {
               prodMayPl = prodSem; 
               obreroMayPl = objObrero.obtenerNombreObr();
            }
            toObrPl = toObrPl + 1;
            prodSemPl = prodSemPl + prodSem;
            objObrero = new RegObrero();
            objObrero.establecerNumero(obreros.readInt()); 
            objObrero.establecerNombreObr(obreros.readUTF());
            objObrero.establecerClavePlanta(obreros.readInt()); 
            for (n=0; n<=4; n++)
            {
                pro = obreros.readInt();
                prod[n] = pro;
            }
            objObrero.establecerProduc(prod);
          }
          plantas.seek((plantaProceso - 1) * 36);     
          objPlanta = new RegPlanta();
          objPlanta.establecerClavePlanta(plantas.readInt()); 
          objPlanta.establecerNombrePlanta(plantas.readUTF());
          System.out.printf("TOTAL PLANTA  %s\n ", objPlanta.obtenerNombrePlanta());
          System.out.printf("%20d      OBREROS           ", toObrPl);
          for (i=0; i<=4; i++)
              System.out.printf("%5d", toPlProDias[i]);
          System.out.printf("%7d\n", prodSemPl);
          System.out.printf("OBRERO MAS PRODUCTIVO: %30s\n", obreroMayPl);
          if (prodMayPl > prodMay) 
          {
             prodMay = prodMayPl; 
             obreroMay = obreroMayPl;
          }
          for (i=0; i<=4; i++)
              toGeProDias[i] = toGeProDias[i] + toPlProDias[i];
          toObrGe = toObrGe + toObrPl;
          prodTot = prodTot + prodSemPl; 
       }
       System.out.printf("TOTAL GENERAL %7d      OBREROS           ", toObrGe);
       for (i=0; i<=4; i++)
           System.out.printf("%5d", toGeProDias[i]);
       System.out.printf("%7d\n", prodTot);
       System.out.printf("OBRERO MAS PRODUCTIVO: %30s\n", obreroMay);
       obreros.close();
       plantas.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
 
   public static void reporteProductivos()
   {
       String obreroMay, obreroMayPl;
       int    totPlantas, prodSem, prodTot, plantaProceso, prodMay, prodMayPl, i, n , pro;
       int    prod[] = new int[5];

     try
     {
       prodTot = 0; 
       prodMay = 0; prodMayPl = 0;
       totPlantas = 0;
       obreroMay = ""; obreroMayPl = "";
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("                   REPORTE DE OBREROS MAS PRODUCTIVOS");
       System.out.println("PLANTA                         NOMBRE OBRERO MAS PRODUCTIVO  PROD.SEMANAL");
       System.out.println("-------------------------------------------------------------------------");
       RandomAccessFile obreros = new RandomAccessFile("c:/arObr.dat", "rw");
       RandomAccessFile plantas = new RandomAccessFile("c:/arPla.dat", "rw");
       RegObrero objObrero = new RegObrero();
       RegPlanta objPlanta = new RegPlanta();
    // Lee los datos del primer obrero del archivo   
       objObrero.establecerNumero(obreros.readInt()); 
       objObrero.establecerNombreObr(obreros.readUTF());
       objObrero.establecerClavePlanta(obreros.readInt()); 
       for (n=0; n<=4; n++)
       {   pro = obreros.readInt();
           prod[n] = pro;
       }
       objObrero.establecerProduc(prod);
       while (objObrero.obtenerNombreObr().compareTo("FIN") != 0)
       {
          plantaProceso = objObrero.obtenerClavePlanta();
          prodMayPl = 0;
          while (objObrero.obtenerClavePlanta() == plantaProceso && objObrero.obtenerNombreObr().compareTo("FIN") != 0)
          {
            prod = objObrero.obtenerProduc();
            prodSem = 0;
            for (i=0; i<=4; i++)
            {
               prodSem = prodSem + prod[i];
            }
            if (prodSem > prodMayPl) 
            {
               prodMayPl = prodSem; 
               obreroMayPl = objObrero.obtenerNombreObr();
            }
            objObrero = new RegObrero();
            objObrero.establecerNumero(obreros.readInt()); 
            objObrero.establecerNombreObr(obreros.readUTF());
            objObrero.establecerClavePlanta(obreros.readInt()); 
            for (n=0; n<=4; n++)
            {
                pro = obreros.readInt();
                prod[n] = pro;
            }
            objObrero.establecerProduc(prod);
          }
          plantas.seek((plantaProceso - 1) * 36);     
          objPlanta = new RegPlanta();
          objPlanta.establecerClavePlanta(plantas.readInt()); 
          objPlanta.establecerNombrePlanta(plantas.readUTF());
          System.out.printf("%30s ", objPlanta.obtenerNombrePlanta());
          System.out.printf("%30s ", obreroMayPl);
          System.out.printf("%8d\n", prodMayPl);
          if (prodMayPl > prodMay) 
          {
             prodMay = prodMayPl; 
             obreroMay = obreroMayPl;
          }
          totPlantas = totPlantas + 1;
          prodTot = prodTot + prodMayPl; 
       }
       System.out.printf("TOTAL    %7d      PLANTAS           ", totPlantas);
       System.out.printf("%30d\n", prodTot);
       System.out.printf("OBRERO MAS PRODUCTIVO: %30s\n", obreroMay);
       System.out.printf("PRODUCCION DEL OBRERO MAS PRODUCTIVO: %7d\n", prodMay);
       obreros.close();
       plantas.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }

   public static void reporteProductividad()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       String obreroMay, obreroMayPl;
       int    niveles[][] = new int[5][2];
       int    prod[] = new int[5];
       int    totNivelPl[] = new int[5];
       int    totNivelGe[] = new int[5];
       int    totObrGe, totObrPl, prodSem, prodSemPl, prodTot, plantaProceso, nivel, i, n, d, pro;

     try
     {
       prodTot = 0; 
       totObrGe = 0;
       for (i=0; i<=4; i++)
       {
            d = i + 1; // Se usa d para hacer el ajuste entre el numero de dia y la posicion donde se guardara en el arreglo
            System.out.print("Teclee limite inferior[" + d + "][" +  1 + "]: ");
            niveles[i][0] = entrada.nextInt();
            System.out.print("Teclee limite superior[" + d + "][" +  2 + "]: ");
            niveles[i][1] = entrada.nextInt();
       }
       for (i=0; i<=4; i++)
           totNivelGe[i] = 0;
       System.out.println("--------------------------------------------------------------------------");
       System.out.println("                        REPORTE DE PRODUCTIVIDAD");
       System.out.println("                                               PRODUCCION        NIVEL");
       System.out.println("NUMERO NOMBRE                          PLANTA    SEMANAL     PRODUCTIVIDAD");
       System.out.println("--------------------------------------------------------------------------");
       RandomAccessFile obreros = new RandomAccessFile("c:/arObr.dat", "rw");
       RandomAccessFile plantas = new RandomAccessFile("c:/arPla.dat", "rw");
       RegObrero objObrero = new RegObrero();
       RegPlanta objPlanta = new RegPlanta();
    // Lee los datos del primer obrero del archivo   
       objObrero.establecerNumero(obreros.readInt()); 
       objObrero.establecerNombreObr(obreros.readUTF());
       objObrero.establecerClavePlanta(obreros.readInt()); 
       for (n=0; n<=4; n++)
       {   pro = obreros.readInt();
           prod[n] = pro;
       }
       objObrero.establecerProduc(prod);
       while (objObrero.obtenerNombreObr().compareTo("FIN") != 0)
       {
          plantaProceso = objObrero.obtenerClavePlanta();
          totObrPl = 0; prodSemPl = 0; 
          for (i=0; i<=4; i++)
              totNivelPl[i] = 0;
          while (objObrero.obtenerClavePlanta() == plantaProceso && objObrero.obtenerNombreObr().compareTo("FIN") != 0)
          {
            prod = objObrero.obtenerProduc();
            prodSem = 0;
            for (i=0; i<=4; i++)
            {
               prodSem = prodSem + prod[i];
            }
            i = -1;
            do
            {
               i = i + 1;
            } while(!(prodSem >= niveles[i][0] &&
                                    prodSem <= niveles[i][1]));
            nivel = i;
            System.out.printf("%6d ", objObrero.obtenerNumero());
            System.out.printf("%30s ", objObrero.obtenerNombreObr());
            System.out.printf("%6d ", objObrero.obtenerClavePlanta());
            System.out.printf("%8d", prodSem);            
            System.out.printf("%15d\n", nivel+1);            
            totNivelPl[nivel] = totNivelPl[nivel] + 1;
            totObrPl = totObrPl + 1;
            prodSemPl = prodSemPl + prodSem;
            objObrero = new RegObrero();
            objObrero.establecerNumero(obreros.readInt()); 
            objObrero.establecerNombreObr(obreros.readUTF());
            objObrero.establecerClavePlanta(obreros.readInt()); 
            for (n=0; n<=4; n++)
            {
                pro = obreros.readInt();
                prod[n] = pro;
            }
            objObrero.establecerProduc(prod);
          }
          plantas.seek((plantaProceso - 1) * 36);     
          objPlanta = new RegPlanta();
          objPlanta.establecerClavePlanta(plantas.readInt()); 
          objPlanta.establecerNombrePlanta(plantas.readUTF());
          System.out.printf("TOTAL PLANTA  %30s\n", objPlanta.obtenerNombrePlanta());
          System.out.printf("%24d OBREROS ", totObrPl);
          System.out.printf("%20d\n", prodSemPl);
          for (i=0; i<=4; i++)
              System.out.printf("NIVEL PRODUCTIVIDAD %5d: %5d  OBREROS\n", i+1, totNivelPl[i]);
          totObrGe = totObrGe + totObrPl;
          prodTot = prodTot + prodSemPl; 
          for (i=0; i<=4; i++)
              totNivelGe[i] = totNivelGe[i] + totNivelPl[i];
       }
       System.out.printf("TOTAL GENERAL %10d OBREROS   %18d\n", totObrGe, prodTot);
       for (i=0; i<=4; i++)
           System.out.printf("NIVEL PRODUCTIVIDAD %5d: %5d  OBREROS\n", i+1, totNivelGe[i]);
       obreros.close();
       plantas.close();
     }
     catch (IOException error)
     {
        System.err.println("Error " + error.getMessage());
     }
   }
}
