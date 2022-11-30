
package chapters.chapter05.CheckPoints_05;

public class CheckPoint_05_24b {
	public static void main(String[] args) {
		int balance = 10;
		while (true) {
			if (balance < 9) {
				continue;
			}
			balance = balance - 9;
			
		}
		//System.out.println("Balance is " + balance);  unreachable kod
	}
}
