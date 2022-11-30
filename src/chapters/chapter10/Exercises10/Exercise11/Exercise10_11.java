
package chapters.chapter10.Exercises10.Exercise11;

public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("c1 's area: " + c1.getArea() +  "\t\tperimeter: " + c1.getPerimeter());
        System.out.println("Is c1 contains points x = 3, y = 3: " + c1.contains(3,3));
        System.out.println("Is c1 contains this circle: x = 4, y = 5, radius = 10.5: "+ c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("Is c1 overlaps this circle: x = 3, y = 5, radius = 2.3: " + c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
