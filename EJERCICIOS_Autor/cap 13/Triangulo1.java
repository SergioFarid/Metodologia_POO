// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura1, Triangulo1, Cuadrado1, Rectangulo1, 
//                               Circulo1 y EjecutaFigura1
// Triangulo1.java

class Triangulo1 extends Figura1
{
  // Datos de la clase
     private double baseTria; 
     private double alturaTria;
     private double areaTria;

  // Metodos de entrada de datos -setters-

     public void establecerBaseTria(double base)
     {
         baseTria = base;
     }

     public void establecerAlturaTria(double altura)
     {
        alturaTria = altura;
     }

     public void calcularAreaTria()
     {
        areaTria = (baseTria * alturaTria) / 2;
     }

  // Metodo de acceso al dato -getter-

     public double obtenerAreaTria()
     {
        return areaTria;
     }
}