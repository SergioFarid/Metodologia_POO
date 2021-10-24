// Clase ejecutora del programa PROMEDIO DE 20 NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Numero1 y EjecutaNumero1
// EjecutaNumero1.java

import java.util.Scanner;

public class EjecutaNumero1
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int   i, num, sumatoria;
        float promedio;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n    CALCULA EL PROMEDIO DE 20 NUMEROS\n");

     // Se declara, crea e inicia el objeto de la clase Numero1 
        Numero1 objNumero = new Numero1();

       System.out.println("\n------------ Lectura de datos ------------");
       sumatoria = 0;
       for (i = 1; i <= 20; i++)
       {
           System.out.print("Teclee el numero " + i + " : ");
           num = entrada.nextInt();
        // Establecer los valores leidos, en los datos del objeto
           objNumero.establecerNumero(num);
           sumatoria = sumatoria + objNumero.obtenerNumero(); 
       } 
       promedio = (float)sumatoria / (float)20;
       System.out.println("\n---------------- Resultado ---------------");
       System.out.println("Promedio = " + promedio);

   }
}
