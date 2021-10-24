// Programa CALCULA PROMEDIO DE UN ALUMNO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Alumno4 y EjecutaAlumno4
// Alumno4.java

public class Alumno4
{
  // Declarar
  // Datos de la clase
     private String nombreAlum;
     private float calif1, calif2, calif3, calif4;
     private float promedio; 
     private String observacion;

  // Metodos de entrada de datos -setters-

     public void establecerNombreAlum(String nom)
     {
        nombreAlum = nom;    
     }

     public void establecerCalif1(float ca1)
     {
        calif1 = ca1;    
     }

     public void establecerCalif2(float ca2)
     {
        calif2 = ca2;    
     }

     public void establecerCalif3(float ca3)
     {
        calif3 = ca3;    
     }

     public void establecerCalif4(float ca4)
     {
        calif4 = ca4;    
     }

     public void calcularPromedio()
     {
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;
     }

     public void calcularObservacion()
     {
        if (promedio >= 60)
           observacion = "Aprobado";
        else
           observacion = "Reprobado";
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerNombreAlum()
     {
        return nombreAlum;
     }

     public float obtenerPromedio()
     {
        return promedio;
     }

     public String obtenerObservacion()
     {
        return observacion;
     }
}
