package chapters.chapter10.Exercises10.Exercise20;
//BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);

import java.math.BigDecimal;

public class Exercise10_20 {
    public static void main(String[] args) {
        System.out.println(String.valueOf(10));
        for (int i = 1; i <= 10; i++) {
            displayE(i * 100);
        }
    }

    private static void displayE(int limit) {
        BigDecimal d = new BigDecimal("1");
        BigDecimal e = new BigDecimal("1");

        for (int i = 0; i < limit; i++) {
            for (int j = i - 1; j >= 1; j--) {
                BigDecimal j1 = new BigDecimal(j + "");
                d = d.multiply(j1);
                e = e.add(BigDecimal.ONE.divide(d, 25, BigDecimal.ROUND_UP));
            }
        }
        System.out.println(e);
    }


}
