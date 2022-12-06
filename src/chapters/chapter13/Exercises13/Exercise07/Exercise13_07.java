package chapters.chapter13.Exercises13.Exercise07;



public class Exercise13_07 {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Square((int)(Math.random() *20));
            System.out.println("Area: " + objects[i].getArea());
            System.out.print("How to Color: ");
            objects[i].howToColor();
        }

    }
}
