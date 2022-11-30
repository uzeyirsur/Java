
package chapters.chapter12.CheckPoints12;

public class CheckPoint22 {
    public static void main(String[] args) {
        System.out.println(isNumeric("123"));
    }

/*
  public static boolean isNumeric(String token){
        try{
            Double.parseDouble(token);
            return true;
        }catch(java.lang.NumberFormatException ex){
            return false;
        }
    }
 */

    // is better replaced by
    public static boolean isNumeric(String token){
        for (int i = 0; i < token.length(); i++) {
            if(token.charAt(i) >'9' || token.charAt(i)<'0'){
                return false;
            }
        }
        return true;
    }
}
