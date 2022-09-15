package chapters.chapter_05.CheckPoints_05;

public class CheckPoint_05_20b {
public static void main(String[] args) {
	int i = 0;
	while (i < 5) {
		for (int j = i; j > 1; j--) {
			System.out.println(j + " ");
			System.out.println("****");
			i++;
		}
	}
}
}
