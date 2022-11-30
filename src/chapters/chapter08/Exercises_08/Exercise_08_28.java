
package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_28 {
    public static void main(String[] args) {
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        getListFromUser(list1);
        getListFromUser(list2);
        if (equals(list1, list2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("Thw two arrays are not strictly identical");
        }
    }

    public static void getListFromUser(int[][] list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list:");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = input.nextInt();
            }
        }
    }

    public static boolean equals(int[][] list1, int[][] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i].length != list2[i].length) {
                return false;
            }
            for (int j = 0; j < list1[i].length; j++) {
                if (list1[i][j] != list2[i][j]) {
                    return false;
                }
            }


        }
        return true;
    }
}
