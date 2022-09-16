package chapters.chapter_05.Exercises;
import java.util.Scanner;
public class Exercise_05_09 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of students:");
 	int numOfStudents = input.nextInt();
	int score = -1;
 	String name = "";
	int score2 = -1;
	String name2 = "";
 	int i = 0;
	while (i != numOfStudents) {
		System.out.print("Enter the name and the score of the student (e.g Hasan 76): ");
		String name1 =input.next();
		int score1 = input.nextInt();
		i++;
		if (score1 > score) {
			score = score1;
			name = name1;
		}
	}
	
}
}
