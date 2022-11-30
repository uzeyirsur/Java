
package chapters.chapter05.Exercises_05;

public class Exercise_05_19 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.printf("%36d\n", a);
		for (int i = 1; i < 8; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("    ");
			}
			for (int k = 1; k <= a; k *= 2) {
				System.out.printf("%4d" ,k);

			}
			for (int m = b; m > 0 ; m /= 2) {
				
				System.out.printf("%4d" , m);
			}
						
			System.out.println();
			a *= 2;
			b *= 2;
		}

	}

}
