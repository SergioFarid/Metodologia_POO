// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado12, EmpleadoPorHoras2, 
//                                 EmpleadoAsalariado2 y EjecutaEmpleado12
// Empleado12.java

abstract class Empleado12
{
  // Datos de la clase
     protected String nombreEmp;
     protected String deptoEmp;
     protected String puestoEmp;
     protected float sueldoQna;

  // Metodos de entrada de datos -setters-

     public void establecerNombreEmp(String nom)
     {
        nombreEmp = nom;    
     }

     public void establecerDeptoEmp(String dep)
     {
        deptoEmp = dep;    
     }

     public void establecerPuestoEmp(String pue)
     {
        puestoEmp = pue;    
     }

  // Metodo abstracto

     abstract void calcularSueldoQna();
 
  // Metodos de acceso a los datos -getters-

     public String obtenerNombreEmp()
     {
        return nombreEmp;
     }

     public String obtenerDeptoEmp()
     {
        return deptoEmp;
     }

     public String obtenerPuestoEmp()
     {
        return puestoEmp;
     }

     public float obtenerSueldoQna()
     {
        return sueldoQna;
     }
}
