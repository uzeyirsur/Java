package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_22 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter string 1 : ");
	String s1 = input.nextLine();
	System.out.print("Enter string 2 : ");
	String s2 = input.nextLine();
	if (s1.indexOf(s2) == -1) {
		System.out.println(s2 + " is not a substring of " + s1);
	}else {
		System.out.println(s2 + " is a substring of " + s1);
		
	}
}
}
