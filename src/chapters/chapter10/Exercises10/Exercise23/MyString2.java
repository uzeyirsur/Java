package chapters.chapter10.Exercises10.Exercise23;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin; i < chars.length; i++) {
            s += chars[i];
        }
        return new MyString2(s);
    }

    public MyString2 toUpperString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) ((chars[i] - 'a') + 'A');
            }
            s += chars[i];
        }
        return new MyString2(s);
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("true") : new MyString2("false");
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
