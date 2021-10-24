// Clase ejecutora del programa CLASIFICA (ORDENA) ARREGLO DE NOMBRES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: NombresOrden y EjecutaNombresOrden
// EjecutaNombresOrden.java

import java.util.Scanner;

public class EjecutaNombresOrden
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        String noms[] = new String[10];
        String nomsOrdenado[] = new String[10];
        int i;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCLASIFICA (ORDENA) ARREGLO DE NOMBRES\n");

     // Se declara, crea e inicia el objeto 
        NombresOrden objNombres = new NombresOrden();

        System.out.println("--------------- Lectura de nombres --------------");
        for (i=0; i<=9; i++)
        {
           System.out.print("Teclee nombres[" + i + "]: ");
           noms[i] = entrada.nextLine();
        } 
        System.out.println("---------------- Nombres leidos -----------------");
        for (i=0; i<=9; i++)
        {
           System.out.println("nombres[" + i + "]: " + noms[i]);
        } 

     // Establecer
        objNombres.establecerNombres(noms);

     // Clasificar 
        objNombres.ordenarNombres();

     // Obtener
        nomsOrdenado = objNombres.obtenerNombres();

     // Imprimir
        System.out.println("--------------- Nombres ordenados ---------------");
        for (i=0; i<=9; i++)
        {
           System.out.println("numeros[" + i + "]= " + nomsOrdenado[i]);
        }
   }
}
