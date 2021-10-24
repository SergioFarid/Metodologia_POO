// Programa CALCULA INFLACION DE ARTICULOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Articulo y EjecutaArticulo
// Articulo.java

public class Articulo
{
  // Declarar
  // Datos de la clase
     private String articulo;
     private float precioAnt;
     private float precioAct; 
     private float ptjeInfla; 

  // Metodos de entrada de datos -setters-

     public void establecerArticulo(String nom)
     {
        articulo = nom;    
     }

     public void establecerPrecioAnt(float pAnt)
     {
        precioAnt = pAnt;    
     }

     public void establecerPrecioAct(float pAct)
     {
        precioAct = pAct;    
     }

     public void calcularPtjeInfla()
     {
        ptjeInfla = ((precioAct - precioAnt) / precioAnt) * 100;    
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerArticulo()
     {
        return articulo;
     }

     public float obtenerPrecioAnt()
     {
        return precioAnt;
     }

     public float obtenerPrecioAct()
     {
        return precioAct;
     }

     public float obtenerPtjeInfla()
     {
        return ptjeInfla;
     }
}
