// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura2, Triangulo2, Cuadrado2, Rectangulo2, 
//                               Circulo2 y EjecutaFigura2
// Triangulo2.java

class Triangulo2 extends Figura2
{
  // Datos de la clase
     private double baseTria; 
     private double alturaTria;
     private double areaTria;
     private double ladoA, ladoB, ladoC;
     private double perimTria;

  // Metodos de entrada de datos -setters-

     public void establecerBaseTria(double base)
     {
         baseTria = base;
     }

     public void establecerAlturaTria(double altura)
     {
        alturaTria = altura;
     }

     public void establecerLadoA(double a)
     {
        ladoA = a;
     }

     public void establecerLadoB(double b)
     {
        ladoB = b;
     }

     public void establecerLadoC(double c)
     {
        ladoC = c;
     }

     public void calcularAreaTria()
     {
        areaTria = (baseTria * alturaTria) / 2;
     }

     public void calcularPerimTria()
     {
        perimTria = ladoA + ladoB + ladoC;
     }

  // Metodos de acceso a los datos -getters-

     public double obtenerAreaTria()
     {
        return areaTria;
     }

     public double obtenerPerimTria()
     {
        return perimTria;
     }
}