// Programa FACTORIALES DE N NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Factorial3 y EjecutaFactorial3
// Factorial3.java

public class Factorial3
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
