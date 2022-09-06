package chapters.chapter04.Exercises_04;

import java.util.Scanner;

public class Exercise_04_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double n = input.nextDouble();
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		System.out.println("The are of the polygon is " + area);

	}
}
