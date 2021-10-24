// Clase ejecutora del programa SUMA ARREGLOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: SumaArreglos2 y EjecutaSumaArreglos2
// EjecutaSumaArreglos2.java

import java.util.Scanner;

public class EjecutaSumaArreglos2
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int arA[] = new int[10];
        int arA2[] = new int[10];
        int arB[] = new int[10];
        int arB2[] = new int[10];
        int arS[] = new int[10];
        int i;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA EL PRODUCTO DE DOS VECTORES\n");

     // Se declara, crea e inicia el objeto de la clase Vectores
        SumaArreglos2 objArreglos = new SumaArreglos2();

        System.out.println("-------- Lectura de datos --------");
        System.out.println("--------    Arreglo A     --------");
        for (i=0; i<=9; i++)
        {
           System.out.print("Teclee Vector A[" + i + "]: ");
           arA[i] = entrada.nextInt();
        } 

        System.out.println("--------    Arreglo B     --------");
        for (i=0; i<=9; i++)
        {
           System.out.print("Teclee Vector B[" + i + "]: ");
           arB[i] = entrada.nextInt();
        } 

     // Establecer
        objArreglos.establecerArregloA(arA);
        objArreglos.establecerArregloB(arB);

     // Calcular
        objArreglos.calcularArregloS();

     // Obtener
        arA2 = objArreglos.obtenerArregloA();
        arB2 = objArreglos.obtenerArregloB();
        arS = objArreglos.obtenerArregloS();

     // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("Arreglo 1    +    Arreglo 2    =    Arreglo 3");
        for (i=0; i<=9; i++)
        {
           System.out.println("    " + arA2[i] + "      " + arB2[i]+ "      " + arS[i]);
        }
   }
}
