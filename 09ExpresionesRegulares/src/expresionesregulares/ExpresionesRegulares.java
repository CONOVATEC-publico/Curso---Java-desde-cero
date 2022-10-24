package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mine_
 */
public class ExpresionesRegulares {

  public static void main(String[] args) {
    /*Pattern p = Pattern.compile("^[A-Z]+[-][A-Z]+[\\s][0-9]{4}+$");
    Matcher m = p.matcher("AGOSTO-DICIEMBRE 2022");*/
    
    String expresion = "^[A-Z]{4,10}[\\s][0-9]{4}[-][A-Z]{4,10}[\\s][0-9]{4}$";
    Pattern p = Pattern.compile(expresion);
    //Matcher m = p.matcher("AGOSTO-DICIEMBRE 2022");
    Matcher m = p.matcher("SEPTIEMBRE 2020-ENERO 2021");
    
    if (m.find()) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }
  
}
