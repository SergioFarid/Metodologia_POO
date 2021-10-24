// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado11, EmpleadoPorHoras1, 
//                                 EmpleadoAsalariado1 y EjecutaEmpleado11
// EmpleadoPorHoras1.java

class EmpleadoPorHoras1 extends Empleado11
{
  // Datos de la clase
     private int horasTrab;
     private float cuotaHora;
     private float sueldoQnaHoras;

  // Metodos de entrada de datos -setters-

     public void establecerHorasTrab(int horasTr)
     {
        horasTrab = horasTr;
     }

     public void establecerCuotaHora(float cuotaHr)
     {
        cuotaHora = cuotaHr;    
     }

     public void calcularSueldoQnaHoras()
     {
        sueldoQnaHoras = horasTrab * cuotaHora;    
     }

  // Metodo de acceso al dato -getter-

     public float obtenerSueldoQnaHoras()
     {
        return sueldoQnaHoras;
     }
}
