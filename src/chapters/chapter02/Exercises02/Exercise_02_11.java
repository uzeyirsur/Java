
package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of year to calculate the population: ");
		double years = input.nextInt();

		double birth = (((24 * 120) * 365) / 7) * years;

		double death = (((24 * 120) * 365) / 13) * years;

		double newImmigrant = (((24 * 120) * 365) / 45) * years;

		double population = (birth + newImmigrant - death) + 312032486;
		System.out.println("After " + years + " years population will be " + (int) (population));

	}

}
