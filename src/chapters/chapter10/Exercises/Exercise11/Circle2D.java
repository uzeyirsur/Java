package chapters.chapter10.Exercises.Exercise11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;
    Circle2D(){
        this(0,0,1);
    }
    Circle2D(double x,double y,double radius){
        this.x = x;
        this.y = y;
        this.radius =radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x,double y){
        return distance(new Circle2D(x,y,0))<= getRadius();
    }


    public boolean contains(Circle2D circle){
        return distance(circle) + circle.getRadius() <= getRadius();
    }

    public boolean overlaps(Circle2D circle){
        return getRadius() + circle.getRadius() >= distance(circle);
    }


private double distance(Circle2D circle){
        return Math.sqrt(Math.pow(getX() - circle.getX(),2) + Math.pow(getY() - circle.getY(),2));
}

}
