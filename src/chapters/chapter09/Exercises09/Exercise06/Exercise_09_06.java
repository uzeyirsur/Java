package chapters.chapter09.Exercises09.Exercise06;

public class Exercise_09_06 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int [] numbers = new int[100_000];
        stopWatch.start();
        java.util.Arrays.sort(numbers);
        stopWatch.stop();
        System.out.println("Start: " + stopWatch.getStartTime() );
        System.out.println("End: " + stopWatch.getEndTime());
        System.out.println("Execution time: " + stopWatch.getElapsedTime());
    }
}
