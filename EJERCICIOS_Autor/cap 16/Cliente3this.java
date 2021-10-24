// Programa CLIENTES HOJAS HIELO SECO (usando this)
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Cliente3this y EjecutaCliente3this
// Cliente3this.java

public class Cliente3this
{
  // Declarar
  // Datos de la clase
     private String nombreClie;
     private int tipoClie, cantidad;
     private float precioUni, subTotal, descuento, netoPagar; 

  // Metodos de entrada de datos -setters-

     public void establecerNombreClie(String nombreClie)
     {
        this.nombreClie = nombreClie;    
     }

     public void establecerTipoClie(int tipoClie)
     {
        this.tipoClie = tipoClie;    
     }

     public void establecerCantidad(int cantidad)
     {
        this.cantidad = cantidad;    
     }

     public void establecerPrecioUni(float precioUni)
     {
        this.precioUni = precioUni;    
     }

     public void calcularSubTotal()
     {
        subTotal = cantidad * precioUni;    
     }

     public void calcularDescuento()
     {
        switch (tipoClie)
        {
          case 1:
                  descuento = subTotal * 0.05F;
                  break;  
          case 2:
                  descuento = subTotal * 0.08F;
                  break;  
          case 3:
                  descuento = subTotal * 0.12F;
                  break;  
          case 4:
                  descuento = subTotal * 0.15F;
                  break;  
        }
     }

     public void calcularNetoPagar()
     {
        netoPagar = subTotal - descuento;    
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerNombreClie()
     {
        return nombreClie;
     }

     public float obtenerSubTotal()
     {
        return subTotal;
     }

     public float obtenerDescuento()
     {
        return descuento;
     }

     public float obtenerNetoPagar()
     {
        return netoPagar;
     }
}
