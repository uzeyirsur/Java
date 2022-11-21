package chapters.chapter10.Exercises10.Exercise13;

public class Exercise10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("r1's area: " + r1.getArea() + "\t\tperimeter: " + r1.getPerimeter());
        System.out.println("Is r1 contains x = 3, y = 3 point: " + r1.contains(3,3));
        System.out.println("Is r1 contains x = 4, y = 5, width = 10.5, height = 3.2 rectangle: " + r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println("Is r1 overlaps x = 3, y = 5, width = 2.3, height = 5,4 rectangle: " + r1.overlaps((new MyRectangle2D(3,5,2.3,5.4))));

    }
}
