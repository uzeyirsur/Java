package chapters.chapter13.Exercises13.Exercise05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;
    private Date dateCreated;



    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color,boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled=filled;

    }

    @Override
    public int compareTo(GeometricObject o){
        if(this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea()< o.getArea()) {
            return -1;
        }else {
            return 0;
        }
    }
    public static GeometricObject max(GeometricObject o1,GeometricObject o2){
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    public abstract double getArea() ;



    public abstract double getPerimeter();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString(){
        return "created on: " + dateCreated +
                "\ncolor: " + color +
                "\nand filled: " + filled;
    }
}
