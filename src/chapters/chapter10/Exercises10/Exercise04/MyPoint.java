package chapters.chapter10.Exercises10.Exercise04;

public class MyPoint {
    private double x;
    private double y;

    MyPoint() {
        this(0, 0);
    }

    MyPoint(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double distance(double newX, double newY) {
        return Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
    }
    public double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
