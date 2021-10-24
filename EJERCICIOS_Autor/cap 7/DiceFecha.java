// Programa DICE FECHA
// Elaborado por: Leobardo López Román
// DiceFecha.java

import java.util.Scanner;

public class DiceFecha
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String fecha, nombreMes="", dia, mes2, anio; 
       int nuMes, x;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\nDADA UNA FECHA, DDMMAAAA; LA DICE CON LETRAS");
       System.out.println("ES DECIR, SE LEE IGUAL EN LOS DOS SENTIDOS\n");

    // Leer dato
       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee fecha (DDMMAAAA): ");
       fecha = entrada.nextLine();

       dia = fecha.substring(0,2);
       mes2 = fecha.substring(2,4);
       nuMes = Integer.parseInt(mes2);
       anio = fecha.substring(4,8);

       switch (nuMes)
       {
           case 1:
                   nombreMes = "Enero";
                   break;
           case 2:
                   nombreMes = "Febrero";
                   break;
           case 3:
                   nombreMes = "Marzo";
                   break;
           case 4:
                   nombreMes = "Abril";
                   break;
           case 5:
                   nombreMes = "Mayo";
                   break;
           case 6:
                   nombreMes = "Junio";
                   break;
           case 7:
                   nombreMes = "Julio";
                   break;
           case 8:
                   nombreMes = "Agosto";
                   break;
           case 9:
                   nombreMes = "Septiembre";
                   break;
           case 10:
                   nombreMes = "Octubre";
                   break;
           case 11:
                   nombreMes = "Noviembre";
                   break;
           case 12:
                   nombreMes = "Diciembre";
                   break;
       }

    // Imprimir salida
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println(dia + " de " + nombreMes + " de " + anio);
   }
}