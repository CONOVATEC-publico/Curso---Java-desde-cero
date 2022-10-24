package sumapromedios;

import java.util.Scanner;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class SumaPromedios {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    
    System.out.print("Ingrese la cantidad de alumnos:");
    int cantidadAlumnos = sc.nextInt();
    
    for (int i = 1; i <= cantidadAlumnos; i++) {
      System.out.print("Ingrese la edad del Alumno " + i + ": ");
      contador += sc.nextInt();
    }
    
    double promedio = contador / cantidadAlumnos;
    System.out.println("Edad promedio: " + promedio);
  }
  
}
