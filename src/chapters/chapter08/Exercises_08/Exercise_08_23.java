package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_23 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        getMatrixFromUser(matrix);
        int firstViolatedRow = findViolatedFirstRow(matrix);
       int firstViolatedColumn =  findViolatedFirstColumn(matrix);

        if (firstViolatedColumn == -1 || firstViolatedRow == -1) {
            System.out.println("There is no violated row or column");
        } else {
            System.out.println("The flipped cell is at (" + firstViolatedRow + ", " + firstViolatedColumn + ")");
        }
    }

    public static void getMatrixFromUser(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }

        }
    }

    public static int findViolatedFirstRow(int[][] matrix) {
        int violatedFirstRow = -1;
        for (int i = 0; i < matrix.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes == 1 || countOnes == 3 || countOnes == 5) {
                violatedFirstRow = i;
                i = matrix.length;
            }
        }
        return violatedFirstRow;
    }

    public static int findViolatedFirstColumn(int[][] matrix) {
        int violatedFirstColumn = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            int countOnes = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    countOnes++;
                }
            }
            if (countOnes == 1 || countOnes == 3 || countOnes == 5) {
                violatedFirstColumn = i;
                i = matrix.length;
            }
        }
        return violatedFirstColumn;
    }
}
