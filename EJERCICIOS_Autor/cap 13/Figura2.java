// Programa AREAS Y PERIMETROS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura2, Triangulo2, Cuadrado2, Rectangulo2, 
//                               Circulo2 y EjecutaFigura2
// Figura2.java

class Figura2
{
  // Dato de la clase
     protected String nomFigura;

  // Metodo de entrada del dato -setter-

     public void establecerNomFigura(String nom)
     {
        nomFigura = nom;    
     }
   
  // Metodo de acceso al dato -getter-

     public String obtenerNomFigura()
     {
        return nomFigura;
     }
}