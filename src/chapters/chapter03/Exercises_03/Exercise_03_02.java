
package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int z = (int) (Math.random() * 10);
		System.out.println(x + " + " + y + " + " + z + " = ?");
		int answer = input.nextInt();
		System.out.println(x + " + " + y + " + " + z + " = " + answer + " is " + (x + y + z == answer));

	}
}
