// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura2, Triangulo2, Cuadrado2, Rectangulo2, 
//                               Circulo2 y EjecutaFigura2
// Cuadrado2.java

class Cuadrado2 extends Figura2
{
  // Datos de la clase
     private double ladoCuad; 
     private double areaCuad;
     private double perimCuad;

  // Metodos de entrada de datos -setters-

     public void establecerLadoCuad(double lado)
     {
        ladoCuad = lado;
     }

     public void calcularAreaCuad()
     {
        areaCuad = Math.pow(ladoCuad,2);
     }

     public void calcularPerimCuad()
     {
        perimCuad = 4 * ladoCuad;
     }

  // Metodos de acceso a los datos -getters-

     public double obtenerAreaCuad()
     {
        return areaCuad;
     }

     public double obtenerPerimCuad()
     {
        return perimCuad;
     }
}
