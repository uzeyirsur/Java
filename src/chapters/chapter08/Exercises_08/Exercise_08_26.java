package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();
        sortRows(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] getMatrixFromUser() {
        double[][] matrix = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] sortRows(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {
                double currentMin = m[i][j];
                int currentMinIndex = j;
                for (int k = j + 1; k < m[i].length; k++) {
                    if (m[i][k] < currentMin) {
                        currentMin = m[i][k];
                        currentMinIndex = k;
                    }
                }
                if (currentMinIndex != j) {
                    m[i][currentMinIndex] = m[i][j];
                    m[i][j] = currentMin;
                }
            }
        }
        return m;
    }
}
