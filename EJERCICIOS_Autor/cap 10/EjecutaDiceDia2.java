// Clase ejecutora del programa DICE DIA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: DiceDia2 y EjecutaDiceDia2
// EjecutaDiceDia2.java

import java.util.Scanner;

public class EjecutaDiceDia2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       int nDia;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Empleado5 
       DiceDia2 objDia = new DiceDia2();

       System.out.println("\n            DICE NOMBRE DEL DIA\n");

    // Leer dato
       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee numero de dia (1-7): ");
       nDia = entrada.nextInt();

    // Establecer el valor leido, en el dato del objeto
       objDia.establecerNumDia(nDia);

    // Calcular
       objDia.calcularNombreDia();

    // Imprimir salida, obteniendo el dato del objeto
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("El dia es = " + objDia.obtenerNombreDia());
   }
}
