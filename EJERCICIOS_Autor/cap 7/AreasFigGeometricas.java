// Programa AREAS
// Elaborado por: Leobardo López Román
// AreasFigGeometricas.java

import java.util.Scanner;

public class AreasFigGeometricas 
{
   public static void main(String args[]) 
   {
   // Crear objeto para entrada de datos por el teclado
      Scanner entrada = new Scanner(System.in);

   // Declarar variable
      int opcion;

      do
      {
         System.out.println("---------------------------");
         System.out.println("|AREAS FIGURAS GEOMETRICAS|");
         System.out.println("|-------------------------|");
         System.out.println("|  1. TRIANGULO           |");
         System.out.println("|  2. CUADRADO            |");
         System.out.println("|  3. RECTANGULO          |");
         System.out.println("|  4. CIRCULO             |");
         System.out.println("|  5. FIN                 |");
         System.out.println("|-------------------------|");
         System.out.print("   TECLEE OPCION: ");
         opcion = entrada.nextInt();         
         switch (opcion)
         {
            case 1:
                 calcularAreaTriangulo();
                 break;
            case 2:
                 calcularAreaCuadrado();
                 break;
            case 3:
                 calcularAreaRectangulo();
                 break;
            case 4:
                 calcularAreaCirculo();
                 break;
         }
      } while (opcion != 5);
   }

   public static void calcularAreaTriangulo()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

   // Declarar variables
      float base, altura, areaTria;

      String datoEntrada;
      System.out.println("\n--------- Lectura de datos ---------");
      System.out.print("Teclee base: ");
      base = entrada.nextFloat();         
      System.out.print("Teclee altura: ");
      altura = entrada.nextFloat();         
      areaTria = (base * altura) / 2;
      System.out.println("\n------------ Resultado -------------");
      System.out.println("Area = " + areaTria);
   }

   public static void calcularAreaCuadrado()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

   // Declarar variables
      float lado, areaCuad;

      System.out.println("\n--------- Lectura del dato ---------");
      System.out.print("Teclee lado: ");
      lado = entrada.nextFloat();         
      areaCuad = lado * lado;
      System.out.println("\n------------ Resultado -------------");
      System.out.println("Area = " + areaCuad);
   }

   public static void calcularAreaRectangulo()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

   // Declarar variables
      float base, altura, areaRect;

      System.out.println("\n--------- Lectura de datos ---------");
      System.out.print("Teclee base: ");
      base = entrada.nextFloat();         
      System.out.print("Teclee altura: ");
      altura = entrada.nextFloat();         
      areaRect = base * altura;
      System.out.println("\n------------ Resultado -------------");
      System.out.println("Area = " + areaRect);
   }

   public static void calcularAreaCirculo()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

   // Declarar variables
      float radio, areaCirc;

      System.out.println("\n--------- Lectura del dato ---------");
      System.out.print("Teclee radio: ");
      radio = entrada.nextFloat();         
      areaCirc = 3.1416F * (radio * radio);
      System.out.println("\n------------ Resultado -------------");
      System.out.println("Area = " + areaCirc);
   }
}