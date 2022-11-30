
package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_Question_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ages of three people : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if ((a > b) && (b > c)) {
			System.out.println("The oldest person is " + a + " years old.");
			System.out.println("The youngest person is " + c + " years old.");
		} else if ((a > c) && (c > b)) {
			System.out.println("The oldest person is " + a + " years old.");
			System.out.println("The youngest person is " + b + " years old.");
		}else if ((c > a) && (a > b)) {
			System.out.println("The oldest person is " + c + " years old.");
			System.out.println("The youngest person is " + b + " years old.");
		}else if ((c > b) && (b > a)) {
			System.out.println("The oldest person is " + c + " years old.");
			System.out.println("The youngest person is " + a + " years old.");
		}else if ((b > a) && (a > c)) {
			System.out.println("The oldest person is " + b + " years old.");
			System.out.println("The youngest person is " + c + " years old.");
		}else if ((b > c) && (c > a)) {
			System.out.println("The oldest person is " + b + " years old.");
			System.out.println("The youngest person is " + a + " years old.");
		}

	}
}
