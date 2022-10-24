package promediodos;

/**
 * @author mine_
 */
public class PromedioDos {

  public static void main(String[] args) {
    double a = 10.0;
    double b = 10.0;
    double c = 5.0;
    double promedio = 
      ((a / 10 * 2) + (b / 10 * 3) + (c / 10 * 5));
      //((a * 2) + (b * 3) + (c * 5)) / 10;
    
    System.out.println("Promedio final: " + promedio);
  }
  
}
