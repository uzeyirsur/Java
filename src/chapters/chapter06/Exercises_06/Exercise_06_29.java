
package chapters.chapter06.Exercises_06;

public class Exercise_06_29 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (Exercise_06_26.isPrime(i) && Exercise_06_26.isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2 + ")"));
            }

        }
    }
}
