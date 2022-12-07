package chapters.chapter13.Exercises13.Exercise12;


public class Exercise13_12 {
    public static void main(String[] args) {
        GeometricObject[] geometricObject = {new Circle(5), new Circle(10),
                new Rectangle(5, 7), new Rectangle(5, 9)};

        System.out.printf("The sum of the areas is %2.2f", sumArea(geometricObject));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
