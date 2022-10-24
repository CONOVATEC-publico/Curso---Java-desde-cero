package practicatrajes;

import java.util.Scanner;

/**
 * @author mine_
 */
public class PracticaTrajes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    double descuento;
    
    if (x > 2500) {
      descuento = x * 0.15;
    } else {
      descuento = x * 0.08;
    }
    
    System.out.println("Descuento: " + descuento);
    System.out.println("Precio final: " + (x - descuento));
  }
  
}
