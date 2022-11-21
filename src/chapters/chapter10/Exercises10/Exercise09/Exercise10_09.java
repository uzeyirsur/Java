package chapters.chapter10.Exercises10.Exercise09;

public class Exercise10_09 {
    public static void main(String[] args) {
        Course course = new Course("Software Development");
        course.addStudent("Uzeyir Sur");
        course.addStudent("Mehmet Loy");
        course.addStudent("David Mahler");
        course.dropStudent("Mehmet Loy");

        String students[] = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }
}
