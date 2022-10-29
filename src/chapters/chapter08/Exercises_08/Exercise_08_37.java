package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] states = getStatesAndCapitals();
        int correctCount = 0;
        for (int i = 0; i < states.length; i++) {
            System.out.println("What is the capital of " + states[i][0] + "?");
            String answer = input.nextLine().toLowerCase();

            if (answer.equals(states[i][1].toLowerCase())) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + states[i][1]);
            }
        }
        System.out.println("The correct count is " + correctCount);
    }

    public static String[][] getStatesAndCapitals() {
        String[][] states = {{"Turkey", "Ankara"}, {"Greece", "Atina"}, {"Italy", "Rome"}, {"England", "London"}, {"Germany", "Berlin"}};
        return states;
    }
}
