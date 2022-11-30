
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int numOfStudent = input.nextInt();

        System.out.println("Enter the name and the score of the student: ");
        String[] names = new String[numOfStudent];
        double[] scores = new double[numOfStudent];
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
            scores[i] = input.nextDouble();
        }
        double[] sortedScores = sortScores(scores);
        int[] indexOfStudents = getIndexOfStudents(sortedScores, scores);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[indexOfStudents[i]] + "  " + sortedScores[i]);
        }
    }

    public static int[] getIndexOfStudents(double[] sortedScores, double[] scores) {
        int[] indexOfStudents = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            double currentMaxNumber = sortedScores[i];

            for (int j = 0; j < scores.length; j++) {
                if (currentMaxNumber == scores[j]) {
                    indexOfStudents[i] = j;
                }

            }
        }
        return indexOfStudents;
    }

    public static double[] sortScores(double[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            double currentMax = scores[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (currentMax < scores[j]) {
                    currentMax = scores[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;
            }
        }
        return scores;
    }
}
