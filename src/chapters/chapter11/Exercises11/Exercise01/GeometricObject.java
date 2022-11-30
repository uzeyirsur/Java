
package chapters.chapter11.Exercises11.Exercise01;

public class GeometricObject {
    private String color;
    private boolean isFilled;

    public GeometricObject() {
        this(null, false);
    }

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
