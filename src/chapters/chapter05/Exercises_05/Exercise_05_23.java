
package chapters.chapter05.Exercises_05;

public class Exercise_05_23 {
public static void main(String[] args) {
	double sum = 0;
	for (double n = 1; n < 50001; n++) {
		 sum += 1/n;
	}
	System.out.println("The sum is " + sum);
	double sum2 = 0;
	for (double n2 =50000; n2 > 0; n2--) {
		sum2 += 1/n2;
	}
	System.out.println("The sum2 is " + sum2);
}
}
