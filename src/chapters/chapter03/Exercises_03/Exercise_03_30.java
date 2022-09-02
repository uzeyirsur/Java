package chapters.chapter03.Exercises_03;

public class Exercise_03_30 {
public static void main(String[] args) {
	long totalMilliseconds = System.currentTimeMillis();
	long totalSeconds = totalMilliseconds / 1000;
	long currentSecond = totalSeconds % 60;
	long totalMinutes = totalSeconds / 60;
	long currentMinutes = totalMinutes % 60;
	long totalHours = totalMinutes / 60;
	long currentHour = totalHours % 24;
	 currentHour = currentHour + 3;
	 if (currentHour >=24) {
		 currentHour = currentHour % 12;
		 System.out.println(currentHour + ":" + currentMinutes +":" + currentSecond + " am");
	 }else {		 System.out.println(currentHour + ":" + currentMinutes +":" + currentSecond + " pm");

		 
	 }
}
}
