
package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the commission you want to get: ");
		double commissionSought = input.nextDouble();
		double sales = 0;
		double commission = 0;
		for (; commission < commissionSought; sales += 1) {
			if (sales <= 5000) {
				commission = sales * 8 / 100;
			} else if (sales <= 10000) {
				commission = (sales * 5000) + (sales - 5000) * 0.1;
			} else if (sales > 10000) {
				commission = sales * 5000 + (sales - 5000) * 0.1 + (sales - 10000) * 0.12;
			}
		}
		
		System.out.println("To get the commission that you seek your sales amount have to be  $" + (sales -1));
	}
}
