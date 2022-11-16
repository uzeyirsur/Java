package chapters.chapter10.Exercises.Exercise24;

public class Exercise10_24 {
    public static void main(String[] args) {
        MyCharacter c = new MyCharacter('a');

        System.out.println(c.charValue());

        System.out.println(MyCharacter.valueOf('b').charValue());

        MyCharacter c1 = new MyCharacter('z');
        System.out.println(MyCharacter.compare(c.charValue(),c1.charValue()));

        System.out.println(c.compareTo(c1));


    }
}
