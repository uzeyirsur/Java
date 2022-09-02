package chapters.chapter03.Exercises_03;

import java.util.Scanner;

public class Exercise_03_26 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int x = input.nextInt();
	System.out.println(" Is " + x + " divisible by 5 and 6 ? "  + ( x % 5 ==0 && x % 6 == 0 ));
	System.out.println(" Is " + x + " divisible by 5 or 6 ? "  + ( x % 5 ==0 || x % 6 == 0 ));
	System.out.println(" Is " + x + " divisible by 5 or 6  but not both? "  + ( x % 5 ==0 ^ x % 6 == 0 ));

}
}
