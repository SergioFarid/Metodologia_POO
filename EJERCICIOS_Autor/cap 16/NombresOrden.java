// Programa CLASIFICA (ORDENA) ARREGLO DE NOMBRES
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: NombresOrden y EjecutaNombresOrden
// NombresOrden.java

public class NombresOrden
{
  // Dato de la clase
     private String nombres[]; 

  // Metodo de entrada de datos -setters-

     public void establecerNombres(String nom[])
     {
        nombres = nom;  
     }

     public void ordenarNombres()
     {
        String auxiliar;
        int    c, bandera;  
        do
        {
           bandera = 0;
           for (c=1; c<=9; c++)
                if (nombres[c-1].compareToIgnoreCase(nombres[c]) > 0)
                { 
                    auxiliar = nombres[c];
                    nombres[c] = nombres[c-1];
                    nombres[c-1] = auxiliar;
                    bandera = 1;
                } 
        } while (bandera != 0);

     }

  // Metodos de acceso a los datos -getters-

     public String[] obtenerNombres()
     {
        return nombres;  
     }
}
