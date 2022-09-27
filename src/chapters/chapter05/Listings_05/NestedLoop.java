package chapters.chapter05.Listings_05;

public class NestedLoop {
public static void main(String[] args) {
	int sayac = 0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.println("i :" + i + "   j :" + j + "   k :" + k);
			}
			
		}
	}
	int a = 5;
	int b = 5;
	
	System.out.println(" " + a * b );
}
}
