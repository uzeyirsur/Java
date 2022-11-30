
package chapters.chapter04.Exercises_04;

import java.util.Scanner;

public class Exercise_04_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year :");
		int year = input.nextInt();
		System.out.print("Enter a month : ");
		String month = input.next();
		month = month.toLowerCase();

		switch (month) {
		case "jan":
			System.out.println("Jan " + year + " has 31 days");
			break;
		case "mar":
			System.out.println("Mar " + year + " has 31 days");
			break;
		case "apr":
			System.out.println("Apr " + year + " has 30 days");
			break;
		case "may":
			System.out.println("May " + year + " has 31 days");
			break;
		case "jun":
			System.out.println("Jun " + year + " has 30 days");
			break;
		case "jul":
			System.out.println("Jul " + year + " has 31 days");
			break;
		case "aug":
			System.out.println("Aug " + year + " has 31 days");
			break;
		case "sep":
			System.out.println("Sep " + year + " has 30 days");
			break;
		case "oct":
			System.out.println("Oct " + year + " has 31 days");
			break;
		case "nov":
			System.out.println("Nov " + year + " has 30 days");
			break;
		case "dec":
			System.out.println("Dec " + year + " has 31 days");
			break;
		case "feb":
			if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
				System.out.println("Feb " + year + " has 29 days");
			} else
				System.out.println("Feb " + year + " has 28 days");
			break;
		default:
			System.out.println("invalid input!");
		}

	}
}
