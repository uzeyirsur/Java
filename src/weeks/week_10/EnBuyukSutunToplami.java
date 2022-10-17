package weeks.week_10;

import java.util.Scanner;

public class EnBuyukSutunToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = input.nextInt();
        System.out.println("Enter the number of column: ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {
             arr[row][col]= (int) (Math.random() * 5);
            }
        }

        for (row = 0; row < arr.length; row++) {
            for (col =0; col <= arr[row].length; col++) {
                System.out.print(arr[row].length % col == 0 ? arr[row][col] + "\n" : arr[row][col] + " ");
            }
        }
                System.out.println(TheGreatestRow(arr,row,col));

        }


    public static int TheGreatestRow(int[][] arr, int row, int col) {
       int i = -1;
        int sum = 0;
        int max = -1;
        for (row = 0; row < arr.length; row++) {

            for (col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if(sum > max){
                max = sum;
                i = row;
            }
            sum = 0;
        }
return i;
    }
}
