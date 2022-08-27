package chapters.chapter03.checkPoints_03;

public class CheckPoint_03_16 {
	public static void main(String[] args) {
		int i;
		i = (int) (Math.random() * 20);
		System.out.println(i);

		i = (int) (Math.random() * 10 + 10);
		System.out.println(i);

		i = (int) (Math.random() * 40 + 10);
		if (i == 49) {
			System.out.println(i + 1);

		} else
			System.out.println(i);
	}
}
