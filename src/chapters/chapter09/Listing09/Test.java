package chapters.chapter09.Listing09;

public class Test {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5);
        printCircle(myCircle);
    }
    public static void printCircle(CircleWithPrivateDataFields c){
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }
}
