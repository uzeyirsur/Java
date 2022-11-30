
package chapters.chapter07.Exercises_07;

//not finished yet.
public class Exercise_07_29 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        makeDeck(deck);
        int sum = 0;
        int picks = 0;
        while (sum != 24) {
            int card1 = deck[(int) (Math.random() * 52)];
            int card2 = deck[(int) (Math.random() * 52)];
            int card3 = deck[(int) (Math.random() * 52)];
            int card4 = deck[(int) (Math.random() * 52)];
            sum = card1 + card2 + card3 + card4;
            picks++;
        }
        System.out.println("The pick number " + picks + " yields the sum of 24");
    }

    public static void makeDeck(int[] deck) {
        int cardNumber = 1;
        for (int i = 0; i < deck.length; i++) {
            deck[i] = cardNumber;
            if (cardNumber == 13) {
                cardNumber = 1;
                continue;
            }
            cardNumber++;
        }
    }
}
