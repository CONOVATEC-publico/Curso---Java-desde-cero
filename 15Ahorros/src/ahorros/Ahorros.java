package ahorros;

import java.util.Scanner;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Ahorros {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double ahorroMensual = 0;
    
    for (int i = 1; i <= 12; i++) {
      System.out.print("Ingresa tu ahorro: ");
      ahorroMensual += sc.nextDouble();
      
      System.out.println("El ahorro del mes " + i + " es: " + ahorroMensual);
    }
    
    System.out.println("El ahorro final es: " + ahorroMensual);
  }
  
}
