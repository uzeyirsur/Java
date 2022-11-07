package chapters.chapter10.Listings;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Haluk Dundar");
        course1.addStudent("Uzeyir Sur");
        course1.addStudent("Serhat Gulbas");

        course2.addStudent("Steve Wozniak");
        course2.addStudent("Steve Jobs");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
    }
}
