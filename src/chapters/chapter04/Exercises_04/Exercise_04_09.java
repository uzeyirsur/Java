package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_09 {
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
String s =input.nextLine();
int i = (int) s.charAt(0);
System.out.println("The Unicode for the character " + s + " is " + i);



	}
}
