package chapters.chapter06.Exercises_06;

public class Exercise_06_14 {
    public static void main(String[] args) {
        System.out.printf("%-12s %s\n", "i", "m(i)");
        for (double i = 1; i <= 901; i += 100) {
            System.out.printf("%-12.0f %1.4f\n", i, getM(i));
        }
    }

    public static double getM(double n) {
        double m = 0;
        for (double i = 1; i <= n; i++) {
            m += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return m;
    }
}
