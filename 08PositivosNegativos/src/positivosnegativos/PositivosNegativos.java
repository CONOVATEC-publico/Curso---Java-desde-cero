package positivosnegativos;

import java.util.Scanner;

/**
 * @author mine_
 */
public class PositivosNegativos {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    if (a > 0) {
      System.out.println(a + " es un número positivo");
    } else {
      System.out.println(a + " es número negativo");
    }
  }
  
}
