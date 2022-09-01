package chapters.chapter03.Exercises_03;
import java.util.Scanner;
public class Exercise_03_12 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a three digit number:");
	int number =input.nextInt();
	int digit1 = number/100;
	int digit2 = (number % 100) / 10;
	int digit3 = number % 10;
	
	if(digit1 == digit3 ) {
		System.out.println(number + " is a polindrome");
	}else {
		System.out.println(number + " is not a palindrome");
	}
	
}
}
