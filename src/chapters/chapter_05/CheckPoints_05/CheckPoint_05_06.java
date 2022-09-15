package chapters.chapter_05.CheckPoints_05;
import java.util.Scanner;
public class CheckPoint_05_06 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int number, max ;
	number = input.nextInt();
	max = number;
	do {
		number = input.nextInt();
		if (number > max)
			max = number;
	}while (number != 0);
	System.out.println("max is " + max);
	System.out.println("number is " + number);
}
}
