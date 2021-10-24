// Programa AYUDA
// Elaborado por: Leobardo López Román
// Ayuda.java

import java.util.Scanner;

public class Ayuda 
{
// Declarar variables globales o de clase
   static int num1, num2, resuNi, resuMaq, opcion;
   static char desea;
   static String entradaChar;

   public static void main(String args[]) 
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       do
       {
          System.out.println("--------------------------");
          System.out.println("|   TE PUEDO AYUDAR A:   |");
          System.out.println("|------------------------|");
          System.out.println("|  1. SUMAR              |");
          System.out.println("|  2. RESTAR             |");
          System.out.println("|  3. MULTIPLICAR        |");
          System.out.println("|  4. DIVIDIR            |");
          System.out.println("|  5. FIN                |");
          System.out.println("|------------------------|");
          System.out.print("   ESCOGER OPCION: ");
          opcion = entrada.nextInt();        
          switch (opcion)
          {
             case 1:
                  ayudaSumar();
                  break;
             case 2:
                  ayudaRestar();
                  break;
             case 3:
                  ayudaMultiplicar();
                  break;
             case 4:
                  ayudaDividir();
                  break;
          }
       } while (opcion != 5);
   }

   public static void ayudaSumar()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("-----------------");
       do
       {
           System.out.println("----- AYUDANDO A SUMAR -----");
           System.out.print("Teclee primer  numero: ");
           num1 = entrada.nextInt();

           System.out.print("Teclee segundo numero: ");
           num2 = entrada.nextInt();
           System.out.println("                  ------------  +");

           System.out.print("       Teclee su suma: ");
           resuNi = entrada.nextInt();
         
           resuMaq = num1 + num2;

           if (resuNi == resuMaq)
              System.out.println("\nLa suma esta correcta");
           else
              System.out.println("\nLa suma esta incorrecta");

           System.out.print("\n¿Desea revisar otra suma(S/N)?: ");
           entradaChar = entrada.next();
           desea = entradaChar.charAt(0);
           entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }

   public static void ayudaRestar()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("-----------------");
       do
       {
          System.out.println("----- AYUDANDO A RESTAR -----");
          System.out.print("Teclee primer  numero: ");
          num1 = entrada.nextInt();

          System.out.print("Teclee segundo numero: ");
          num2 = entrada.nextInt();
          System.out.println("                  ------------  -");

          System.out.print("      Teclee su resta: ");
          resuNi = entrada.nextInt();
         
          resuMaq = num1 - num2;
          if (resuNi == resuMaq)
             System.out.println("\nLa resta esta correcta");
          else
             System.out.println("\nLa resta esta incorrecta");

          System.out.print("\n¿Desea revisar otra resta(S/N)?: ");
          entradaChar = entrada.next();
          desea = entradaChar.charAt(0);
          entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }

   public static void ayudaMultiplicar()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("-----------------");
       do
       {
          System.out.println("---- AYUDANDO A MULTIPLICAR ----");
          System.out.print("    Teclee primer  numero: ");
          num1 = entrada.nextInt();

          System.out.print("    Teclee segundo numero: ");
          num2 = entrada.nextInt();
          System.out.println("                     ------------  *");

          System.out.print("Teclee su multiplicacion: ");
          resuNi = entrada.nextInt();
         
          resuMaq = num1 * num2;

          if (resuNi == resuMaq)
             System.out.println("\nLa multiplicacion esta correcta");
          else
             System.out.println("\nLa multiplicacion esta incorrecta");

          System.out.print("\n¿Desea revisar otra multiplicacion(S/N)?: ");
          entradaChar = entrada.next();
          desea = entradaChar.charAt(0);
          entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }

   public static void ayudaDividir()
   {
    // Crear objeto para entrada de datos por el teclado
       Scanner entrada = new Scanner(System.in);

       System.out.println("-----------------");
       do
       {
          System.out.println("----- AYUDANDO A DIVIDIR -----");
          System.out.print("Teclee primer  numero: ");
          num1 = entrada.nextInt();

          System.out.print("Teclee segundo numero: ");
          num2 = entrada.nextInt();
          System.out.println("                 ------------  /");

          System.out.print("   Teclee su division: ");
          resuNi = entrada.nextInt();
         
          resuMaq = num1 / num2;

          if (resuNi == resuMaq)
             System.out.println("\nLa division esta correcta");
          else
             System.out.println("\nLa division esta incorrecta");

          System.out.print("\n¿Desea revisar otra cuenta division(S/N)?: ");
          entradaChar = entrada.next();
          desea = entradaChar.charAt(0);
          entrada.nextLine();
       } while (desea == 'S' || desea == 's');
   }
}