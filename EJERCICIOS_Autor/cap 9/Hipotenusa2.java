// Programa CALCULAR HIPOTENUSA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Hipotenusa2 y EjecutaHipotenusa2
// Hipotenusa2.java

public class Hipotenusa2
{
  // Declarar
  // Datos de la clase
     private double a;
     private double b;
     private double c; 

  // Metodos de entrada de datos -setters-

     public void establecerA(double catetoA)
     {
        a = catetoA;    
     }

     public void establecerB(double catetoB)
     {
        b = catetoB;    
     }

     public void calcularC()
     {
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));    
     }
 
  // Metodo de acceso al dato -getter-

     public double obtenerC()
     {
        return c;
     }
}
