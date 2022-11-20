package chapters.chapter11.Exercises11.Exercise16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        ArrayList<Integer> answers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");

        answers.add(input.nextInt());

        int i = 0;
        while (number1 + number2 != answers.get(i)) {
            for (int j = 0; j < answers.size(); j++) {
                if (i != j && answers.get(i) == answers.get(j)) {
                    System.out.println("You already entered " + answers.get(i));
                    break;
                }
            }
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
            answers.add(input.nextInt());
            i++;
        }
        System.out.println("You got it!");
    }
}
