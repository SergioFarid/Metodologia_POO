// Clase ejecutora del programa MATRIZ POR VECTOR COLUMNA 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: MatrizVector y EjecutaMatrizVector
// EjecutaMatrizVector.java

import java.util.Scanner;

public class EjecutaMatrizVector
{
   public static void main(String args[])
   {
     // Declarr
     // Variables
        int matA[][] = new int[5][6];
        int matA2[][] = new int[5][6];
        int vecX[] = new int[5];
        int vecX2[] = new int[5];
        int vecZ[] = new int[5];
        int r, c;

     // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nMULTIPLICA MATRIZ POR VECTOR COLUMNA\n");

     // Se declara, crea e inicia el objeto de la clase Matrices1
        MatrizVector objMatrizVec = new MatrizVector();

        System.out.println("--------Lectura de datos--------");
        System.out.println("--------  Matriz A  --------");
        for (r=0; r<=4; r++)
        {
           for (c=0; c<=4; c++)
           {
              System.out.print("Teclee matrizA[" + r + "][" +  c + "]: ");
              matA[r][c] = entrada.nextInt();
           } 
        }

        System.out.println("--------  Vector X  --------");
        for (r=0; r<=4; r++)
        {
            System.out.print("Teclee VECTORx[" + r + "]: ");
            vecX[r] = entrada.nextInt();
        }

     // Establecer
        objMatrizVec.establecerMatrizA(matA);
        objMatrizVec.establecerVectorX(vecX);

     // Calcular
        objMatrizVec.calcularMatrizXVector();

     // Obtener
        matA2 = objMatrizVec.obtenerMatrizA();
        vecX2 = objMatrizVec.obtenerVectorX();
        vecZ  = objMatrizVec.obtenerVectorZ();

     // Imprimir
        System.out.println("        MATRIZ A      VECTOR X    Z");
        System.out.println("-----------------------------------");
        for (r=0; r<=4; r++)
        {
           for (c=0; c<=4; c++)
           {
               System.out.print(matA2[r][c] + "  ");
           }
           System.out.println("  " + vecX2[r] + "   " + vecZ[r]);
        }
   }
}
