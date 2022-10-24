package promedioestatura;

import java.util.Scanner;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class PromedioEstatura {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double contador = 0;
    
    System.out.print("Ingrese la cantidad de personas: ");
    int cantidadPersonas = sc.nextInt();
    
    for (int i = 1; i <= cantidadPersonas; i++) {
      System.out.print("Ingrese la estatura de la persona " + i + ": ");
      contador += sc.nextDouble();
    }
    
    System.out.println("Promedio: " + contador / cantidadPersonas);
  }
  
}
