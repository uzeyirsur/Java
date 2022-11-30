
package chapters.chapter03.Listings_03;
import java.util.Scanner;
public class Listing_03_01 {
public static void main(String[] args) {
	int number1 = (int)(System.currentTimeMillis() %10 );
	int number2 = (int)(System.currentTimeMillis() /7 %10 );
	Scanner input =new Scanner(System.in);
	
	System.out.println("Whatis " + number1 + " + " + number2 + "? ");
	int answer = input.nextInt();
	
	System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2  ==  answer ));
	
}
}
