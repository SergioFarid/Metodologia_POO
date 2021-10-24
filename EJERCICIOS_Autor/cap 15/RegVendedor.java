// Programa SISTEMA DE VENDEDORES
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: RegVendedor, RegDepto, RegSuc y EjecutaRegVendedor
// RegVendedor.java

import java.io.*;
public class RegVendedor implements Serializable
{
  // Datos de la clase
     private int numero;
     private String nombreVen;
     private int claveSuc;
     private int claveDepto;
     private float ventas[];

  // Metodos de entrada de datos -setters-

     public void establecerNumero(int num)
     {
        numero = num;    
     }

     public void establecerNombreVen(String nom)
     {
        nombreVen = nom;    
     }

     public void establecerClaveSuc(int cve)
     {
        claveSuc = cve;    
     }

     public void establecerClaveDepto(int cve)
     {
        claveDepto = cve;    
     }

     public void establecerVentas(float ven[])
     {
        ventas = ven;    
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerNumero()
     {
        return numero;
     }

     public String obtenerNombreVen()
     {
        return nombreVen;
     }

     public int obtenerClaveSuc()
     {
        return claveSuc;
     }

     public int obtenerClaveDepto()
     {
        return claveDepto;
     }

     public float[] obtenerVentas()
     {
        return ventas;
     }
}
