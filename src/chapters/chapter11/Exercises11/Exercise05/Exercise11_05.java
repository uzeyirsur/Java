package chapters.chapter11.Exercises11.Exercise05;

public class Exercise11_05 {
    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudent("Uzeyir");
        course.addStudent("Emre");
        System.out.println(course.getStudents());
        course.dropStudent("Emre");
        System.out.println(course.getStudents());
    }
}
