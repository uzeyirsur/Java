
package chapters.chapter11.Exercises11.Exercise02;

import chapters.chapter10.Exercises10.Exercise14.MyDate;

public class Exercise11_02 {
    public static void main(String[] args) {
        Person person = new Person("Uzeyir", "Istanbul", "902-345-234", "noname@gmail.com");
        Student student = new Student("Haluk", "Istanbul", "909-234-12-32", "haluq@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Idris", "Odunbazari", "13123", "idris@gmail.com",
                "Lp 40", 5000, new MyDate());

        Faculty faculty = new Faculty("Hasan", "Ankara", "2323223", "hasan@gmail.com",
                "Ist NO21", 1000, new MyDate(), "09:00 am to 05:00 pm", "Professor");

        Staff staff = new Staff("Mehmet", "Elazig", "98989-23", "mehmethuloo@gmail.com", "32", 5500,
                new MyDate(), "Caretaker");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
