
package chapters.chapter03.Exercises_03;
import java.util.Scanner;
public class Exercise_03_34 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter three points for p0, p1, and p2: ");
	double x0 = input.nextDouble();
	double y0 = input.nextDouble();
	
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0 && x2 < x0 && x2 > x1 || x2 > x0 && x2 < x1) {
		System.out.println("(" +x2 + "," + y2 + ") is on the lime segment from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
	}else {
		System.out.println("(" +x2 + "," + y2 + ") is not on the lime segment from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
	}
}
}
