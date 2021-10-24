// Clase ejecutora del programa PROMEDIO DE N NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Numero2 y EjecutaNumero2
// EjecutaNumero2.java

import java.util.Scanner;

public class EjecutaNumero2
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        int   i, n, num, sumatoria;
        float promedio;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n    CALCULA EL PROMEDIO DE N NUMEROS\n");

     // Se declara, crea e inicia el objeto de la clase Numero2 
        Numero2 objNumero = new Numero2();

        System.out.println("------------ Lectura de datos ------------");
        System.out.print("Teclee cantidad de numeros a procesar: ");
        n = entrada.nextInt();

        sumatoria = 0;
        for (i = 1; i <= n; i++)
        {
            System.out.print("Teclee el numero " + i + " : ");
            num = entrada.nextInt();
         // Establecer los valores leidos, en los datos del objeto
            objNumero.establecerNumero(num);
            sumatoria = sumatoria + objNumero.obtenerNumero(); 
        } 
        promedio = (float)sumatoria / (float)n;
        System.out.println("\n---------------- Resultado ---------------");
        System.out.println("Promedio = " + promedio);
   }
}
