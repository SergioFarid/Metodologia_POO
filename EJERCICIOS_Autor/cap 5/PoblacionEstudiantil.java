// Programa ESTIMAR POBLACION
// Elaborado por: Leobardo López Román
// PoblacionEstudiantil.java

public class PoblacionEstudiantil
{
   public static void main(String args[])
   {
    // Declarar
    // Variables
       int   n;
       float pobFinal;

       System.out.println("\nESTIMA POBLACION ESTUDIANTIL\n");
       pobFinal = 750;
       for (n = 2004; n <= 2015; n++)
       {
           pobFinal = pobFinal + (pobFinal * 0.12F);
       } 
       System.out.println("La poblacion estudiantil sera de " + pobFinal);
   }
}
