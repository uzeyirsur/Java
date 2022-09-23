package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter the number of years: ");
		double years = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		double totalPayment = monthlyPayment * years * 12;

		System.out.println("Monthly payment: " + monthlyPayment);
		System.out.println("TotalPayment: " + totalPayment);
		double interest = 0;
		double principal = 0;
		double balance = loanAmount;
		System.out.println("Payment\t\tInterest\t\tPrincipal\t\tBalance");
		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-16d %-24.2f %-16.2f %12.2f\n", i, interest, principal, balance);

		}

	}
}
