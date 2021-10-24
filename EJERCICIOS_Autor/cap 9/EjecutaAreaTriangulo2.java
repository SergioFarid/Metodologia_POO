// Clase ejecutora del programa AREA TRIANGULO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: AreaTriangulo2 y EjecutaAreaTriangulo2
// EjecutaAreaTriangulo2.java

import java.util.Scanner;

public class EjecutaAreaTriangulo2
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String datoEntrada;
        double basTri, altuTri;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

     // Se declara, crea e inicia el objeto de la clase AreaTriangulo2 
        AreaTriangulo2 objTriangulo = new AreaTriangulo2();

        System.out.println("\n        CALCULA AREA DE UN TRIANGULO\n");

     // Leer datos
        System.out.println("------------ Lectura de datos ------------");
        System.out.print("Teclee base: ");
        basTri = entrada.nextDouble();

        System.out.print("Teclee altura: ");
        altuTri = entrada.nextDouble();

     // Establecer los valores leidos, en los datos del objeto
        objTriangulo.establecerBaseTria(basTri);
        objTriangulo.establecerAlturaTria(altuTri);

     // Calcular 
        objTriangulo.calcularAreaTria();

     // Imprimir salida, obteniendo el dato del objeto
        System.out.println("---------------- Resultado ---------------");
        System.out.println("Area = " + objTriangulo.obtenerAreaTria());
   }
}
