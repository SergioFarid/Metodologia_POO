// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura2, Triangulo2, Cuadrado2, Rectangulo2, 
//                               Circulo2 y EjecutaFigura2
// Circulo2.java

class Circulo2 extends Figura2
{

  // Datos de la clase
     private double radioCirc;
     private double areaCirc;
     private double perimCirc;

  // Metodos de entrada de datos -setters-

     public void establecerRadioCirc(double radio)
     {
        radioCirc = radio;
     }

     public void calcularAreaCirc()
     {
        areaCirc = 3.1416 * Math.pow(radioCirc,2);
     }

     public void calcularPerimCirc()
     {
        perimCirc = 2 * 3.1416 * radioCirc;
     }

  // Metodos de acceso a los datos -getters-

     public double obtenerAreaCirc()
     {
        return areaCirc;
     }

     public double obtenerPerimCirc()
     {
        return perimCirc;
     }
}