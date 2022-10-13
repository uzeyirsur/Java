package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores(With negative intiger ends): ");
        double score = 0;
        double[] scores = new double[50];
        int i = 0;
        while (score >= 0) {
            score = input.nextDouble();
            if (score < 0) {
                break;
            }
            scores[i] = score;
            i++;
        }
        double avarage = getTheAvarage(scores);
        CountTheNumbersStatus(avarage, scores);

    }

    private static void CountTheNumbersStatus(double avarage, double[] scores) {
        int countBelows = 0;
        int countAboves = 0;
        int countEquals = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < avarage && scores[i] != 0) {
                countBelows++;
            } else if (scores[i] > avarage) {
                countAboves++;
            } else if (scores[i] == avarage) {
                countEquals++;
            }
        }
        System.out.print(countAboves);
        System.out.print(countAboves == 1 ? " number aboves the avarage" : " numbers above the avarage  ");
        System.out.println(" " + avarage);

        System.out.print(countEquals);
        System.out.print(countEquals == 1 ? " number equals the avarage" : " numbers equal the avarage  ");
        System.out.println(" " + avarage);

        System.out.print(countBelows);
        System.out.print(countBelows == 1 ? " number belows the avarage" : " numbers below the avarage  ");
        System.out.println(" " + avarage);
    }

    private static double getTheAvarage(double[] scores) {
        int sum = 0;
        int positiveNums = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > 0) {
                positiveNums++;
            }
        }
        return sum / positiveNums;
    }

}