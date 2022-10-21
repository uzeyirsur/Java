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
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
                                        // NOT FINISHED YET
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] += a[i][j] * b[j][i];
            }
        }
        return sum;
    }
}
