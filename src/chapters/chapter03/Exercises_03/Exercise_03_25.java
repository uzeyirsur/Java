package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for x1 and y1: ");
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		System.out.println("Enter a value for x2 and y2: ");
		double x2 = input.nextInt();
		double y2 = input.nextInt();
		System.out.println("Enter a value for x3 and y3: ");
		double x3 = input.nextInt();
		double y3 = input.nextInt();
		System.out.println("Enter a value for x4 and y4: ");
		double x4 = input.nextInt();
		double y4 = input.nextInt();

		double x;
		double y;

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);

		if (a * d - b * c == 0) {
			System.out.println("The two lines are parralel");
			System.exit(1);
		} else {
			System.out.println("The intersecting point is at (" + x + " , " + y + ")");
		}

	}
}
