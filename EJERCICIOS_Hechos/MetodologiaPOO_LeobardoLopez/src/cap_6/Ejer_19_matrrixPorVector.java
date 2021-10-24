package cap_6;

import java.math.*;


public class Ejer_19_matrrixPorVector {
    public static int numeroAleatorio()
    {
        int numMenor = 1;
        int numMayor = 5;
        int numero; 

        numero = (int)((numMayor - numMenor)*Math.random()) + numMenor;
        return numero;
    }

    public static void main(String[] args) {

        // Declaraci'on de varibles
        int i, j, longRenglonMatriz =6 , longColMatriz = 7, longVector = 6, sumaProductoRenglon = 0;
        int matriz_6x7[][] = new int[6][7];
        var vector_6_Elem = new int[6];

        int vectorResultado [] = new int[longColMatriz];

        // Imprimir encabezado
        System.out.println("  =============================================================");
        System.out.println(" | PRODUCTO DE UNA MATRIZ DE 6X7 POR UN VECTOR DE 6 ELEMENTOS  |" );
        System.out.println("  =============================================================");

        // Generar matriz 6x7
        for ( i = 0; i < longRenglonMatriz; i++) {
            for ( j = 0; j < longColMatriz; j++) {
                matriz_6x7[i][j] = numeroAleatorio();
            }
        }

        for ( i = 0; i < longVector; i++) {
            vector_6_Elem[i] = numeroAleatorio();
        }

        //Calculos
        /*if (longRenglonMatriz == longVector) {
            
        } else {
            System.out.println("ERROR: La cantidad de filas de la matriz debe ser igual a la longitud"
                                + " del vector que se desea multiplicar.");
        }
        */
        for ( i = 0; i < longColMatriz; i++) {
            sumaProductoRenglon = 0;
            for ( j = 0; j < longRenglonMatriz; j++) {
                sumaProductoRenglon += matriz_6x7[j][i] * vector_6_Elem[j];
            }
            vectorResultado[i] = sumaProductoRenglon;
        }

        //Impresi'on de resultado
        System.out.println("\n      MATRIZ DE 6 X 7");
        System.out.println("  ---------------------------");
        System.out.print("    ");
        for ( i = 0; i < longRenglonMatriz; i++) {
            for ( j = 0; j < longColMatriz; j++) {
                System.out.print( matriz_6x7[i][j] + "  ");
            }
            System.out.println("");
            System.out.print("    ");
        }

        System.out.println("\n   VECTOR []: ");
        System.out.println("  -------------------");

        System.out.print("   ");
        for ( i = 0; i < longVector; i++) {
            System.out.print(" " + vector_6_Elem[i] + " ");
        }

        System.out.println("\n\n   EL PRODUCTOR DE LA MATRIZ POR EL VECTOR ES: ");
        System.out.println("  ----------------------------------------------");
        System.out.print("    ");
        for ( i = 0; i < vectorResultado.length; i++) {
            System.out.print( vectorResultado[i] + "  " );
        }


    }//fin main
    
}
