
package chapters.chapter05.Exercises_05;

public class Exercise_05_26 {
    public static void main(String[] args) {
        double e = 1;

        for (double i = 1; i < 10001; i++) {
            double d = i;
            for (double j = i - 1; j >= 1; j--) {
                d *= j;
                e += 1 / d;
            }

        }
        System.out.println(e);
        for (double i = 1; i < 20001; i++) {
            double d = i;
            for (double j = i - 1; j >= 1; j--) {
                d *= j;
                e += 1 / d;
            }
        }
        System.out.println(e);

        for (double i = 1; i < 100001; i++) {
            double d = i;
            for (double j = i - 1; j >= 1; j--) {
                d *= j;
                e += 1 / d;
            }

        }
        System.out.println(e);

    }
}
