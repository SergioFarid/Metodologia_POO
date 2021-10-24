// Programa CALCULAR SUELDO DE VARIOS EMPLEADOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empleado9estatico y EjecutaEmpleado9estatico
// Empleado9estatico.java

public class Empleado9estatico
{
  // Datos de la clase
     static int totEmpleados;
     static float totSueldos;

     private String nombreEmp;
     private int horasTrab;
     private float cuotaHora;
     private float sueldo; 

  // Metodos estaticos

     public static void iniciarTotEmpleados()
     {
        totEmpleados = 0;    
     }

     public static void incrementarTotEmpleados()
     {
        totEmpleados = totEmpleados + 1;    
     }

     public static int obtenerTotEmpleados()
     {
        return totEmpleados;
     }

     public static void iniciarTotSueldos()
     {
        totSueldos = 0;    
     }

     public static void incrementarTotSueldos(float sdo)
     {
        totSueldos = totSueldos + sdo;    
     }

     public static float obtenerTotSueldos()
     {
        return totSueldos;
     }

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
