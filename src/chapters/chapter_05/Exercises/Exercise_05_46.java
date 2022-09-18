package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		int length = s.length();
		int i = 0;
		int a = 0;
		while (i < length) {
			a = i;
			char first = s.charAt(a);
			char last = s.charAt(length - 1);
			first = last;
			System.out.print(first);
			length--;
			a++;
		}

	}

}
