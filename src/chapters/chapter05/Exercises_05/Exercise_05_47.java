
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string : ");
		String s = input.nextLine();
		int digit = 0;
		String s1 = "";
		for (int i = 0; i < 12; i++) {
			char ch = s.charAt(i);
			s1 = "" + ch;
			digit = Integer.parseInt(s1);
			digit += digit;

		}
		int sum = digit % 10;
		System.out.println(s + sum);
	}

}
