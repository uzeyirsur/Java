
package chapters.chapter03.checkPoints_03;

import java.util.Scanner;

public class CheckPoint_03_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of x: ");
		double x = input.nextDouble();

		System.out.print("Enter the number of y: ");
		double y = input.nextDouble();
		double z;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);

			}
		} else
			System.out.println("x is " + x);
	}

}
