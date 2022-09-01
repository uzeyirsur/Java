package chapters.chapter03.Exercises_03;
import java.util.Scanner;
public class Exercise_03_17 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("scissor(0) , rock(1) , paper(2):");
	int user = input.nextInt();
	int computer = (int)(Math.random() * 3);
	if (computer == 0 && user ==0) {
		System.out.println("The computer is scissor. You are scissor too.It is a draw.");
	}
}
}
