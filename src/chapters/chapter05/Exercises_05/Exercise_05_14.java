package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int d = Math.min(n1, n2);
		int gcd = 0;
		while (d > 1) {
			if (n1 % d == 0 && n2 % d == 0) {
				gcd = d;
				break;
			} else {
				d--;
			}

		}
		if (gcd == 0) {
			System.out.println("There is no gcd of theese two integers");
		} else {
			System.out.println(gcd);
		}
	}
}
