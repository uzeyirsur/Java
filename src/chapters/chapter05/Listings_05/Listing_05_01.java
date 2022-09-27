package chapters.chapter05.Listings_05;

import java.util.Scanner;

public class Listing_05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		System.out.println("What is " + number1 + " + " + number2 + " ?");
		int answer = input.nextInt();
		while (number1 + number2 != answer) {
			System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ?");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}

}
