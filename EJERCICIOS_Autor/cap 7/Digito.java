// Programa DIGITO
// Elaborado por: Leobardo López Román
// Digito.java

import java.util.Scanner;

public class Digito
{
   public static void main(String args[])
   {
    // Declarar
    // Variables 
       int n=0, digiVerif;

    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n      LEE UN NUMERO ENTERO E IMPRIME");
       System.out.println("          SU DIGITO VERIFICADOR\n");

    // Leer dato
       System.out.println("------------ Lectura del dato ------------");
       System.out.print("Teclee numero: ");
       n = entrada.nextInt();

       digiVerif = calculardigiVerif(n);

    // Imprimir salida
       System.out.println("\n--------------- Resultado ----------------");
       System.out.println("Numero = " + n);
       System.out.println("Digito verificador = " + digiVerif);
   }


   public static int calculardigiVerif(int nume)
   {
   // Declarar variables
      int i, producto, multiplicador, n2, digVeri, residuo;
      String numero;
      char num;

      numero = String.valueOf(nume);
      producto = 0;
      multiplicador = 1;
      for (i=numero.length()-1; i>=0; i--)
      {
          multiplicador = multiplicador + 1;
          num = numero.charAt(i);
          n2 = Integer.parseInt(String.valueOf(num));
          producto = producto + (n2 * multiplicador);
      }
      residuo = producto;
      while (residuo >= 11) residuo = residuo - 11;
      if (residuo == 0 || residuo == 1) 
         digVeri = residuo;
      else
         digVeri = 11 - residuo;
      return digVeri;
   }
}