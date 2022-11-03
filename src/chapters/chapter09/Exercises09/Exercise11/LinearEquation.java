package chapters.chapter09.Exercises09.Exercise11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    public boolean isSolvable() {
        return ((a * d) - (b * c) != 0);
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
