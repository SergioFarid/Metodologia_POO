// Programa VARIABLE GLOBAL 
// Elaborado por: Leobardo López Román
// VarGlobal.java

public class VarGlobal
{
// Declarar variable global
   static int x;

   public static void main(String args[])
   {
      x = 0;
      System.out.println("x = " + x);
      cambiar();
      System.out.println("x = " + x);
   }
   
   public static void cambiar()
   {
      x = 1;
   }
}
