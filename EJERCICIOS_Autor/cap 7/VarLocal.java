// Programa VARIABLE LOCAL 
// Elaborado por: Leobardo López Román
// VarLocal.java

public class VarLocal
{
// Declarar variable global o de clase
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
      int x;
      x = 1;
   }
}
