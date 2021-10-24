// Programa SEGUNDA LEY NEWTON
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: LeyNewton2 y EjecutaLeyNewton2
// LeyNewton2.java

public class LeyNewton2
{
  // Declarar
  // Datos de la clase
     private double fuerza;
     private double masa;
     private double aceleracion; 

  // Metodos de entrada de datos -setters-

     public void establecerFuerza(double fu)
     {
        fuerza = fu;    
     }

     public void establecerMasa(double ma)
     {
        masa = ma;    
     }

     public void establecerAceleracion(double acel)
     {
        aceleracion = acel;    
     }

     public void calcularFuerza()
     {
        fuerza = masa * aceleracion;    
     }

     public void calcularMasa()
     {
        masa = fuerza / aceleracion;    
     }

     public void calcularAceleracion()
     {
        aceleracion = fuerza / masa;    
     }
 
  // Metodos de acceso a los datos -getters-

     public double obtenerFuerza()
     {
        return fuerza;
     }

     public double obtenerMasa()
     {
        return masa;
     }

     public double obtenerAceleracion()
     {
        return aceleracion;
     }
}
