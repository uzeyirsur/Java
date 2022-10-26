package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_24 {
    public static void main(String[] args) {
        int grid[][] = readASolution();
        if (checkRow(grid) && checkColumn(grid) && check3by3box(grid)) {
            System.out.println("Valid solution");
        } else {
            System.out.println("Invalid solution");
        }
    }
                                // NOT FINISHED YET
    public static int[][] readASolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = input.nextInt();
            }

        }
        return grid;
    }

    public static boolean checkRow(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                for (int k = j + 1; k < grid[i].length; k++) {
                    if (grid[i][j] == grid[i][k]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length - 1; j++) {
                for (int k = j + 1; k < grid.length; k++) {
                    if(grid[i][j]== grid[i][k]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean check3by3box(int[][] grid) {
        for (int i =0, row= (i/3); row < (i / 3) * 3 + 3; i++,row++) {
            for (int j = 0,col =(j/3) * 3; col < (j / 3) * 3 + 3; j++,col++) {
                for (int k = j + 1,col2=(j/3) * 3; col2 <(j /3) * 3 ; col2++) {

                }
            }
        }
        return true;
    }
}
