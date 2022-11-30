
package chapters.chapter08.Exercises_08;

public class Exercise_08_22 {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];
        generateAndDisplayMatrix(matrix);
        if (checkRow(matrix) && checkColumn(matrix)) {
            System.out.println("Yes, every row and every column have an even number of 1s.");
        } else {
            System.out.println("No, every row and every column don't have an even number of 1s.");
        }
    }

    public static void generateAndDisplayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkRow(int[][] matrix) {
        int countOnesInEveryRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;

                }
            }
            if (countOnes == 2 || countOnes == 4 || countOnes == 6) {
                countOnesInEveryRow++;

            }
        }
        return (countOnesInEveryRow == matrix.length);



    }

    public static boolean checkColumn(int[][] matrix) {
        int countOnesForEveryColumn = 0;
        for (int i = 0; i < matrix.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    countOnes++;


                    }
                }
            if (countOnes == 2 || countOnes ==4 || countOnes == 6) {
                countOnesForEveryColumn++;
            }
        }

        return (countOnesForEveryColumn == matrix[0].length);



    }
}
