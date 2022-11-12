package chapters.chapter10.Exercises.Exercise09;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }else {

            students[numberOfStudents] = student;
            numberOfStudents++;
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i <students.length - 1; i++) {
            if(students[i].equals(student)){
            students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }
    public void clear(){
            students = new String[100];
            numberOfStudents = 0;

    }
}

