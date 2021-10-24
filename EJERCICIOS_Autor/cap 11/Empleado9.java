// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado9 y EjecutaEmpleado9
// Empleado9.java

public class Empleado9
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
