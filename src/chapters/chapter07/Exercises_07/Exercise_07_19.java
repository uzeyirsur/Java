package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers : ");
        int numOfInts = input.nextInt();
        int[] list = new int[numOfInts];
        System.out.println("Enter " + list.length + " numbers : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }

    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] >= list[j]) {
                    return false;
                }
            }
        }
        return true;

    }
}



