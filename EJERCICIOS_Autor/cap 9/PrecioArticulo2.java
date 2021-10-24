// Programa PRECIO DE VENTA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: PrecioArticulo2 y EjecutaPrecioArticulo2
// PrecioArticulo2.java

public class PrecioArticulo2
{
  // Declarar
  // Datos de la clase
     private String descripcion;
     private float costo;
     private float precioVta; 

  // Metodos de entrada de datos -setters-

     public void establecerDescripcion(String des)
     {
        descripcion = des;    
     }

     public void establecerCosto(float co)
     {
        costo = co;    
     }

     public void calcularPrecioVta()
     {
        precioVta = costo + (costo*1.2F) + ((costo + (costo*1.2F)) * 0.15F);    
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerDescripcion()
     {
        return descripcion;
     }

     public float obtenerPrecioVta()
     {
        return precioVta;
     }
}
