package chapters.chapter05.Exercises_05;
import java.util.Scanner;
public class Exercise_05_32 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int lotteryDigit1 = (int) (1 +  Math.random() * 9);
	int lotteryDigit2 = 1;
	do {
		lotteryDigit2 = (int) (1 + Math.random() * 9);
		
	}while (lotteryDigit1 == lotteryDigit2) ;
		
	System.out.println("Enter your two digit guess: ");
	int guess = input.nextInt();
	
	int guessDigit1 = guess / 10;
	int guessDigit2 = guess % 10;
	System.out.println("The lottery number is " + lotteryDigit1 + "" + lotteryDigit2);
	if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2) {
		System.out.println("Exact Match: You win 10.000$");
	}else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
		System.out.println("Match all digits: You win 3.000$ ");
	}else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 ||
			lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit1) {
		System.out.println("Match one: You win 1.000$");
	}else {
		System.out.println("No match!");
	}
	
}
}
