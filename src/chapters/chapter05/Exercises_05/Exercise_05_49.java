package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();
		s = s.toLowerCase();
		int length = s.length();
		char letter = ' ';
		int counterWowel = 0;
		int counterCons = 0;
		for (int i = 0; i < length; i++) {
			letter = s.charAt(i);

			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				counterWowel++;
			} else if (letter == ' ') {

			} else {
				counterCons++;
			}

		}
		System.out.println("The number of vowels is " + counterWowel);
		System.out.println("The number of consonants is " + counterCons);
	}
}
