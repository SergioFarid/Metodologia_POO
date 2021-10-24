// Programa MATRIZ CON SUMAS POR RENGLONES Y COLUMNAS 
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Matriz y EjecutaMatriz
// Matriz.java

public class Matriz
{
 // Datos de la clase
    private int matriz[][] = new int[5][7]; 
    private int sumaRenglones[] = new int[5]; 
    private int sumaColumnas[] = new int[7]; 

 // Metodos de entrada de datos -setters-

    public void establecerMatriz(int ma[][])
    {
       matriz = ma;  
    }

    public void calcularSumaRenglones()
    {
       int r, c;
       for (r=0; r<=4; r++)
       {
           sumaRenglones[r] = 0;
           for (c=0; c<=6; c++)
           {
               sumaRenglones[r] = sumaRenglones[r] + matriz[r][c];
           }
       }
    }

    public void calcularSumaColumnas()
    {
       int re, co;
       for (co=0; co<=6; co++)
       {
           sumaColumnas[co] = 0;
           for (re=0; re<=4; re++)
           {
               sumaColumnas[co] = sumaColumnas[co] + matriz[re][co];
           }
       }
    }

 // Metodos de acceso a los datos -getters-

    public int[][] obtenerMatriz()
    {
       return matriz;  
    }

    public int[] obtenerSumaRenglones()
    {
       return sumaRenglones;  
    }

    public int[] obtenerSumaColumnas()
    {
       return sumaColumnas;  
    }
}

