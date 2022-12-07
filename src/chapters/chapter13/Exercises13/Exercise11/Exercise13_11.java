package chapters.chapter13.Exercises13.Exercise11;

public class Exercise13_11 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octangle octangle = new Octangle(5);
        Octangle octangle1 =(Octangle) octangle.clone();

        System.out.println("octangle's area: " + octangle.getArea());
        System.out.println("octangle's perimeter: "+ octangle.getPerimeter());
        System.out.println(octangle.compareTo(octangle1));
    }
}
