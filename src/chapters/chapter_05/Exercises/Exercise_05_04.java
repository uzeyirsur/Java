package chapters.chapter_05.Exercises;

public class Exercise_05_04 {
public static void main(String[] args) {
	System.out.println("Miles			Kilometers");
	for (int miles = 1; miles < 11; miles++) {
		System.out.printf("%-24d", miles);
		double km =miles * 1.609;
		System.out.println(km);
		
	}
	
}
}
