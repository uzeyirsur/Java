
package chapters.chapter05.Exercises_05;

public class Exercise_05_05 {
public static void main(String[] args) {
	System.out.println("Kilograms \t Pounds\t\t|\tPounds\tKilograms");
	for(int kg = 1, pounds2 = 20; kg < 200 & pounds2 < 516; kg +=2 , pounds2 += 5) {
		System.out.printf("%-17d",kg);
		double pounds = kg * 2.2;
		double kg2 = pounds2 /2.2;
		System.out.printf("%2.1f\t\t| %8d %10.2f", pounds , pounds2 , kg2 );
		System.out.println();
		
	}
	
	 }
	}
