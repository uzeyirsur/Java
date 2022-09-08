package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_20 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string :");
	String str = input.nextLine();
	int length = str.length();
	int unicode = str.charAt(0);
	char firstch = (char) unicode;
	System.out.println("The length of the string is " + length + " and the first character of the string is " + firstch);
}
}
