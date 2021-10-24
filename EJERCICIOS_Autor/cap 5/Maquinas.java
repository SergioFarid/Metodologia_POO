// Programa MANTENIMIENTO MAQUINAS
// Elaborado por: Leobardo López Román
// Maquinas.java

import java.util.Scanner;

public class Maquinas
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String entradaChar;
       char   hay;
       int    totManten, cantManten, tipo, maquina, toTipo1, toTipo2,
              toTipo3, toTipo4, toTipo5, toTipo6, toTipo7;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n   PROCESA MANTENIMIENTO DE MAQUINAS\n");

       System.out.println("\n       REPORTE DE MANTENIMIENTO");
       System.out.println("MAQUINA        TOTAL DE MANTENIMIENTOS");
       System.out.println("----------------------------------------");
       totManten = 0; toTipo1 = 0; toTipo1 = 0; toTipo2 = 0; toTipo3 = 0;
       toTipo4 = 0; toTipo5 = 0; toTipo6 = 0; toTipo7 = 0;
       for (maquina=1; maquina<=10; maquina++)
       {
           System.out.println("\nMaquina " + maquina);
        // Leer datos
           System.out.println("\n-------------- Lectura de datos --------------");
           cantManten = 0;
           System.out.print("\n¿Hay mantenimiento(S/N)?: ");
           entradaChar = entrada.next();
           hay = entradaChar.charAt(0);
           entrada.nextLine();
           while (hay == 'S' || hay == 's')
           {
              System.out.print("Teclee tipo de mentenimiento (1-7): ");
              tipo = entrada.nextInt();
              cantManten = cantManten + 1;
              switch (tipo)
              {
                  case 1:
                          toTipo1 = toTipo1 + 1;
                          break;
                  case 2:
                          toTipo2 = toTipo2 + 1;
                          break;
                  case 3:
                          toTipo3 = toTipo3 + 1;
                          break;
                  case 4:
                          toTipo4 = toTipo4 + 1;
                          break;
                  case 5:
                          toTipo5 = toTipo5 + 1;
                          break;
                  case 6:
                          toTipo6 = toTipo6 + 1;
                          break;
                  case 7:
                          toTipo7 = toTipo7 + 1;
                          break;
              }
              System.out.print("\n¿Hay otro mantenimiento(S/N)?: ");
              entradaChar = entrada.next();
              hay = entradaChar.charAt(0);
              entrada.nextLine();
          } 
          System.out.println("\n----------------- Resultados -----------------");
          System.out.println("Maquina = " + maquina);
          System.out.println("Cantidad de mantenimientos = " + cantManten);
          totManten = totManten + cantManten;
       }
     // Imprimir salida
        System.out.println("\n------------------ Totales -------------------");
        System.out.println("Total mantenimientos = " + totManten);
        System.out.println("Total tipo 1 = " + toTipo1);
        System.out.println("Total tipo 2 = " + toTipo2);
        System.out.println("Total tipo 3 = " + toTipo3);
        System.out.println("Total tipo 4 = " + toTipo4);
        System.out.println("Total tipo 5 = " + toTipo5);
        System.out.println("Total tipo 6 = " + toTipo6);
        System.out.println("Total tipo 7 = " + toTipo7); 
   }
}
