// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura4, Triangulo4, Cuadrado4, Rectangulo4, 
//                               Circulo4 y EjecutaFigura4
// Circulo4.java

class Circulo4 extends Figura4
{

  // Datos de la clase
     private double radioCirc;

  // Metodos de entrada de datos -setters-

     public void establecerRadioCirc(double radio)
     {
        radioCirc = radio;
     }

     public void calcularArea()
     {
        area = 3.1416 * Math.pow(radioCirc,2);
     }

     public void calcularPerim()
     {
        perim = 2 * 3.1416 * radioCirc;
     }
}