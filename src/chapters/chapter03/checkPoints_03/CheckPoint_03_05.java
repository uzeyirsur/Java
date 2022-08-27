package chapters.chapter03.checkPoints_03;
import java.util.Scanner;
public class CheckPoint_03_05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the score: ");
	double score = input.nextDouble();
		
	if (score > 90) {
		
		score =  score + (score * 3 / 100);
		
		System.out.println(score);
	}
	
	
}
	
	
}
