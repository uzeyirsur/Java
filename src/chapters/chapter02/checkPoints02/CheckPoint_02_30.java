package chapters.chapter02.checkPoints02;
import java.util.Scanner;
public class CheckPoint_02_30 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter purchase amount: ");
	double purchaseAmount = input.nextDouble();
	double tax = purchaseAmount * 0.06;
	System.out.println("Tax is " + (int) (tax * 100 ) / 100);
}
}
