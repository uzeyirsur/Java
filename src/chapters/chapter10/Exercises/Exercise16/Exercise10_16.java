package chapters.chapter10.Exercises.Exercise16;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger remainder2 = new BigInteger("2");
        BigInteger remainder3 = new BigInteger("3");
        int count = 0;
        while (count < 10) {
            if (a.remainder(remainder2) == BigInteger.ZERO) {
                System.out.println(a);
                count++;

            } else if (a.remainder(remainder3) == BigInteger.ZERO) {
                System.out.println(a);
                count++;

            }
            a = a.add(BigInteger.ONE);
        }

    }
}
