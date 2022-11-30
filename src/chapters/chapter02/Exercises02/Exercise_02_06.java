
package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000 : ");
		int number = input.nextInt();

		int digit1000 = number / 1000;
		int digit100 = number / 100;
		int digit10 = (number / 10) % 10;
		int digit1 = number % 10;
		System.out.println("The sum of the digits is " + (digit1000 + digit100 + digit10 + digit1));

	}
}
