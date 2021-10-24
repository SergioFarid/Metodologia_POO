// Programa VALIDACION
// Elaborado por: Leobardo López Román
// Validacion.java

import java.util.Scanner;

public class Validacion
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String  nombreEmp;
       long    horasTrab;
       float   cuotaHora;

       System.out.println("\nLEE Y VALIDA");
       System.out.println("      UN DATO ALFABETICO");
       System.out.println("      UN NUMERO ENTERO");
       System.out.println("      UN NUMERO REAL");

       System.out.println("------------ Lectura de datos ------------");

       nombreEmp = leerAlfabetico();
       horasTrab = leerEntero();
       cuotaHora = leerReal();

    // Imprimir salida
       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("Nombre = " + nombreEmp);
       System.out.println("Horas trabajadas = " + horasTrab);
       System.out.println("Cuota por hora = " + cuotaHora);
   }

   public static String leerAlfabetico()
   {
    // Declarar
    // Variables 
       String  nom;
       int     i, bandera;
       char    car;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer dato
       do 
       {
           bandera = 1;
           System.out.print("Teclee nombre: ");          
           nom = entrada.nextLine();
           for (i=0; i<=nom.length()-1; i++)
           {
               car = nom.charAt(i);
               if (!((car>='a' && car<='z') || (car>='A' && car<='Z') 
                                    || (car == ' ') || (car == '.'))) 
                  bandera = 0;
           }
       } while (bandera != 1);
       return nom;
   }

   public static long leerEntero()
   {
    // Declarar
    // Variables 
       long    n;
       String  numero;
       int     i, bandera;
       char    num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer dato
       do
       {
           do 
           {
               bandera = 1;
               System.out.print("Teclee horas trabajadas: ");         
               numero = entrada.nextLine();
               for (i=0; i<=numero.length()-1; i++)
               {
                  num = numero.charAt(i);
                  if (!((num >= '0' && num <= '9') || num == '-')) bandera = 0;
                  if (num == '-' && i > 0) bandera = 0;
               }
           } while (bandera != 1);
           n = Long.parseLong(numero);
           if (n < -32768 || n > 32767)
              bandera = 0;
       } while (bandera != 1);
       return n;
   }

   public static float leerReal()
   {
    // Declarar
    // Variables 
       float   z;
       String  numero;
       int     i, puntos, bandera;
       char    num;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer dato
       do
       {
            bandera = 1;
            puntos = 0;
            System.out.print("Teclee cuota por hora: ");        
            numero = entrada.nextLine();
            for (i=0; i<=numero.length()-1; i++)
            {
                num = numero.charAt(i);
                if (!((num >= '0' && num <= '9') || num == '-' || num == '.')) 
                   bandera = 0;
                if (num == '-' && i > 0) bandera = 0;
                if (num == '.' && i > 0) puntos = puntos + 1;
            }
            if (puntos > 1 ) bandera = 0;
       } while (bandera != 1);
       z = Float.parseFloat(numero);
       return z;
   }
}