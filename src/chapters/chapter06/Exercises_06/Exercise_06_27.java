
package chapters.chapter06.Exercises_06;

public class Exercise_06_27 {
    public static void main(String[] args) {
        int countEmirp = 0;
        int i = 2;
        while (countEmirp != 100) {
            if (Exercise_06_26.isPrime(i) && !Exercise_06_26.isPalindrom(i) && Exercise_06_26.isPrime(reverseOfTheNumber(i))) {
                countEmirp++;
                System.out.print(i);
                System.out.print(countEmirp % 10 == 0 ? "\n" : " ");

            }
            i++;
        }
    }

    public static int reverseOfTheNumber(int number) {
        String s = "" + number;
        String convertS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            convertS += s.charAt(i);
        }
        return Integer.parseInt(convertS);
    }
}
