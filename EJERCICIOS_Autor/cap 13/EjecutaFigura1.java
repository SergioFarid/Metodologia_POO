// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura1, Triangulo1, Cuadrado1, Rectangulo1, 
//                               Circulo1 y EjecutaFigura1
// EjecutaFigura1.java

import java.util.Scanner;

public class EjecutaFigura1
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
                // Se declara, crea e inicia el objeto de la clase Triangulo1
                   Triangulo1 objFigura = new Triangulo1();

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
                   objFigura.calcularAreaTria();

                // Imprimir 
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerAreaTria());
                   break;  
               }
            case 2:
               {
                // Se declara, crea e inicia el objeto de la clase Cuadrado1
                   Cuadrado1 objFigura = new Cuadrado1();

                   System.out.println("\n----------- Lectura de datos -----------  ");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee lado: ");
                   lad = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerLadoCuad(lad); 

                // Calcular 
                   objFigura.calcularAreaCuad();

                // Imprimir
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerAreaCuad());
                   break;  
               }
            case 3:
               {
                // Se declara, crea e inicia el objeto de la clase Rectangulo1
                   Rectangulo1 objFigura = new Rectangulo1();

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
                   objFigura.calcularAreaRecta();

                // Imprimir los datos
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerAreaRecta());
                   break;  
               }
            case 4:
               {
                // Se declara, crea e inicia el objeto de la clase Circulo1
                   Circulo1 objFigura = new Circulo1();

                   System.out.println("\n----------- Lectura de datos -----------  ");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee radio: ");
                   rad = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerRadioCirc(rad); 

                // Calcular 
                   objFigura.calcularAreaCirc();

                // Imprimir los datos
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerAreaCirc());
                   break;  
               }
           }
       } while (opcion !=5);
   }
}
