
package chapters.chapter05.Exercises_05;
import java.util.Scanner;
public class Exercise_05_48 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string : ");
	String s = input.nextLine();
	int length = s.length();
	for ( int i = 0; i < length; i += 2) {
		char ch = s.charAt(i);
		System.out.print(ch);
	}
	
}
	

}
