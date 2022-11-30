
package chapters.chapter03.checkPoints_03;

import java.util.Scanner;

public class CheckPoint_03_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for x : ");
		int x = input.nextInt();

		System.out.print("Enter a number for y : ");
		int y = input.nextInt();

		if (x > 2)
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);

			} else
				System.out.println("x is " + x);

	}

}
