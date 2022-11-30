
package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_25 {
    public static void main(String[] args) {
        double[][] matrix = getMatrixFromUser();
        if(isMarkovMatrix(matrix)){
            System.out.println("It is a Markov matrix");
        }else{
            System.out.println("It is not a Markov matrix");
        }
    }
    public static double[][] getMatrixFromUser(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static boolean isMarkovMatrix(double[][] matrix){
        return isPositive(matrix) && isSumOfColumnOne(matrix);
    }
    public static boolean isPositive(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0){
                    return false;
                }
                
            }
        }
        return true;
    }
    public static boolean isSumOfColumnOne(double[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if(sum != 1){
                return false;
            }
        }
        return true;
    }
}
