package chapters.chapter02.MyExercises;

import java.util.Scanner;

public class CountingMonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount (for Ex : 11,56) : ");
		double amount = input.nextDouble();
		int remainingAmount = (int) (amount * 100);
		int numberOfOneDollars = remainingAmount / 100;

		remainingAmount = remainingAmount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes =remainingAmount / 10 ;
		remainingAmount %= 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		int numberOfPennies = remainingAmount / 1;
		
		System.out.println("Your amount " + amount + " consist of :");
		System.out.println(numberOfOneDollars + " dollars");
		System.out.println(numberOfQuarters + " quarters");
		System.out.println(numberOfDimes + " dimes");
		System.out.println(numberOfNickels + " nickels");
		System.out.println(numberOfPennies + " pennies");
		
	}
}
