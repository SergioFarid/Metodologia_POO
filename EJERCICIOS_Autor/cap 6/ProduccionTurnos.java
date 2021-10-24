// Programa PRODUCCION TURNOS
// Elaborado por: Leobardo López Román
// ProduccionTurnos.java

import java.util.Scanner;

public class ProduccionTurnos
{
   public static void main(String args[])
   {
     // Declarar
     // Variables
        String articulos[] = new String[10];
        int prod[][] = new int[10][3];
        int r, c, mayorProd, totTurno, totProd, toTotProd;
        String articuloMay="";

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n       PROCESA PRODUCCION DE ARTICULOS\n");

    // Leer datos
       System.out.println("-------------- Lectura de datos --------------");
       for (r = 0; r <= 9; r++)
       {
           System.out.print("Teclee articulos[" + r + "]: ");
           articulos[r] = entrada.nextLine();
           for (c = 0; c <= 2; c++)
           {
               System.out.print("Teclee produccion[" + r + "," + c + "]: ");
               prod[r][c] = entrada.nextInt();
           }
           entrada.nextLine();
       }
 
    // Imprimir salida
       System.out.println("           REPORTE DIARIO DE PRODUCCION");
       System.out.println("ARTICULO     TURNO 1  TURNO 2  TURNO 3  PROD.DIA");
       System.out.println("------------------------------------------------");
       mayorProd = 0;
       toTotProd = 0;
       for (r = 0; r <= 9; r++)
       {
           System.out.print(articulos[r] + "   ");
           totProd = 0;
           for (c = 0; c <= 2; c++)
           {
               System.out.print(prod[r][c] + "   ");
               totProd = totProd + prod[r][c];
           }
           System.out.println(totProd);
           if (totProd > mayorProd)
           {
              mayorProd = totProd;
              articuloMay = articulos[r];
           }
           toTotProd = toTotProd + totProd;
       }

       System.out.print("      TOTAL                 ");
       for (c = 0; c <= 2; c++)
       {
           totTurno = 0;
           for (r = 0; r <= 9; r++)
           {
               totTurno = totTurno + prod[r][c];
           }
           System.out.print(totTurno + "  ");
       } 
       System.out.println(toTotProd);
       System.out.println("Articulo con mayor produccion = " + articuloMay);
       System.out.println("Produccion del articulo mayor = " + mayorProd);
   }
}

