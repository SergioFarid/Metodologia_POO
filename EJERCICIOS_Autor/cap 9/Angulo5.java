// Programa CALCULOS LOGARITMICOS DE ANGULO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Angulo5 y EjecutaAngulo5
// Angulo5.java

public class Angulo5
{
  // Declarar
  // Datos de la clase
     private double tamAngulo;
     private double senAng;
     private double cosAng; 

  // Metodos de entrada de datos -setters-

     public void establecerTamAngulo(double ang)
     {
        tamAngulo = ang;    
     }

     public void calcularSenAng()
     {
        senAng = Math.sin(tamAngulo);    
     }

     public void calcularCosAng()
     {
        cosAng = Math.cos(tamAngulo);    
     }
 
  // Metodos de acceso a los datos -getters-

     public double obtenerSenAng()
     {
        return senAng;
     }

     public double obtenerCosAng()
     {
        return cosAng;
     }
}
