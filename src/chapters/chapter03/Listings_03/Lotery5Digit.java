package chapters.chapter03.Listings_03;
import java.util.Scanner;
public class Lotery5Digit {
public static void main(String[] args) {
	int lottery = (int)(Math.random() * 900 +100);
	System.out.println(lottery);
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a five digits number : ");
	int guess = input.nextInt();
	
	int lotteryDigit1 = lottery / 100;
	int lotteryDigit2 = (lottery % 100) / 10;
	int lotteryDigit3 = lottery % 10;
	
	int guessDigit1 = guess / 100;
	int guessDigit2 = (guess %100) / 10;
	int guessDigit3 = guess % 10;
	
	if (guess == lottery) {
		System.out.println("10.000$");
	}else if ((lotteryDigit1 = guessDigit2) || (lotteryDigit1 = guessDigit3)&& lottertDigit2 =guessDigit1 ) {
		
	}
}
}
