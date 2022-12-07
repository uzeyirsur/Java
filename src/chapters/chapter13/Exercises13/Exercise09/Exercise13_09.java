package chapters.chapter13.Exercises13.Exercise09;

public class Exercise13_09 {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", true, 10);
        Circle circle2 = new Circle("white", false, 12);
        Circle circle3 = new Circle("pink", false, 10);

        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle1.equals(circle2));

        System.out.println(circle1.compareTo(circle3));
        System.out.println(circle1.equals(circle3));
    }
}
