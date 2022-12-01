package chapters.chapter13.CheckPoints13;

public class CheckPoint08 {
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        //System.out.println((Integer)x.compareTo(new Integer(4))); It does not cast x but casts whole statement.
                                                                    // There is a compile error.
    }
}
