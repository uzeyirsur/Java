
package chapters.chapter05.Exercises_05;

public class Exercise_05_27 {
public static void main(String[] args) {
	int counter = 0;
	for (int i=101; i <=2100; i++) {
		if (i % 4 == 0 && i % 100 != 0 || (i % 400 == 0)) {
			System.out.print(i);
			counter++ ;
			System.out.print(counter % 10 == 0 ? "\n" : " ");
		}
	}
	
	System.out.println("\nTotal number of leap year is " + counter);
}
}
