// Programa CALCULA SUELDO DE UN EMPLEADO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado5 y EjecutaEmpleado5
// Empleado5.java

public class Empleado5
{
  // Declarar
  // Datos de la clase
     private String nombreEmp;
     private int horasTrab;
     private float cuotaHora;
     private float sueldo; 

  // Metodos de entrada de datos -setters-

     public void establecerNombreEmp(String nom)
     {
        nombreEmp = nom;    
     }

     public void establecerHorasTrab(int horasTr)
     {
        horasTrab = horasTr;    
     }

     public void establecerCuotaHora(float cuotaHr)
     {
        cuotaHora = cuotaHr;    
     }

     public void calcularSueldo()
     {
        sueldo = horasTrab * cuotaHora;    
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerNombreEmp()
     {
        return nombreEmp;
     }

     public float obtenerSueldo()
     {
        return sueldo;
     }
}
