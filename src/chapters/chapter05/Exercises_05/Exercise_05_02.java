
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		int numberOfCorrect = 0;
		for (int i = 0; i < 10; i++) {
			int a = (int) (1 + Math.random() * 15);
			int b = (int) (1 + Math.random() * 15);
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			System.out.println(a + " - " + b + " = ? ");
			int answer = input.nextInt();
			if (answer == a - b) {
				System.out.println("Correct!");
				numberOfCorrect++;
			} else {
				System.out.println("Your answer is wrong !");
			}

		}
		System.out.println("You have " + numberOfCorrect + " correct answers");
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime) / 1000;
		System.out.println("Test time is " + totalTime + " seconds");
	}
}
