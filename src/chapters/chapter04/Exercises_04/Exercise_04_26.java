
package chapters.chapter04.Exercises_04;

import java.util.Scanner;

public class Exercise_04_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a amount: ");
		String amount = input.nextLine();
		int k = amount.indexOf(',');
		String numberOfOneDollars = amount.substring(0, k);

		String cents = amount.substring(k + 1);

		int remainingCents = Integer.parseInt(cents);

		int numberOfQuarters = remainingCents / 25;
		remainingCents %= 25;

		int numberOfDimes = remainingCents / 10;
		remainingCents %= 10;

		int numberOfNickels = remainingCents / 5;
		remainingCents %= 5;

		int numberOfPennies = remainingCents;

		System.out.println("Your amount " + amount + " consist of");
		System.out.println(numberOfOneDollars + " dollars");
		System.out.println(numberOfQuarters + " quarters");
		System.out.println(numberOfDimes + " dimes");
		System.out.println(numberOfNickels + " nickels");
		System.out.println(numberOfPennies + " pennies");

	}
}
