package chapters.chapter13.Exercises13.Exercise10;


public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double length;
    private double width;
public Rectangle(){
}
public Rectangle(double length,double width){
    this.length = length;
    this.width = width;
}
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        if (this.getArea() < rectangle.getArea()) {
            return -1;
        } else if (this.getArea() == rectangle.getArea()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
Rectangle rectangle = (Rectangle) o;
        return this.getArea() == rectangle.getArea();
    }

    @Override
    public String toString() {
return "date created: " + getDateCreated()+
        "area: " + getArea() +
        "perimeter: " + getPerimeter();
    }
}
