// Programa SUMA ARREGLOS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: SumaArreglos2 y EjecutaSumaArreglos2
// SumaArreglos2.java

public class SumaArreglos2
{
 // Datos de la clase
    private int arregloA[] = new int[10]; 
    private int arregloB[] = new int[10]; 
    private int arregloS[] = new int[10]; 

 // Metodos de entrada de datos -setters-

    public void establecerArregloA(int a[])
    {
       arregloA = a;  
    }

    public void establecerArregloB(int b[])
    {
       arregloB = b;  
    }

    public void calcularArregloS()
    {
       int r;
       for (r=0; r<=9; r++)
       {
           arregloS[r] = arregloA[r] + arregloB[r];
       } 
    }

 // Metodos de acceso a los datos -getters-

    public int[] obtenerArregloA()
    {
       return arregloA;  
    }

    public int[] obtenerArregloB()
    {
       return arregloB;  
    }

    public int[] obtenerArregloS()
    {
       return arregloS;  
    }
}

