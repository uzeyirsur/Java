package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digit of ISBN-10");
		int number = input.nextInt();
		int digit = 0;
		int sum = 0;
		int fac = 1;
		for (int i = 100000000; i >= 10; i /= 10) {
			digit = (number / i) % 10;
			sum += digit * fac;
			fac++;
			if (fac == 9) {
				sum += (number % 10) * fac;
			}
		}
		if (sum % 11 == 10) {
			System.out.println(number + "" + "X");
		} else {
			System.out.println(number + "" + (sum % 11));
		}

	}
}
