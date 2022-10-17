package weeks.week_10;

import java.util.Scanner;

public class RowAndColumn {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];
        fill2DArrWithRandomValues(arr,0,10);
    }
    public static void fill2DArrWithRandomValues(int[][] arr, int start,int limit){
        for (int row = 0; row <arr.length ; row++) {
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = (int) (Math.random() * (limit - start) + start);
            }
        }
    }
}
