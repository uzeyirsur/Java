
package chapters.chapter03.Listings_03;

import java.util.Scanner;

public class Listing_03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("0 - single , 1 - Married jointly or qualifying widow(er), "
				+ " 3 - Head of household Enter the filing status : ");
		double status = input.nextDouble();
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		double tax = 0;

		if (status == 0) {
			if (income <= 8350) {
				tax = income * 0.10;
			} else if (income <= 33950) {
				tax = (8350 * 0.10) + (income - 8350) * 0.15;

			} else if (income <= 82251) {
				tax = (8350 * 0.10) + ((income - 8350) * 0.15) + ((income - 33950) * 0.25);
			} else if (income <= 171551) {
				tax = (8350 * 0.10) + ((income - 8350) * 0.15) + ((income - 33950) * 0.25) + ((income - 82250) * 0.28);
			} else if (income <= 372950) {
				tax = (8350 * 0.10) + ((income - 8350) * 0.15) + ((income - 33950) * 0.25) + ((income - 82250) * 0.28)
						+ ((income - 171551) * 0.33);
			} else if (income >= 372951) {
				tax = (8350 * 0.10) + ((income - 8350) * 0.15) + ((income - 33950) * 0.25) + ((income - 82250) * 0.28)
						+ ((income - 171551) * 0.33) + ((income - 372950) * 35);
			} else {
				System.out.println("Error : invalid status");
				System.exit(1);
			}

		}
		System.out.println((int) (tax * 100) / 100.0);
	}
}
