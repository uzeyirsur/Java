package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array:");
        int numOfRow = input.nextInt();
        int numOfCol = input.nextInt();
        double[][] a = new double[numOfRow][numOfCol];
        System.out.println("Enter the array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        int[] largestLocate = locateLargest(a);
        System.out.println("The location of the largest element is (" + largestLocate[0] + ", " + largestLocate[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] largestLocate = new int[2];
        double largestNum = a[0][0];
        int largestRow = 0;
        int largestCol = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largestNum < a[i][j]) {
                    largestNum = a[i][j];
                    largestRow = i;
                    largestCol = j;
                }
            }
            largestLocate[0] = largestRow;
            largestLocate[1] = largestCol;
        }
        return largestLocate;
    }
}
