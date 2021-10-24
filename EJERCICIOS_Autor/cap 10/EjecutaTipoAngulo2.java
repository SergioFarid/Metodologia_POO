// Clase ejecutora del programa TIPO ANGULO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: TipoAngulo2 y EjecutaTipoAngulo2
// EjecutaTipoAngulo2.java

import java.util.Scanner;

public class EjecutaTipoAngulo2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       float  angulo;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Empleado5 
       TipoAngulo2 objAngulo = new TipoAngulo2();

       System.out.println("\n         IMPRIME EL TIPO DE ANGULO\n");

    // Leer dato
       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee tamaño del angulo: ");
       angulo = entrada.nextFloat();

    // Establecer el valor leido, en el dato del objeto
       objAngulo.establecerTamAngulo(angulo);

    // Calcular
       objAngulo.calcularTipoAngulo();

    // Imprimir salida, obteniendo el dato del objeto
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("El angulo es = " + objAngulo.obtenerTipoAngulo());
   }
}
