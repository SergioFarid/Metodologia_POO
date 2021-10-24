package cap_6;
public class Ejer_17_asignaCeroDiagonalMatriz {
    public static void main(String[] args) {
        
         // Declarar
      // Variables
       int numeros[][] = new int[10][10];
       int i, j;

      // Imprimir encabezado
       System.out.println("\nMATRIZ 10x10, ASIGNA CERO A TODOS LOS ELEMENTOS DE LA ");
       System.out.println(" DIAGONAL PRINCIPAL HACIA ABAJO, EL RESTO ASIGNA UNO");

      //llenar arreglo
      for ( i = 0; i < numeros.length; i++) {
        for ( j = 0; j < numeros.length; j++) {
          if (j > i) 
            numeros[i][j] = 1;
          else
            numeros[i][j] = 0;
        }
      }//fin for
    
      //Imprimir resultado
      System.out.println();
      for ( i = 0; i < numeros.length; i++) {
        for ( j = 0; j < numeros.length; j++) {
          System.out.print(numeros[i][j] + " ");
        }
        System.out.println();
      }


    }// fin main
} //fin class
