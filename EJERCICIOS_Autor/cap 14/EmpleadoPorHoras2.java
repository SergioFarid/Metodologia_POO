// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado12, EmpleadoPorHoras2, 
//                                 EmpleadoAsalariado2 y EjecutaEmpleado12
// EmpleadoPorHoras2.java

class EmpleadoPorHoras2 extends Empleado12
{
  // Datos de la clase
     private int horasTrab;
     private float cuotaHora;

  // Metodos de entrada de datos -setters-

     public void establecerHorasTrab(int horasTr)
     {
        horasTrab = horasTr;
     }

     public void establecerCuotaHora(float cuotaHr)
     {
        cuotaHora = cuotaHr;    
     }

     public void calcularSueldoQna()
     {
        sueldoQna = horasTrab * cuotaHora;    
     }
}
