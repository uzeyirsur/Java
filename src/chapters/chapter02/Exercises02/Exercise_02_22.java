package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_22 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount (e.g., 1156): ");
		int amount = input.nextInt();
		int numberOfDollars = amount / 100;

		int remainingCents = amount % 100;

		int numberOfQuarters = remainingCents / 25;
		remainingCents %= 25;

		int numberOfDimes = remainingCents / 10;
		remainingCents %= 10;

		int numberOfNickels = remainingCents / 5;
		remainingCents %= 5;

		int numberOfPennies = remainingCents / 1;

		System.out.println(amount + " cents contains :");
		System.out.println(numberOfDollars + " one dollars");
		System.out.println(numberOfQuarters + " quarters");
		System.out.println(numberOfDimes + " dimes");
		System.out.println(numberOfNickels + " nickels");
		System.out.println(numberOfPennies + " pennies");
		
		
		
		
	}
}
