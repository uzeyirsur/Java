
package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		double currentAmount = savingAmount * (1 + 0.00417);

		currentAmount = (savingAmount + currentAmount) * (1 + 0.00417);
		currentAmount = (savingAmount + currentAmount) * (1 + 0.00417);
		currentAmount = (savingAmount + currentAmount) * (1 + 0.00417);
		currentAmount = (savingAmount + currentAmount) * (1 + 0.00417);
		currentAmount = (savingAmount + currentAmount) * (1 + 0.00417);
		System.out.println("After the sixth month , the account value is $" + currentAmount);

	}
}
