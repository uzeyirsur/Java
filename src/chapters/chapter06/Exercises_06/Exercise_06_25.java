package chapters.chapter06.Exercises_06;

public class Exercise_06_25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(5500));
    }

    public static String convertMillis(long millis) {
        long remainingSeconds = millis / 1000;
        long seconds = remainingSeconds % 60;
        remainingSeconds -= seconds;
        long remainingMinutes = remainingSeconds / 60;
        long minutes = remainingMinutes % 60;
        remainingMinutes -= minutes;
        long hours = remainingMinutes / 60;
        return "" + hours + ":" + minutes + ":" + seconds;

    }
}
