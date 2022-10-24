package promedios;

/**
 * @author mine_
 */
public class Promedios {

  public static void main(String[] args) {
    int calificacionUno = 71;
    int calificacionDos = 95;
    int calificacionTres = 100;
    int calificacionCuatro = 89;
    int sumaCalificaciones = calificacionUno + calificacionDos + calificacionTres
      + calificacionCuatro;
    float promedio = sumaCalificaciones / 4.0f;
    
    System.out.println("Promedio general: " + promedio);
  }
  
}
