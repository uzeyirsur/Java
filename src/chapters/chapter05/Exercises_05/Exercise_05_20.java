
package chapters.chapter05.Exercises_05;

public class Exercise_05_20 {
	public static void main(String[] args) {
		int counter= 0 ;
		for (int number = 2; number < 1001; number++) {
			int i = 2;
			while (number % i != 0) {
				i++;
			}
			if(number == i) {
			System.out.print(i);
			counter++;
			System.out.print(counter % 8 == 0 ? "\n" :  " " );
			}
			
			
		}

		



	}

}
