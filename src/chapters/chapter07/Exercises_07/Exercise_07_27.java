package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 : ");
        int numOfInt = input.nextInt();
        int[] list1 = new int[numOfInt];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2: ");
        int numOfInt2 = input.nextInt();
        int[] list2 = new int[numOfInt2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        if (equals(list1, list2)) {
            System.out.println("Two list are identical");
        } else {
            System.out.println("Two list are not identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        list1 = selectionSort(list1);
        list2 = selectionSort(list2);
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] selectionSort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}
