package chapters.chapter13.Exercises13.Exercise06;

public class Exercise13_06 {
    public static void main(String[] args) {
        ComparableCircle circle = new ComparableCircle(12);
        ComparableCircle circle2 = new ComparableCircle(20);
        System.out.println(circle.compareTo(circle2));
    }
}
