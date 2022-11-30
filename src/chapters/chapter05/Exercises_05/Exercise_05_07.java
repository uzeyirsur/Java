
package chapters.chapter05.Exercises_05;

public class Exercise_05_07 {
	public static void main(String[] args) {

		double tuition = 10000;
		int year = 1;

		while (year < 11) {
			if (year == 1) {
				System.out.println("1. years's tuition is $10000,00");
				year++;
				continue;
			}

			tuition = tuition + (tuition * 0.5);
			System.out.printf("%d. year's tution is $%2.2f\n ", year, tuition);
			year++;

		}
		double sum = 0;
		int fourYear = 0;
		while (fourYear < 4) {
			tuition = tuition + (tuition * 0.5);
			sum = +tuition;
			fourYear++;
		}
		System.out.printf("$%2.2f ", sum);

	}
}
