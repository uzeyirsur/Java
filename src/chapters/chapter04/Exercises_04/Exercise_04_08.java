package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_08 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an ASCII code:  ");
int number = input.nextInt();

if (0 <= number &&  number <= 127) {
	char c =  (char)number;
	System.out.println(c);
}else {
	System.out.println("Invalid ASCII code !");
}



}
}
