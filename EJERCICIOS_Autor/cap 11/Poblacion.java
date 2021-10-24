// Programa LLUVIAS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Poblacion y EjecutaPoblacion
// Poblacion.java

public class Poblacion
{
  // Declarar
  // Datos de la clase
     private String nombrePob;
     private float cantLluvia;
     private String nivelLluvia;

  // Metodos de entrada de datos -setters-

     public void establecerNombrePob(String nom)
     {
        nombrePob = nom;    
     }

     public void establecerCantLluvia(float cant)
     {
        cantLluvia = cant;    
     }

     public void calcularNivelLluvia()
     {
        if (cantLluvia == 0) 
            nivelLluvia = "NULA";
        if (cantLluvia > 0 && cantLluvia < 100) 
            nivelLluvia = "BAJA";
        if (cantLluvia >= 100 && cantLluvia <= 250)
            nivelLluvia = "REGULAR";
        if (cantLluvia > 250) 
            nivelLluvia = "ALTA";
     }

  // Metodos de acceso a los datos -getters-

     public String obtenerNombrePob()
     {
        return nombrePob;
     }

     public float obtenerCantLluvia()
     {
        return cantLluvia;
     }

     public String obtenerNivelLluvia()
     {
        return nivelLluvia;
     }
}
