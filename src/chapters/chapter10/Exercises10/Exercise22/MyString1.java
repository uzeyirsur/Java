
package chapters.chapter10.Exercises10.Exercise22;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] ch = new char[end - begin];
        for (int i = begin, index = 0; i < end; i++, index++) {
            ch[index] = chars[i];
        }
        return new MyString1(ch);
    }

    public MyString1 toLowerCase() {

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) ((chars[i] - 'A') + 'a');
            }
        }
        return new MyString1(chars);
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String s = i + "";
        char[] chars = new char[s.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = s.charAt(j);
        }
        return new MyString1(chars);
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
