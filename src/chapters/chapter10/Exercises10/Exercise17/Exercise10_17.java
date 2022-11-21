package chapters.chapter10.Exercises10.Exercise17;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        long sqrt = (long)(Math.sqrt(Long.MAX_VALUE))+ 1;

        BigInteger n = new BigInteger(sqrt +"");

        for (int i = 0; i < 10; i++) {
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);

        }



    }
}
