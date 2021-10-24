// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura3, Triangulo3, Cuadrado3, Rectangulo3, 
//                               Circulo3 y EjecutaFigura3
// Triangulo3.java

class Triangulo3 extends Figura3
{
  // Datos de la clase
     private double baseTria; 
     private double alturaTria;

  // Metodos de entrada de datos -setters-

     public void establecerBaseTria(double base)
     {
         baseTria = base;
     }

     public void establecerAlturaTria(double altura)
     {
        alturaTria = altura;
     }


     public void calcularArea()
     {
        area = (baseTria * alturaTria) / 2;
     }
}