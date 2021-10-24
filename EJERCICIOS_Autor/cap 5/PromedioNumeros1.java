// Programa PROMEDIO DE 20 NUMEROS
// Elaborado por: Leobardo López Román
// PromedioNumeros1.java

import java.util.Scanner;

public class PromedioNumeros1
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int   i, numero, sumatoria;
       float promedio;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n        CALCULA EL PROMEDIO DE 20 NUMEROS\n");

       System.out.println("\n---------------- Lectura de datos ----------------");
       sumatoria = 0;
       for (i = 1; i <= 20; i++)
       {
           System.out.print("Teclee el numero " + i + " : ");
           numero = entrada.nextInt();
           sumatoria = sumatoria + numero; 
       } 
       promedio = (float)sumatoria / (float)20;

       System.out.println("\n------------------- Resultado --------------------");
       System.out.println("Promedio = " + promedio);
    }
}

