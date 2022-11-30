
package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F : ");
		double tA = input.nextInt();
		System.out.println("Enter the wind speed (>=2) in miles per hour :");
		double v = input.nextInt();
		double tWC = 35.74 + (0.621 * tA) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * tA * Math.pow(v, 0.16));

		if (tA < -58 || tA > 41 && v < 2) {
			System.out.println("Invalid temperature and wind value!");
		} else if (tA < -58 || tA > 41) {
			System.out.println("Invalid temperature value!");
		} else if (v < 2) {
			System.out.println("Invalid wind value!");
		} else {
			System.out.println("The wind chill index is " + tWC);
		}

	}
}
