package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_16 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer:");
			int number = input.nextInt();
			int fac = 2;
			while (number != 0) {
				if (number % fac != 0) {
					fac++;
					if (number % fac == 0) {
						number = number / fac;
						System.out.print(fac + ",");
					}
				} else {
					number = number / fac;
					System.out.print(fac + ",");
				}

			}
		}
	}
}