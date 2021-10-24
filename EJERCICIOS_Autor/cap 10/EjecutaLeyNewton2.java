// Clase ejecutora del programa SEGUNDA LEY NEWTON
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: LeyNewton2 y EjecutaLeyNewton2
// EjecutaLeyNewton2.java

import java.util.Scanner;

public class EjecutaLeyNewton2
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       String datoEntrada, entradaChar;
       double f, a, m;
       char   resp;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

    // Se declara, crea e inicia el objeto de la clase LeyNewton2 
       LeyNewton2 objNewton = new LeyNewton2();

       System.out.println("\nREALIZA CALCULOS CON LA SEGUNDA LEY NEWTON\n");

    // Leer datos
       System.out.println("------------ Lectura de datos ------------");
       System.out.println("¿Que desea calcular?");
       System.out.print("¿Fuerza (F), Aceleracion (A), Masa (M)?: ");
       entradaChar = entrada.next();
       resp = entradaChar.charAt(0);
       entrada.nextLine();

    // Procesar calculos
       if (resp == 'F' || resp == 'f')
       {
        // Leer
           System.out.print("Teclee Masa: ");
           m = entrada.nextDouble();

           System.out.print("Teclee Aceleracion: ");
           a = entrada.nextDouble();

        // Establecer los valores leidos, en los datos del objeto
           objNewton.establecerMasa(m);
           objNewton.establecerAceleracion(a);

        // Calcular
           objNewton.calcularFuerza();

        // Imprimir salida, obteniendo el dato del objeto
           System.out.println("\n--------------- Resultado ----------------");
           System.out.println("Fuerza   = " + objNewton.obtenerFuerza());
       }

       if (resp == 'A' || resp == 'a')
       {
        // Leer
           System.out.print("Teclee Masa: ");
           m = entrada.nextDouble();

           System.out.print("Teclee Fuerza: ");
           f = entrada.nextDouble();

        // Establecer los valores leidos, en los datos del objeto
           objNewton.establecerMasa(m);
           objNewton.establecerFuerza(f);

        // Calcular
           objNewton.calcularAceleracion();

        // Imprimir salida, obteniendo el dato del objeto
           System.out.println("\n--------------- Resultado ----------------");
           System.out.println("Aceleracion   = " + objNewton.obtenerAceleracion());
       }

       if (resp == 'M' || resp == 'm')
       {
        // Leer
           System.out.print("Teclee Fuerza: ");
           f = entrada.nextDouble();

           System.out.print("Teclee Aceleracion: ");
           a = entrada.nextDouble();

        // Establecer los valores leidos, en los datos del objeto
           objNewton.establecerFuerza(f);
           objNewton.establecerAceleracion(a);

        // Calcular
           objNewton.calcularMasa();

        // Imprimir salida, obteniendo el dato del objeto
           System.out.println("\n--------------- Resultado -----------------");
           System.out.println("Masa   = " + objNewton.obtenerMasa());
       }
   }
}
