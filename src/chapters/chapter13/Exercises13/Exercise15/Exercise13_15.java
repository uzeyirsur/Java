package chapters.chapter13.Exercises13.Exercise15;

import java.math.BigInteger;

public class Exercise13_15 {
    public static void main(String[] args) {
        Rational num1 = new Rational(new BigInteger("23232"),new BigInteger("9999993499999"));
        Rational num2 = new Rational(new BigInteger("32"),new BigInteger("131231299995"));
        System.out.println(num1.multiply(num2));
    }
}
