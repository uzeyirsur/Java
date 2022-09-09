package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		int years = minutes / 525_600;
		int days = (minutes % 525_600) / 1440;
		System.out.println(minutes + " minutes is approximately " + years + " years" + " and " + days + " days");

	}

}
