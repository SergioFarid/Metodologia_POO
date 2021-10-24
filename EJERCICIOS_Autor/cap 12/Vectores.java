// Programa PRODUCTO DE VECTORES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Vectores y EjecutaVectores
// Vectores.java

public class Vectores
{
 // Datos de la clase
    private int vectorA[] = new int[10]; 
    private int vectorB[] = new int[10]; 
    private int producto; 

 // Metodos de entrada de datos -setters-

    public void establecerVectorA(int vecA[])
    {
       vectorA = vecA;  
    }

    public void establecerVectorB(int vecB[])
    {
       vectorB = vecB;  
    }

    public void calcularProducto()
    {
       int r;
       producto = 0;
       for (r=0; r<=9; r++)
       {
           producto = producto + (vectorA[r] * vectorB[r]);
       } 
    }

 // Metodos de acceso a los datos -getters-

    public int[] obtenerVectorA()
    {
       return vectorA;  
    }

    public int[] obtenerVectorB()
    {
       return vectorB;  
    }

    public int obtenerProducto()
    {
       return producto;  
    }
}

