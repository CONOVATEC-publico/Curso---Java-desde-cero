package distanciadospuntos;

/**
 * @author mine_
 */
public class DistanciaDosPuntos {

  public static void main(String[] args) {
    double x1 = -2.5;
    double y1 = 0.4;
    double x2 = 12.1;
    double y2 = 7.3;
    double suma = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
    double distancia = Math.sqrt(suma);
    String formato = String.format("%.4f", distancia);
    System.out.println(formato);
    
    /* 
      (x1)1.0 (y1)7.0 <= p1
      (x2)5.0 (y2)9.0 <= p2
    */
  }
  
}
