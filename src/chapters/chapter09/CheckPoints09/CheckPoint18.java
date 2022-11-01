package chapters.chapter09.CheckPoints09;

public class CheckPoint18 {
    int count;

    public static void main(String[] args) {

    }

    public int getCount() {
        return count;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}
