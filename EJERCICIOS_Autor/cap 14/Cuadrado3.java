// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura3, Triangulo3, Cuadrado3, Rectangulo3, 
//                               Circulo3 y EjecutaFigura3
// Cuadrado3.java

class Cuadrado3 extends Figura3
{
  // Dato de la clase
     private double ladoCuad; 

  // Metodos de entrada de datos -setters-

     public void establecerLadoCuad(double lado)
     {
        ladoCuad = lado;
     }

     public void calcularArea()
     {
        area = Math.pow(ladoCuad,2);
     }
}
