
package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_21 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a SSN : ");
	String ssn = input.nextLine();
	char dash = '-';
	char firstDash = ssn.charAt(3);
	char secondDash = ssn.charAt(6);
	boolean d1 = Character.isDigit(ssn.charAt(0));
	boolean d2 = Character.isDigit(ssn.charAt(1));
	boolean d3 = Character.isDigit(ssn.charAt(2));
	boolean d5 = Character.isDigit(ssn.charAt(4));
	boolean d6 = Character.isDigit(ssn.charAt(5));
	boolean d8 = Character.isDigit(ssn.charAt(7));
	boolean d9 = Character.isDigit(ssn.charAt(8));
	boolean d10 = Character.isDigit(ssn.charAt(9));
	boolean d11 = Character.isDigit(ssn.charAt(10));
	
	if (firstDash == dash && secondDash == dash && ssn.length() == 11 && d1 && d2 && d3 && d5 && d6 && d8 && d9 && d10 && d11 ) {
		System.out.println(ssn + " is a valid security number.");
	}else {
		System.out.println(ssn + " is a invalid security number.");
	}
		
	
	
	
}
}
