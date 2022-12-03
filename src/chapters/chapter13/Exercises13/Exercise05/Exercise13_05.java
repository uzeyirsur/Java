package chapters.chapter13.Exercises13.Exercise05;

public class Exercise13_05 {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", true, 10);
        Circle circle2 = new Circle("white", false, 20);
        System.out.println(circle1.compareTo(circle2));

        System.out.println(new Rectangle("green", true, 5, 10).compareTo(new Rectangle(null, false, 2, 3)));
    }
}
