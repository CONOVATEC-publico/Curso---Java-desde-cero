package practicalapices;

import java.util.Scanner;

/**
 * @author mine_
 */
public class PracticaLapices {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    double pago;
    
    if (x >= 1000) {
      pago = x * 0.85;
    } else {
      pago = x * 0.90;
    }
    
    System.out.println("El pago es " + pago);
  }
  
}
