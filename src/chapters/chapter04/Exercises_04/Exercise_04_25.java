
package chapters.chapter04.Exercises_04;

public class Exercise_04_25 {
public static void main(String[] args) {
	int number1 = (int) (Math.random() * 10);
	int number2 = (int) (Math.random() * 10);
	int number3 = (int) (Math.random() * 10);
	int number4 = (int) (Math.random() * 10);
	
	int letter1 = (int) (65 + Math.random() * 26);
	int letter2 = (int) (65 + Math.random() * 26);
	int letter3 = (int) (65 + Math.random() * 26);
	
char p1 = (char) letter1;
char p2 = (char) letter2;
char p3 = (char) letter3;

System.out.println("" + p1 + p2 + p3 + number1 + number2 + number3 + number4);

}
}
