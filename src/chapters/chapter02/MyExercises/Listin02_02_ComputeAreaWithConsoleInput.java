package chapters.chapter02.MyExercises;

import java.util.Scanner;

public class Listin02_02_ComputeAreaWithConsoleInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		System.out.println("The area is " + area);
	}

}