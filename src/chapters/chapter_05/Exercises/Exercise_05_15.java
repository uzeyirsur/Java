package chapters.chapter_05.Exercises;

public class Exercise_05_15 {
public static void main(String[] args) {
	char ch = 0;
	for (int i = 33; i < 127; i++ ) {
		ch = (char)i;
		System.out.print(ch);
		System.out.print(i % 10 == 0 ? "\n" : " ");
		
	}
	
}
}
