package chapters.chapter05.Listings_05;

public class Listing_05_07 {
public static void main(String[] args) {
	System.out.println("                     Multiplication Table");
	System.out.print("    ");
	for (int j = 1; j <= 9; j++) {
		 System.out.print("    " + j);
	}
	  System.out.println("\n--------------------------------------------------------------------------");
	  
	  for (int i = 1; i <= 9; i++) {
		  System.out.print(i + " | ");
		  for (int j = 1; j <= 9; j++) {
			  System.out.printf("%5d", i * j);
		  }
		  System.out.println();
	  }
}
}
