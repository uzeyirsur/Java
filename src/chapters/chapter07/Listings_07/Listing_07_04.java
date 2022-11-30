
package chapters.chapter07.Listings_07;

public class Listing_07_04 {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("The lowercase letters are: ");
        displayArray(chars);
        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);

    }

    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print((i + 1) % 20 == 0 ? chars[i] + "\n" : chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.print((i + 1) % 10 == 0 ? counts[i] + " " + (char) (i + 'a') + "\n" : counts[i] + "" + (char) (i + 'a') + "  ");
        }
    }


    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }


}
