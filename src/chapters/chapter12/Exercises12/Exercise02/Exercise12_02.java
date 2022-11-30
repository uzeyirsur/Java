
package chapters.chapter12.Exercises12.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter two integers:");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid Input!: an integer is required");
                input.nextLine();

            }
        } while (continueInput);


    }
}
