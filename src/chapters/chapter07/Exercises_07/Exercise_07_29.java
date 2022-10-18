package chapters.chapter07.Exercises_07;
                                          //not finished yet.
public class Exercise_07_29 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        int[] selectedRanks = new int[4];
        System.out.println("Selected cards are: ");
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            selectedRanks[i] = ranks[deck[i] % 13];
            System.out.print("Card number " + deck[i] + ": ");
            switch (ranks[i]) {
                case 1:
                    System.out.println("Ace of " + suit);
                    break;
                case 11:
                    System.out.println("Jack of " + suit);
                    break;
                case 12:
                    System.out.println("Queen of " + suit);
                    break;
                case 13:
                    System.out.println("King of " + suit);
                    break;
                default:
                    System.out.println(selectedRanks[i] + " of " + suit);
            }
        }

        for (int i = 0; i < selectedRanks.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < selectedRanks.length; j++) {
                sum = selectedRanks[i] + selectedRanks[j];
            }

        }


    }
}
