package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double m = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double q = m * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + q);

	}
}
