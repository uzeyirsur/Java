
package chapters.chapter04.Exercises_04;

import java.util.Scanner;

public class Exercise_04_07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a radius for pentagon :");
	double r = input.nextDouble();
	
	double x1 =  r * Math.cos(Math.toRadians(18));
	double y1 = r * Math.sin(Math.toRadians(18));
	
	double x2 = r * Math.cos(Math.toRadians(90));
	double y2 = r * Math.sin(Math.toRadians(90));
	
	double x3 = r * Math.cos(Math.toRadians(162));
	double y3 = r * Math.sin(Math.toRadians(162));
	
	double x4 = r * Math.cos(Math.toRadians(234));
	double y4 = r * Math.sin(Math.toRadians(234));
	
	double x5 = r * Math.cos(Math.toRadians(306));
	double y5 = r * Math.sin(Math.toRadians(306));
	
	System.out.printf("The coordinates of five points on the pentagon are :\n %2.2f %2.2f\n %2.2f %2.2f\n %2.2f %2.2f\n %2.2f %2.2f\n %2.2f %2.2f\n " ,x1 , y1 ,x2 , y2 , x3, y3, x4, y4, x5, y5 );
}
}
