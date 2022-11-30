
package chapters.chapter06.Exercises_06;

public class Exercise_06_28 {
    public static void main(String[] args) {
        System.out.printf("%-15s %s\n", "p", "2^p-1");
        System.out.println("--------------------------");
        for (int p = 2; p <= 31; p++) {
            if (Exercise_06_26.isPrime(p) && Exercise_06_26.isPrime((int) (Math.pow(2, p) - 1))) {
                System.out.printf("%-15d %d\n", p, (int) Math.pow(2, p) - 1);
            }
        }


    }

}
