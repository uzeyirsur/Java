package chapters.chapter03.checkPoints_03;

import java.util.Scanner;

public class CheckPoint_03_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a count: ");
		int count = input.nextInt();

		boolean newLine = count % 10 == 0;

		System.out.println(newLine);
	}
}
