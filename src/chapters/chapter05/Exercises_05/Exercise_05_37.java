package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimalValue = input.nextInt();
		int remainder = 0;
		String binary = "";
		while (decimalValue != 0) {
			remainder = decimalValue % 2;
			decimalValue /= 2;
			binary += remainder;
		}
		int length = binary.length();
		int i = length - 1;
		while (i >= 0) {
			System.out.print(binary.charAt(i));
			i--;
		}
	}
}
