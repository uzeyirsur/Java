package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter wieght in pounds : ");
		double pounds = input.nextDouble();

		System.out.print("Enter feet : ");
		double feet = input.nextDouble();

		System.out.print("Enter inches : ");
		double inches = input.nextDouble();

		inches = feet * 12 + inches;
		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;
		double bmi = kilograms / (Math.pow(meters, 2));
		System.out.println("BMI is " + (int) (bmi * 100) / 100.);

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (18.5 <= bmi && bmi < 25.0) {
			System.out.println("Normal");
		} else if (25.0 <= bmi && bmi < 30.0) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

	}
}
