// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura4, Triangulo4, Cuadrado4, Rectangulo4, 
//                               Circulo4 y EjecutaFigura4
// Cuadrado4.java

class Cuadrado4 extends Figura4
{
  // Datos de la clase
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

     public void calcularPerim()
     {
        perim = 4 * ladoCuad;
     }
}
