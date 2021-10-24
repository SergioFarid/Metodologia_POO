// Programa SISTEMA DE VENDEDORES
// Elaborado por: Leobardo López Román
// Esta formado por cuatro clases: RegVendedor, RegDepto, RegSuc y EjecutaRegVendedor
// RegSuc.java

import java.io.*;
public class RegSuc implements Serializable
{
  // Datos de la clase
     private int claveSuc;
     private String nomSuc;

  // Metodos de entrada de datos -setters-

     public void establecerClaveSuc(int cve)
     {
        claveSuc = cve;    
     }

     public void establecerNomSuc(String nomSu)
     {
        nomSuc = nomSu;    
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerClaveSuc()
     {
        return claveSuc;
     }

     public String obtenerNomSuc()
     {
        return nomSuc;
     }
}
