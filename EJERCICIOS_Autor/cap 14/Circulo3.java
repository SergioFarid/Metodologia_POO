// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura3, Triangulo3, Cuadrado3, Rectangulo3, 
//                               Circulo3 y EjecutaFigura3
// Circulo3.java

class Circulo3 extends Figura3
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
}