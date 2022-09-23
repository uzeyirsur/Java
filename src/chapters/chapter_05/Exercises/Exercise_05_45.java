package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten ages: ");
		double sum = 0;
		double sum2 = 0;

		double i = 0;
		for (i = 0; i < 10; i++) {
			double ages = input.nextDouble();
			sum += ages;
			sum2 += Math.pow(ages, 2);

		}
		double sum3 = Math.pow(sum, 2) / i;
		double deviation = Math.sqrt((sum2 - sum3) / (i - 1));
		double mean = sum / i;
		System.out.println("The mean is " + mean);
		System.out.println("The standart deviation is " + deviation);
	}
}
