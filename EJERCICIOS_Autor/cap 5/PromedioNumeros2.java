// Programa PROMEDIO DE N NUMEROS
// Elaborado por: Leobardo López Román
// PromedioNumeros2.java

import java.util.Scanner;

public class PromedioNumeros2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int   i, n, numero, sumatoria;
       float promedio;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n         CALCULA EL PROMEDIO DE N NUMEROS\n");

       System.out.println("\n---------------- Lectura de datos ----------------");
       System.out.print("¿A cuantos numeros desea calcular el promedio : ");
       n = entrada.nextInt();
       sumatoria = 0;
       for (i = 1; i <= n; i++)
       {
           System.out.print("Teclee el numero " + i + " : ");
           numero = entrada.nextInt();
           sumatoria = sumatoria + numero; 
       } 
       promedio = (float)sumatoria / (float)n;

       System.out.println("\n------------------- Resultado --------------------");
       System.out.println("Promedio = " + promedio);
   }
}
