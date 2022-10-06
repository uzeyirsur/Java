package chapters.chapter06.Exercises_06;

import java.util.Scanner;

public class Exercise_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {
        String sForZero = "";
        String numberS = "" + number;
        if (numberS.length() >= width) {
            return numberS;
        } else {
            for (int i = 0; i < width - numberS.length(); i++) {
                sForZero += "0";
            }
        }
        return sForZero + numberS;
    }
}
