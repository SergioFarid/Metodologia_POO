// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura2, Triangulo2, Cuadrado2, Rectangulo2, 
//                               Circulo2 y EjecutaFigura2
// Rectangulo2.java

class Rectangulo2 extends Figura2
{
  // Datos de la clase
     private double baseRecta;
     private double alturaRecta;
     private double areaRecta;
     private double perimRecta;

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

     public void calcularPerimRecta()
     {
        perimRecta =  2 * (baseRecta + alturaRecta);
     }

  // Metodos de acceso a los datos -getters-

     public double obtenerAreaRecta()
     {
        return areaRecta;
     }

     public double obtenerPerimRecta()
     {
        return perimRecta;
     }
}