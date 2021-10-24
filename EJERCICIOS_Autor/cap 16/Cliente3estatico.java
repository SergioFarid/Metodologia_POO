// Programa CLIENTES HOJAS HIELO SECO (usando static)
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Cliente3estatico y EjecutaCliente3estatico
// Cliente3estatico.java

public class Cliente3estatico
{
  // Declarar
  // Datos de la clase
     static int totClientes;
     static float totSubTotal, totDescuento, totNetoPagar;

     private String nombreClie;
     private int tipoClie, cantidad;
     private float precioUni, subTotal, descuento, netoPagar; 

  // Metodos estaticos

     public static void iniciarTotClientes()
     {
        totClientes = 0;    
     }

     public static void incrementarTotClientes()
     {
        totClientes = totClientes + 1;    
     }

     public static int obtenerTotClientes()
     {
        return totClientes;
     }

     public static void iniciarTotSubTotal()
     {
        totSubTotal = 0;    
     }

     public static void incrementarTotSubTotal(float suTo)
     {
        totSubTotal = totSubTotal + suTo;    
     }

     public static float obtenerTotSubTotal()
     {
        return totSubTotal;
     }

     public static void iniciarTotDescuento()
     {
        totDescuento = 0;    
     }

     public static void incrementarTotDescuento(float desc)
     {
        totDescuento = totDescuento + desc;    
     }

     public static float obtenerTotDescuento()
     {
        return totDescuento;
     }

     public static void iniciarTotNetoPagar()
     {
        totNetoPagar = 0;    
     }

     public static void incrementarTotNetoPagar(float nePag)
     {
        totNetoPagar = totNetoPagar + nePag;    
     }

     public static float obtenerTotNetoPagar()
     {
        return totNetoPagar;
     }

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
