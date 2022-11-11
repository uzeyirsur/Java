package chapters.chapter10.CheckPoints;

public class CheckPoint29 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnoprstjuvyzx1234";
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.delete(4,10));

        StringBuilder stringBuilder1 = new StringBuilder("1234566778891011121314");
        System.out.println(stringBuilder1.delete(1,10));

        StringBuilder stringBuilder2 = new StringBuilder("time management");
        System.out.println(stringBuilder2.delete(4,15));
    }
}
