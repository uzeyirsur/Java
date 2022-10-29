package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = input.nextInt();
        char[][] letters = new char[n][n];

        getLettersFromUser(letters);
        System.out.println(isLatinSquare(letters) ? "The input array is a Latin square": "The input array is not a Latin square");
    }

    public static void getLettersFromUser(char[][] letters) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + letters.length + " rows of letters separated by spaces:");
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                letters[i][j] = input.next().charAt(0);
                letters[i][j] = Character.toUpperCase(letters[i][j]);

                if (letters[i][j] < 'A' || ('A' + (letters.length - 1) )< letters[i][j]) {
                    System.out.println("Wrong input: the letters must be from A to " + (char) ('A' + letters.length - 1));
                    System.exit(1);
                }

            }
        }
    }
    public static boolean isLatinSquare(char[][] letters){
      return checkRow(letters) && checkColumn(letters);

    }
    public static boolean checkRow(char[][] letters){
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length - 1; j++) {
                for (int k = j + 1; k < letters[i].length; k++) {
                    if(letters[i][j] == letters[i][k]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkColumn(char[][] letters){
        for (int i = 0; i < letters[0].length; i++) {
            for (int j = 0; j < letters.length - 1; j++) {
                for (int k = j + 1; k < letters.length; k++) {
                    if(letters[j][i]== letters[k][i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
