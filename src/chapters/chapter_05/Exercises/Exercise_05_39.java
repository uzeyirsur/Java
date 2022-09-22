package chapters.chapter_05.Exercises;

public class Exercise_05_39 {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < 1000000; i++) {
			int a = (int) (Math.random() * 2);
			if (a == 0) {
				heads++;
			} else {
				tails++;
			}

		}
		System.out.println("Total Heads\t\tTotal Tails");
		System.out.println(heads + "\t\t\t" + tails);
	}
}
