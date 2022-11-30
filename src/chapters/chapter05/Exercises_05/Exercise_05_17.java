
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 1-15: ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= i; j--) {
				System.out.print("  ");

			}
			for (int k = i; k > 0; k--) {
				System.out.print(k + " ");
			}
			if (i == 1) {
				System.out.println();
			} else {
				for (int l = 2; l < i + 1; l++) {
					System.out.print(l + " ");
				}
			}

			if (i != 1) {
				System.out.println();
			}
		}

	}

}
