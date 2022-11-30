
package chapters.chapter04.Exercises_04;

import java.util.Scanner;

public class Exercise_04_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 - 15):  ");
		int value = input.nextInt();
		if (0 <= value && value <= 9) {
			System.out.println("The hex value is " + value);
		} else if (value <= 15) {
			System.out.println("The hex value is " + (char) (value + 55));
		} else if (value < 0 && value > 15) {
			System.out.println(value + " is a invalid input. ");
		}

	}
}
