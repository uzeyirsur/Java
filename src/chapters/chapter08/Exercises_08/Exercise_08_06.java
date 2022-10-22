package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_06 {
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix1:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix2:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = input.nextDouble();
            }
        }
        double[][] sum = multiplyMatrix(a, b);
        displayResult(a, b, sum);


    }

    private static void displayResult(double[][] a, double[][] b, double[][] sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            if (i == 1) {
                System.out.print("\t*\t ");
            } else {
                System.out.print("\t\t ");
            }
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            if (i == 1) {
                System.out.print("\t=\t ");
            } else {
                System.out.print("\t\t ");
            }
            for (int j = 0; j < sum[i].length; j++) {
                System.out.printf("%2.1f  ", sum[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
