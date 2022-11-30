
package chapters.chapter05.Exercises_05;
import java.util.Scanner;
public class Exercise_05_31 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the amount : ");
	double amount = input.nextDouble();
	System.out.println("Enter the annual percentage yield:");
	double annualpercentage= input.nextDouble();
	System.out.println("Enter the number of months:");
	double months = input.nextDouble();
	System.out.println("Month\t\tCD Value");
	for (int i = 1; i <= months; i++) {
		amount = amount + (amount * annualpercentage /1200);
		
		System.out.printf("%d\t\t%2.2f\n", i, amount);
		
	}
	
}
}
