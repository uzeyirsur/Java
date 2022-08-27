package chapters.chapter02.Exercises02;
import java.util.Scanner;
public class Exercise_02_23 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the diriving distance : ");
	double distance = input.nextDouble();
	
	System.out.print("Enter miles per gallon: ");
	double milesPerGallon =input.nextDouble();
	
	
	System.out.print("Enter price per gallon : ");
	double pricePerGallon =input.nextDouble() ;
	
	double cost = ( distance / milesPerGallon ) * pricePerGallon ;
	
	System.out.println("The cost of driving is $" + cost);
	
	
	
}
	
	
}
