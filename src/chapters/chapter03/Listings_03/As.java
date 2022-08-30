package chapters.chapter03.Listings_03;

import java.util.Scanner;

public class As {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("i , k , j' yi gir :");
	int i = input.nextInt();
	int k = input.nextInt();
	int j = input.nextInt();
	if (i > k) {
		if (j > k)
		System.out.println("i and j are greater than k");
		}
		else
		System.out.println("i is less than or equal to k");
	
	
	
}
}
