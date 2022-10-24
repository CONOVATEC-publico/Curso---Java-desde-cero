package mayorque;

import java.util.Scanner;

/**
 * @author mine_
 */
public class MayorQue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if (a > b) {
      System.out.println(a + " es mayor que " + b);
    }
  }
  
}
