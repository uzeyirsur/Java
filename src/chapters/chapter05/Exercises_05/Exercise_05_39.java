
package chapters.chapter05.Exercises_05;

public class Exercise_05_39 {
public static void main(String[] args) {
	double commission = 0;
	double sales = 0;
	while (commission < 25000) {
		
		if (sales <= 5000) {
			commission = sales * 0.08;
		}else if (5000 < sales && sales <= 10000) {
			commission = 5000 * 0.08 + (sales - 5000) * 0.1;
		}else if (sales >10000) {
			commission = 5000 * 0.08 + 5000 * 0.1 + (sales - 10000) * 0.12;
		}
		sales += 0.1;
	}
	System.out.println("Minimum sales you have to generate in order to make $30.000 with your base salary is $" + sales);
}
}
