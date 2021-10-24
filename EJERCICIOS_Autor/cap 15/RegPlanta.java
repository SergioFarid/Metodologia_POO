// Programa SISTEMA DE OBREROS
// Elaborado por: Leobardo López Román
// Esta formado por tres clases: RegObrero, RegPlanta y EjecutaRegObrero
// RegPlanta.java

import java.io.*;
public class RegPlanta implements Serializable
{
  // Datos de la clase
     private int clavePlanta;
     private String nombrePlanta;

  // Metodos de entrada de datos -setters-

     public void establecerClavePlanta(int cve)
     {
        clavePlanta = cve;    
     }

     public void establecerNombrePlanta(String nomPl)
     {
        nombrePlanta = nomPl;    
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerClavePlanta()
     {
        return clavePlanta;
     }

     public String obtenerNombrePlanta()
     {
        return nombrePlanta;
     }
}
