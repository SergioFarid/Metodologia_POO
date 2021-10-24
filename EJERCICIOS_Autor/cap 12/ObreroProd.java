// Programa PRODUCCION PROMEDIO DE OBRERO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: ObreroProd y EjecutaObreroProd
// ObreroProd.java

public class ObreroProd
{
 // Declaraciones
 // Datos de la clase
    private String nombreObr; 
    private int produccion[] = new int[30]; 
    private float promProd;
    private int totArriba;
    private int prodMayor;
    private int diaMayor;

    public void establecerNombreObr(String nom)
    {
       nombreObr = nom;    
    }

    public void establecerProduccion(int pro[])
    {
       produccion = pro;    
    }

    public void calcularPromProd()
    {
      int n, sumaProd;
      sumaProd = 0;
      for (n=0; n<=29; n++)
      {
         sumaProd = sumaProd + produccion[n];    
      } 
      promProd = sumaProd / 30;
    }

    public void calcularTotArriba()
    {
      int j;
      totArriba = 0;
      for (j=0; j<=29; j++)
      {
         if (produccion[j] > promProd)
            totArriba = totArriba + 1; 
      } 
    }

    public void CalcularProdMayorDiaMayor()
    {
      int m;
      prodMayor = 0;
      for (m=0; m<=29; m++)
      {
         if (produccion[m] > prodMayor)
         {
            prodMayor = produccion[m];
            diaMayor = m;
         }  
      } 
    }

    public String obtenerNombreObr()
    {
       return nombreObr;
    }

    public int[] obtenerProduccion()
    {
       return produccion;
    }

    public float obtenerPromProd()
    {
       return promProd;
    }

    public int obtenerTotArriba()
    {
       return totArriba;
    }

    public int obtenerProdMayor()
    {
       return prodMayor;
    }

    public int obtenerDiaMayor()
    {
       return diaMayor;
    }
}
