package chapters.chapter03.Listings_03;

import java.util.Scanner;

public class Listing_03_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble();

		weight *= 0.45359237;
		height *= 0.254;

		double bmi = weight / Math.pow(height, 2) * 100;
		System.out.println("BMI is " + (int) bmi * 1000 / 1000.);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if ( bmi == 18.5 && bmi < 25.0) {
			System.out.println("Normal");

		} else if (bmi < 30.0) {
			System.out.println("Overweight");
		} else
			System.out.println("Obese");

	}

}
