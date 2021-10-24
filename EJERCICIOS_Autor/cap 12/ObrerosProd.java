// Programa PRODUCCION 20 OBREROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: ObrerosProd y EjecutaObrerosProd
// ObrerosProd.java

public class ObrerosProd
{
 // Datos de la clase
    private String nombres[] = new String[20]; 
    private int produccion[][] = new int[20][6]; 
    private int totProd[] = new int[20]; 
    private int totMes[] = new int[6]; 
    private int toTotProd; 

 // Metodos de entrada de datos -setters-

    public void establecerNombres(String nom[])
    {
       nombres = nom;  
    }

    public void establecerProduccion(int pro[][])
    {
       produccion = pro;  
    }

    public void calcularTotProd()
    {
       int r, c;
       for (r=0; r<=19; r++)
       {
          totProd[r] = 0;
          for (c=0; c<=5; c++)
          {
            totProd[r] = totProd[r] + produccion[r][c];
          }
        }
    }

    public void calcularTotMes()
    {
       int re, co;
       for (co=0; co<=5; co++)
       {
          totMes[co] = 0;
          for (re=0; re<=19; re++)
          {
            totMes[co] = totMes[co] + produccion[re][co];
          }
        }
    }

    public void calcularToTotProd()
    {
       int i;
       toTotProd = 0; 
       for (i=0; i<=5; i++)
       {
           toTotProd = toTotProd + totMes[i];
       }
    }

 // Metodos de acceso a los datos -getters-

    public String[] obtenerNombres()
    {
       return nombres;
    }

    public int[][] obtenerProduccion()
    {
       return produccion;  
    }

    public int[] obtenerTotProd()
    {
       return totProd;  
    }

    public int[] obtenerTotMes()
    {
       return totMes;  
    }

    public int obtenerToTotProd()
    {
       return toTotProd;  
    }
}

