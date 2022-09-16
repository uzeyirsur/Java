package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int numOfStudents = input.nextInt();

		int score = 0;
		int i = 0;
		String name = "";
		while (i != numOfStudents) {
			System.out.println("Enter the name of the student: ");
			String name1 = input.next();
			System.out.println("Enter the score of the student: ");
			int score1 = input.nextInt();
			i++;
			if (score1 > score) {
				score = score1;
				name = name1;
			}
		}
		System.out.println(name);
		System.out.println(score);
	}
}
