// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: Empleado11, EmpleadoPorHoras1, 
//                                 EmpleadoAsalariado1 y EjecutaEmpleado11
// Empleado11.java

class Empleado11
{
  // Datos de la clase
     protected String nombreEmp;
     protected String deptoEmp;
     protected String puestoEmp;

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
}

