package chapters.chapter09.Exercises09.Exercise09;

public class Exercise_09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("regularPolygon1: perimeter = " + regularPolygon1.getPerimeter() + "\t\tarea = " + regularPolygon1.getArea());
        System.out.println("regularPolygon2: perimeter = " + regularPolygon2.getPerimeter() + "\t\tarea = " + regularPolygon2.getArea());
        System.out.println("regularPolygon3: perimeter = " + regularPolygon3.getPerimeter() + "\t\tarea = " + regularPolygon3.getArea());
    }
}
