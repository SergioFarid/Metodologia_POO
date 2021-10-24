// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado12, EmpleadoPorHoras2, 
//                                 EmpleadoAsalariado2 y EjecutaEmpleado12
// EmpleadoAsalariado2.java

class EmpleadoAsalariado2 extends Empleado12
{
  // Datos de la clase
     private float sueldoMensual;

  // Metodos de entrada de datos -setters-

     public void establecerSueldoMensual(float sdo)
     {
        sueldoMensual = sdo;    
     }

     public void calcularSueldoQna()
     {
        sueldoQna = sueldoMensual / 2;    
     }
}