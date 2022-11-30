package chapters.chapter12.Exercises12.Exercise30;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename:");

        File file = new File(keyboard.next());
        if (!file.exists()) {
            System.out.println("File does not exists");
            System.exit(1);
        }
        int[] numberOfLetters = new int[26];
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                s = s.toUpperCase();
                getNumberOfLetters(s, numberOfLetters);
            }
        }

        displayNumberOfLetters(numberOfLetters);
    }


    public static void getNumberOfLetters(String s, int[] numberOfLetters) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 'A'; j <= 'Z'; j++) {
                if (s.charAt(i) == j) {
                    numberOfLetters[j - 65]++;
                    break;
                }
            }
        }
    }

    private static void displayNumberOfLetters(int[] numberOfLetters) {
        for (int i = 0; i < numberOfLetters.length; i++) {
            char letter = (char) (65 + i);
            System.out.println("Number of " + letter + "'s:" + numberOfLetters[i]);
        }
    }
}
