package chapters.chapter13.Exercises13.Exercise09;

import java.util.Date;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle circle) {
        if (this.radius < circle.radius) {
            return -1;
        } else if (this.radius == circle.radius) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        Circle circle = (Circle) o;
        return this.radius == circle.radius;

    }
}

