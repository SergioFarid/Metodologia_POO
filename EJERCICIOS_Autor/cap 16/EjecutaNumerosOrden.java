// Clase ejecutora del programa CLASIFICA (ORDENA) ARREGLO DE NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: NumerosOrden y EjecutaNumerosOrden
// EjecutaNumerosOrden.java

import java.util.Scanner;

public class EjecutaNumerosOrden
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int nums[] = new int[10];
        int numsOrdenado[] = new int[10];
        int i;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCLASIFICA (ORDENA) ARREGLO DE NUMEROS\n");

     // Se declara, crea e inicia el objeto 
        NumerosOrden objNumeros = new NumerosOrden();

        System.out.println("--------Lectura de numeros--------");
        for (i=0; i<=9; i++)
        {
           System.out.print("Teclee numeros[" + i + "]: ");
           nums[i] = entrada.nextInt();
        } 
        System.out.println("--------- Numeros leidos ---------");
        for (i=0; i<=9; i++)
        {
           System.out.println("numeros[" + i + "]: " + nums[i]);
        } 

     // Establecer
        objNumeros.establecerNumeros(nums);

     // Clasificar 
        objNumeros.ordenarNumeros();

     // Obtener
        numsOrdenado = objNumeros.obtenerNumeros();

     // Imprimir
        System.out.println("-------- Numeros ordenados -------");
        for (i=0; i<=9; i++)
        {
           System.out.println("numeros[" + i + "]= " + numsOrdenado[i]);
        }
   }
}
