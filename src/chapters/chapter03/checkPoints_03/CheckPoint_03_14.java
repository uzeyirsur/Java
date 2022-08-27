package chapters.chapter03.checkPoints_03;

import java.util.Scanner;

public class CheckPoint_03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");
		double number = input.nextDouble();

		if (number % 2 == 0)
			System.out.println(number + " is even");
		if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");
		
		System.out.print("Enter a number : ");
		double number2= input.nextDouble();
		
		if (number2 % 2 == 0)
			System.out.println(number2 +  " is even");
		else if (number2 % 5 == 0 )
			System.out.println(number2 + " is multiple of 5");
		
	}
}
