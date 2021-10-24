// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura1, Triangulo1, Cuadrado1, Rectangulo1, 
//                               Circulo1 y EjecutaFigura1
// Rectangulo1.java

class Rectangulo1 extends Figura1
{
  // Datos de la clase

     private double baseRecta;
     private double alturaRecta;
     private double areaRecta;

  // Metodos de entrada de datos -setters-

     public void establecerBaseRecta(double base)
     {
        baseRecta = base;
     }

     public void establecerAlturaRecta(double altura)
     {
        alturaRecta = altura;
     }

     public void calcularAreaRecta()
     {
        areaRecta = baseRecta * alturaRecta;
     }

  // Metodo de acceso al dato -getter-

     public double obtenerAreaRecta()
     {
        return areaRecta;
     }
}