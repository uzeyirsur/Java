package chapters.chapter_05.Exercises;

public class Exercise_05_35 {
public static void main(String[] args) {
	double a = 0;
	double sum = 0;
	for(int i = 1; i < 625; i++) {
		a = Math.sqrt(i) + Math.sqrt(i + 1);
		sum += 1/a;
	}
	System.out.println("The sum is " + sum);
}
}
