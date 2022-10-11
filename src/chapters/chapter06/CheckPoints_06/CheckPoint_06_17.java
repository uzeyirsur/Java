package chapters.chapter06.CheckPoints_06;

public class CheckPoint_17 {
    public static void main(String[] args) {
        double z = m(4, 5);
        double a = m(4, 5.4);
        double b = m(4.5, 5.4);
        System.out.println(z); //Second method invoked.
        System.out.println(a); // Second method invoked
        System.out.println(b); // First method invoked.
    }

    public static double m(double x, double y) {
        return x;
    }

    public static double m(int x, double y) {
        return y;
    }
}
