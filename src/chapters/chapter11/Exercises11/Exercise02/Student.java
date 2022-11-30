
package chapters.chapter11.Exercises11.Exercise02;

public class Student extends Person {
    private final String STATUS;
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    public Student(String status) {
        STATUS = status;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        STATUS = status;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public String toString() {
        return "Student Class\nName: " + this.getName() + "\n";
    }
}
