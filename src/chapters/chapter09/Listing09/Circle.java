package chapters.chapter09.Listing09;

public class Circle {
    private double radius = 1;
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Radius is " + myCircle.radius); // There is no problem here. Because main method and the private variable are in the same class.
    }
}
