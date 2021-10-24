// Programa SUMA MATRICES 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Matrices1 y EjecutaMatrices1
// Matrices1.java

public class Matrices1
{
 // Datos de la clase
    private int matriz1[][] = new int[5][5]; 
    private int matriz2[][] = new int[5][5]; 
    private int matriz3[][] = new int[5][5]; 

 // Metodos de entrada de datos -setters-

    public void establecerMatriz1(int mat1[][])
    {
       matriz1 = mat1;  
    }

    public void establecerMatriz2(int mat2[][])
    {
       matriz2 = mat2;  
    }

    public void calcularMatriz3()
    {
       int r, c;
       for (r=0; r<=4; r++)
       {
           for (c=0; c<=4; c++)
           {
               matriz3[r][c] = matriz1[r][c] + matriz2[r][c];
           }
       }
    }

 // Metodos de acceso a los datos -getters-

    public int[][] obtenerMatriz1()
    {
       return matriz1;  
    }

    public int[][] obtenerMatriz2()
    {
       return matriz2;  
    }

    public int[][] obtenerMatriz3()
    {
       return matriz3;  
    }
}

