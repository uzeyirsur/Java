
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students: ");
        int i = input.nextInt();
        double[] students = new double[i];

        System.out.println("Enter the scores of the students: ");
        for (int j = 0; j < students.length; j++) {
            students[j] = input.nextDouble();
        }
        double bestScore = getBestScore(students);

        for (int j = 0; j < students.length; j++) {
            System.out.println("Student " + j + " score is " + students[j] + " and grade is " + getGrade(bestScore, students, j));

        }
    }

    public static double getBestScore(double[] students) {
        double bestScore = students[0];
        for (int i = 0; i < students.length; i++) {
            if (bestScore < students[i]) {
                bestScore = students[i];
            }
        }
        return bestScore;
    }

    public static char getGrade(double bestScore, double[] students, int indexOfStudent) {

        if (students[indexOfStudent] >= bestScore - 10) {
            return 'A';
        } else if (students[indexOfStudent] >= bestScore - 20) {
            return 'B';
        } else if (students[indexOfStudent] >= bestScore - 30) {
            return 'C';
        } else if (students[indexOfStudent] >= bestScore - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
