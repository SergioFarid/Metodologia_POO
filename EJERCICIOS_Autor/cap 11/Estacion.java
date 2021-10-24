// Programa ESTACIONES DE TRABAJO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Estacion y EjecutaEstacion
// Estacion.java

public class Estacion
{
  // Declarar
  // Datos de la clase
     private int numEstacion;
     private int totProduccion;
     private String nivProductividad;

  // Metodos de entrada de datos -setters-

     public void establecerNumEstacion(int num)
     {
        numEstacion = num;    
     }

     public void establecerTotProduccion(int tProd)
     {
        totProduccion = tProd;    
     }

     public void calcularNivProductividad()
     {
        if (totProduccion < 300)
           nivProductividad = "Deficiente";
        else
           if (totProduccion == 300)
              nivProductividad = "Bueno";
           else
              nivProductividad = "Excelente";
     }

  // Metodos de acceso a los datos -getters-

     public int obtenerNumEstacion()
     {
        return numEstacion;
     }

     public int obtenerTotProduccion()
     {
        return totProduccion;
     }

     public String obtenerNivProductividad()
     {
        return nivProductividad;
     }
}
