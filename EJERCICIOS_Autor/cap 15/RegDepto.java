// Programa SISTEMA DE VENDEDORES
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: RegVendedor, RegDepto, RegSuc y EjecutaRegVendedor
// RegDepto.java

import java.io.*;
public class RegDepto implements Serializable
{
  // Datos de la clase
     private int claveDepto;
     private String nomDepto;

  // Metodos de entrada de datos -setters-

     public void establecerClaveDepto(int cve)
     {
        claveDepto = cve;    
     }

     public void establecerNomDepto(String nomDe)
     {
        nomDepto = nomDe;    
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerClaveDepto()
     {
        return claveDepto;
     }

     public String obtenerNomDepto()
     {
        return nomDepto;
     }
}
