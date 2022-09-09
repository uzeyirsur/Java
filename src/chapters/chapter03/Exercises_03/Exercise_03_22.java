package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x :");
		double x2 = input.nextDouble();
		System.out.println("Enter y: ");
		double y2 = input.nextDouble();

		double x1 = 0;
		double y1 = 0;
		double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2), 0.5);
		if (distance <= 10) {
			System.out.println("The point is in the circle");
		} else {
			System.out.println("The point is out of circle");
		}
	}
}
