// Programa CLASIFICA (ORDENA) ARREGLO DE NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: NumerosOrden y EjecutaNumerosOrden
// NumerosOrden.java

public class NumerosOrden
{
  // Dato de la clase
     private int numeros[]; 

  // Metodo de entrada de datos -setters-

     public void establecerNumeros(int num[])
     {
        numeros = num;  
     }

     public void ordenarNumeros()
     {
        int auxiliar, c, bandera;  
        do
        {
           bandera = 0;
           for (c=1; c<=9; c++)
                if (numeros[c-1] > numeros[c])
                { 
                    auxiliar = numeros[c];
                    numeros[c] = numeros[c-1];
                    numeros[c-1] = auxiliar;
                    bandera = 1;
                } 
        } while (bandera != 0);

     }

  // Metodos de acceso a los datos -getters-

     public int[] obtenerNumeros()
     {
        return numeros;  
     }
}
