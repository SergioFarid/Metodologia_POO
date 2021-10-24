// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura3, Triangulo3, Cuadrado3, Rectangulo3, 
//                               Circulo3 y EjecutaFigura3
// EjecutaFigura3.java

import java.util.Scanner;

public class EjecutaFigura3
{
   public static void main(String args[]) 
   {
    // Declaraciones
    // Variables
       String nombre;
       int    opcion;
       double bas, alt, rad, lad;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       do
       {
           System.out.println("\n<< ------------------------- >>");
           System.out.println("<< AREAS FIGURAS GEOMETRICAS >>");
           System.out.println("<< ------------------------- >>");
           System.out.println("      1. Triangulo ");
           System.out.println("      2. Cuadrado ");
           System.out.println("      3. Rectangulo ");
           System.out.println("      4. Circulo ");
           System.out.println("      5. Fin");
           System.out.println("<< ------------------------- >>");
           System.out.print("     Teclee opcion: ");
           opcion = entrada.nextInt();
           entrada.nextLine();

           switch (opcion)
           {
            case 1: 
               {
                // Se declara, crea e inicia el objeto de la clase Triangulo3
                   Triangulo3 objFigura = new Triangulo3();

                   System.out.println("\n----------- Lectura de datos -----------  ");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee base: ");
                   bas = entrada.nextFloat();

                   System.out.print("Teclee altura: ");
                   alt = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerBaseTria(bas); 
                   objFigura.establecerAlturaTria(alt);

                // Calcular 
                   objFigura.calcularArea();

                // Imprimir 
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   break;  
               }
            case 2:
               {
                // Se declara, crea e inicia el objeto de la clase Cuadrado3
                   Cuadrado3 objFigura = new Cuadrado3();

                   System.out.println("\n----------- Lectura de datos -----------  ");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee lado: ");
                   lad = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerLadoCuad(lad); 

                // Calcular 
                   objFigura.calcularArea();

                // Imprimir
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   break;  
               }
            case 3:
               {
                // Se declara, crea e inicia el objeto de la clase Rectangulo3
                   Rectangulo3 objFigura = new Rectangulo3();

                   System.out.println("\n----------- Lectura de datos -----------  ");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee base: ");
                   bas = entrada.nextFloat();

                   System.out.print("Teclee altura: ");
                   alt = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerBaseRecta(bas); 
                   objFigura.establecerAlturaRecta(alt); 

                // Calcular 
                   objFigura.calcularArea();

                // Imprimir los datos
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   break;  
               }
            case 4:
               {
                // Se declara, crea e inicia el objeto de la clase Circulo3
                   Circulo3 objFigura = new Circulo3();

                   System.out.println("\n----------- Lectura de datos -----------  ");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee radio: ");
                   rad = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerRadioCirc(rad); 

                // Calcular 
                   objFigura.calcularArea();

                // Imprimir los datos
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   break;  
               }
           }
       } while (opcion !=5);
   }
}
