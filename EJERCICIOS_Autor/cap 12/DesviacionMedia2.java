// Programa DESVIACION DE MEDIA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: DesviacionMedia2 y EjecutaDesviacionMedia2
// DesviacionMedia2.java

public class DesviacionMedia2
{
 // Datos de la clase
    private int numeros[] = new int[15]; 
    private float media;
    private float desviacion[] = new float[15]; 

 // Metodos de entrada de datos -setters-

    public void establecerNumeros(int n[])
    {
       numeros = n;  
    }

    public void calcularMedia()
    {
       int r;
       float sumatoria;
       sumatoria = 0;
       for (r=0; r<=14; r++)
       {
           sumatoria = sumatoria + numeros[r];
       } 
       media = sumatoria / r;
    }

    public void calcularDesviacion()
    {
       int j;
       for (j=0; j<=14; j++)
       {
           desviacion[j] = numeros[j] - media;
       } 
    }

 // Metodos de acceso a los datos -getters-

    public int[] obtenerNumeros()
    {
       return numeros;  
    }

    public float obtenerMedia()
    {
       return media;  
    }

    public float[] obtenerDesviacion()
    {
       return desviacion;  
    }
}

