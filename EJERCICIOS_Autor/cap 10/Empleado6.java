// Programa CALCULAR SUELDO DOBLE DE UN EMPLEADO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado6 y EjecutaEmpleado6
// Empleado6.java

public class Empleado6
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
        if (horasTrab <= 40)
           sueldo = horasTrab * cuotaHora;
        else
           sueldo = (40*cuotaHora) + ((horasTrab-40)*(cuotaHora*2));
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
