// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura4, Triangulo4, Cuadrado4, Rectangulo4, 
//                               Circulo4 y EjecutaFigura4
// Triangulo4.java

class Triangulo4 extends Figura4
{
  // Datos de la clase
     private double baseTria; 
     private double alturaTria;
     private double ladoA, ladoB, ladoC;

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

     public void calcularArea()
     {
        area = (baseTria * alturaTria) / 2;
     }

     public void calcularPerim()
     {
        perim = ladoA + ladoB + ladoC;
     }
}