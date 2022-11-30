
package chapters.chapter09.Exercises09.Exercise01;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }


    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
