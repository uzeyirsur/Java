package chapters.chapter_05.CheckPoints_05;

public class CheckPoint_05_26b {
public static void main(String[] args) {
	int sum = 0;
	int number = 0;
	while (number < 20 ) {
		number++;
		if (number != 10 && number !=11) {
		sum += number;
		}
	}
	System.out.println("the sum is " + sum);
}
}
