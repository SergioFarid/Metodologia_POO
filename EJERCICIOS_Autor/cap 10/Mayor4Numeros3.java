// Programa MAYOR 4 NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Mayor4Numeros3 y EjecutaMayor4Numeros3
// Mayor4Numeros3.java

public class Mayor4Numeros3
{
  // Declarar
  // Datos de la clase
     private int numA, numB, numC, numD, nuMayor;

  // Metodos de entrada de datos -setters-

     public void establecerNumA(int a)
     {
        numA = a;    
     }

     public void establecerNumB(int b)
     {
        numB = b;    
     }

     public void establecerNumC(int c)
     {
        numC = c;    
     }

     public void establecerNumD(int d)
     {
        numD = d;    
     }

     public void calcularNuMayor()
     {
        if (numA > numB && numA > numC && numA > numD)
           nuMayor = numA;
        else
          if (numB > numC && numB > numD)
             nuMayor = numB;
          else
             if (numC > numD)
                nuMayor = numC;
             else
                nuMayor = numD;
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerNuMayor()
     {
        return nuMayor;
     }
}
