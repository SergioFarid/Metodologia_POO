// Programa MATERIAL REQUERIDO
// Elaborado por: Leobardo López Román
// Materiales.java

import java.util.Scanner;

public class Materiales
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       String entradaChar;
       char   resp;
       int    material1, material2, material3, material4,
              material5, material6, cantidad, totProd;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n               PROCESA  PEDIDOS");
       System.out.println("\n-------------- Lectura de datos --------------");
       totProd = 0;
       System.out.print("\n¿Hay pedido(S/N)?: ");
       entradaChar = entrada.next();
       resp = entradaChar.charAt(0);
       entrada.nextLine();
       while (resp == 'S' || resp == 's')
       {
           System.out.print("Teclee cantidad pedida: ");
           cantidad = entrada.nextInt();
           totProd = totProd + cantidad;
           System.out.print("\n¿Hay otro pedido(S/N)?: ");
           entradaChar = entrada.next();
           resp = entradaChar.charAt(0);
           entrada.nextLine();
       } 
       material1 = totProd * 3;
       material2 = totProd * 4;
       material3 = totProd * 1;
       material4 = totProd * 2;
       material5 = totProd * 3;
       material6 = totProd * 2;

    // Imprimir salida
       System.out.println("\n----------------- Resultados -----------------");
       System.out.println("\nLISTADO DE MATERIALES REQUERIDOS");
       System.out.println("MATERIAL       TOTAL DE UNIDADES");
       System.out.println("--------------------------------");
       System.out.println("   1                " + material1);
       System.out.println("   2                " + material2);
       System.out.println("   3                " + material3);
       System.out.println("   4                " + material4);
       System.out.println("   5                " + material5);
       System.out.println("   6                " + material6);
   }
}
