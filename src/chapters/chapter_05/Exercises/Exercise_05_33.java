package chapters.chapter_05.Exercises;

public class Exercise_05_33 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for (int i = 2; i < 10000; i++) {
			sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					sum += j;

				}
			}
			if (sum == i) {
				System.out.println(i + " is a perfect number");
			}

		}

	}

}
