package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_Question_03 {
	public static void main(String[] args) {
System.out.print("Enter a four-digit number: ");
		Scanner input = new Scanner(System.in);

int  x = input.nextInt();
int y = x;

 int number = (x-y) + (int) (Math.random() * 10000) ;
System.out.println(number);


	}
}
