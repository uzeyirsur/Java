/*
1- Prompt user to enter 4-by-4 matrix row by row
2-Save this matrix in an 4-4 array.
3-Pass this array to suMajorDiagonal which calculates the sum the elements in major diagonal.
4-SUmMajorDiagonal = At first row save the first element in sum. At Second row save the second element in sum with first element etc.
We do it with nested for loop.
5 Show the result.
 */


package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] numbers = new double[4][4];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(numbers));
    }
    public static double sumMajorDiagonal(double[][] numbers){
       double sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = row; column == row; column++) {
                sum += numbers[row][column];
                }
            }
        return sum;
        }
    }

