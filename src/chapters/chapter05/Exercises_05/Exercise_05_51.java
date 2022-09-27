package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string : ");
		String s2 = input.nextLine();
		int length1 = s1.length();
		int length2 = s2.length();
		int length = Math.min(length1, length2);
		
		for (int i = 0; i < length; i++) {
			String pre1 = s1.substring(i, i + 1);
			String pre2 = s2.substring(i, i + 1);
			if (pre1.equals(pre2)) {
				System.out.print(pre1);
			} else {
				break;
			}
		}

	}
}
