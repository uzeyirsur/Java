package chapters.chapter13.Exercises13.Exercise18;


import chapters.chapter13.Exercises13.Exercise15.Rational;

import java.math.BigInteger;

public class Exercise13_18 {
    public static void main(String[] args) {


        Rational sum = new Rational(new BigInteger("1"),new BigInteger("2"));

        for (int i = 2; i < 99; i++) {
           String n = i +"";
           String d = (i + 1) +"";
            Rational num = new Rational(new BigInteger(n),new BigInteger(d));
           sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
