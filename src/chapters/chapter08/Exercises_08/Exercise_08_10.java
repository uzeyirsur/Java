package chapters.chapter08.Exercises_08;

public class Exercise_08_10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int mostOneRow = 0;
        int mostOneRowIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
                if (array[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > mostOneRow) {
                mostOneRow = countOnes;
                mostOneRowIndex = i;
            }
        }
        int mostOneColumn = 0;
        int mostOneColumnIndex = 0;
        for (int i = 0; i < array[0].length; i++) {
            int countOnes = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > mostOneColumn) {
            mostOneColumn = countOnes;
            mostOneColumnIndex = i;
            }

        }
        displayArray(array);
        System.out.println("The largest row index: " + mostOneRowIndex);
        System.out.println("The largest column index: " +mostOneColumnIndex);
    }
    public static void displayArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
