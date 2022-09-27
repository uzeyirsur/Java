package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount :");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate:");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter the number of month: ");
		double numberOfMonth = input.nextDouble();
		double monthlyInterestRate = (annualInterestRate / 100) / 12;
		double sum = 1;
		for (int i = 0; i < numberOfMonth; i++) {
			if (i == 0) {
				sum = amount * (1 + monthlyInterestRate);
			} else
				sum = (amount + sum) * (1 + monthlyInterestRate);

		}
		System.out.println(sum);
	}
}
