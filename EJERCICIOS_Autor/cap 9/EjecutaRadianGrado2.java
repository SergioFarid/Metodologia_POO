// Clase ejecutora del programa CONVIERTE RADIANES A GRADOS Y GRADOS A RADIANES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RadianGrado2 y EjecutaRadianGrado2
// EjecutaRadianGrado2.java

import java.util.Scanner;

public class EjecutaRadianGrado2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       double radian, grad;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase RadianGrado2 
       RadianGrado2 objRadianGrado = new RadianGrado2();

       System.out.println("\nCONVIERTE RADIANES A GRADOS Y GRADOS A RADIANES\n");

    // Leer dato
       System.out.println("------------ Lectura de datos  ------------");
       System.out.print("Teclee numero de radianes: ");
       radian = entrada.nextDouble();

       System.out.print("Teclee numero de grados: ");
       grad = entrada.nextDouble();

    // Establecer los valores leidos, en los datos del objeto
       objRadianGrado.establecerRadianes(radian);
       objRadianGrado.establecerGrados(grad);

    // Calcular 
       objRadianGrado.calcularNumRadianes();
       objRadianGrado.calcularNumGrados();

    // Imprimir salida, obteniendo los datos del objeto
       System.out.println("\n---------------- Resultados ---------------");
       System.out.println("Numero de grados   = " + objRadianGrado.obtenerNumGrados());
       System.out.println("Numero de radianes = " + objRadianGrado.obtenerNumRadianes());
   }
}
