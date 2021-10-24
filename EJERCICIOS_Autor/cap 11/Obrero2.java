// Programa CALCULA LA PRODUCCION DE 15 OBREROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Obrero2 y EjecutaObrero2
// Obrero2.java

public class Obrero2
{
  // Declarar
  // Datos de la clase
     private String nombreObr;
     private int produccion;
     private float sueldo;

  // Metodos de entrada de datos -setters-

     public void establecerNombreObr(String nom)
     {
        nombreObr = nom;    
     }

     public void establecerProduccion(int prod)
     {
        produccion = prod;    
     }
 
     public void calcularSueldo()
     {
        if (produccion <= 500)
           sueldo = produccion * 20.00F;
        if (produccion > 500 && produccion <= 800) 
           sueldo = produccion * 25.00F;
        if (produccion > 800)
           sueldo = produccion * 30.00F;
     } 

  // Metodos de acceso a los datos -getters-

     public String obtenerNombreObr()
     {
        return nombreObr;
     }

     public int obtenerProduccion()
     {
        return produccion;
     }

     public float obtenerSueldo()
     {
        return sueldo;
     }
}
