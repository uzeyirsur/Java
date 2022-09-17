package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the day (between 1 - 7, e.g 2 for Tuesday):  ");
		int day = input.nextInt();

		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
		int numberOftotalDay = 0;
		for (int i = 1; i < 13; i++) {

		}

	}
}