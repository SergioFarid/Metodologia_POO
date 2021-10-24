// Programa MAYOR 3 NUMEROS CON METODOS
// Elaborado por: Leobardo López Román
// Mayor3Numeros4.java

import java.util.Scanner;

public class Mayor3Numeros4
{  
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       int a[] = new int[1];
       int b[] = new int[1];
       int c[] = new int[1];
       int may;

       System.out.println("\n        MAYOR TRES NUMEROS\n");

       leerNumeros(a, b, c);
       may = obtenerMayor(a, b, c);
       imprimirMayor(may);
   } 

   public static void leerNumeros(int n1[], int n2[], int n3[])
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Leer datos
       System.out.println("-------- Lectura de datos --------");
       System.out.print("Teclee numero 1: ");
       n1[0] = entrada.nextInt();

       System.out.print("Teclee numero 2: ");
       n2[0] = entrada.nextInt();

       System.out.print("Teclee numero 3: ");
       n3[0] = entrada.nextInt();
   }

   public static int obtenerMayor(int num1[], int num2[], int num3[])
   {
   // Declarar variable
      int mayor;

      mayor = num1[0];
      if (num2[0] > mayor)
          mayor = num2[0];
      if (num3[0] > mayor)
          mayor = num3[0];
      return mayor;
   }

   public static void imprimirMayor(int m)
   {
    // Imprimir salida
       System.out.println("\n----------- Resultado ------------");
       System.out.println("Mayor = " + m);
   }
}