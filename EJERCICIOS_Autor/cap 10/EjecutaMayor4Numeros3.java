// Clase ejecutora del programa MAYOR 4 NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Mayor4Numeros3 y EjecutaMayor4Numeros3
// EjecutaMayor4Numeros3.java

import java.util.Scanner;

public class EjecutaMayor4Numeros3
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       int    n1, n2, n3, n4;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Empleado5 
       Mayor4Numeros3 objMayor4Numeros = new Mayor4Numeros3();

       System.out.println("\n       IMPRIME EL MAYOR DE 4 NUMEROS\n");

    // Leer datos
       System.out.println("------------ Lectura de datos ------------");
       System.out.print("Teclee numero 1: ");
       n1 = entrada.nextInt();

       System.out.print("Teclee numero 2: ");
       n2 = entrada.nextInt();

       System.out.print("Teclee numero 3: ");
       n3 = entrada.nextInt();

       System.out.print("Teclee numero 4: ");
       n4 = entrada.nextInt();

    // Establecer los valores leidos, en los datos del objeto
       objMayor4Numeros.establecerNumA(n1);
       objMayor4Numeros.establecerNumB(n2);
       objMayor4Numeros.establecerNumC(n3);
       objMayor4Numeros.establecerNumD(n4);

    // Calcular
       objMayor4Numeros.calcularNuMayor();

    // Imprimir salida, obteniendo el dato del objeto
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("El mayor es = " + objMayor4Numeros.obtenerNuMayor());
   }
}
