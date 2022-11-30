
package chapters.chapter06.Exercises_06;

public class Exercise_06_02 {
    public static int sumDigits(long n) {
long sum = 0;
        while (n != 0) {
            long digit = n % 10;
            n /= 10;
            sum += digit;
        }
        return (int) (sum);
    }

}
