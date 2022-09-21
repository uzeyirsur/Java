package chapters.chapter_05.Exercises;

public class Exercise_05_03 {
	public static void main(String[] args) {
		System.out.print("Kilograms		");
		System.out.println("Pounds");
		for (int kg = 1; kg < 200; kg += 2) {
			System.out.printf("%-3d", kg);
			double pound = kg * 2.2;
			System.out.printf("%26.1f", pound);
			System.out.println();
		}

	}
}
