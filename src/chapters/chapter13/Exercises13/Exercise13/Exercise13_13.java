package chapters.chapter13.Exercises13.Exercise13;

public class Exercise13_13{
    public static void main(String[] args) throws CloneNotSupportedException{
        Course course = new Course("Mathematics");
        course.addStudent("Harry Maguire");
        course.addStudent("Ronaldo");
        course.addStudent("Uzeyir");

        Course course1 = (Course) course.clone();


        System.out.println("course's students: " + course.students);
        System.out.println("course1's students: " + course.students);

    }
}
