// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura3, Triangulo3, Cuadrado3, Rectangulo3, 
//                               Circulo3 y EjecutaFigura3
// Figura3.java

abstract class Figura3
{
  // Datos de la clase
     protected String nomFigura;
     protected double area;

  // Metodo de entrada del dato -setter-

     public void establecerNomFigura(String nom)
     {
        nomFigura = nom;    
     }

  // Metodo abstracto

     abstract void calcularArea();
   
  // Metodo de acceso a los datos -getters-

     public String obtenerNomFigura()
     {
        return nomFigura;
     }

     public double obtenerArea()
     {
        return area;
     }
}