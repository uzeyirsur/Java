package chapters.chapter_05.Exercises;
import java.util.Scanner;
public class Exercise_05_41 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter integers (it ends with input of 0): ");
	int i=1;
	int max = 0;
	int countMax = 0;
	while (i != 0) {
		i = input.nextInt();
		if (i >= max) {
			max = i;
			countMax++;
		}
		
		
		
		
	}
	
	
}
}
