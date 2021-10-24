// Programa AREAS FIGURAS GEOMETRICAS
// Elaborado por: Leobardo López Román
// Esta formado por seis clases: Figura1, Triangulo1, Cuadrado1, Rectangulo1, 
//                               Circulo1 y EjecutaFigura1
// Figura1.java

class Figura1
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