// Programa SISTEMA DE OBREROS
// Elaborado por: Leobardo López Román
// Esta formado por tres clases: RegObrero, RegPlanta y EjecutaRegObrero
// RegObrero.java

import java.io.*;
public class RegObrero implements Serializable
{
  // Datos de la clase
     private int numero;
     private String nombreObr;
     private int clavePlanta;
     private int produc[];

  // Metodos de entrada de datos -setters-

     public void establecerNumero(int num)
     {
        numero = num;    
     }

     public void establecerNombreObr(String nom)
     {
        nombreObr = nom;    
     }

     public void establecerClavePlanta(int cve)
     {
        clavePlanta = cve;    
     }

     public void establecerProduc(int pro[])
     {
        produc = pro;    
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerNumero()
     {
        return numero;
     }

     public String obtenerNombreObr()
     {
        return nombreObr;
     }

     public int obtenerClavePlanta()
     {
        return clavePlanta;
     }

     public int[] obtenerProduc()
     {
        return produc;
     }
}
