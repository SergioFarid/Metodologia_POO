// Programa MATRIZ POR VECTOR COLUMNA 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: MatrizVector y EjecutaMatrizVector
// MatrizVector.java

public class MatrizVector
{
 // Datos de la clase
    private int matrizA[][] = new int[5][6]; 
    private int vectorX[] = new int[5]; 
    private int vectorZ[] = new int[5]; 

 // Metodos de entrada de datos -setters-

    public void establecerMatrizA(int ma[][])
    {
       matrizA = ma;  
    }

    public void establecerVectorX(int vx[])
    {
       vectorX = vx;  
    }

    public void calcularMatrizXVector()
    {
       int re, co;
       for (re=0; re<=4; re++)
       {
           vectorZ[re] = 0;
           for (co=0; co<=4; co++)
           {
               vectorZ[re] = vectorZ[re] + (matrizA[re][co] * vectorX[re]);
           }
       }
    }

 // Metodos de acceso a los datos -getters-

    public int[][] obtenerMatrizA()
    {
       return matrizA;  
    }

    public int[] obtenerVectorX()
    {
       return vectorX;  
    }

    public int[] obtenerVectorZ()
    {
       return vectorZ;  
    }
}

