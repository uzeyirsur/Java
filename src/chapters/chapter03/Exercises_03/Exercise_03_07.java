package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount (e.g 11,56): ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		int numberOfPennies = remainingAmount;
		System.out.println("Your amount " + amount + " consist of");
		if (numberOfDollars <= 1) {
			System.out.println(numberOfDollars + " dollar");
		} else {
			System.out.println(numberOfDollars + " dollars");
		}
		if (numberOfQuarters <= 1) {
			System.out.println(numberOfQuarters + " quarter");
		} else {
			System.out.println(numberOfQuarters + " quarters");
		}
		if (numberOfDimes <= 1) {
			System.out.println(numberOfDimes + " dime");
		} else {
			System.out.println(numberOfDimes + " dimes");
		}
		if (numberOfNickels <= 1) {
			System.out.println(numberOfNickels + " nickel");
		} else {
			System.out.println(numberOfNickels + " nickels");
		}

		if (numberOfPennies <= 1) {
			System.out.println(numberOfPennies + " penny");
		} else {
			System.out.println(numberOfPennies + " pennies");
		}

	}
}
