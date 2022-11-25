package chapters.chapter12.Listings12;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());

    }
}

class CircleWithCustomException {
    private double radius;

    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        CircleWithCustomException.numberOfObjects = numberOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
}
