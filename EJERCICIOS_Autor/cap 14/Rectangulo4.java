// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura4, Triangulo4, Cuadrado4, Rectangulo4, 
//                               Circulo4 y EjecutaFigura4
// Rectangulo4.java

class Rectangulo4 extends Figura4
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

     public void calcularPerim()
     {
        perim =  2 * (baseRecta + alturaRecta);
     }
}