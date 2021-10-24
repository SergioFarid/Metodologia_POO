// Clase ejecutora del programa DESVIACION DE MEDIA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: DesviacionMedia2 y EjecutaDesviacionMedia2
// DesviacionMedia2.java

import java.util.Scanner;

public class EjecutaDesviacionMedia2
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int nums[] = new int[15];
        int nums2[] = new int[15];
        float desv[] = new float[15];
        int i;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA DESVIACION DE MEDIA DE 15 NUMEROS\n");

     // Se declara, crea e inicia el objeto de la clase Vectores
        DesviacionMedia2 objNumeros = new DesviacionMedia2();

        System.out.println("-------- Lectura de datos --------");
        System.out.println("-------- Vector de numeros -------");
        for (i=0; i<=14; i++)
        {
           System.out.print("Teclee numeros[" + i + "]: ");
           nums[i] = entrada.nextInt();
        } 

     // Establecer
        objNumeros.establecerNumeros(nums);

     // Calcular
        objNumeros.calcularMedia();
        objNumeros.calcularDesviacion();

     // Obtener
        nums2 = objNumeros.obtenerNumeros();
        desv = objNumeros.obtenerDesviacion();

     // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("NUMERO    DESVIACION");
        System.out.println("---------------------------");
        for (i=0; i<=14; i++)
        {
           System.out.println(nums2[i] + "       " + desv[i]);
        }
        System.out.println("Media = " + objNumeros.obtenerMedia());
   }
}
