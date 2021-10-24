// Programa MAYOR 5 NUMEROS
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: Mayor5Numeros2 y EjecutaMayor5Numeros2
// Mayor5Numeros2.java

public class Mayor5Numeros2
{
  // Declarar
  // Datos de la clase
     private int numA, numB, numC, numD, numE, nuMayor;

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

     public void establecerNumE(int e)
     {
        numE = e;    
     }

     public void calcularNuMayor()
     {
        nuMayor = numA;
        if (numB > nuMayor)
           nuMayor = numB;
        if (numC > nuMayor)
           nuMayor = numC;
        if (numD > nuMayor)
           nuMayor = numD;
        if (numE > nuMayor)
           nuMayor = numE;
     }
 
  // Metodos de acceso a los datos -getters-

     public int obtenerNuMayor()
     {
        return nuMayor;
     }
}
