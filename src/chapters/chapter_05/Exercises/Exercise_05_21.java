package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount :");
		double loanAmount = input.nextDouble();
		System.out.print("Enter the number of years: ");
		double years = input.nextDouble();
		double annualInterestRate = 5;
		double monthlyInterestRate = 0;
		double monthlyPayment = 0;
		double totalPayment = 0;
		System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
		for (int i = 0; i < years; i++) {
			if (i != 0) {
				annualInterestRate += 0.125;

			} else {
				annualInterestRate = 5;
			}
			System.out.printf("%-25.3f", annualInterestRate);
			monthlyInterestRate = annualInterestRate / 1200;
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
			totalPayment = monthlyPayment * years * 12;
			System.out.printf("%-25.3f", monthlyPayment);
			System.out.printf("%3.3f\n", totalPayment);
		}
	}
}
