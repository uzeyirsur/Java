
package chapters.chapter03.checkPoints_03;

public class CheckPoint_03_35 {
public static void main(String[] args) {
	double score;
	double scale = 10;
	double x =5;
	if (x > 10) {
		score = 3 * scale;
	}else {
		score = 4 * scale;
	}System.out.println(score);
	double tax;
	double income =900;
	
	if (income > 10000) {
	tax = income * 0.2;	
	}else {
		tax = income * 0.17 + 1000;
	}System.out.println(tax);
	
}
}
