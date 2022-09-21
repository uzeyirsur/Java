package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise_05_09 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of student:");
int numberOfStudent = input.nextInt();
double max = 0;
double max2 = 0;
String name1 = "";
String name2 = "";
for (int i = 0; i < numberOfStudent; i++ ) {
	System.out.println("Enter the name and the score of the student (e.g Hasan 45): ");
	String name =input.next();
	double score = input.nextDouble();
	if (score > max) {
		max2 = max;
		name2 = name;
		max = score;
		name1 = name;
	}else if (score > max2){
		max2 = score;
		name2 = name;
	}
}
System.out.println(name1 + " has the highest score " + max);
System.out.println(name2 + " hast the second highest score " + max2);
	}
}



