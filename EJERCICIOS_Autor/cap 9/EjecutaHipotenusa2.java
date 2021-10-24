// Clase ejecutora del programa CALCULAR HIPOTENUSA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Hipotenusa2 y EjecutaHipotenusa2
// EjecutaHipotenusa2.java

import java.util.Scanner;

public class EjecutaHipotenusa2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       double cateA, cateB;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Hipotenusa2 
       Hipotenusa2 objHipotenusa = new Hipotenusa2();

       System.out.println("\n           CALCULA HIPOTENUSA\n");

    // Leer dato
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee cateto A: ");
       cateA = entrada.nextDouble();

       System.out.print("Teclee cateto B: ");
       cateB = entrada.nextDouble();

    // Establecer los valores leidos, en los datos del objeto
       objHipotenusa.establecerA(cateA);
       objHipotenusa.establecerB(cateB);

    // Calcular 
       objHipotenusa.calcularC();

    // Imprimir salida, obteniendo el dato del objeto
       System.out.println("\n---------------- Resultado ---------------");
       System.out.println("Hipotenusa C = " + objHipotenusa.obtenerC());
   }
}
