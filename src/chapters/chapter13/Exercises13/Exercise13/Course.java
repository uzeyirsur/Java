package chapters.chapter13.Exercises13.Exercise13;

import java.util.ArrayList;

public class Course implements Cloneable {
    private String courseName;
    ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course courseClone = (Course) super.clone();

        courseClone.students = this.students;
        return courseClone;
    }
}
