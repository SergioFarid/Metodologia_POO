// Programa TIPO ANGULO
// Elaborado por: Leobardo López Román
// Esta formado por dos clases: TipoAngulo2 y EjecutaTipoAngulo2
// TipoAngulo2.java

public class TipoAngulo2
{
  // Declarar
  // Datos de la clase
     private float tamAngulo; 
     private String tipoAngulo;

  // Metodos de entrada de datos -setters-

     public void establecerTamAngulo(float ang)
     {
        tamAngulo = ang;    
     }

     public void calcularTipoAngulo()
     {
        if (tamAngulo < 90)
           tipoAngulo = "Agudo";
        if (tamAngulo == 90)
           tipoAngulo = "Recto";
        if (tamAngulo > 90 && tamAngulo < 180)
           tipoAngulo = "Obtuso";
        if (tamAngulo == 180)
           tipoAngulo = "Llano";
        if (tamAngulo > 180 && tamAngulo < 360)
           tipoAngulo = "Concavo";
     }
 
  // Metodos de acceso a los datos -getters-

     public String obtenerTipoAngulo()
     {
        return tipoAngulo;
     }
}
