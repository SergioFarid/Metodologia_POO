// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura3, Triangulo3, Cuadrado3, Rectangulo3, 
//                               Circulo3 y EjecutaFigura3
// Rectangulo3.java

class Rectangulo3 extends Figura3
{
  // Datos de la clase

     private double baseRecta;
     private double alturaRecta;

  // Metodos de entrada de datos -setters-

     public void establecerBaseRecta(double base)
     {
        baseRecta = base;
     }

     public void establecerAlturaRecta(double altura)
     {
        alturaRecta = altura;
     }

     public void calcularArea()
     {
        area = baseRecta * alturaRecta;
     }
}