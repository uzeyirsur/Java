
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_16 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer:");
			int number = input.nextInt();
			int fac = 2;
			while (number != 1) {
				if (number % fac != 0) {
					fac++;
				} else if (number % fac == 0) {
					number = number / fac;
					
					if (number != 1) {
					System.out.print(fac + ",");
					}else {
						System.out.println(fac + ".");
					}
				}

			}

		}
	}
}
