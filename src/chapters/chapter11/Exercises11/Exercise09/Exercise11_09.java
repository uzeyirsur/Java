
package chapters.chapter11.Exercises11.Exercise09;

import chapters.chapter09.Listing09.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size n:");
        int n = input.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> rowSums = new ArrayList<>();
        ArrayList<Integer> columnSums = new ArrayList<>();

        ArrayList<Integer> rowMaxIndex = new ArrayList<>();
        ArrayList<Integer> columnMaxIndex = new ArrayList<>();

        findLargestRows(array, rowSums, rowMaxIndex);
        findLargestColumns(array, columnSums, columnMaxIndex);
        System.out.println("\nThe largest row index: " + rowMaxIndex.toString());
        System.out.println("The largest column index: " + columnMaxIndex.toString());
    }

    private static void findLargestRows(int[][] array, ArrayList<Integer> rowsSums, ArrayList<Integer> rowMaxIndex) {


        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            rowsSums.add(sum);
        }

        int max = java.util.Collections.max(rowsSums);
        for (int i = 0; i < rowsSums.size(); i++) {
            if (max == rowsSums.get(i)) {
                rowMaxIndex.add(i);
            }
        }


    }

    private static void findLargestColumns(int[][] array, ArrayList<Integer> columnSums, ArrayList<Integer> columnMaxIndex) {


        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            columnSums.add(sum);
        }

        int max = java.util.Collections.max(columnSums);
        for (int i = 0; i < columnSums.size(); i++) {
            if (max == columnSums.get(i)) {
                columnMaxIndex.add(i);
            }
        }


    }
}
