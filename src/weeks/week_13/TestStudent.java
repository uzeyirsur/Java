
package weeks.week_13;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student haluk = new Student("Haluk","Inar",425,"haluk@inar.com");
        haluk.print();
    }

}

class Student {
    String name;
    String surname;
    int id;
    String email;
public Student(){

}

    public Student(String name,String surname,int id,String email) {

    }

    public String getName() {
        return name;
    }
public void print(){
    System.out.println("Isim:" + this.name);
}
}
