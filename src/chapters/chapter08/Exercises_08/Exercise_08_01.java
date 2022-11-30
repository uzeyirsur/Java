
/*Prompt user to enter numbers  length  of 3 * 4 num.length
  Save numbers to [3] [4] array
  put arrays yo sumColumn method
  This method find each element in a column and sum of them.  with nested for loop
  When number of column ends. Look for second column...forth row etc..
  Every time when sum all the elements in a column,print the results.
 */

package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
       double[][] numbers =new double[3][4];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = input.nextDouble();
            }
        }
        for (int columnIndex = 0; columnIndex < numbers[0].length; columnIndex++) {
            System.out.println( "Sum of the elements at column " + columnIndex + " is " + sumColumn(numbers, columnIndex));
        }

    }
    public static double sumColumn(double[][]numbers,int columnIndex){
        double sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            sum += numbers[row][columnIndex];
        }
        return sum;
    }
}
