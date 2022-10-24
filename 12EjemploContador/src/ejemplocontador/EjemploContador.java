package ejemplocontador;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class EjemploContador {

  public static void main(String[] args) {
    int cont = 0; // 1, 3, ...
    for (int i = 1; i <= 10; i++) {
      //cont = cont + i;
      cont += i;
    }
    System.out.println("Suma total: " + cont);
  }
  
}
