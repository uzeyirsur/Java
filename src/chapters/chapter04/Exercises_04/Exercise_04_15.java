package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_15 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a letter :");
	String letter = input.nextLine();
	char ch = letter.toLowerCase().charAt(0);
	switch (ch) {
	case 'a', 'b', 'c': System.out.println("The corresponding number is " + 2);break;
	case 'd', 'e', 'f':System.out.println("The corresponding number is " + 3);break;
	case 'g', 'h', 'i':System.out.println("The corresponding number is " + 4);break;
	case 'j', 'k', 'l':System.out.println("The corresponding number is " + 5);break;
	case 'm', 'n', 'o':System.out.println("The corresponding number is " + 6);break;
	case 'p', 'q', 'r', 's':System.out.println("The corresponding number is " + 7);break;
	case 't', 'u', 'v':System.out.println("The corresponding number is " + 8);break;
	case 'w', 'x', 'y', 'z':System.out.println("The corresponding number is " + 9);break;
	default : System.out.println(ch + " is a invalid input.");

	}
	
}
}
