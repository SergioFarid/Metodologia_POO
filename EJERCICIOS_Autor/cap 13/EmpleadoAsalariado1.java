// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado11, EmpleadoPorHoras1, 
//                                 EmpleadoAsalariado1 y EjecutaEmpleado11
// EmpleadoAsalariado1.java

class EmpleadoAsalariado1 extends Empleado11
{
  // Datos de la clase
     private float sueldoMensual;
     private float sueldoQnaAsal;

  // Metodos de entrada de datos -setters-

     public void establecerSueldoMensual(float sdo)
     {
        sueldoMensual = sdo;    
     }

     public void calcularSueldoQnaAsal()
     {
        sueldoQnaAsal = sueldoMensual / 2;    
     }

  // Metodo de acceso al dato -getter-

     public float obtenerSueldoQnaAsal()
     {
        return sueldoQnaAsal;
     }
}