package chapters.chapter11.Exercises11.Exercise02;

import chapters.chapter10.Exercises10.Exercise14.MyDate;

public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String office, double salary, MyDate dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Class\n Name: " + this.getName() + "\n";
    }
}
