package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();

		System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		double leftSide1 = x1 - (width1 / 2);
		double rightSide1 = x1 + (width1 / 2);
		double bottomSide1 = y1 - (height1 / 2);
		double topSide1 = y1 + (height1 / 2);

		double leftSide2 = x2 - (width2 / 2);
		double rightSide2 = x2 + (width2 / 2);
		double bottomSide2 = y2 - (height2 / 2);
		double topSide2 = y2 + (height2 / 2);
		if (leftSide2 >= leftSide1 && leftSide2 < rightSide1 && rightSide2 > leftSide1 && rightSide2 <= rightSide1
				&& topSide2 <= topSide1 && topSide2 > bottomSide1 && bottomSide2 >= bottomSide1
				&& bottomSide2 < topSide1) {
			System.out.println("r2 is inside r1");
		} else if (leftSide1 >= leftSide2 && leftSide1 < rightSide2 && rightSide1 > leftSide2
				&& rightSide1 <= rightSide2 && topSide1 <= topSide2 && topSide1 > bottomSide2
				&& bottomSide1 >= bottomSide2 && bottomSide1 < topSide2) {
			System.out.println("r1 is inside s2");
		} else if (leftSide2 > rightSide1 || bottomSide2 > topSide1 || rightSide2 < leftSide1
				|| topSide2 < bottomSide1) {
			System.out.println("r2 is outside of r1");
		} else {
			System.out.println("r2 overlaps r1");
		}

	}
}
