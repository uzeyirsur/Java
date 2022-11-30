
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int decimalValue = input.nextInt();
		int remainder = 0;
		String octal = "";
		while (decimalValue > 8) {
			remainder = decimalValue % 8;
			decimalValue /= 8;
			octal += remainder;
		}
		octal += decimalValue;
		int length = octal.length();
		int i = length - 1;
		while (i >= 0) {
			System.out.print(octal.charAt(i));
			i--;
		}

	}
}
