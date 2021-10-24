// Programa CONVIERTE RADIANES A GRADOS Y GRADOS A RADIANES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RadianGrado2 y EjecutaRadianGrado2
// RadianGrado2.java

public class RadianGrado2
{
  // Declarar
  // Datos de la clase
     private double radianes;
     private double grados;
     private double numRadianes; 
     private double numGrados; 

  // Metodos de entrada de datos -setters-

     public void establecerRadianes(double rad)
     {
        radianes = rad;    
     }

     public void establecerGrados(double gra)
     {
        grados = gra;    
     }

     public void calcularNumRadianes()
     {
       numRadianes = grados * (Math.PI / 180);
     }

     public void calcularNumGrados()
     {
       numGrados = radianes * (180 / Math.PI);
     }
 
  // Metodos de acceso a los datos -getters-

     public double obtenerNumRadianes()
     {
        return numRadianes;
     }

     public double obtenerNumGrados()
     {
        return numGrados;
     }
}
