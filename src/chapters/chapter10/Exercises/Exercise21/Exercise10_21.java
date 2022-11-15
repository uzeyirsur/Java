package chapters.chapter10.Exercises.Exercise21;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);

        BigInteger FIVE = new BigInteger("5");
        BigInteger SIX = new BigInteger("6");
        int count = 0;

        while(count < 10){
            if(number.remainder(FIVE).equals(BigInteger.ZERO) || number.remainder(SIX).equals(BigInteger.ZERO)){
                System.out.println(number);
                count++;
            }
           number = number.add(BigInteger.ONE);
        }
    }

}
