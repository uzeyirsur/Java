
package chapters.chapter02.Exercises02;

import java.util.Scanner;

public class Exercise_02_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		long currentSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;

		System.out.print("Enter the time zone offset to GMT: ");
		long zoneOffSet = input.nextLong();
		System.out.println((currentHours + zoneOffSet) % 24 + ":" + currentMinutes + ":" + currentSeconds);

	}
}
