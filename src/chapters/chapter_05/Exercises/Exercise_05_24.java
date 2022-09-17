package chapters.chapter_05.Exercises;

public class Exercise_05_24 {
public static void main(String[] args) {
	double sum = 0;
	double b = 3;
	for (double a = 1; a < 98; a+=2) {
		 while (b < 100) {
			sum += a/b;
			b+=2;
			break;}
		}
	System.out.println(sum);
	}
	
}
