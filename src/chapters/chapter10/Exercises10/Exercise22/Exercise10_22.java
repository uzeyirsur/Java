package chapters.chapter10.Exercises10.Exercise22;

public class Exercise10_22 {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'd', 'e'};
        MyString1 s = new MyString1(chars);
        System.out.println(s.substring(0, 2).toString());
        System.out.println(s.toLowerCase().toString());
        System.out.println(s.toString());
        System.out.println(s.equals(new MyString1(new char[]{'a', 'b', 'c', 'd', 'e'})));
        System.out.println(MyString1.valueOf(123));


    }
}
