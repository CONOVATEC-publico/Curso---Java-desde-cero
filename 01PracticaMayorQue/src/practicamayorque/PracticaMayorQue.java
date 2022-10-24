package practicamayorque;

import java.util.Scanner;

/**
 * @author mine_
 */
public class PracticaMayorQue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = a > b ? a : b; // Operador Ternario
    
    /*if (a > b) {
      m = a;
    } else {
      m = b;
    }*/
    
    System.out.println(m);
  }
  
}
