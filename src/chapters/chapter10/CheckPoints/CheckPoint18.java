package chapters.chapter10.CheckPoints;

public class CheckPoint18 {
    public static void main(String[] args) {
        //a
        String s1 = "Welcome";
        String s2 = "welcome";
        s2 = s1.replaceAll("e","E");

        System.out.println(s1);
        System.out.println(s2);

        //b
        String[] arr = "Welcome to Java and HTML".split(" ");
        s1 = arr[0];
        s2 = arr[1];
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
    }
}
