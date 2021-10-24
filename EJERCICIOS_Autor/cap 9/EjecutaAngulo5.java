// Clase ejecutora del programa CALCULOS LOGARITMICOS DE ANGULO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Angulo5 y EjecutaAngulo5
// EjecutaAngulo5.java

import java.util.Scanner;

public class EjecutaAngulo5
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String datoEntrada;
        double tamAng;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

     // Se declara, crea e inicia el objeto de la clase Angulo5 
        Angulo5 objAngulo = new Angulo5();

        System.out.println("\n      CALCULOS LOGARITMICOS DE ANGULO\n");

     // Leer dato
        System.out.println("------------ Lectura del dato ------------");
        System.out.print("Teclee tamaño del angulo en radianes: ");
        tamAng = entrada.nextDouble();

     // Establecer el valor leido, en el dato del objeto
        objAngulo.establecerTamAngulo(tamAng);

     // Calcular 
        objAngulo.calcularSenAng();
        objAngulo.calcularCosAng();

     // Imprimir salida, obteniendo los datos del objeto
        System.out.println("\n--------------- Resultados ---------------");
        System.out.println("Seno   = " + objAngulo.obtenerSenAng());
        System.out.println("Coseno = " + objAngulo.obtenerCosAng());
   }
}
