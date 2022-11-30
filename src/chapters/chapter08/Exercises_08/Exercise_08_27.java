
package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_27 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();
        sortColumns(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] getMatrixFromUser(){
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
    public static double[][] sortColumns(double[][] m){
        for (int i = 0; i <m[0].length ; i++) {
            for (int j = 0; j < m.length - 1; j++) {
                double currentMin = m[j][i];
                int currentMinIndex =j;
                for (int k = j + 1; k < m.length; k++) {
                    if(currentMin > m[k][i]){
                        currentMin = m[k][i];
                        currentMinIndex = k;
                    }
                }
                if(currentMinIndex != j){
                    m[currentMinIndex][i] = m[j][i];
                    m[j][i] = currentMin;
                }
            }

        }
        return m;
    }
}
