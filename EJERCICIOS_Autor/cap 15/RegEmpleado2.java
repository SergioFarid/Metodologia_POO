// Programa SISTEMA DE NOMINA SECUENCIAL
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: RegEmpleado2 y EjecutaRegEmpleado2
// RegEmpleado2.java

import java.io.*;
public class RegEmpleado2 implements Serializable
{
  // Datos de la clase
     private int numero;
     private String nombreEmp;
     private int depto;
     private int puesto;
     private float sueldo; 

  // Metodos de entrada de datos -setters-

     public void establecerNumero(int num)
     {
        numero = num;    
     }

     public void establecerNombreEmp(String nom)
     {
        nombreEmp = nom;    
     }

     public void establecerDepto(int dep)
     {
        depto = dep;    
     }

     public void establecerPuesto(int pue)
     {
        puesto = pue;    
     }

     public void establecerSueldo(float sue)
     {
        sueldo = sue;    
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerNumero()
     {
        return numero;
     }

     public String obtenerNombreEmp()
     {
        return nombreEmp;
     }

     public int obtenerDepto()
     {
        return depto;
     }

     public int obtenerPuesto()
     {
        return puesto;
     }

     public float obtenerSueldo()
     {
        return sueldo;
     }
}
