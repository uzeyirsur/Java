package chapters.chapter13.Exercises13.Exercise10;

public class Exercise13_10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20, 5);
        Rectangle r2 = new Rectangle(20, 3);
        Rectangle r3 = new Rectangle(20, 5);
        System.out.println(r1.compareTo(r2));
        System.out.println(r1.equals(r2));

        System.out.println(r1.compareTo(r3));
        System.out.println(r1.equals(r3));
    }
}
