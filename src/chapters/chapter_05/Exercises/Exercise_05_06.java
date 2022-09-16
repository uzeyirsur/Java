package chapters.chapter_05.Exercises;

public class Exercise_05_06 {
public static void main(String[] args) {
	System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
	for (int miles = 1 , kilometers2 = 20; miles < 11 && kilometers2 < 66; miles++ , kilometers2 += 5) {
		
		System.out.printf( "%-16d %-14.3f |\t %-22d %2.3f",miles, miles * 1.609, kilometers2 , kilometers2 * 12.430 );
		System.out.println();
	}
}
}
