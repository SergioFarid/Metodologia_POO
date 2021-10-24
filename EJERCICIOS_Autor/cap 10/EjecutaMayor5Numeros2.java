// Clase ejecutora del programa MAYOR 5 NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Mayor5Numeros2 y EjecutaMayor5Numeros2
// EjecutaMayor5Numeros2.java

import java.util.Scanner;

public class EjecutaMayor5Numeros2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada;
       int    n1, n2, n3, n4, n5;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase Empleado5 
       Mayor5Numeros2 objMayor5Numeros = new Mayor5Numeros2();

       System.out.println("\n       IMPRIME EL MAYOR DE 5 NUMEROS\n");

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

       System.out.print("Teclee numero 5: ");
       n5 = entrada.nextInt();

    // Establecer los valores leidos, en los datos del objeto
       objMayor5Numeros.establecerNumA(n1);
       objMayor5Numeros.establecerNumB(n2);
       objMayor5Numeros.establecerNumC(n3);
       objMayor5Numeros.establecerNumD(n4);
       objMayor5Numeros.establecerNumE(n5);

    // Calcular
       objMayor5Numeros.calcularNuMayor();

    // Imprimir salida, obteniendo el dato del objeto
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("El mayor es = " + objMayor5Numeros.obtenerNuMayor());
   }
}
