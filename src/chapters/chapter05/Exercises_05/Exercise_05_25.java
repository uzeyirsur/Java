package chapters.chapter05.Exercises_05;

public class Exercise_05_25 {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double sum = 0;
		for (double i = 1; i < 10001; i++) {
			a = Math.pow((-1), i + 1);
			b = 2 * i - 1;
			sum += a / b;
		}
		System.out.println("For i = 10000 approximate pi is " + 4 * sum);
		double c = 0;
		double d = 0;

		for (double i = 1; i < 20001; i++) {
			c = Math.pow((-1), i + 1);
			d = 2 * i - 1;
			sum += c / d;
		}
		System.out.println("For i = 20000, approximate pi is " + sum);

		for (int i = 1; i < 1000001; i++) {
			a = Math.pow((-1), i + 1);
			b = 2 * i - 1;
			sum += a / b;
		}
		System.out.println("For i = 1000000, approximate pi is " + sum);
	}
}
