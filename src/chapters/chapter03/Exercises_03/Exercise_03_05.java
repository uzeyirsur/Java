package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day : ");
		int numberOfToday = input.nextInt();
		System.out.print("Enter the number of days elapsed since today:");

		int numberOfElapsedDays = input.nextInt();
		int numberOffutureDay = numberOfToday + numberOfElapsedDays;

		switch (numberOffutureDay % 7) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

	}
}
