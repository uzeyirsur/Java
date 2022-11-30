
package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x:");
		double x2 = input.nextDouble();
		System.out.println("Enter y:");
		double y2 = input.nextDouble();

		double width = 10;
		double height = 5;

		double horizontalDistance = x2 - 0;
		double verticalDistance = y2 - 0;
		if (horizontalDistance <= (width / 2) && verticalDistance <= (height / 2)) {
			System.out.println("Point (" + x2 + "," + y2 + ") is in the rectangle.");
		} else {
			System.out.println("Point (" + x2 + "," + y2 + ") is not in the rectangle.");
		}

	}
}
