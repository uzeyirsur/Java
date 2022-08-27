package chapters.chapter02.checkPoints02;

import java.util.Scanner;

public class CheckPoint_02_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for a: ");
		int a = input.nextInt();

		System.out.println("Enter a value for b: ");
		int b = input.nextInt();

		System.out.println("Enter a value for c: ");
		int c = input.nextInt();
		
		System.out.println("Result: " + (-b + (Math.sqrt(Math.pow(b, 2)) - (4 * a * c))) / (2 * a));

	}
}
