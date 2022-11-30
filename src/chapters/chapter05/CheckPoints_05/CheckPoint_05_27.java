
package chapters.chapter05.CheckPoints_05;

public class CheckPoint_05_27 {
	public static void main(String[] args) {

		a();
		System.out.println("---------------------------------------------------------");
		b();
		
	}

	public static void a() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					break;
				System.out.println(i * j);
			}
			System.out.println(i);
		}
	}

	public static void b() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					continue;
				System.out.println(i * j);
			}
			System.out.println(i);
		}

	}

}
