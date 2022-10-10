package chapters.chapter07.CheckPoints_07;

public class CheckPoint_07_12 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //No it won't work. There is a logical mistake. In this way we may pick the same card which is not contained in a deck of cards.
        for (int i = 0; i < 4; i++) {
            int cardNumber = (int) (Math.random() * deck.length);
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println("Card number" + cardNumber + ": " + rank + " of " + suit);
        }

    }
}

