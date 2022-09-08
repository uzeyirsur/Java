package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_24 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first city: ");
	String city1 = input.nextLine();
	System.out.print("Enter the second city: ");
	String city2 = input.nextLine();
	System.out.print("Enter the third city: ");
	String city3 = input.nextLine();
	char c1 = city1.toUpperCase().charAt(0);
	char c2 = city2.toUpperCase().charAt(0);
	char c3 = city3.toUpperCase().charAt(0);
	
	if (c1 <  c2 && c1 < c3 && c2 < c3) {
		System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
	}else if (c1 < c2 && c1 < c3 && c3 < c2) {
		System.out.println("The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2);

	}else if (c2 < c1 && c2 < c3 && c1 < c3) {
		System.out.println("The three cities in alphabetical order are " + city2 + " " + city1 + " " + city3);

	}else if (c2 < c1 && c2 < c3 && c3 < c1) {
		System.out.println("The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);

	}else if (c3 < c1 && c3 < c2 && c1 < c2) {
		System.out.println("The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);

	}else if (c3 < c1 && c3 < c2 && c2 < c1) {
		System.out.println("The three cities in alphabetical order are " + city3 + " " + city2 + " " + city1);

	}
	
	
}
}
