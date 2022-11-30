
package weeks.week_15;

public class Vehicles {
    protected String brand;
    protected String model;
    protected int wheels;
    protected int year;
    protected String color;
    protected boolean hasSunRoof;
public Vehicles(){
    this("default","default,",4,0,"default",false);
}

    public Vehicles(String brand, String model, int wheels, int year, String color, boolean hasSunRoof) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.year = year;
        this.color = color;
        this.hasSunRoof = hasSunRoof;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }
    public void accelerate(){
        System.out.println("Car is getting faster.");
    }
    public void slowDown(){
        System.out.println("Car is slowing down.");
    }
    public void start(){
        System.out.println("Car is starting.");
    }
    public void shutDown(){
        System.out.println("Car shut down.");
    }
}
