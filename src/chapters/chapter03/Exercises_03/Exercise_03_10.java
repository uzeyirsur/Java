
package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_10 {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 90 + 10);
		int number2 = (int) (Math.random() * 90 + 10);

		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.println("What is the " + number1 + " - " + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if (answer == number1 - number2) {
			System.out.println("You are correct!");
		} else {
			System.out.println("Your answer is wrong!");
		}

	}
}
