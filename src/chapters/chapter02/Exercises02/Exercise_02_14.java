package chapters.chapter02.Exercises02;
import java.util.Scanner;
public class Exercise_02_14 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a weight in pounds: ");
	double pounds = input.nextDouble();
	double kilograms =  0.45359237 * pounds;
	
	System.out.print("Enter a height in inches: ");
	double inches = input.nextDouble();
	double meters = 0.0254 * inches;
	
	double bmi = kilograms / (Math.pow(meters, 2));
	System.out.println("BMI is " + bmi);
}
}
