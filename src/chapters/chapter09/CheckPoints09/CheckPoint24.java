package chapters.chapter09.CheckPoints09;

public class CheckPoint24 {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle(1);
        SimpleCircle circle2 = new SimpleCircle(2);
        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);

        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
    }
        public static void swap1(SimpleCircle x, SimpleCircle y){
            SimpleCircle temp = x;
            x = y;
            y = temp;
        }
    public static void swap2(SimpleCircle x, SimpleCircle y){
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}
class SimpleCircle {
    double radius;
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
}