// Programa ARREGLO TRES DIMENSIONES 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empresa1 y EjecutaEmpresa1
// Empresa1.java

public class Empresa1
{
  // Dato de la clase
     private int produccion[][][] = new int[6][4][5]; 

  // Metodo de entrada del dato -setter-

     public void establecerProduccion(int pro[][][])
     {
        produccion = pro;  
     }

  // Metodo de acceso al dato -getter-

     public int[][][] obtenerProduccion()
     {
        return produccion;  
     }
}

