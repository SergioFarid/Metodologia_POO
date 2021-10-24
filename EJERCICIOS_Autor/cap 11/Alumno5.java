// Programa CALCULA PROMEDIO DE VARIOS ALUMNOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Alumno5 y EjecutaAlumno5
// Alumno5.java

public class Alumno5
{
  // Declarar
  // Datos de la clase
     private String nombreAlum;
     private float calif1;
     private float calif2;
     private float calif3;
     private float calif4;
     private float promedio; 

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
 
  // Metodos de acceso a los datos -getters-

     public String obtenerNombreAlum()
     {
        return nombreAlum;
     }

     public float obtenerCalif1()
     {
        return calif1;
     }

     public float obtenerCalif2()
     {
        return calif2;
     }

     public float obtenerCalif3()
     {
        return calif3;
     }

     public float obtenerCalif4()
     {
        return calif4;
     }

     public float obtenerPromedio()
     {
        return promedio;
     }
}
