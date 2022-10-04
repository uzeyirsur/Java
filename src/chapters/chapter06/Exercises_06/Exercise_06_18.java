package chapters.chapter06.Exercises_06;

import java.util.Scanner;

import static java.lang.Character.isLetterOrDigit;

public class Exercise_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your passward: ");
        String password = input.nextLine();
        if (isEightCharacter(password) && isOnlyLettersAndDigits(password) && isAtLeastTwoDigits(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isEightCharacter(String password) {
        return password.length() >= 8;

    }

    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isAtLeastTwoDigits(String password) {
        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countDigits++;

            }
        }
        return countDigits >= 2;


    }
}
