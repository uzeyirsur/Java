package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of package : ");
		double weight = input.nextDouble();
		if (0 < weight && weight <= 1) {
			System.out.println("The cost is 3.5$");
		} else if (weight <= 3) {
			System.out.println("The cost is 5.5$");
		} else if (weight <= 10) {
			System.out.println("The cost is 8.5$");
		} else if (weight <= 20) {
			System.out.println("The cost is 10.5$");
		} else if (weight > 20) {
			System.out.println("The package cannot be shipped");
		}

	}
}
