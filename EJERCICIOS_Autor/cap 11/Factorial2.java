// Programa FACTORIAL
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Factorial2 y EjecutaFactorial2
// Factorial2.java

public class Factorial2
{
  // Declarar
  // Datos de la clase
     private int numero;
     private int factorial;

  // Metodos de entrada de datos -setters-

     public void establecerNumero(int nu)
     {
        numero = nu;    
     }

     public void calcularFactorial()
     {
     // Declarar variable
        int i;

        if (numero == 0)
           factorial = 1;
        else
        {
           factorial = 1;
           for (i = numero; i >= 1; i--)
           {
               factorial = factorial * i;
           }
        }         
     }
 
  // Metodos de acceso al dato -getter-

     public int obtenerFactorial()
     {
        return factorial;
     }
}
