package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int convert = input.nextInt();
		

		switch (convert) {
		case 0:
			System.out.println("Enter the dollar amount: ");
			double amount = input.nextDouble();
			System.out.println("$" + amount + " is " + (int)((amount * exchangeRate) * 100) / 100. + " yuan");
			break;
		case 1:
			System.out.println("Enter the RMB amount: ");
			 amount = input.nextDouble();
			System.out.println(amount + " yuan is " +  (int)((amount / exchangeRate) * 100) / 100. + " dollars");
		}
	}
}
