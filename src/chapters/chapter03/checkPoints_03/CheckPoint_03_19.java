
package chapters.chapter03.checkPoints_03;
import java.util.Scanner;
public class CheckPoint_03_19 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter x ");
	int num = input.nextInt();
	
	System.out.println(1 <= num && num <= 100);
	System.out.println(1 <= num && num <= 100 || num < 0);
	
}
}
