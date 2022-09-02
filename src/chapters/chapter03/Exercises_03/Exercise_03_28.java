package chapters.chapter03.Exercises_03;
import java.util.Scanner;
public class Exercise_03_28 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
	double x1 =input.nextDouble();
	double y1 =input.nextDouble();
	double width1 =input.nextDouble();
	double height1 =input.nextDouble();
	
	System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
	double x2 =input.nextDouble();
	double y2 =input.nextDouble();
	double width2 =input.nextDouble();
	double height2 =input.nextDouble();
	
	double leftEdge1 = x1 - (width1 / 2);
	double rightEdge1 = x1 + (width1 / 2);
	double bottomEdge1 = y1 - (height1 /2);
	double topEdge1 = y1 + (height1 / 2);
	
	double leftEdge2 = x2 - (width1 / 2);
	double rightEdge2 = x2 + (width1 / 2);
	double bottomEdge2 = y2 - (height1 /2);
	double topEdge2 = y2 + (height1 / 2);
	
	
	
	
	
}
}
