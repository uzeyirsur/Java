package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g., 2013): ");
		int year = input.nextInt();
		System.out.print("Enter month (1-12): ");
		int m = input.nextInt();
		System.out.print("Enter the day of the month (1-31) :");
		int q = input.nextInt(); // The day of month (1-31)
		int j = year / 100; // century
		int k = year % 100; // year of the century
		if (m == 1) {
			m = 13;
		} else if (m == 2) {
			m = 14;
		}
		int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		switch (h) {
		case 0:
			System.out.println("Day of week is Saturday ");
			break;
		case 1:
			System.out.println("Day of week is Sunday");
			break;
		case 2:
			System.out.println("Day of week is  Monday");
			break;
		case 3:
			System.out.println("Day of week is Tuesday");
			break;
		case 4:
			System.out.println("Day of week is Wednesday");
			break;
		case 5:
			System.out.println("Day of week is Thursday");
			break;
		case 6:
			System.out.println("Day of week is Friday");
			break;

		}
	}
}
