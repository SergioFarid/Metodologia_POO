// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura1, Triangulo1, Cuadrado1, Rectangulo1, 
//                               Circulo1 y EjecutaFigura1
// Circulo1.java

class Circulo1 extends Figura1
{

  // Datos de la clase
     private double radioCirc;
     private double areaCirc;

  // Metodos de entrada de datos -setters-

     public void establecerRadioCirc(double radio)
     {
        radioCirc = radio;
     }

     public void calcularAreaCirc()
     {
        areaCirc = 3.1416 * Math.pow(radioCirc,2);
     }

  // Metodo de acceso al dato -getter-

     public double obtenerAreaCirc()
     {
        return areaCirc;
     }
}