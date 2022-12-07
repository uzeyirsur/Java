package chapters.chapter13.Exercises13.Exercise11;

public class Octangle extends GeometricObject implements Comparable<Octangle>, Cloneable {
    private double side;

    public Octangle() {

    }

    public Octangle(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octangle octangle) {
        if (this.getArea() < octangle.getArea()) {
            return -1;
        } else if (this.getArea() == octangle.getArea()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Octangle octangle = (Octangle) obj;
        return this.side == octangle.side;
    }

    public Object clone() throws CloneNotSupportedException {
    return super.clone();
    }
}
