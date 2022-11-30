
package chapters.chapter02.checkPoints02;
import java.util.Scanner;
public class CheckPoint_02_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for a: ");
		double a = input.nextDouble();
		System.out.print("Enter a number for b: ");
		double b = input.nextDouble();
		System.out.print("Enter a number for c: ");
		double c = input.nextDouble();
		System.out.print("Enter a number for d: ");
		double d = input.nextDouble();
		System.out.print("Enter a number for r: ");
		double r = input.nextDouble();
		
		System.out.println((4 / ( 3 * (r+34))) - (9 * (a + b * c)) + (3 + d * (2 + a) /( a + b * d)) );
		System.out.print("Enter a number for t: ");
		double t = input.nextDouble();
		System.out.println(5.5 * Math.pow(r + 2.5, 2.5 + t));
		
		
		
		
	}

}
