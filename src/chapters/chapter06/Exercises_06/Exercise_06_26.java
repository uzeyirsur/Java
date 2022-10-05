package chapters.chapter06.Exercises_06;

public class Exercise_06_26 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (count <= 100) {
            if (isPalindrom(i) && isPrime(i)) {
                System.out.print(i);
                count++;
                System.out.print(count % 10 == 0 ? "\n" : " ");

            }
            i++;
        }

    }


    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrom(int number) {
        String s = "" + number;
        String convertS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            convertS += s.charAt(i);
        }
        return s.equals(convertS);
    }
}
