package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int length = s.length();
		char ch = ' ';
		int count = 0;
		for (int i = 0; i < length; i++) {
			ch = s.charAt(i);
			if (65 <= ch && ch <= 90) {
				count++;
			}
		}
System.out.println("The number of uppercase letters is " + count );
	}

}
