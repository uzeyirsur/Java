
package chapters.chapter06.Exercises_06;

public class Exercise_06_22 {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }

    public static double sqrt(long n) {
        double nextGuess = 1.2;
        double lastGuess = 1;
        while (nextGuess - lastGuess != 0) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;


        }
        return nextGuess;
    }
}
