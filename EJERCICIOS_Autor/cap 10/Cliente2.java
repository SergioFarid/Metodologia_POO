// Programa CLIENTE HOJAS HIELO SECO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Cliente2 y EjecutaCliente2
// Cliente2.java

public class Cliente2
{
  // Declarar
  // Datos de la clase
     private String nombreClie;
     private int tipoClie, cantidad;
     private float precioUni, subTotal, descuento, netoPagar; 

  // Metodos de entrada de datos -setters-

     public void establecerNombreClie(String nom)
     {
        nombreClie = nom;    
     }

     public void establecerTipoClie(int tipo)
     {
        tipoClie = tipo;    
     }

     public void establecerCantidad(int can)
     {
        cantidad = can;    
     }

     public void establecerPrecioUni(float pre)
     {
        precioUni = pre;    
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
