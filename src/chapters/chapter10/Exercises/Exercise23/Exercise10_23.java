package chapters.chapter10.Exercises.Exercise23;

import java.util.Arrays;

public class Exercise10_23 {
    public static void main(String[] args) {
        MyString2 s = new MyString2("freedom");
        System.out.println(s.substring(3).toString());
        System.out.println(s.toUpperString().toString());
        char[] ch = s.toChars();
        System.out.println(MyString2.valueOf(true));

    }
}
