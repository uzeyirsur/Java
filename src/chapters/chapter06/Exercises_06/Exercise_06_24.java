package chapters.chapter06.Exercises_06;

public class Exercise_06_24 {
    public static void main(String[] args) {
        currentTime();
        currentYear();
        currentMonth();
    }

    public static long totalHours() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        return totalMinutes / 60;

    }

    public static void currentTime() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 12;
        System.out.println(currentHour + ":" + currentMinutes + ":" + currentSecond);
    }

    public static void currentYear() {
long totalYears = (long) (totalHours() /8765.81277);
        long currentYear = 1970 + totalYears;
        System.out.println(currentYear);

    }
    public static long totalYears(){
        return (long) (totalHours() /8765.81277);
    }
    public static void currentMonth(){
       long totalMonth = totalYears() *12;
        System.out.println(totalMonth);

    }
}
