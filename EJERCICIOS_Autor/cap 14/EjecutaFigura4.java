// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura4, Triangulo4, Cuadrado4, Rectangulo4, 
//                               Circulo4 y EjecutaFigura4
// EjecutaFigura2.java

import java.util.Scanner;

public class EjecutaFigura4
{
   public static void main(String args[]) 
   {
    // Declaraciones
    // Variables
       String nombre;
       int    opcion;
       double bas, alt, rad, lad, laA, laB, laC;

   // Crear objeto para entrada de datos por el teclado
      Scanner entrada = new Scanner(System.in);

      do
      {
           System.out.println("\n<< ------------------------- >>");
           System.out.println("<<   AREAS Y PERIMETROS DE   >>");
           System.out.println("<<    FIGURAS GEOMETRICAS    >>");
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
                // Se declara, crea e inicia el objeto de la clase Triangulo4
                   Triangulo4 objFigura = new Triangulo4();

                   System.out.println("\n----------- Lectura de datos -----------");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee base: ");
                   bas = entrada.nextFloat();

                   System.out.print("Teclee altura: ");
                   alt = entrada.nextFloat();

                   System.out.print("Teclee lado A: ");
                   laA = entrada.nextFloat();

                   System.out.print("Teclee lado B: ");
                   laB = entrada.nextFloat();

                   System.out.print("Teclee lado C: ");
                   laC = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerBaseTria(bas); 
                   objFigura.establecerAlturaTria(alt);
                   objFigura.establecerLadoA(laA);
                   objFigura.establecerLadoB(laB);
                   objFigura.establecerLadoC(laC);

                // Calcular 
                   objFigura.calcularArea();
                   objFigura.calcularPerim();

                // Imprimir 
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   System.out.println("Perimetro = " + objFigura.obtenerPerim());
                   break;  
               }
            case 2:
               {
                // Se declara, crea e inicia el objeto de la clase Cuadrado4
                   Cuadrado4 objFigura = new Cuadrado4();

                   System.out.println("\n----------- Lectura de datos -----------");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee lado: ");
                   lad = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerLadoCuad(lad); 

                // Calcular 
                   objFigura.calcularArea();
                   objFigura.calcularPerim();

                // Imprimir
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   System.out.println("Perimetro = " + objFigura.obtenerPerim());
                   break;  
               }
            case 3:
               {
                // Se declara, crea e inicia el objeto de la clase Rectangulo4
                   Rectangulo4 objFigura = new Rectangulo4();

                   System.out.println("\n----------- Lectura de datos -----------");
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
                   objFigura.calcularPerim();

                // Imprimir los datos
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   System.out.println("Perimetro = " + objFigura.obtenerPerim());
                   break;  
               }
            case 4:
               {
                // Se declara, crea e inicia el objeto de la clase Circulo4
                   Circulo4 objFigura = new Circulo4();

                   System.out.println("\n----------- Lectura de datos -----------");
                   System.out.print("Teclee nombre de la figura: ");
                   nombre = entrada.nextLine();

                   System.out.print("Teclee radio: ");
                   rad = entrada.nextFloat();

                // Establecer
                   objFigura.establecerNomFigura(nombre); 
                   objFigura.establecerRadioCirc(rad); 

                // Calcular 
                   objFigura.calcularArea();
                   objFigura.calcularPerim();

                // Imprimir los datos
                   System.out.println("\n-------------- Resultados --------------");
                   System.out.println("Nombre de la figura= " + 
                                       objFigura.obtenerNomFigura());
                   System.out.println("Area = " + objFigura.obtenerArea());
                   System.out.println("Perimetro = " + objFigura.obtenerPerim());
                   break;  
               }
           }
      } while (opcion !=5);
   }
}
