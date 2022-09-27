package chapters.chapter05.Listings_05;
import java.util.Scanner;
public class Listing_05_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random() * 101);
        System.out.println("Guess a magig number between 0 and 100");
       int guess = -1;
		while (number != guess) {
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
			if (guess < number) {
				System.out.println("Your guess is too low");
			}else if (guess > number) {
				System.out.println("Your guess is too high");
			}
		
		}
		System.out.println("Yes the number is " + number);
		
		
	}
}
