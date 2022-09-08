package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_12 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a letter: ");
	String letter = input.nextLine();
	char ch = letter.charAt(0);
	ch = Character.toLowerCase(ch);
	if ('a' > ch || ch > 'z') {
		System.out.println("Invalid input");
	}else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
		System.out.println(letter + " is a wowel");
	}else {
		System.out.println(letter + " is a consonant");
	}
		
	
}
}
