package chapters.chapter_05.CheckPoints_05;

public class CheckPoint_05_24 {
public static void main(String[] args) {
	int balance = 10;
	while (true) {
		if (balance < 9) {
			break;
		}
		balance = balance - 9;
	}
	System.out.println("Balance is " + balance);
}
}
