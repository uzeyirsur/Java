package chapters.chapter03.Exercises_03;
import java.util.Scanner;
public class Exercise_03_15 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int lottery =(int)( Math.random() * 900 +100);
	System.out.print("Enter a three-digit number:");
	int guess = input.nextInt();
	System.out.println(guess);
	int guessDigit1 = guess / 100;
	int guessDigit2 = (guess % 100) / 10;
	int guessDigit3 = guess & 10;
	System.out.println("The lottery number is " + lottery);
	
	int lotteryDigit1 = lottery / 100;
	int lotteryDigit2 = (lottery % 100) / 10;
	int lotteryDigit3 = lottery & 10;
	
	if ( guess == lottery) {
		System.out.println("You win 10.000$");
		
	}else if ( guessDigit1 == lotteryDigit2 && 
		       guessDigit2 == lotteryDigit3 &&
		       guessDigit3 == lotteryDigit1 ||
		       
		       guessDigit1 == lotteryDigit2 &&
		       guessDigit2 == lotteryDigit1 &&
		       guessDigit3 == lotteryDigit3 ||
		       
		       guessDigit1 == lotteryDigit1 &&
		       guessDigit2 == lotteryDigit3 &&
		       guessDigit3 == lotteryDigit2 ||
		       
		       guessDigit1 == lotteryDigit3 &&
		       guessDigit2 == lotteryDigit1 &&
		       guessDigit3 == lotteryDigit2 ||
       
		       guessDigit1 == lotteryDigit3 &&
		       guessDigit2 == lotteryDigit2 &&
		       guessDigit3 == lotteryDigit1 ) {
		System.out.println("You win 3.000$");
		
	}else if(guessDigit1 == lotteryDigit1 ||
			 guessDigit1 == lotteryDigit2 ||
			 guessDigit1 == lotteryDigit3 ||
			 
			 guessDigit2 == lotteryDigit1 ||
			 guessDigit2 == lotteryDigit2 ||
			 guessDigit2 == lotteryDigit3 ||
		
			 guessDigit3 == lotteryDigit1 ||
			 guessDigit3 == lotteryDigit2 ||
			 guessDigit3 == lotteryDigit3 ) {
		System.out.println("You win 1.000$");
	}else {
		System.out.println("No match");
	}

}
}
