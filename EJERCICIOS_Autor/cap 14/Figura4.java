// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura4, Triangulo4, Cuadrado4, Rectangulo4, 
//                               Circulo4 y EjecutaFigura4
// Figura4.java

abstract class Figura4
{
  // Dato de la clase
     protected String nomFigura;
     protected double area;
     protected double perim;

  // Metodos de entrada de datos -setters-

     public void establecerNomFigura(String nom)
     {
        nomFigura = nom;    
     }

  // Metodos abstractos

     abstract void calcularArea();   
     abstract void calcularPerim();   

  // Metodos de acceso a los datos -getters-

     public String obtenerNomFigura()
     {
        return nomFigura;
     }

     public double obtenerArea()
     {
        return area;
     }

     public double obtenerPerim()
     {
        return perim;
     }
}