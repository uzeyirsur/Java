
package chapters.chapter03.checkPoints_03;
import java.util.Scanner;
public class CheckPoint_03_07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	
	double number = input.nextDouble();
	
	if (number % 2 == 0)
		System.out.println(number + " is even");
	
	System.out.println(number + " is odd");
	
	
	System.out.print("Enter a number :");
	double number2 = input.nextDouble();
	
	if (number2 % 2 == 0)
	System.out.println(number2 + " is even");
	else
	System.out.println(number2 + " is odd");
	
	
	
	
	
}
}
