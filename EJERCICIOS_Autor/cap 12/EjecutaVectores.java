// Clase ejecutora del programa PRODUCTO DE VECTORES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Vectores y EjecutaVectores
// EjecutaVectores.java

import java.util.Scanner;

public class EjecutaVectores
{
   public static void main(String args[])
   {
     // Declaraciones
     // Variables
        int vectA[] = new int[10];
        int vectA2[] = new int[10];
        int vectB[] = new int[10];
        int vectB2[] = new int[10];
        int i;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA EL PRODUCTO DE DOS VECTORES\n");

     // Se declara, crea e inicia el objeto de la clase Vectores
        Vectores objVectores = new Vectores();

        System.out.println("-------- Lectura de datos --------");
        System.out.println("--------     Vector A     --------");
        for (i=0; i<=9; i++)
        {
           System.out.print("Teclee Vector A[" + i + "]: ");
           vectA[i] = entrada.nextInt();
        } 

        System.out.println("--------     Vector B     --------");
        for (i=0; i<=9; i++)
        {
           System.out.print("Teclee Vector B[" + i + "]: ");
           vectB[i] = entrada.nextInt();
        } 

     // Establecer
        objVectores.establecerVectorA(vectA);
        objVectores.establecerVectorB(vectB);

     // Calcular
        objVectores.calcularProducto();

     // Obtener
        vectA2 = objVectores.obtenerVectorA();
        vectB2 = objVectores.obtenerVectorB();


     // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("   Vector A       Vector B");
        for (i=0; i<=9; i++)
        {
           System.out.println("       " + vectA2[i] + "               " + vectB2[i]);
        }
        System.out.println("Producto = " + objVectores.obtenerProducto());
   }
}
