
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countPc = 0;
		int countUser = 0;
		while (Math.sqrt(Math.pow(countPc - countUser, 2)) != 2) {
			int pc = (int) (Math.random() * 3);
			System.out.println("Enter 0 for scissor, 1 for rock, 2 for paper: ");
			int user = input.nextInt();
			if (pc == 0) {
				System.out.print("Pc is scissor, ");
			} else if (pc == 1) {
				System.out.print("Pc is rock, ");
			} else if (pc == 2) {
				System.out.print("Pc is paper, ");
			}
			if (user == 0) {
				System.out.print("you are scissor. ");
			} else if (user == 1) {
				System.out.print("you are rock. ");
			} else if (user == 2) {
				System.out.print("you are paper. ");
			}

			if (pc == user) {
				System.out.println("It is draw!");
				System.out.println("You " + countUser + " \nPc " + countPc + "\n");
			} else if (pc == 0 && user == 1 || pc == 1 && user == 2 || pc == 2 && user == 0) {

				System.out.println("You win");
				countUser++;
				System.out.println("You: " + countUser + "\nPc: " + countPc + "\n");

			} else if (pc == 0 && user == 2 || pc == 1 && user == 0 || pc == 2 && user == 1) {
				System.out.println("You lost");
				countPc++;
				System.out.println("You: " + countUser + "\nPc " + countPc + "\n");
			}

		}
		if (countUser > countPc) {
			System.out.println("\nGame ends. YOU WIN");
		} else if (countUser < countPc) {
			System.out.println("\nGame ends. YOU LOST");
		}
	}
}
