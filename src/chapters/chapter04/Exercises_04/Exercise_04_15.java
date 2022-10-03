package chapters.chapter04.Exercises_04;

import java.util.Scanner;

public class Exercise_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter :");
        String letter = input.nextLine();
        if(letter.length() > 1){
            System.out.println("invalid input");
            System.exit(0);
        }
        char ch = letter.toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'b' || ch == 'c') {
            System.out.println("The corresponding number is " + 2);
        } else if (ch == 'd' || ch == 'e' || ch == 'f') {
            System.out.println("The corresponding number is " + 3);
        } else if (ch == 'g' || ch == 'h' || ch == 'i') {
            System.out.println("The corresponding number is " + 4);
        } else if (ch == 'j' || ch == 'k' || ch == 'l') {
            System.out.println("The corresponding number is " + 5);
        } else if (ch == 'm' || ch == 'n' || ch == 'o') {
            System.out.println("The corresponding number is " + 6);
        } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
            System.out.println("The corresponding number is " + 7);
        } else if (ch == 't' || ch == 'u' || ch == 'v') {
            System.out.println("The corresponding number is " + 8);
        } else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
            System.out.println("The corresponding number is " + 9);
        } else {
            System.out.println("invalid input!");
        }

    }
}

