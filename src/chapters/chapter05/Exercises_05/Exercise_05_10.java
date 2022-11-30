
package chapters.chapter05.Exercises_05;

public class Exercise_05_10 {
public static void main(String[] args) {
	int counter = 0;
	for (int number = 100; number <= 1000; number++) {
		if (number % 5 == 0 && number % 6 == 0) {
			counter++;
			System.out.print(number);
			System.out.print((counter % 10 == 0 ? "\n" : " "));
			
		}
	}
	
}
}
