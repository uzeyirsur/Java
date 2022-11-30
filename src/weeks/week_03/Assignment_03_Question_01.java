
package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_Question_01 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.print( "Enter your year of service: ");
	
	int yearOfService = input.nextInt();
	
	if (yearOfService > 5) {
		System.out.print("Enter your salary: ");
		double salary = input.nextDouble();
		double bonus =salary * 0.05;
System.out.println("Your net bonus salary is: " + bonus);
	}
	else  
		System.out.println("We regret to inform you that you dont have a bonus salary.");
	
	
}
	
 

	

}
