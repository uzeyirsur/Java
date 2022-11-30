
package chapters.chapter10.CheckPoints10;

public class CheckPoint08 {
    public static void main(String[] args) {
        Integer i = new Integer("23");
        Integer i2 = new Integer(23);
        Integer i3 = Integer.valueOf("23");
       Integer i4 = Integer.parseInt("23",8);
       //Double d = new Double(); false because the wrapper classes do not have no-arg constructors.
        Double d = Double.valueOf("23.45");
        int i5 = (Integer.valueOf("23")).intValue();
        double d2 =(Double.valueOf(23.4)).doubleValue();
        int i6 =(Double.valueOf(23.4)).intValue();
        String s = (Double.valueOf("23.4")).toString();

    }
}
