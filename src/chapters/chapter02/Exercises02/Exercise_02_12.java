package chapters.chapter02.Exercises02;
import java.util.Scanner;
public class Exercise_02_12 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
    System.out.print("Enter speed and acceleration: ");
    double v = input.nextDouble();
    double a = input.nextDouble();
    
    double length = Math.pow(v, 2) / ( 2 * a ) ;
    System.out.println("The minimum runway length this airplane is " +  length );
	
	
}
}
