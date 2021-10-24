// Programa DICE DIA
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: DiceDia2 y EjecutaDiceDia2
// DiceDia2.java

public class DiceDia2
{
  // Declarar
  // Datos de la clase
     private int numDia;
     private String nombreDia;

  // Metodos de entrada de datos -setters-

     public void establecerNumDia(int num)
     {
        numDia = num;    
     }

     public void calcularNombreDia()
     {
        switch (numDia)
        {
          case 1:
                 nombreDia = "Domingo";
                 break;
          case 2:
                 nombreDia = "Lunes";
                 break;
          case 3:
                 nombreDia = "Martes";
                 break;
          case 4:
                 nombreDia = "Miercoles";
                 break;
          case 5:
                 nombreDia = "Jueves";
                 break;
          case 6:
                 nombreDia = "Viernes";
                 break;
          case 7:
                 nombreDia = "Sabado";
                 break;
          default:
                 nombreDia = "No esta en el rango de 1 a 7";                  
        }

     }
 
  // Metodo de acceso al dato -getter-

     public String obtenerNombreDia()
     {
        return nombreDia;
     }
}
