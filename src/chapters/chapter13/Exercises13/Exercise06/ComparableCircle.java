package chapters.chapter13.Exercises13.Exercise06;

public class ComparableCircle extends Circle implements Comparable<Circle> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(Circle circle) {
        return Double.compare(this.getArea(), circle.getArea());
    }
}
