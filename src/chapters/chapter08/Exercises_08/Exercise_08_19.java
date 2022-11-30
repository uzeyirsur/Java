
package chapters.chapter08.Exercises_08;



import java.util.Scanner;

public class Exercise_08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int numOfRow = input.nextInt();
        int numOfColumn = input.nextInt();
        System.out.println("Enter the values in the array:");
        int[][] array = new int[numOfRow][numOfColumn];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        if(isConsecutiveFour(array)){
            System.out.println("At least there are four consecutive equal numbers.");
        }else{
            System.out.println("There is not four consecutive equal numbers.");
        }
    }
    public static boolean isConsecutiveFour(int[][] array){
        return isConsecutiveFourColumn(array) || isConsecutiveFourRow(array);
    }

    private static boolean isConsecutiveFourRow(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {
                int countRow = 1;
                for (int k = j + 1; k < array[i].length; k++) {
                    if(array[i][j] == array[i][k]){
                        countRow++;
                        if(countRow == 4){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourColumn(int[][] array){
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int countColumn = 1;
                for (int k = j + 1; k < array.length; k++) {
                   if(array[j][i]==array[k][i]){
                       countColumn++;
                       if(countColumn == 4){
                           return true;
                       }
                   }
                }

            }
        }
        return false;
    }

}
