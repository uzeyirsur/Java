package chapters.chapter03.checkPoints_03;

public class CheckPoint_03_31 {
	public static void main(String[] args) {
		int x = 1;
		int a = 3;

		switch (a) {
		case 1: System.out.println("x = " + (x += 5));break;
		case 2:System.out.println("x = " + (x += 10));break;
		case 3:System.out.println("x = " + (x += 16));break;
		case 4:System.out.println("x = " + (x += 34));break;
		}
		
		
	}
}
