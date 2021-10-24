// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS -Usando this-
// Elaborado por: Leobardo L�pez Rom�n
// Esta formado por dos clases: Empleado9this y EjecutaEmpleado9this
// Empleado9this.java

public class Empleado9this
{
  // Declarar
  // Datos de la clase
     private String nombreEmp;
     private int horasTrab;
     private float cu�taHora;
     private float sueldo; 

  // Metodos de entrada de datos -setters-

     public void establecerNombreEmp(String nombreEmp)
     {
        this.nombreEmp = nombreEmp;    
     }

     public void establecerHorasTrab(int horasTrab)
     {
        this.horasTrab = horasTrab;    
     }

     public void establecerCuotaHora(float cu�taHora)
     {
        this.cu�taHora = cu�taHora;    
     }

     public void calcularSueldo()
     {
        sueldo = horasTrab * cu�taHora;    
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
