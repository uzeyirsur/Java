
package chapters.chapter07.Exercises_07;

public class Exercise_07_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        int countPicks = 0;
        int countDiffrentSuits = 0;
        int k = 0;
        int i = 0;
        while (countDiffrentSuits < 4) {
            countPicks++;
            if (deck[i] / 13 == k) {
                System.out.print(ranks[deck[i] % 13] + " of " + suits[deck[i] / 13] + "\n");

                countDiffrentSuits++;
                k++;
            }
            i++;
        }
        System.out.println("Total pics " + countPicks);
    }
}
