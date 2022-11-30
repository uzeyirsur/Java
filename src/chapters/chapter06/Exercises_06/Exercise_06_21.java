
package chapters.chapter06.Exercises_06;

import java.util.Scanner;

public class Exercise_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String phoneString = input.nextLine();
        char ch;
        for (int i = 0; i < phoneString.length(); i++) {
            ch = phoneString.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
            } else if (Character.isLetter(ch)) {
                getNumber(ch);
            } else {
                System.out.print(ch);
            }

        }
    }


    public static void getNumber(char upperCaseLetter) {
        String ch = "" + upperCaseLetter;
        ch = ch.toLowerCase();
        upperCaseLetter = ch.charAt(0);

        if (upperCaseLetter == 'a' || upperCaseLetter == 'b' || upperCaseLetter == 'c') {
            System.out.print(2);
        } else if (upperCaseLetter == 'd' || upperCaseLetter == 'e' || upperCaseLetter == 'f') {
            System.out.print(3);
        } else if (upperCaseLetter == 'g' || upperCaseLetter == 'h' || upperCaseLetter == 'i') {
            System.out.print(4);
        } else if (upperCaseLetter == 'j' || upperCaseLetter == 'k' || upperCaseLetter == 'l') {
            System.out.print(5);
        } else if (upperCaseLetter == 'm' || upperCaseLetter == 'n' || upperCaseLetter == 'o') {
            System.out.print(6);
        } else if (upperCaseLetter == 'p' || upperCaseLetter == 'q' || upperCaseLetter == 'r' || upperCaseLetter == 's') {
            System.out.print(7);
        } else if (upperCaseLetter == 't' || upperCaseLetter == 'u' || upperCaseLetter == 'v') {
            System.out.print(8);
        } else if (upperCaseLetter == 'w' || upperCaseLetter == 'x' || upperCaseLetter == 'y' || upperCaseLetter == 'z') {
            System.out.print(9);
        } else {
            System.out.println("invalid input!");
        }


    }
}
