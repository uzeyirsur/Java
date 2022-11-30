
package chapters.chapter09.Exercises09.Exercise08;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }
public void setRadius(double newRadius){
        this.radius = newRadius;
}
    public String getColor() {
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }

    public String toString() {
        if (on) {
            return ("fan speed is " + getSpeed() + ", color: " + getColor() + ",  radius: " + getRadius());
        }
        return ("color: " + getColor() + ", radius: " + getRadius() + ", fan is off");
    }
}
