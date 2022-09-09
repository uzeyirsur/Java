package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilogram = pounds / 1000 * 454.;

		System.out.println(pounds + " pounds is " + kilogram + " kilogram");

	}
}
