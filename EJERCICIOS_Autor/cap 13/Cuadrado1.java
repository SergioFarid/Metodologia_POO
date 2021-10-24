// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura1, Triangulo1, Cuadrado1, Rectangulo1, 
//                               Circulo1 y EjecutaFigura1
// Cuadrado1.java

class Cuadrado1 extends Figura1
{
  // Datos de la clase
     private double ladoCuad; 
     private double areaCuad;

  // Metodos de entrada de datos -setters-

     public void establecerLadoCuad(double lado)
     {
        ladoCuad = lado;
     }

     public void calcularAreaCuad()
     {
        areaCuad = Math.pow(ladoCuad,2);
     }

  // Metodo de acceso al dato -getter-

     public double obtenerAreaCuad()
     {
        return areaCuad;
     }
}
