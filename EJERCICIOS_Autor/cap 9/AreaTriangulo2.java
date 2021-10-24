// Programa AREA TRIANGULO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: AreaTriangulo2 y EjecutaAreaTriangulo2
// AreaTriangulo2.java

public class AreaTriangulo2
{
  // Declarar
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
        areaTria = (baseTria *alturaTria) / 2;    
     }
 
  // Metodo de acceso al dato -getter-

     public double obtenerAreaTria()
     {
        return areaTria;
     }
}
