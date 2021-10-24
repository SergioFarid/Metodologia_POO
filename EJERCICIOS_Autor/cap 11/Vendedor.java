// Programa VENDEDORES DE AUTOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Vendedor y EjecutaVendedor
// Vendedor.java

public class Vendedor
{
  // Declarar
  // Datos de la clase
     private String nombreVend;
     private float totalAutosVend;
     private float sueldoVend;
     private float totalVentas;
     private float salarioMinimo;

  // Metodos de entrada de datos -setters-

     public void establecerNombreVend(String nom)
     {
        nombreVend = nom;    
     }

     public void establecerTotalVentas(float toVen)
     {
        totalVentas = toVen;    
     }

     public void establecerTotalAutosVend(int toAuVen)
     {
        totalAutosVend = toAuVen;    
     }

     public void establecerSalarioMinimo(float saMi)
     {
        salarioMinimo = saMi;    
     }

     public void calcularSueldoVend()
     {
        sueldoVend = salarioMinimo + (totalAutosVend*100.00F) + (totalVentas*0.02F);   
     }

  // Metodos de acceso a los datos -getters-

     public String obtenerNombreVend()
     {
        return nombreVend;
     }

     public float obtenerSueldoVend()
     {
        return sueldoVend;
     }
}
