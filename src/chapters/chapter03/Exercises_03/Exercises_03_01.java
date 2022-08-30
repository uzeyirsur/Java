package chapters.chapter03.Exercises_03;
import java.util.Scanner;
public class Exercises_03_01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a value for a, b and c:  ");
	double a =input.nextDouble();
	double b =input.nextDouble();
	double c =input.nextDouble();
	double r1;
	double r2;
	r1 = (-b + Math.pow(Math.pow(b, 2) -( 4 * a * c) , 0.5)) / (2 * a)  ;
	r2 = (-b - Math.pow(Math.pow(b, 2) -( 4 * a * c ) , 0.5)) / (2 * a);
	
	if (Math.pow(b, 2) - 4 * a * c > 0) {	
		System.out.println("The equation has two roots " + r1 + "and " + r2);
	}else if (Math.pow(b, 2) - 4 * a * c  == 0) {
		System.out.println("The equation has one root" + r1);
	}else {
		System.out.println("The equation has no real roots.");
	}
}
}
