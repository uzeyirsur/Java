package chapters.chapter05.Listings_05;
import java.util.Scanner;
public class Listing_05_09 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer: ");
	int n1 = input.nextInt();
	System.out.print("Enter second integer: ");
	int n2 = input.nextInt();
	
	int gcd = 1;
	int k = 2;
	while (k <= n1 && k <= n2) {
		if(n1 % k == 0 && n2 % k == 0)
			gcd = k;
		k++;
	}
	System.out.println("gcd is " + gcd);
}
}
