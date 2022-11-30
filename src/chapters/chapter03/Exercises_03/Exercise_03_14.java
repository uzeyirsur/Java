
package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the flip of coin ( 0 represents head and 1 represents tail: ");
		int guess = input.nextInt();
		int coin = (int) (Math.random() * 2);

		if (guess == coin) {
			System.out.println("Your guess is correct");
		} else {
			System.out.println("Your guess is incorrect");

		}
	}
}
