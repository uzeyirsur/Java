package chapters.chapter10.Exercises10.Exercise19;

import chapters.chapter10.Exercises10.Exercise18.Exercise10_18;

import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {

        System.out.println("p\t\t\t2^p - 1");
        BigInteger TWO = BigInteger.valueOf(2L);

        for (int p = 2; p <= 100; p++) {
            BigInteger mersennePrime = TWO.pow(p).subtract(BigInteger.ONE);

            if (isPrime(p) && Exercise10_18.isPrime(mersennePrime)) {
                System.out.println(p + "\t\t\t" + mersennePrime);
            }

        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
