package chapters.chapter06.Exercises_06;

public class Exercise_06_38 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomUpperCaseCharacter());
            count++;
            System.out.print(count % 10 == 0 ? "\n" : " ");
        }
        int count2 = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomDigitCharacter());
            count++;
            System.out.print(count % 10 == 0 ? "\n" : " ");
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseCharacter() {
        return (char) getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return (char) getRandomCharacter('1', '9');
    }
}
