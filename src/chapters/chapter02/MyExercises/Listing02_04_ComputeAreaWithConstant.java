package chapters.chapter02.MyExercises;
import java.util.Scanner;
public class Listing02_04_ComputeAreaWithConstant {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number for radius: ");
	double radius = input.nextDouble();
	final double PI = 3.14159;
	double area = radius * radius * PI;
	System.out.println("The area for the circle of radius " + radius + " is " + area);
	
}
}
