// Programa ARREGLO CUATRO DIMENSIONES 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Empresa2 y EjecutaEmpresa2
// Empresa2.java

public class Empresa2
{
  // Dato de la clase
     private int produccion[][][][] = new int[6][3][4][5]; 

  // Metodo de entrada del dato -setter-

     public void establecerProduccion(int pro[][][][])
     {
        produccion = pro;  
     }

  // Metodo de acceso al dato -getter-

     public int[][][][] obtenerProduccion()
     {
        return produccion;  
     }
}

